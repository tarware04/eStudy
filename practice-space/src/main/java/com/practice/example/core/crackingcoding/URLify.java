package com.practice.example.core.crackingcoding;

import java.util.Arrays;

public class URLify {

    public static void main(String[] args) {

        String input = "Mr John Smith ";
        String replaceWith = "%20";

        //input = input.replaceAll(" ", replaceWith);

        char[] charArr = input.toCharArray();
        int countSpace = 0;
        for(int i=0; i< input.length(); i++){
            char c = input.charAt(i);
            if(charArr[i] == ' ') {
                countSpace++;
            }
        }

        int indexes = input.length() + countSpace * 2;
        charArr[indexes] = '\0';
        for(int j=input.length()-1; j>=0; j++){

            if(charArr[j] == ' '){
                charArr[indexes - 1] = '%';
                charArr[indexes - 2] = '2';
                charArr[indexes - 3] = '0';

                indexes = indexes - 3;
            }else{
                charArr[indexes] = charArr[j];
                indexes--;
            }
        }

        System.out.println(Arrays.toString(charArr));
    }
}

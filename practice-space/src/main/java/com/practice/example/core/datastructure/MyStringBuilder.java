package com.practice.example.core.datastructure;

public class MyStringBuilder {

    char[] arrOfString;

    MyStringBuilder() {

    }

    public MyStringBuilder append(String str) {

        char[] chars = str.toCharArray();

        if (arrOfString != null) {
            arrOfString = new char[chars.length];
        } else {
            arrOfString = new char[arrOfString.length + chars.length];
        }

        for (int i = 0; i <= chars.length; i++) {
            arrOfString[arrOfString.length + i] = chars[i];
        }
        return this;
    }

}

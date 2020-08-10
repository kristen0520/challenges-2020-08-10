package com.company;

public class StringReverse {

    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        s = sb.toString();
        return s;
    }
}

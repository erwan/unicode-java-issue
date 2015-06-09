package com.example;

class Hello {
    public static void main(String[] args) {
        String input = "%;アレルギー[]abcd";
        String output= input.replaceAll("[^-_.\\w-\\p{script=Han}\\p{script=Hira}\\p{script=Kana}\\p{script=Hang}]", "");
        System.out.println(output);
    }
}

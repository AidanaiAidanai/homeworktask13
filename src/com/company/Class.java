package com.company;

import java.util.Arrays;

public class Class {
   private int number;
   private String word;
    int san[];

    public Class(int number, String word, int[] san) {
        this.number = number;
        this.word = word;
        this.san = san;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", san=" + Arrays.toString(san) +
                '}';
    }

}


package com.company;

public class IndexOutOfRange extends Exception {
    private final int index;
    IndexOutOfRange(int indexNew){
        index = indexNew;
    }
    public String getMessage() {
        return " can't add " + index + " element";
    }
}

package com.ni.exercise2;

import com.ni.exercise2.Ink;

public class ColorInk implements Ink {
    @Override
    public void printInkInfo() {
        System.out.println("墨盒：彩色");
    }
}

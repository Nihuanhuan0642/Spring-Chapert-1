package com.ni.exercise2;

public class Printer {
    private Paper paper;
    private Ink ink;

    public void printerInfo() {
        System.out.println("打印机信息：");
        paper.printPaperInfo();
        ink.printInkInfo();
    }

    public Printer() {
    }

    public Printer(Paper paper, Ink ink) {
        this.paper = paper;
        this.ink = ink;
    }
}

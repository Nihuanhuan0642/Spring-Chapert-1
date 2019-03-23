package com.ni.exercise3;

import com.ni.exercise2.Ink;
import com.ni.exercise2.Paper;

public class Printer {
    private Power power;// 电源
    private Paper paper;
    private Ink ink;

    public void printerInfo() {
        System.out.println("打印机信息：");
        paper.printPaperInfo();
        ink.printInkInfo();
    }

    public Power getPower() {

        return power;

    }

    public void setPower(Power power) {

        this.power = power;

    }

    public Printer() {
    }

    public Paper getPaper() {
        return paper;
    }

    public Ink getInk() {
        return ink;
    }

    public Printer(Paper paper, Ink ink) {
        this.paper = paper;
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }
}

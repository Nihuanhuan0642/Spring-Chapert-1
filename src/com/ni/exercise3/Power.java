package com.ni.exercise3;

public class Power {

    private String type;// 电源型号

    public void printPowerInfo() {

        System.out.println("电源:" + type);

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {
        this.type = type;

    }

}
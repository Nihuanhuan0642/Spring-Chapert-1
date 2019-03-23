package com.ni.test;

public class MainFrame {
    private String modeType;

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    public void PrintModeFranmeInfo() {
        System.out.println("主机型号：" + modeType);
    }

}

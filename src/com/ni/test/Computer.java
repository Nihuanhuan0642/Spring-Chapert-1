package com.ni.test;

public class Computer {
    private MainFrame mainFrame;
    private Display display;

    public void printComputerInfo() {
        System.out.println("计算机配置如下：");
        mainFrame.PrintModeFranmeInfo();
        display.printDisplayInfo();
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}

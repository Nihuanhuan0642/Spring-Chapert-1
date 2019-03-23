package com.ni.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        SamSungHardDisk samSungHardDisk = (SamSungHardDisk) context.getBean("samSungHardDisk");
        samSungHardDisk.printHardDiskInfo();
    }
}

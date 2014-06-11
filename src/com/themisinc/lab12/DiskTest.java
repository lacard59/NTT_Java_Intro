package com.themisinc.lab12;

/**
 * Created by Administrator on 6/10/2014.
 */
public class DiskTest {
    public static void main(String[] args) {
        Disk test = new Disk(2, "Unholy Confessions", "Avenged Sevenfold", 121);
        System.out.println(test);
        Disk test2 = new Disk(5, "Sounding the Seventh Trumpet", "Very cool Album, son!", 15.00, 0.50, "Avenged Sevelfold", 119.5);
        System.out.println(test2);
    }
}

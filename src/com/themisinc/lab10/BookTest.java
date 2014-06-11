package com.themisinc.lab10;

/**
 * Created by Administrator on 6/10/2014.
 */
public class BookTest {
    public static void main(String[] args) {
        Book thing = new Book(4, "11 Minutos", "Great book about a prostitute", 49.99, 2.00, "Paulo Cohelo", 361);
        System.out.println(thing);
        Book thingy = new Book();
        thingy.setAuthor("Dudebro");
        thingy.setNumPages(55);
        thingy.setCost(100.03);
        thingy.setDesc("Dudebro Stuff");
        thingy.setId(1111);
        thingy.setName("The Dudebro Bible");
        thingy.setWeight(20);
        System.out.println(thingy);

    }
}

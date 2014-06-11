package com.themisinc.lab12;

import java.io.*;

/**
 * Created by Administrator on 6/11/2014.
 */
public class CartDisplayUtility {

    static File txt = new File("C:\\Users\\Administrator\\Desktop\\testDisplay.txt");
    static File objItem = new File("C:\\Users\\Administrator\\Desktop\\items.objs");
    static File objSale = new File("C:\\Users\\Administrator\\Desktop\\sale.objs");
    public static void writeItemAsText(Sale sale){
        Item arr[] = sale.getItems();
        try {

            PrintWriter pw = new PrintWriter(txt);
            for (Item anArr : arr) {
                if (anArr != null) pw.println(anArr.toString());
            }
            pw.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void readItemsAsText (){
        try {
            FileReader fr = new FileReader(txt);
            BufferedReader bf = new BufferedReader(fr);
            String line;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
            bf.close();
            fr.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void writeItemsAsObjects(Sale sale){
        Item arr[] = sale.getItems();
        try {
            FileOutputStream fos = new FileOutputStream(objItem);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) ous.writeObject(arr[i]);
            }
            fos.close();
            ous.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void readItemsAsObjects(){
        try {
            FileInputStream fis = new FileInputStream(objItem);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                System.out.println(ois.readObject().toString());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeSalesAsObject(Sale sale){
        try {
            FileOutputStream fos = new FileOutputStream(objSale);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(sale);
            fos.close();
            ous.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void readSaleAsObject(){
        try {
            FileInputStream fis = new FileInputStream(objSale);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                System.out.println(ois.readObject().toString());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

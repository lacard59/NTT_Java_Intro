package com.themisinc.lab12;

/**
 * Created by Administrator on 6/10/2014.
 */
public class Disk extends Item {

    private String artist;
    private double lengthInMinutes;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public Disk(int id, String name, String artist, double lengthInMinutes) {
        super(id, name);
        this.artist = artist;
        this.lengthInMinutes = lengthInMinutes;
    }

    public Disk(int id, String name, String desc, double cost, double weight, String artist, double lengthInMinutes) {
        super(id, name, desc, cost, weight);
        this.artist = artist;
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "artist='" + artist + '\'' +
                ", lengthInMinutes=" + lengthInMinutes +
                "} " + super.toString();
    }

    
}

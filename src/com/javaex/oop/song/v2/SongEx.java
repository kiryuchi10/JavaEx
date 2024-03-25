package com.javaex.oop.song.v2;

public class SongEx {
    private String artist;
    private String title;
    private String album;
    private int year;
    private String trackNumber;
    private String composer;

    public SongEx(String artist, String title, String album, int year, String trackNumber, String composer) {
        this.artist = artist;
        this.title = title;
        this.album = album;
        this.year = year;
        this.trackNumber = trackNumber;
        this.composer = composer;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public String getComposer() {
        return composer;
    }

    public static void main(String[] args) {
        SongEx music = new SongEx("BIGBANG", "거짓말", "Always", 2007, "2번", "G-DRAGON");
        System.out.println("Artist: " + music.getArtist());
        System.out.println("Title: " + music.getTitle());
        System.out.println("Album: " + music.getAlbum());
        System.out.println("Year: " + music.getYear());
        System.out.println("Track Number: " + music.getTrackNumber());
        System.out.println("Composer: " + music.getComposer());
    }
}
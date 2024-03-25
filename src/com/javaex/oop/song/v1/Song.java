package com.javaex.oop.song.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
//	public Song(String t,String a, String ab, int yr, String tr) {
//		title=t;
//		artist=a;
//		album=ab;
//		year=yr;
//		track=tr;
//	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String getartist() {
		return title;
	}
	public void setartist(String artist) {
		this.artist=artist;
	}
	public String album() {
		return album;
	}
	public void setalbum(String album) {
		this.album=album;
	}
	public int getyear() {
		return year;
	}
	public void setyear(int year) {
		this.year=year;
	}
	public String gettrack() {
		return track;
	}
	public void settrack(String track) {
		this.track=track;
	}
	public String getcomposer() {
		return composer;
	}
	public void setcomposer(String composer) {
		this.composer=composer;
	}
	public void showinfo()
	{
		System.out.printf("%s: %s(%s,%d,%s track),%s 작곡",
				artist, title,album,year,track,composer);
	}
	
}

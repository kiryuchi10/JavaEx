package com.javaex.oop.song.v1;


public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1=new Song();
		//song1.Song("아이유", "좋은날" , "Real", 2010, "3번" , "이민수");
		song1.setartist("아이유");
		song1.settitle("좋은날");
		song1.setalbum("Real");
		song1.setyear(2010);
		song1.settrack("3번");
	    song1.setcomposer("이민수");
		song1.showinfo();
		
	}

}

package practice5;

public class Song {
	private String artist;
    private String title;
    private String album;
    private String year;
    private int trackNumber;
    private String composer;
    

		    
		public Song() {
		    	System.out.println("Song(파라미터0개)");
		    }
		public Song(String artist, String title, String album, 
				String year, int trackNumber, String composer) {
		        this.artist = artist;
		        this.title = title;
		        this.album = album;
		        this.year = year;
		        this.trackNumber = trackNumber;
		        this.composer = composer;
		        System.out.println("Song(파라미터5개)");
		   	}
		public Song(String artist, String title, String album, String year,
				int trackNumber, String composer) {
		        this(title,artist,album,composer,year);
		        this.trackNumber = trackNumber;  
		        System.out.println("Song(파라미터6개)");
		    }

		   
	}

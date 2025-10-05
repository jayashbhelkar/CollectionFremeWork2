package collections;

import java.util.Objects;

public class Song {

	String name ;
	String singer ;
	String lyrics ;
	String movie ;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String name, String singer, String lyrics, String movie) {
		super();
		this.name = name;
		this.singer = singer;
		this.lyrics = lyrics;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", singer=" + singer + ", lyrics=" + lyrics + ", movie=" + movie + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lyrics, movie, name, singer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(lyrics, other.lyrics) && Objects.equals(movie, other.movie)
				&& Objects.equals(name, other.name) && Objects.equals(singer, other.singer);
	}
	
	
}
                                                                                        
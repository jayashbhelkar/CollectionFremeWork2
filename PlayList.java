package collections;

public class PlayList {

	String name ;
	private ArrayQueue<Song> list = new ArrayQueue<Song>() ;
	
	private PlayList() {
		// TODO Auto-generated constructor stub
	}

	public PlayList(String name) {
		super();
		this.name = name;
	}
	
	public boolean addSong(String name, String singer, String lyrics, String movie)
	{
		if (name!=null && singer!=null&&lyrics!=null && movie!=null) {
			
			list.add(new Song(name, singer, lyrics, movie)) ;
			System.out.println(name+" song added!");
			
			return true ;
		}
		
		return false ;
	}
	
	public void showCurrentSong()
	{
		Song s = list.element() ;
		
		if (s!=null) {
			
			System.out.println(s);
		}
		else
		{
			System.out.println("No song in the playlist");
		}
	}
	
	public void playNext()
	{
		if (list.size()>1) {
			
			list.remove() ;
			
			System.out.println(list.element().name+" is playing next!");
		}
		else
		{
			System.out.println("No more songs in the playlist");
		}
	}
	
	
	public boolean searchSong(String name, String singer, String lyrics, 
			String movie) 
	{
		return list.contains(new Song(name, singer, lyrics, movie)) ;
 	}
	
	
	public void shufflePlayList()
	{
		list.shuffle(); 
	}
	
	public boolean addAsNextSong(String name, String singer, String lyrics, 
			String movie) 
	{
		return list.makeNextHead(new Song(name, singer, lyrics, movie)) ;
	}
	
	
	public String toString()
	{
		return list.toString() ;
	}
	
	
	
	
	
	
}

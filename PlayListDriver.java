package collections;

public class PlayListDriver {

	public static void main(String[] args) {
		
		
		PlayList p1 = new PlayList("M39") ;
		p1.addSong("Aadat","Atif Aslam","Mithun Sharma","Kaliyug") ;
		p1.addSong("Haseen","Talwinder","Talwinder","Haseen") ;
		p1.addSong("Zingaat","Ajay Atul","Ajay Atul","Sairat") ;
		p1.addSong("Masakali","Mohit Chauhan","Prasoon Joshi","Delhi 6") ;
		p1.addSong("Lal Pari","Honey Singh","Honey Singh","Housefull 5") ;
		p1.addSong(null, null, null, null) ;
		
		System.out.println(p1);
		
		p1.playNext();
		
		//p1.shufflePlayList();
		
	//	p1.shufflePlayList();
		
		p1.addAsNextSong("Chandra","Shreya Ghoshal","Guru Thakur","Chandramukhi") ;
		
		p1.addAsNextSong("Lal Pari","Honey Singh","Honey Singh","Housefull 5");
		System.out.println(p1);
	}
}

package de.uni_hannover.hci.data;

public class LinkStore {
	
	
	private static String[] videos = {"dtiKDBO4nMc","AkjMCbSvTto","NBI9kXzMHS0","ND8jAv7WrmU"};
	private static Boolean[] quiz = {false,false,true,true};
	
	public static String getVideo(int id){
		return videos[id];
	}
	
	public static Boolean isQuiz(int id){
		return quiz[id];
	}

}

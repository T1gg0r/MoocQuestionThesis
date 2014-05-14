package de.uni_hannover.hci.data;

import java.util.Hashtable;

public class LinkStore {
	
	
	//private static String[] videos = {"dtiKDBO4nMc","AkjMCbSvTto","NBI9kXzMHS0","ND8jAv7WrmU"};
	//private static Boolean[] quiz = {false,false,true,true};
	private static Hashtable<Integer, String> videos;
	private static Hashtable<Integer, Boolean> quiz;
	public static void init(){
		videos.put(0, "dtiKDBO4nMc"); // Course Outline
		videos.put(1, "AkjMCbSvTto"); //Introduction to the Web 
		videos.put(2, "NBI9kXzMHS0"); // World Wide Web
		videos.put(3, "uPTMmyZB7tw"); //Answer Quiz 2
		videos.put(4, "ND8jAv7WrmU"); //File Types
		videos.put(5, "VngVBqQYxVg"); //Answer Quiz 4
		videos.put(6, "kzyfIiVZPJA"); //Components of the Web
		videos.put(7, "cVU7hYn-B8I"); //Answer Quiz 6
		videos.put(8, "57kH7Yole2k"); //Best Browser
		videos.put(9, "eQDNuWOxaJ0"); //Answer Quiz 8 
		videos.put(10, "5Kjx-NOwcSc"); //Intro to HTML
		videos.put(11, "VsxbuJWcxqA"); //Intro to HTML Tags
		videos.put(12, "irJ9o1Uv6U8"); //Bold Tag
		videos.put(13, "JWld9DM-La4"); //Answer Quiz 12
		
		quiz.put(0, false);
		quiz.put(1, false);
		quiz.put(2, true);
		quiz.put(3, false);
		quiz.put(4, true);
		quiz.put(5, false);
		quiz.put(6, true);
		quiz.put(7, false);
		quiz.put(8, true);
		quiz.put(9, false);
		quiz.put(10, false);
		quiz.put(11, false);
		quiz.put(12, true);
		quiz.put(13, false);
		quiz.put(14, false);
		quiz.put(15, false);
	}
	public static String getVideo(int id){
		return videos.get(id);
	}
	
	public static Boolean isQuiz(int id){
		return quiz.get(id);
	}

}

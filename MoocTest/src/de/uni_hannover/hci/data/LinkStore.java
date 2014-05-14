package de.uni_hannover.hci.data;

import java.util.Hashtable;

public class LinkStore {
	
	
	//private static String[] videos = {"dtiKDBO4nMc","AkjMCbSvTto","NBI9kXzMHS0","ND8jAv7WrmU"};
	//private static Boolean[] quiz = {false,false,true,true};
	private static Hashtable<Integer, String> course = new Hashtable<Integer, String>();
	private static Hashtable<Integer, Boolean> quiz = new Hashtable<Integer, Boolean>();
	private static Hashtable<Integer, String> answers = new Hashtable<Integer, String>();
	public static void init(){
		course.put(1, "dtiKDBO4nMc"); // Course Outline
		course.put(2, "AkjMCbSvTto"); //Introduction to the Web 
		course.put(3, "NBI9kXzMHS0"); // World Wide Web
		course.put(4, "ND8jAv7WrmU"); //File Types
		course.put(5, "kzyfIiVZPJA"); //Components of the Web
		course.put(6, "57kH7Yole2k"); //Best Browser
		course.put(7, "5Kjx-NOwcSc"); //Intro to HTML
		course.put(8, "VsxbuJWcxqA"); //Intro to HTML Tags
		course.put(9, "irJ9o1Uv6U8"); //Bold Tag
		
		answers.put(3, "uPTMmyZB7tw");
		answers.put(4, "VngVBqQYxVg");
		answers.put(5, "cVU7hYn-B8I");
		answers.put(6, "eQDNuWOxaJ0");
		
		quiz.put(3,true);
		quiz.put(4,true);
		quiz.put(5,true);
		quiz.put(6,true);
		quiz.put(9,true);
		quiz.put(10,true);
		quiz.put(11,true);
		quiz.put(12,true);
		
	}
	public static String getVideo(int id){
		if(course.get(id) != null) return course.get(id);
		else return null;
	}
	
	public static Boolean isQuiz(int id){
		if(quiz.get(id) != null) return quiz.get(id);
		else return false;
	}
	
	public static String getAnswer(int id){
		if(answers.get(id) != null) return answers.get(id);
		else return null;
	}

}

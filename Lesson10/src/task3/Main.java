package task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) throws Exception { 
		  String sentence = read_file("/Users/sophiyca/eclipse-workspace/Lesson10/src/task3/sentence.txt");
		  System.out.println(sentence);
		  System.out.println("---------------------------------------------------------------------");
		  System.out.println("Amount of words in a sentence is: " +  amount(sentence, " ") + "\n");
		  System.out.println("---------------------------------------------------------------------");
		  System.out.println("The most often in sentence is used word : " +  most_used_word(sentence));
		  
		  String text = read_file("/Users/sophiyca/eclipse-workspace/Lesson10/src/task3/text.txt");
		  System.out.println(text);
		  System.out.println("---------------------------------------------------------------------");
		  System.out.println("Amount of sentences in a text is: " +  amount(text, "[.?!]"));
		  System.out.println("---------------------------------------------------------------------");
		  System.out.println("The most often in text is used word : " +  most_used_word(text));
	  } 
	
	public static String read_file(String file_name) throws Exception {
		File file = new File(file_name); 
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String st;
		  String text = "";
		  while ((st = br.readLine()) != null) {
			  text += st + "\n";
		  } return text;
	}
	
	public static int amount(String text, String spliter) {
		String textArray[] = text.split(spliter);
		return textArray.length;
	}
	
	public static String most_used_word(String text) {
		String new_text = text.replaceAll("[.,:;!?@#$%^*(){}«»]", "");
		String textArray[] = new_text.toLowerCase().split(" ");
		int amount = 0;
		int max = 0;
		String word = "";
		for(int i = 0; i < textArray.length; i++) {
			for(int j = 0; j < textArray.length; j++) if (textArray[i].equals(textArray[j])) amount++;
			if(amount > max) {
				max = amount;
				word = textArray[i];
			} amount = 0;
		}return word;
	}
}

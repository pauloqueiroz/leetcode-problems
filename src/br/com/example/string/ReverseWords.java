package br.com.example.string;

import java.util.StringJoiner;

public class ReverseWords {
	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		System.out.println("|"+rw.reverseWords("the sky is blue")+"|");
		System.out.println("|"+rw.reverseWords("  hello world  ")+"|");
		System.out.println("|"+rw.reverseWords("a good   example")+"|");
	}

    public String reverseWords(String s) {
        if(s == null || s.isBlank())
        	return "";
    	String[] words = s.split("\s+");
    	StringJoiner stringJoiner = new StringJoiner(" ");
    	for(int i = words.length - 1; i >= 0; i--) {
    		String currentWord = words[i];
    		if(!currentWord.isBlank())
    			stringJoiner.add(currentWord);
    	}
    	return stringJoiner.toString();
    }
}

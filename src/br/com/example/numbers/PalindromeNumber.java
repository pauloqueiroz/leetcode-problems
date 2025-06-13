package br.com.example.numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(9 % 10);
		var algorithm = new PalindromeNumber();
		//System.out.println(algorithm.isPalindrome(-11));
		System.out.println(algorithm.isPalindrome(121));
		System.out.println(algorithm.isPalindrome(122));
		System.out.println(algorithm.isPalindrome(0));
		System.out.println(algorithm.isPalindrome(10000));
	}

	public boolean isPalindrome(int x) {
		if(x<-9) {
			return false;
		}
		String xAsString = String.valueOf(x);
		int j = xAsString.length()-1;
		for(int i = 0; i < xAsString.length() || i<=j; i++) {
			var charInicio = xAsString.charAt(i);
			var charFim = xAsString.charAt(j);
			if(charInicio != charFim) {
				return false;
			}
			j--;
		}
		return true;
	}
}

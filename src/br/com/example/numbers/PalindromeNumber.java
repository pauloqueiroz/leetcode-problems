package br.com.example.numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(9 % 10);
		var algorithm = new PalindromeNumber();
		System.out.println(algorithm.isPalindrome(-11));
	}

	public boolean isPalindrome(int x) {
		if (x < -10) {
			return false;
		}
		if (x % 10 < 10) {
			return true;
		}
		return false;
		/*
		 * int numInvertido; boolean aindaTemDigitos = true; int multiplicador = 1;
		 * while(aindaTemDigitos) {
		 * 
		 * int num += num % (1*multiplicador) }
		 */

	}
}

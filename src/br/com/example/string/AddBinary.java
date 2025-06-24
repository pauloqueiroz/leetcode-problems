package br.com.example.string;

public class AddBinary {

	public static void main(String[] args) {
		AddBinary algorithm = new AddBinary();

		System.out.println(algorithm.addBinary("11", "1"));
		System.out.println(algorithm.addBinary("1010", "1011"));

		System.out.println(algorithm.addBinary("1111", "1111"));
	}

	public String addBinary(String a, String b) {
		String result = "";
		int acrescimo = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int valor1 = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
			int valor2 = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;
			var soma = valor1 + valor2 + acrescimo;
			if (soma == 2) {
				result = "0" + result;
				acrescimo = 1;
			} else if (soma == 3) {
				result = "1" + result;
				acrescimo = 1;
			} else {
				result = String.valueOf(soma) + result;
				acrescimo = 0;
			}
		}
		if (acrescimo == 1) {
			result = "1" + result;
		}
		return result;
	}

}

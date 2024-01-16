package br.com.example.topinterview150;

public class ArrayProblemsUtils {
	
	public static void printResultArray(int result, int[] nums) {
		System.out.print("Elements: "+result +" -> {");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println("}");
	}

}

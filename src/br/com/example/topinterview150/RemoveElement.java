package br.com.example.topinterview150;

/**
 * LIST: TOP Interview 150
 * 
 * Question: 27. Remove Element
 * 
 * @author Paulo
 *
 */
public class RemoveElement {
	
	/**
	 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
	 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
	 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
	 * Return k.
	 * 
	 */

	public static void main(String[] args) {
		RemoveElement algorithm = new RemoveElement();
		
		// case 1
		int[] nums = {3,2,2,3};
		int val = 3;
		int result = algorithm.removeElement(nums, val);
		print(result, nums);
		
		// case 2
		int[] nums2 = {0,1,2,2,3,0,4,2};
		int val2 = 2;
		int result2 = algorithm.removeElement(nums2, val2);
		print(result2, nums2);
		
		// case 3
		int[] nums3 = {1};
		int val3 = 1;
		int result3 = algorithm.removeElement(nums3, val3);
		print(result3, nums3);
		
	}

	public int removeElement(int[] nums, int val) {
		int k = nums.length;
		for (int i = 0; i < k; i++) {
			while(nums[i] == val && k != i) {
				swapItens(nums, k-1, i);
				k--;
			}
		}
		
		return k;
	}

	private void swapItens(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}

	private static void print(int result, int[] nums) {
		System.out.print("Elements: "+result +" -> {");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println("}");
	}
}

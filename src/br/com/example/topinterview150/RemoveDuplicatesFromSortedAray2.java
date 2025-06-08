package br.com.example.topinterview150;

public class RemoveDuplicatesFromSortedAray2 {
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedAray2 algorithm = new RemoveDuplicatesFromSortedAray2();
		// case 1
		int[] nums = {1,1,1,2,2,3};
		int result = algorithm.removeDuplicates(nums);
		ArrayProblemsUtils.printResultArray(result, nums);
		
		// case 2
		int[] nums2 = {0,0,1,1,1,1,2,3,3};
		int result2 = algorithm.removeDuplicates(nums2);
		ArrayProblemsUtils.printResultArray(result2, nums2);
	}

	public int removeDuplicates(int[] nums) {
		int k = nums.length;
		for (int i = 0; i < k - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				moveItemToTheEnd(nums, i + 1, k);
				i--;
				k--;
			}
		}
		return k;
	}

	private void moveItemToTheEnd(int[] nums, int i, int k) {
		for (int j = i; j < k - 1; j++) {
			int aux = nums[j + 1];
			nums[j + 1] = nums[j];
			nums[j] = aux;
		}
	}
}

package br.com.example.topinterview150;
/**
 * LIST: TOP Interview 150
 * 
 * Question: 26. Remove Duplicates from Sorted Array
 * 
 * @author Paulo
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray algorithm = new RemoveDuplicatesFromSortedArray();
		// case 1
		int[] nums = {1,1,2};
		int result = algorithm.removeDuplicates(nums);
		ArrayProblemsUtils.printResultArray(result, nums);
		
		// case 2
		int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
		int result2 = algorithm.removeDuplicates(nums2);
		ArrayProblemsUtils.printResultArray(result2, nums2);
		
		// case 3
		int[] nums3 = {1};
		int result3 = algorithm.removeDuplicates(nums3);
		ArrayProblemsUtils.printResultArray(result3, nums3);
			
		
	}
	
	/**
	 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
	 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
	 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
	 * Return k.
	 */
	
    public int removeDuplicates(int[] nums) {
    	int k = nums.length;
		for (int i = 0; i < k-1; i++) {
			if(nums[i] == nums[i+1]) {
				moveItemToTheEnd(nums, i+1, k);
				i--;
				k--;
			}
		}
    	return k;
    }
    
	private void moveItemToTheEnd(int[] nums, int i, int k) {
		for (int j = i; j < k-1; j++) {
			int aux = nums[j+1];
			nums[j+1] = nums[j];
			nums[j] = aux;
		}
	}

}

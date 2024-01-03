package br.com.example.topinterview150;

/**
 * LIST: TOP Interview 150
 * 
 * Question: 88. Merge Sorted Array
 * 
 * @author Paulo
 *
 */
public class MergeSortedArray {
	
	/**
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
	 * representing the number of elements in nums1 and nums2 respectively.
	 * 
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
	 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, 
	 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
	 */

	public static void main(String[] args) {
		int[] n1 = {1,2,3,0,0,0};
		int[] n2 = {2,5,6};
		new MergeSortedArray().merge(n1, 3, n2, 3);
		print(n1);

		
		int[] n3 = {1};
		int[] n4 = {};
		new MergeSortedArray().merge(n3, 1, n4, 0);
		print(n3);
		
		int[] n5 = {0};
		int[] n6 = {1};
		new MergeSortedArray().merge(n5, 0, n6, 1);
		print(n5);
	
		int[] n7 = {4,5,6,0,0,0};
		int[] n8 = {1,2,3};
		new MergeSortedArray().merge(n7, 3, n8, 3);
		print(n7);
		
		int[] n9 = {-1,0,0,3,3,3,0,0,0};
		int[] n10 = {1,2,2};
		new MergeSortedArray().merge(n9, 6, n10, 3);
		print(n9);

		
		
	}
	
    private static void print(int[] nums1) {
		System.out.print("Result: {");
    	for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]+", ");
		}
		System.out.println("}");
	}

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(n == 0) {
    		return;
    	}

    	int biggerNumberIndex = nums1.length-1;
    	int index1 = m-1;
    	int index2 = n-1;
        for (;index2 >= 0 && biggerNumberIndex >= 0;) {
			if(index1 >= 0 && nums1[index1] > nums2[index2]) {
				nums1[biggerNumberIndex] = nums1[index1];
				index1--;
        	}else {
        		nums1[biggerNumberIndex] = nums2[index2]; 		
        		index2--;
        	}
			biggerNumberIndex--;
        }
    }
 

}

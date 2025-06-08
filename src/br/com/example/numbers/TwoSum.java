package br.com.example.numbers;

public class TwoSum {

    public static void main(String[] args) {

        TwoSum algorithm = new TwoSum();
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] output = algorithm.twoSum(numbers, target);
        System.out.println("[" + output[0] + ","+output[1]+"]");
        
        int[] numbers2 = {3,2,4};
        target = 6;
        output = algorithm.twoSum(numbers2, target);
        System.out.println("[" + output[0] + ","+output[1]+"]");
        
        int[] numbers3 = {3,3};
        target = 6;
        output = algorithm.twoSum(numbers3, target);
        System.out.println("[" + output[0] + ","+output[1]+"]");
    }

    public int[] twoSum(int[] nums, int target) {
        int arraySize = nums.length;
        int[] output = new int[2];
        for (int i = 0 ; i < arraySize; i++){
            for (int j = arraySize-1; j > i ; j--) {
                if(nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }
}
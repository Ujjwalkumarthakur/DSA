package com.dsa.leetcode;

public class Problem26 {

	public static void main(String[] args) {
		
		    public int removeDuplicates(int[] nums) {
		        if (nums.length == 0) return 0;
		        
		        int uniqueIndex = 0;
		        
		        for (int i = 1; i < nums.length; i++) {
		            if (nums[i] != nums[uniqueIndex]) {
		                uniqueIndex++;
		                nums[uniqueIndex] = nums[i];
		            }
		        }
		        
		        return uniqueIndex + 1;
		    }
		


	}

}

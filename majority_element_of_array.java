
/*
	find majority element in an array
	i/p : nums = [1,1,2]
	o/p : 1
*/

// mentioned condition - The majority element is the element that appears more than n / 2 times. 
// You may assume that the majority element always exists in the array.

// we have use collections to sort the array first, and afterwards we return mid of array

class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}
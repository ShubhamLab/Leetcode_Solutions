/*	remove same element from array

	i/p = nums[1,2,2]
	o/p = nums[1,2]

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0)                   // returns 0 if array is empty
            return 0;
        
        int i=0;
      
        for(int j=i+1;j<nums.length;j++)       // traverse array using i and j
        {
            if(nums[i]!=nums[j])               // if nos r same, ignored
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;                             // returns index of array
    }
        
}
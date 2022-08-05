/*
	single number
	i/p : nums = [1,1,2]
	o/p : 2
*/

// we have used bit manipulation technique, XOR, same numbers shall return 0, hence single number shall be returned 

class Solution {
    public int singleNumber(int[] nums) {
        
        int x=0;
        for(int a : nums)
        {
            x=x^a;
        }
        return x;
        
    }
}
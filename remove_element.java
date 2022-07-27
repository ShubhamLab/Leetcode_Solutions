/* remove element
   i/p = nums[2,3,3,2], val = 3
   o/p = 2, nums[2,2,_,_]
*/

class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
        
       for( int ele: nums)
       {
           if( ele != val )
           {
               nums[i] = ele;
               i++;
           }
       }
        return i;
    }
}


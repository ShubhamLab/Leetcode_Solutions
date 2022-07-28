/*
	roman number to normal number
	i/p = III
	o/p = 3

*/

class Solution {
    public int romanToInt(String s) {
        
        Map<Character , Integer> map = new HashMap<>();
        // we use hashmap data structure to store roman numbers and store them
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int n = s.length();
        
        int num = map.get(s.charAt(n-1)); // we iterate from last number of the string
        
        for(int i = n-2 ; i>=0; i--)
        {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1)))
            {
                num += map.get(s.charAt(i));  
            }
            else
            {
                num -= map.get(s.charAt(i));
            }
        }
        return num;  // final output
    }
}
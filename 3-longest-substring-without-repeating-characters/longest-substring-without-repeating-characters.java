class Solution {
    public int lengthOfLongestSubstring(String s) {
     int n = s.length();
     int minlen = 0;


     for(int i = 0; i < n;i++){
        boolean[] exist = new boolean[256];
        for(int j = i; j < n; j++){
            char ch = s.charAt(j);

            if(exist[ch] == true){
                break;
            }
            exist[ch] = true;

            minlen = Math.max(minlen, j - i +1);

        }
     }
     return minlen;

    }
}
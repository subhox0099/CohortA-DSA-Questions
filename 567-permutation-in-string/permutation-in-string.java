class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

       
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        String sortedS1 = new String(ch1);

        
        for (int i = 0; i <= s2.length() - k; i++) {

            String sub = s2.substring(i, i + k);

            char[] ch2 = sub.toCharArray();
            Arrays.sort(ch2);

            String sortedSub = new String(ch2);

            if (sortedS1.equals(sortedSub)) {
                return true;
            }
        }

        return false;
    }
}
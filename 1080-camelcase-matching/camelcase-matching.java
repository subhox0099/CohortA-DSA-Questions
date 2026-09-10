class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
         ArrayList<Boolean> ans = new ArrayList<>();
for(String q: queries){
 ans.add(match(q, pattern));
}
return ans;
        

    }

    public Boolean match(String query, String pattern){
        int i = 0;
        int j = 0;

        while(i < query.length()){
            if(j < pattern.length() &&  query.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                if(Character.isUpperCase(query.charAt(i))){
                    return false;
                }
                i++;
            }
        }
return j == pattern.length();
    }
}
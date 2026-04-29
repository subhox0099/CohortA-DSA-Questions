class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> checker = new ArrayList<>();

        for(String q : queries){

checker.add(match(q, pattern));
        }
        return checker;
        
    }


public boolean match(String queries, String pattern){
    int i = 0;
    int j = 0;

    while(i < queries.length()){
        if(j < pattern.length() && queries.charAt(i) == pattern.charAt(j)){
            i++;
            j++;
        }
        else{
            if(Character.isUpperCase(queries.charAt(i))){
                return false;
            }
            i++;
        }
    }
    return j == pattern.length();
}

}
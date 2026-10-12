class Solution {
    public int maxDistinct(String s) {
    // I am doing this question then dhannajay ,Shaurya And Rudra will do this Question
     HashSet<Character> set = new HashSet<Character>();
        for(char ch : s.toCharArray()) set.add(ch);
        return set.size();
        // Good Bye
        
    }
}
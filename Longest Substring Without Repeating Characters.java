class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), total = 0,i =0, j=0;
        HashSet<Character> hash_set = new HashSet();
        while(j < n)
        {
            if(!hash_set.contains(s.charAt(j)))
            {
                hash_set.add(s.charAt(j));
                j++;
                total = Math.max(hash_set.size(), total);
            }
            else
            {
                hash_set.remove(s.charAt(i));
                i++;
            }
        }
        return total;
    }
}
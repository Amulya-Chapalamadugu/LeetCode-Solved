class Solution {
    public boolean isPalindrome(int x) {
        long temp = x;
        long sum = 0;
        if(x<0)
            return false;
        while(temp!=0)
        {
            int r = (int)(temp % 10);
            sum = sum * 10 + r ;
            temp = temp/10;
        }
        return(sum == x);
        
    }
}
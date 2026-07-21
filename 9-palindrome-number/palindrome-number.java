class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int org = x;

        if(org<0){
            return false;
        }
        else{
        while(org>0){
            int digit = org%10;
            rev =  rev*10 + digit;
            org = org/10;
        }

        if(rev == x ) {
            return true;
        }else{
            return false;
        }
        }
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rem=0;
        int temp=x;
        while(temp!=0){
            rem=rem*10+(temp%10);
            temp/=10;
        }
        return rem==x;
    }
}
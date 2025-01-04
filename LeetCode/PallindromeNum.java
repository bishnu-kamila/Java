package LeetCode;

public class PallindromeNum {
    public boolean isPalindrome(int x) {
        int pal = 0;
        int temp=x;
        while(x>0){
            int rem = x%10;
            pal = pal*10+rem;
            x = x/10;
        }
        
        return (temp==pal);
    }
}

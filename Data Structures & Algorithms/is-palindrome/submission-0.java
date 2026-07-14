class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;

        while(l<r) {
            while(l<r && (s.charAt(l) == ' ' || !(Character.isLetterOrDigit(s.charAt(l))))) l++;
            while(l<r && (s.charAt(r) == ' ' || !(Character.isLetterOrDigit(s.charAt(r))))) r--;
            int ch1 = Character.toLowerCase(s.charAt(l));
            int ch2 = Character.toLowerCase(s.charAt(r));
            if(ch1 != ch2) return false;
            l++;
            r--;
        }

        return true;
    }
}
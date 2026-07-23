class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = 1;

        int l = 0;
        int r = 1;

        map.put(s.charAt(0), 0);

        while(l<r && r<n) {
            if(map.containsKey(s.charAt(r))) {
                maxLen = Math.max(maxLen, r-l);
                l = Math.max(l, map.get(s.charAt(r))+1);
                map.put(s.charAt(r), r);
                r++;
                continue;
            }

            map.put(s.charAt(r), r);
            r++;
        }
        maxLen = Math.max(maxLen, r-l);
        return maxLen;
    }
}

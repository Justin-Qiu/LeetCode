class Solution {
    public int lengthOfLongestSubstring(String s) {   
        int len = s.length();
        if (len != 0) {
            int i;
            int subLen = 1;
            StringBuilder sub = new StringBuilder();
            sub.append(String.valueOf(s.charAt(0)));
            String chr = sub.toString();
            for (i = 1; i < len; i++) {
                chr = String.valueOf(s.charAt(i));
                if (sub.indexOf(chr) == -1) {
                    sub.append(chr);
                    if (sub.length() >= subLen)
                        subLen = sub.length();
                }
                else {
                    sub = new StringBuilder(sub.substring(sub.indexOf(chr) + 1));
                    sub.append(chr);
                }
            }
            return subLen; 
        } 
        else
            return 0;
    }
}

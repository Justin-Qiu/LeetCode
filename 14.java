class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i, j;
        int len, strLen;
        boolean flag = true;
        String prefix = "";
        if (strs.length != 0) {
            len = strs.length;
            strLen = strs[0].length();
            for (i = 1; i < len; i++) 
                strLen = Math.min(strLen, strs[i].length());
            for (i = strLen - 1; i >= 0; i--) {
                prefix = strs[0].substring(0, i + 1);
                flag = true;
                for (j = 0; j < len; j++) {    
                    if (! strs[j].startsWith(prefix)) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    return prefix;
            }
            return "";
        }
        else
            return prefix;
    }
}

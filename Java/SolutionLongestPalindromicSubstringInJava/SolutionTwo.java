class SolutionTwo {
    public String longestPalindrome(String s) {
        if (s == null)
            return null;
        
        if(s.length() <= 1)
            return s;

        int maxLen = 0;
        String longestStr = null;
        int length = s.length();
        int[][] table = new int[length][length];

        for(int i = 0; i < length; i++) {
            table[i][i] = 1;
        }
        for(int i = 0; i <= length -2; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                table[i][i+1]= 1;
                longestStr = s.substring(i, i+2);
            }
        }

        for(int l = 3; l <= length; l++) {
            for(int i = 0; i <= length - l; i++) {
                int j = i + l - 1;
                if(s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if(table[i][j] == 1 && l > maxLen)
                        longestStr = s.substring(i, j + 1);
                } else {
                    table[i][j] = 0;
                }
            }
        }
        return longestStr;
    }
}


/*
 * Time is O(n^2) and space is O(n^2)
 */
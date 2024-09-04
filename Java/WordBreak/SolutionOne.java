class SolutionOne {
    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict, 0);
    }

    public boolean wordBreakHelper(String s, List<String> dict, int start) {
        if(start == s.length())
            return true;
        
        for(String a: dict) {

            int len = a.length();
            int end = start+len;
            if(end > s.length())
                continue;
            
            if(s.substring(start, start+len).equals(a))
                if(wordBreakHelper(s, dict, start+len))
                    return true;
        }
        
        return false;
    }
}


/*
 * Time is O(n^2)
 */
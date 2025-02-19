class Solution {
    public int strStr(String haystack, String needle) {

        int index = -1;

        if (haystack.isEmpty())
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String temp = haystack.substring(i, (i + needle.length()));
            if (temp.equals(needle)) {
                return i;
            }
        }

        return index;

    }

}
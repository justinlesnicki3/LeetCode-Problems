class Solution {
    public int lengthOfLastWord(String s) {

        String newString = s.trim();

        String lastWord = newString.substring(newString.lastIndexOf(' ') + 1, newString.length());

        return lastWord.length();

    }
}
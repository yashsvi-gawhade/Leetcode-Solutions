class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed ="";
        for (int i = result.length() - 1; i >= 0; i--) {
            reversed += result.charAt(i); 
        }
        if(reversed.equals(result)){
            return true;
        }return false;

    }
}
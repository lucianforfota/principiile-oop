package algortimica;

public class LargestPalindrome {


    //hhxhhxh

    public static void main(String[] args) {

        String s = "sdasrgdnfgbdsg";


    }

    public static boolean isPalindrome (String s){
        return true;
    }


    public static int findLargestPalindromeLength(String s){
        int maxLength = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                String currentSubstring = s.substring(i, j+1);
                if (isPalindrome(currentSubstring) && currentSubstring.length()>maxLength){
                    maxLength = currentSubstring.length();
                }
            }
        }
        return maxLength;
    }

    public static String getPalindromeAroundCharacter(String s, int center){
        //intial left este center - 1
        int left = center - 1;
        //initial right este cetner + 1

        int right = center + 1;

        while (right<s.length() && left>=0 && s.charAt(left) == s.charAt(right)) {
            //atat timp cat right < lugimea string-ului SI left >=0 SI caracterul de la left e egal cu caracterul de la right
            //left devine left -1
            left -= 1;
            //right devine right - 1
            right += 1;
        }
        //returnez substring-ul  (l+1, r)

        return s.substring(left+1,right);

    }

    public static int findLargestPalindromeLength2(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentPalindrome = getPalindromeAroundCharacter(s,i);
            if (currentPalindrome.length() > maxLength){
                maxLength = currentPalindrome.length();
            }
        }
        return maxLength;
    }


}




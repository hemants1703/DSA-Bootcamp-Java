//  https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//  https://leetcode.com/problems/check-if-the-sentence-is-pangram/solutions/3107541/easy-java-solution/
public class Question10 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        boolean check = true;
        for(int i = 65; i < 91; i++) {
            char a = (char)i;           //  Uppercase Alphabets
            char b = (char)(i + 32);    //  Lowercase Alphabets
            for(int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) == a || sentence.charAt(j) == b) {
                    check = true;
                    break;
                }
                else check = false;
            }
            if(!check)
                return false;
        }
        return check;
    }
}

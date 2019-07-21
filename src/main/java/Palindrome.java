public class Palindrome {
    public boolean check(String sentence) {
        int length = sentence.length()-1;
        String pattern = "[a-zA-Z0-9]";

        int i = 0;
        while(i < (sentence.length())/2)
        {
            String ch = sentence.charAt(i) + "";
            String ch2 = sentence.charAt(length)+ "";

            if(ch.matches(pattern) && ch2.matches(pattern)){
                if(!ch2.equalsIgnoreCase(ch))
                    return false;
                i++;
                length--;
            }
            else if (!ch.matches(pattern))
                i++;

            else if (!ch2.matches(pattern))
                length--;

        }
        return true;
    

   }
}

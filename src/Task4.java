import java.util.Scanner;

/**
 *
 * @author Azeem Hashmi
 */
public class Task4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int wordCount = 0, vowelCount = 0, consCount = 0, puncCount = 0;
        String remInt, remCh, PF;
                
        System.out.print("Enter the sentence: ");
        String str = scan.nextLine();
        MyString m = new MyString(str);
        wordCount = m.wordCounter();
        vowelCount = m.vowelCounter();
        consCount = m.consonentCounter();
        puncCount = m.puncCounter();
        remInt = m.removeInteger();
        remCh = m.removeChar();
        PF = m.paraFormat();
        
        System.out.println("Total words in sentence are: " + wordCount);
        System.out.println("Total vowels in sentence are: " + vowelCount);
        System.out.println("Total consonents in sentence are: " + consCount);
        System.out.println("Total punctuation marks in sentence are: " + puncCount);
        System.out.println("After removing integers: " + remInt);
        System.out.println("After removing alphabets: " + remCh);
        System.out.println("Formatted Sentence: " + PF);
    }
    
    static class MyString
    {
        String str;
        
        MyString(String s)
        {
            this.str = s;
        }
        /**
         * This method counts the number of words in paragraph.
         * @param s
         * @return 
         */
        int wordCounter() 
        {
            this.str = str.replaceAll("\\s+", " ");
            int count = 1;
            if (str == "") {
                return 0;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == ' ') {
                    count++;
                }
            }
            return count;
        }
    
        /**
         * This method counts the number of vowels in paragraph.
         * @param s
         * @return 
         */
        int vowelCounter()
        {
            int count = 0;
            if (str == "") {
                return 0;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }
        
        /**
         * This method is used to count number of consonants in paragraph.
         * @param s
         * @return 
         */
        int consonentCounter()
        {
            int count = 0;
            if (str == "") {
                return 0;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    count++;
                }
            }
            return count;
        }
    
        /**
         * This method is used to count number of punctuation marks in paragraph.
         * @param s
         * @return 
         */
        int puncCounter() 
        {
            int count = 0;
            if (str == "") {
                return 0;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '!' || c == '?' || c == ':' || c == ';' || c == '.' || c == ',' || c == ')' || c == '(' || c == '!'
                        || c == '\'' || c == '\"' || c == '-') {
                    count++;
                }
            }
            return count;
        }
    
        /**
         * This method is used to remove integer from paragraph
         * @param s
         * @return 
         */
        String removeInteger()
        {
            String a = str;
            a = a.replaceAll("[0-9]", "");
            return a;
        }
    
        /**
         * This method is used to remove char from paragraph it is basically used when we have to
         * extract roll number from registration number like LHRICSPM2020CS156
         * @param s
         * @return 
         */
        String removeChar()
        {
            String a = str;
            a = a.replaceAll("[A-Z]", "");
            a = a.replaceAll("[a-z]", "");

            return a;
        }
        
        /**
         * It is used to format the paragraph in a way like every first character of line will be upper case.
         * @param s
         * @return 
         */
        String paraFormat()
        {
            String s = str;
            s = s.replaceAll("\\s+", " ");
            char[] ch = s.toCharArray();
            int size = ch.length;

            if (ch[0] >= 'a' && ch[0] <= 'z')
            {
                char a = ch[0];
                int cnvrt = (int)a;
                cnvrt = cnvrt - 32;
                a = (char)cnvrt;
                ch[0] = a;
            }

            for (int i = 1 ; i < size ; i++)
            {
                if (ch[i] == '.' && i != size-1)
                {
                    if (ch[i+1] == ' ')
                    {
                        if (ch[i+2] >= 'a' && ch[i+2] <= 'z')
                        {
                            char a = ch[i+2];
                            int cnvrt = (int)a;
                            cnvrt = cnvrt - 32;
                            a = (char)cnvrt;
                            ch[i+2] = a;
                        }
                    }
                    else
                    {
                        if (ch[i+1] >= 'a' && ch[i+1] <= 'z')
                        {
                            char a = ch[i+1];
                            int cnvrt = (int)a;
                            cnvrt = cnvrt - 32;
                            a = (char)cnvrt;
                            ch[i+1] = a;
                        }
                    }

                }
            }

            s = String.valueOf(ch);
            return s;
        }
    }
}

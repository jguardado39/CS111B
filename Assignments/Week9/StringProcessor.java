package Assignments.Week9;

/*
*
* John Guardado
* CS 111B Section 932
* Spring 2020
* Professor Schatz
*
*/

public class StringProcessor {
    private String str;
    

    public StringProcessor() {
        this.str = " ";
    }

    /*
    * @param s String class
    */
    public StringProcessor(String s) {
        this.str = s;
    }


    /*
    * @param s String class
    */
    public void setString(String s) {
        this.str = s;
    }


    public String getString() {
        return str;
    }


    /*
    * @return wordCount number of words in String
    */
    public int wordCount() {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetterOrDigit(str.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
            } else if (Character.isLetterOrDigit(str.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }


    /*
    * @return capitalLetters number of capital letters in String
    */
    public int uppercaseCount() {
        int captialLetters = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                captialLetters++;
            }
        }
        return captialLetters;
    }


    /*
    * @return number of digits (0-9) in String
    */
    public int digitCount() {
        int digitCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount;
    }


    /*
    * @return digitWordCount number of digit in word form in String
    */
    public int digitWordCount() {
        int digitWordCount = 0;
        String[] wordDigits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] strArray = str.toLowerCase().split(" ");

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < wordDigits.length; j++) {
                if (strArray[i].equals(wordDigits[j])) {
                    digitWordCount++;
                    break;
                }
            }
        }
        return digitWordCount;
    }


    /*
    * @return replace all whitepace with emptypace
    */
    public String getNoSpaceString() {
        return str.replaceAll("\\s+", "");
    }


    /*
    * @return replaces all vowels with dash (-)
    */
    public String getNoVowelString() {
        return str.replaceAll("[aeiouAEIOU]", "-");
    }


    /*
    * @return str returns a replace String with digits as their word form
    */
    public String getNoDigitWordString() {
        String[] wordDigits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] strArray = str.split(" ");

        if (this.digitWordCount() == 0) {
            return str;
        } else {
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < wordDigits.length; j++) {
                    if (strArray[i].equalsIgnoreCase(wordDigits[j])) {
                        str = str.replace(strArray[i], Integer.toString(j));
                        break;
                    }
                }
            }
        }
        return str; 
    }

}

/*
 * Write a simple java program to count the number of vowels and consonants in your name and print their respective count.
 */
public class vowelConsonant20BRS1185 {
    public static void main(String[] args) {
        String name = "Abdul Aziz";
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' ||
                    name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' ||
                    name.charAt(i) == 'O' ||
                    name.charAt(i) == 'U') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("The number of vowels in " + name + " is " + vowel);
        System.out.println("The number of consonants in " + name + " is " + consonant);
    }
     
}

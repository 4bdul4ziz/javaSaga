//convert sample string lowercase to uppercase and uppercase to lowercase 

public class lowerUpper {
    public static void main(String[] args) 
    {String str = "Hello World"; String str1 = ""; for (int i = 0; i < str.length(); i++){char ch = str.charAt(i); if (Character.isLowerCase(ch)) {str1 += Character.toUpperCase(ch);} else {str1 += Character.toLowerCase(ch);}} System.out.println(str1);}   
}

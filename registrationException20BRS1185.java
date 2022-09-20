/*
 * Read the Registration Number and Mobile Number of a student. If the Registration Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 digits, throw an IllegalArgumentException stating that "Registration number does not contain 9 characters" and "Mobile number does contain 10 digits". If the Mobile Number contains any character other than a digit, raise a NumberFormatException. If the Registration Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’.

 */
import java.util.*;
public class registrationException20BRS1185 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        String mobNo = sc.nextLine();
        try {
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Registration number does not contain 9 characters");
            }
            if (mobNo.length() != 10) {
                throw new IllegalArgumentException("Mobile number does contain 10 digits");
            }
            for (int i = 0; i < mobNo.length(); i++) {
                if (!Character.isDigit(mobNo.charAt(i))) {
                    throw new NumberFormatException();
                }
            }
            for (int i = 0; i < regNo.length(); i++) {
                if (!Character.isDigit(regNo.charAt(i)) && !Character.isAlphabetic(regNo.charAt(i))) {
                    throw new NoSuchElementException();
                }
            }
            System.out.println("valid");
        }
        catch (NumberFormatException e) {
            System.out.println("Mobile number contains characters other than digits");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Registration number contains characters other than digits and alphabets");
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}

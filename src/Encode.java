import java.util.Scanner;

public class Encode {

    /**
     * Encrypts a message using the Caesar cipher method.
     *
     * @param plaintext The text to be encrypted.
     * @param key       The key for the Caesar cipher, which specifies the number of
     *                  positions to shift characters.
     * @return The encrypted text.
     */
    public static String caesarCipherEncrypt(String plaintext, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char character : plaintext.toCharArray()) {

            if (Character.isLetter(character)) {
                char shift = Character.isLowerCase(character) ? 'a' : 'A';
                char encryptedChar = (char) (((character - shift + key) % 26 + 26) % 26 + shift);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(character);
            }
        }
        return encryptedText.toString();
    }

    /**
     * Main method that takes user input and encrypts a message using the Caesar
     * cipher.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String plaintext = scanner.nextLine();
        int key = scanner.nextInt();

        String encryptedMessage = caesarCipherEncrypt(plaintext, key);

        System.out.println("Plain text: " + plaintext);
        System.out.println("Key: " + key);
        System.out.println("Cipher text: " + encryptedMessage);

        scanner.close();
    }
}

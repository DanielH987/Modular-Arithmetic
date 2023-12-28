import java.util.Scanner;

public class Decode {

    /**
     * Decrypts an encoded message using the Caesar cipher method.
     *
     * @param ciphertext The text to be decrypted.
     * @param key        The key for the Caesar cipher, which specifies the number
     *                   of positions to shift characters.
     * @return The decrypted text.
     */
    public static String caesarCipherDecrypt(String ciphertext, int key) {
        // We reuse the encryption method from the Encode class but with a negated key
        // to perform decryption.
        return Encode.caesarCipherEncrypt(ciphertext, -key);
    }

    /**
     * Main method that takes user input and decrypts an encoded message using the
     * Caesar cipher.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ciphertext = scanner.nextLine();
        int key = scanner.nextInt();

        String decryptedMessage = caesarCipherDecrypt(ciphertext, key);

        System.out.println("Cipher text: " + ciphertext);
        System.out.println("Key: " + key);
        System.out.println("Decrypted text: " + decryptedMessage);

        scanner.close();
    }
}

import java.util.Scanner;

public class AllKeys {

    /**
     * Decrypts a message without knowing the key by trying all possible keys (0 to
     * 25) in the Caesar cipher method.
     *
     * @param ciphertext The text to be decrypted.
     */
    public static void caesarCipherDecryptWithoutKey(String ciphertext) {
        for (int key = 0; key < 26; key++) {
            String decryptedText = Decode.caesarCipherDecrypt(ciphertext, key);
            System.out.println("Key " + key + ": " + decryptedText);
        }
    }

    /**
     * Main method that takes user input and attempts to decrypt a message without
     * knowing the key using all possible keys.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ciphertext = scanner.nextLine();
        System.out.println("Cipher text: " + ciphertext);
        caesarCipherDecryptWithoutKey(ciphertext);

        scanner.close();
    }
}

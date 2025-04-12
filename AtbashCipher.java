public class AtbashCipher {

    // Encrypt or Decrypt (same logic for Atbash)
    public static String atbash(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append((char) ('Z' - (ch - 'A')));
            } else if (Character.isLowerCase(ch)) {
                result.append((char) ('z' - (ch - 'a')));
            } else {
                result.append(ch); // Non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        String plainText = "Hello World!";
        String cipherText = atbash(plainText);

        System.out.println("Original : " + plainText);
        System.out.println("Atbash   : " + cipherText);
    }
}

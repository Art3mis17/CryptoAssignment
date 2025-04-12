public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }

    public static void main(String[] args) {
        String text = "HelloWorld";
        int shift = 3;

        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Original: " + text);
        System.out.println("Encrypted: " + encrypted);
    }
}

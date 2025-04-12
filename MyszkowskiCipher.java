import java.util.*;

public class MyszkowskiCipher {

    public static String encrypt(String text, String key) {
        int[] keyArray = createKeyArray(key);
        int columns = key.length();
        int rows = (int) Math.ceil((double) text.length() / columns);
        
        // Pad the text with 'X' if necessary
        while (text.length() < rows * columns) {
            text += 'X';
        }

        // Fill the matrix with the text
        char[][] matrix = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = text.charAt(index++);
            }
        }

        // Create the encrypted text by reading the columns in the order defined by the key
        StringBuilder encrypted = new StringBuilder();
        for (int i : keyArray) {
            for (int j = 0; j < rows; j++) {
                encrypted.append(matrix[j][i]);
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String text, String key) {
        int[] keyArray = createKeyArray(key);
        int columns = key.length();
        int rows = text.length() / columns;

        // Create the matrix to hold the decrypted text
        char[][] matrix = new char[rows][columns];
        int index = 0;

        // Fill the matrix by reading the encrypted text in the order of the key
        for (int i : keyArray) {
            for (int j = 0; j < rows; j++) {
                matrix[j][i] = text.charAt(index++);
            }
        }

        // Read the matrix row-wise to get the decrypted text
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                decrypted.append(matrix[i][j]);
            }
        }

        return decrypted.toString().replaceAll("X", "");  // Remove padding
    }

    private static int[] createKeyArray(String key) {
        int[] keyArray = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            keyArray[i] = key.charAt(i) - 'A';
        }

        Integer[] sortedIndexes = new Integer[key.length()];
        for (int i = 0; i < key.length(); i++) {
            sortedIndexes[i] = i;
        }

        Arrays.sort(sortedIndexes, (a, b) -> Character.compare(key.charAt(a), key.charAt(b)));

        int[] sortedKeyArray = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            sortedKeyArray[i] = sortedIndexes[i];
        }

        return sortedKeyArray;
    }

    public static void main(String[] args) {
        String plaintext = "MYSZKOWSKICIPHEREXAMPLE";
        String key = "ZEBRAS";

        String encrypted = encrypt(plaintext, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Original  : " + plaintext);
        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted : " + decrypted);
    }
}

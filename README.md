## Cryptography Ciphers

### 1. **Atbash Cipher**
- **Type**: Monoalphabetic Substitution
- **Description**: Replaces each letter with its reverse in the alphabet (A ↔ Z, B ↔ Y, etc.).
- **Example**
  - Input: `HELLO`
  - Output: `SVOOL`

---

### 2. **August Cipher**
- **Type**: Caesar Cipher Variant
- **Description**: Caesar Cipher with a fixed shift of 1.
- **Example**
  - Input: `HELLO`
  - Output: `IFMMP`

---

### 3. **Affine Cipher**
- **Type**: Monoalphabetic Substitution
- **Description**: Uses a linear function `E(x) = (a*x + b) % 26` for encryption.
- **Example**
  - Input: `HELLO`
  - Key: `a=5`, `b=8`
  - Output: `RCLLA`

---

### 4. **Vigenère Cipher**
- **Type**: Polyalphabetic Substitution
- **Description**: Encrypts by applying Caesar shifts based on a repeating keyword.
- **Example**
  - Input: `HELLO`
  - Key: `KEY`
  - Output: `RIJVS`

---

### 5. **Gronsfeld Cipher**
- **Type**: Polyalphabetic Substitution (Numeric Key)
- **Description**: Similar to Vigenère but uses digits instead of letters in the key.
- **Example**
  - Input: `HELLO`
  - Key: `31415`
  - Output: `KEOOR`

---

### 6. **Beaufort Cipher**
- **Type**: Polyalphabetic Substitution
- **Description**: Similar to Vigenère but uses a different decryption method.
- **Example**
  - Input: `HELLO`
  - Key: `KEY`
  - Output: `DVBXX`

---

### 7. **Autoclave Cipher**
- **Type**: Polyalphabetic Substitution
- **Description**: Uses the plaintext itself as the key (after the initial keyword).
- **Example**
  - Input: `HELLO`
  - Key: `KEY`
  - Output: `RIJVG`

---

### 8. **N-gram Operations**
- **Type**: Text Analysis
- **Description**: Extracts sequences of n characters (N-grams) for frequency analysis.
- **Example**
  - Input: `HELLO`, n=2
  - Output: `[HE, EL, LL, LO]`

---

### 9. **Hill Cipher**
- **Type**: Polygraphic Substitution
- **Description**: Uses matrix multiplication to encrypt blocks of text.
- **Example**
  - Input: `ACT`
  - Key: `[[6,24,1],[13,16,10],[20,17,15]]`
  - Output: `POH`

---

### 10. **Rail Fence Cipher**
- **Type**: Transposition
- **Description**: Writes text in a zigzag across multiple rails.
- **Example**
  - Input: `RAILFENCECIPHER`
  - Rails: `3`
  - Output: `RECNFIEAHPRLCIE`

---

### 11. **Route Cipher**
- **Type**: Transposition
- **Description**: Places characters in a grid and reads them in a set route (e.g., column-wise).
- **Example**
  - Input: `ROUTECIPHEREXAMPLE`
  - Grid: `4x5`
  - Output: `RCIREOHTXEPMAEXULCX`

---

### 12. **Myszkowski Cipher**
- **Type**: Transposition
- **Description**: Uses a keyword with repeated letters to define column reading order.
- **Example**
  - Input: `MYSZKOWSKICIPHEREXAMPLE`
  - Key: `ZEBRAS`
  - Output: `MKCRISZPYOOEXWHSKACMTE`

---

### 13. **Caesar Cipher**
- **Type**: Monoalphabetic Substitution  
- **Description**: Shifts each letter in the plaintext by a fixed number of positions.  
- **Example**  
  - Input: `HELLO`  
  - Shift: `3`  
  - Output: `KHOOR`

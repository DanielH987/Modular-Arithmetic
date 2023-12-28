# Modular Arithmetic Lab: Caesar Cipher

## Overview
This Java project implements the classic Caesar cipher for message encryption and decryption as part of a modular arithmetic lab. Users can encrypt plaintext messages, decrypt ciphertext when the key is known, and attempt to decrypt without the key by trying all possible shifts.

## Learning Objectives
- Utilize the modulo function in Java to implement a simple cryptographic algorithm.
- Learn to read data from standard input.
- Practice encrypting and decrypting data using the Caesar cipher.

## Part 1: Encryption
The `Encode` class takes a plaintext message and a numerical key from standard input and outputs the encoded message using the Caesar cipher.

### Usage
1. Run the `Encode` program.
2. Input the plaintext message.
3. Input the numerical key for encryption.
4. Receive the encoded message as output.

## Part 2: Decryption with Key
The `Decode` class takes a ciphertext message and the numerical key that was used for encryption from standard input and outputs the original plaintext message.

### Usage
1. Run the `Decode` program.
2. Input the ciphertext message.
3. Input the numerical key used for encryption.
4. Receive the decoded plaintext message as output.

## Part 3: Decryption without Key
The `AllKeys` class takes a ciphertext message from standard input and outputs all 26 possible plaintext decodings, one for each possible key in the Caesar cipher.

### Usage
1. Run the `AllKeys` program.
2. Input the ciphertext message.
3. Review all 26 possible decodings to find the one that makes sense.

## Contributing
Contributions to enhance functionality or improve the codebase are welcome. Please adhere to clean code practices and provide comments where necessary.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

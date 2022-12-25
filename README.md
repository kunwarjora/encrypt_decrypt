# encrypt_decrypt

This is a Encryption and decryption program made in Java language.

## Encryption
It's basic concept is adding a particular integer in the ASCII value of the current string.
But the catch is for every character there is different integer which is added to it's ASCII value.
Also, the encrypted string is not the same length as original string. The length is generated via data stored in KEY.
KEY is a special file which has crucial data related to encryption. Encrypted String is nothing without its related KEY (private Key).
Encrypted String consists of random character as well as important characters. The positioning of important char is determined by its private KEY.

## Decryption
It takes Encrypted string as well as KEY in its input and then determines the length of original string and integers related to their encryption.
From the input string, the important chars are selected and decrypted char by char.
Hence we finally get the original Decrypted String.

Output ScreenShots:
<img width="1067" alt="Screenshot_20221226_015102" src="https://user-images.githubusercontent.com/112961351/209481072-bd0ceca8-f17d-4702-b25f-9f84afa71668.png">
<img width="1063" alt="Screenshot_20221226_015151" src="https://user-images.githubusercontent.com/112961351/209481085-63308a3c-76c2-4857-8fd1-baa29251ac1b.png">


### Author: Kunwar Jora

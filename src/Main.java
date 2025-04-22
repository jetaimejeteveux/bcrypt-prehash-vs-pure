import SHA512.SHA512;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String password = "1234567890password12312345678passwordqwertyuiop123456789qwe12345passpass12341111111111111234567qwertyudragon12345123123123123baseball123";
        byte[] passwordb = password.getBytes(StandardCharsets.UTF_8);
        String prehashResult = SHA512.hash(passwordb); // in string

        // implementing prehash to bcrypt
        byte[] prehashResultByte = SHA512.hashToByte(passwordb);
        String salt = Bcrypt.gensalt();
        String hashResult = Bcrypt.hashpw(prehashResultByte, salt);

        System.out.println("prehash = "+prehashResult);
        System.out.println("prehash byte = "+Arrays.toString(prehashResultByte));
        System.out.println("hash = "+hashResult);
    }
}

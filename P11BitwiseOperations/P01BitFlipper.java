//D:\SoftUni\4.JavaAdvanced-September2017\Docs\[ExamPreparations]\Exam Preparation I\01. Bit Flipper_Условие.docx

package P00BitwiseOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P01BitFlipper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num = new BigInteger(reader.readLine());
        BigInteger seven = new BigInteger("7");
        BigInteger zero = new BigInteger("0");

        for (int i = 0; i <= 61 ; i++) {
            BigInteger threeDigits = num.shiftRight(61 - i).and(seven);
            System.out.println(threeDigits);
            if (threeDigits.equals(seven) || threeDigits.equals(zero)){
                num = num.xor(seven.shiftLeft(61 - i));
                i += 2;
            }
        }
        System.out.println(num);
    }
}

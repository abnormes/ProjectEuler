package net.projecteuler;

import java.util.Objects;

/**
 * @author abnormes on 28.04.2020
 * @project ProjectEuler
 */
public class EulerUtil {

    public static boolean isPrime(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        if (number == 1 || number == 0) {
            return false;
        }
        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (((number % 3 == 0) || (number % 2 == 0) || (number % 5 == 0))) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        String buffer = Objects.toString(number);
        int length = buffer.length() / 2;
        for (int i = 0; i < length; i++) {
            if (!(buffer.charAt(i) == buffer.charAt(buffer.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}

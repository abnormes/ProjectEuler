package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.Problem;

import java.math.BigInteger;

/**
 * @author abnormes on 28.04.2020
 * @project ProjectEuler
 */
@Problem(id = 5, name = "Smallest multiple")
public class P005 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P005().solve());
    }

    @Override
    public String solve() {

        /*      LCP method          */
        // BigInteger result = lcpMethod();

        /*      Stupid method #1    */
        // Integer result = stupidMethodOne();

        /*      Stupid method #2    */
        Integer result = stupidMethodTwo();

        return result.toString();
    }

    private BigInteger lcpMethod() {
        BigInteger number = BigInteger.ONE;

        for (int i = 1; i <= 20; i++) {
            number = BigInteger.valueOf(i)
                    .divide(BigInteger.valueOf(i)
                            .gcd(number))
                    .multiply(number);
        }
        return number;
    }

    private Integer stupidMethodOne() {
        Integer number = 20;

        while (true) {
            for (int i = 4; i <= 20; i++) {
                if (number % i == 0) {
                    if (i == 20) {
                        return number;
                    }
                } else {
                    number++;
                    break;
                }
            }
        }
    }

    private Integer stupidMethodTwo() {
        int smallest = 0;
        for (int number = 20; smallest == 0; number += 2) {
            for (int i = 2; i <= 20; i++) {
                if (number % i != 0) break;
                else if (i == 20) smallest = number;
            }
        }

        return smallest;
    }
}

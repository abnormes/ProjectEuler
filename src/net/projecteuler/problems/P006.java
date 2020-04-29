package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.Problem;

import java.math.BigInteger;

/**
 * @author abnormes on 29.04.2020
 * @project ProjectEuler
 */
@Problem(id = 6, name = "Sum square difference")
public class P006 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P006().solve());
    }

    @Override
    public String solve() {
        int sumOfSquare = 0;
        int squareOfSum = 0;
        long result;

        for (int i = 0; i <= 100; i++) {
            squareOfSum += i;
            sumOfSquare += i * i;
        }

        result = (squareOfSum * squareOfSum - sumOfSquare);

        return Long.toString(result);
    }
}

package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.Problem;

/**
 * @author abnormes on 27.04.2020
 * @project ProjectEuler
 */
@Problem(id = 2, name = "Even Fibonacci numbers")
public class P002 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P002().solve());
    }

    @Override
    public String solve() {
        Integer result = 0;
        int currentValue = 2;
        int prevValue = 1;
        while (currentValue < 4_000_000) {

            if (currentValue % 2 == 0) {
                result += currentValue;
            }
            int buffer = prevValue;
            prevValue = currentValue;
            currentValue += buffer;
        }
        return result.toString();
    }
}

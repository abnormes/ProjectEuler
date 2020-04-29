package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.EulerUtil;
import net.projecteuler.Problem;

/**
 * @author abnormes on 29.04.2020
 * @project ProjectEuler
 */
@Problem(id = 7, name = "10001st prime")
public class P007 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P007().solve());
    }

    @Override
    public String solve() {
        int result = 0;
        int counter = 0;

        for (int i = 1; result == 0; i++) {

            if (EulerUtil.isPrime(i)) {
                counter++;
            }

            if (counter == 10_001) {
                result = i;
            }
        }

        return Integer.toString(result);
    }
}

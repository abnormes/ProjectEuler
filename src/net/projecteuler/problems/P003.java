package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.EulerUtil;
import net.projecteuler.Problem;

/**
 * @author abnormes on 27.04.2020
 * @project ProjectEuler
 */
@Problem(id = 3, name = "Largest prime factor")
public class P003 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P003().solve());
    }

    @Override
    public String solve() {
        Long result = -1L;
        Long number = 600851475143L;
        for (long i = 7; i < Math.sqrt(number); i++) {
            if (EulerUtil.isPrime(i) && (number % i == 0)) {
                result = i;
            }
        }
        return result.toString();
    }
}

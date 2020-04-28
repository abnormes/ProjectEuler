package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.Problem;

/**
 * @author abnormes on 27.04.2020
 * @project ProjectEuler\
 */
@Problem(id = 1, name = "Multiples of 3 and 5")
public class P001 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P001().solve());
    }

    @Override
    public String solve() {
        Integer result = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                result += i;
            }
        }
        return result.toString();
    }
}
package net.projecteuler.problems;

import net.projecteuler.EulerSolution;
import net.projecteuler.EulerUtil;
import net.projecteuler.Problem;

/**
 * @author abnormes on 28.04.2020
 * @project ProjectEuler
 */
@Problem(id = 4, name = "Largest palindrome product")
public class P004 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new P004().solve());
    }

    @Override
    public String solve() {
        Integer result = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int buffer = i * j;
                if (EulerUtil.isPalindrome(buffer) && buffer > result) {
                    result = buffer;
                }
            }
        }
        return result.toString();
    }
}

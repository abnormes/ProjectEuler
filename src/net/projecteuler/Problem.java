package net.projecteuler;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author abnormes on 28.04.2020
 * @project ProjectEuler
 */
@Target(ElementType.TYPE)
@Documented
public @interface Problem {

    int id();
    String name();

}

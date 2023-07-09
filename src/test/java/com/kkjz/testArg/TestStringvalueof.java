package com.kkjz.testArg;

import org.junit.Test;

/**
 * @author kkjz
 * @create 2023-07-08 16:41
 */
public class TestStringvalueof {

    @Test
    public void Test1(){
        System.out.println(String.valueOf('c'));
    }

    @Test
    public void Test2(){
        System.out.println(Character.toChars('Y'+32));
    }

}

package com.yitian.javabase;

/**
 * @author ：yitianren
 * @date ：Created in 2019-5-20 16:18
 * @description：
 * @modified By：
 * @version: 4.0-3.6=0.40000001现象$
 */

/**
 * 结果是
 * 0.3999999999999999
 * 解释：2进制的小数无法精确的表达10进制小数，计算机在计算10进制小数的过程中要先转换为2进制进行计算，这个过程中出现了误差
 */
public class TwoScale {

    public static void main(String[] args) {
        System.out.println(4.0-3.6);
    }

}

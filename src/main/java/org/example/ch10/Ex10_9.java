package org.example.ch10;

import java.text.DecimalFormat;

/**
 * ch10. 형식화 클래스
 */
public class Ex10_9 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89");
            System.out.print("1,234,567.89 -> ");
            double d = num.doubleValue();
            System.out.print(d + " -> ");

            String format = df2.format(d);
            System.out.print(format);
        } catch (Exception e) {

        }
    }
}

package org.example.ch09;

import java.util.Arrays;

/**
 * ch09. String 생성자
 */
public class Ex9_5 {
    public static void main(String[] args) {
        System.out.println("String(char[] value) : 주어진 문자열을 갖는 String 인스턴스를 생성한다. ");
        String s = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("s = " + s);
        char[] chars = s.toCharArray();
        System.out.println("chars = " + Arrays.toString(chars));

        System.out.println();
        System.out.println("String(StringBuffer buf) : StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.");
        StringBuffer hello = new StringBuffer("Hello");
        String s1 = new String(hello);
        System.out.println("s1 = " + s1);

        System.out.println();
        System.out.println("char charAt(int index) : 지정된 위치에 있는 문자를 아려준다. (index는 0부터 시작)");
        String s2 = "Hello";
        System.out.println("s2.charAt(2) = " + s2.charAt(2));

        System.out.println();
        System.out.println("int compareTo(String str) : 문자열과 사전순서로 비교한다. 같으면 0, 사전순 이전이면 음수, 이후이면 양수 반환");
        System.out.println("(\"aaa\".compareTo(\"bbb\")) = " + ("aaa".compareTo("bbb")));
        System.out.println("(\"aaa\".compareTo(\"aaa\")) = " + ("aaa".compareTo("aaa")));
        System.out.println("(\"bbb\".compareTo(\"aaa\")) = " + ("bbb".compareTo("aaa")));

        System.out.println();
        System.out.println("String concat(String str) : 문자열을 뒤에 덧붙인다.");
        String concat = s2.concat(" World");
        System.out.println("concat = " + concat);

        System.out.println();
        System.out.println("boolean contains(CharSequence s ) : 지정된 문자열이 포함되었는지 검사한다.");
        boolean llo = s2.contains("llo");
        System.out.println("llo = " + llo);

        System.out.println();
        System.out.println("boolean endWith(String suffix) : 지정된 문자열로 끝나는지 검사한다,");
        String file = "hello.txt";
        System.out.println("file.endsWith(\"txt\") = " + file.endsWith("txt"));

        System.out.println();
        System.out.println("boolean equalsIgnoreCase(String str) : 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다,");
        String s4 = "BaBo";
        System.out.println("s4.equalsIgnoreCase(\"BABO\") = " + s4.equalsIgnoreCase("BABO"));


        System.out.println();
        System.out.println("int indexOf(int ch) : 주어진 문자가 문자열에 존재하는지 확인하여 위치를 알려줌");
        String s5 = "Phone";
        System.out.println("s5.indexOf('o') = " + s5.indexOf('o'));
        System.out.println("s5.indexOf('o', 1) = " + s5.indexOf('o', 1)); // (문자, 시작위치)
        System.out.println("s5.indexOf(\"Ph\") = " + s5.indexOf("Ph"));
        String s6 = "java.lang.Object";
        System.out.println("s6.indexOf('.') = " + s6.indexOf('.'));
        System.out.println("s6.lastIndexOf('.') = " + s6.lastIndexOf('.')); // lastIndexOf는 뒤에서부터 찾음

        System.out.println();
        System.out.println("s6.length() = " + s6.length());

        System.out.println();
        System.out.println("String[] split(String regex) : 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다.");
        s6 = "java,lang,Object";
        String[] split = s6.split(",");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));
        String[] split1 = s6.split(",", 2);
        System.out.println("Arrays.toString(split1) = " + Arrays.toString(split1));

        System.out.println();
        System.out.println("boolean startsWith(String prefix) : 주어진 문자열로 시작하는지 검사한다,");
        System.out.println("s6.startsWith(\"java\") = " + s6.startsWith("java"));

        System.out.println();
        System.out.println("String subString(int begin, int end) : 주어진 시작위치부터 끝 위치범위에 포함된 문자열을 얻는다.");
        String s7 = "java.lang.Object";
        System.out.println("s7.substring(0, 8) = " + s7.substring(0, 8));
        System.out.println("s7.substring(10) = " + s7.substring(10)); // 10 위치부터 끝까지

        System.out.println();
        System.out.println("toLowerCase() : 소문자로 변환");
        System.out.println("\"ABC\".toLowerCase() = " + "ABC".toLowerCase());

        System.out.println("toUpperCase() : 대문자로 변환");
        System.out.println("\"abc\".toUpperCase() = " + "abc".toUpperCase());

        System.out.println();
        System.out.println("String trim() : 문자열의 왼쪽 끝과 오른쪽 끝의 공백 제거");
        String s8 = "  Hello World  ";
        System.out.println("s8.trim() = " + s8.trim());

        System.out.println();
        System.out.println("valueOf() : 지정된 값을 문자열로 변환하여 반환한다.");
        System.out.println("String.valueOf(true) = " + String.valueOf(true));
        System.out.println("String.valueOf(10f) = " + String.valueOf(10f));
    }
}

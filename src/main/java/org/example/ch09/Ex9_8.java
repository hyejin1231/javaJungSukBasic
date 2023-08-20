package org.example.ch09;

/**
 * ch09. StringBuffer 클래스의 메서드
 */
public class Ex9_8 {
    public static void main(String[] args) {

        // StringBuffer() : 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성
        // StringBuffer(int length) : 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성

        // append : 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.
        StringBuffer sb = new StringBuffer("abc");
        sb.append('d').append(10.0f);
        System.out.println("sb.toString() = " + sb);

        // capacity() : StringBuffer 인스턴스의 버퍼 크기를 알려준다.
        System.out.println("sb.capacity() = " + sb.capacity()); // 19
        System.out.println("sb.length() = " + sb.length()); // length()는 문자열의 길이를 알려준다. 8

        // charAt : 지정된 위치에 있는 문자를 반환한다.
        System.out.println("sb.charAt(0) = " + sb.charAt(0)); // a

        // delete : 시작위치 부터 끝 위치 사이에 있는 문자 제거 (끝 위치 문자는 제외)
        StringBuffer sb3 = new StringBuffer("0123456");
        sb3.delete(3, 6);
        System.out.println("sb3 = " + sb3); // 0126

        // deleteCharAt() : 지정된 위치에 문자 제거
        sb3.deleteCharAt(0);
        System.out.println("sb3 = " + sb3); // '0' 제거로 result : 126

        // insert : 두번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치에 추가한다.
        sb3.insert(0, "0");
        System.out.println("sb3 = " + sb3); // 0126
        sb3.insert(3, "345");
        System.out.println("sb3 = " + sb3);

        // replace : 지정된 범위의 문자들을 주어진 문자열로 바꾼다. (end 위치에 문자 범위는 초함 x)
        sb3.replace(3, 5, "abc");
        System.out.println("sb3 = " + sb3); // 012abc56

        // reverse : StringBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
        sb3.reverse();
        System.out.println("sb3 = " + sb3); // 65cba210

        // setCharAt() : 지정된 위치에 문자를 주어진 문자로 바꾼다.
        sb3.setCharAt(0, '7');
        System.out.println("sb3 = " + sb3); // 75cba210

        // setLength() : 지정된 길이의 문자열의 길이를 변경한다.
        sb3.setLength(30);
        System.out.println("sb3 = " + sb3);

        // toString() : StringBuffer 인스턴스의 문자열을 String으로 반환
        String s = sb3.toString();
        System.out.println("s = " + s);

        // subString() : 지정된 범위 내의 문자열을 String으로 뽑아서 반환한다.
        String substring = sb3.substring(0, 3);
        System.out.println("substring = " + substring); // 75c



    }
}

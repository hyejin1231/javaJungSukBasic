package org.example.ch08;

import java.io.File;

/**
 * ch08. 예외 선언하기, finally 블럭
 */
public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File file = createFile("text2.txt");
            System.out.println("파일이 정상적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해주세요.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }

        File f = new File(fileName);
        f.createNewFile();

        return f;
    }
}

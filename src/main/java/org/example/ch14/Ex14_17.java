package org.example.ch14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * ch14. 스트림의 그룹화, 분할
 * partitioningBy() : 2분할
 * groupingBy() : n분할
 */
class Student2 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    /* groupingBy 에서 사용 */
    enum Level {HIGH, MID, LOW} // 성적을 상, 중, 하 3단계로 분류

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }
}

public class Ex14_17 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("나자바", true,  1, 1, 300),
                new Student2("김지미", false, 1, 1, 250),
                new Student2("김자바", true,  1, 1, 200),
                new Student2("이지미", false, 1, 2, 150),
                new Student2("남자바", true,  1, 2, 100),
                new Student2("안지미", false, 1, 2,  50),
                new Student2("황지미", false, 1, 3, 100),
                new Student2("강지미", false, 1, 3, 150),
                new Student2("이자바", true,  1, 3, 200),
                new Student2("나자바", true,  2, 1, 300),
                new Student2("김지미", false, 2, 1, 250),
                new Student2("김자바", true,  2, 1, 200),
                new Student2("이지미", false, 2, 2, 150),
                new Student2("남자바", true,  2, 2, 100),
                new Student2("안지미", false, 2, 2,  50),
                new Student2("황지미", false, 2, 3, 100),
                new Student2("강지미", false, 2, 3, 150),
                new Student2("이자바", true,  2, 3, 200)
        };

        System.out.printf("1. 단순 분할 (성별로 분할) %n");
        Map<Boolean, List<Student2>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale));
        List<Student2> maleStudent = stuBySex.get(true);
        List<Student2> femaleStudent = stuBySex.get(false);

        for (Student2 student2 : maleStudent) {
            System.out.println( student2);
        }

        System.out.println();
        for (Student2 student2 : femaleStudent) {
            System.out.println(student2);
        }

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수) %n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, counting()));

        System.out.println("남학생 수 : " + stuNumBySex.get(true)); // 8
        System.out.println("여학생 수 : " + stuNumBySex.get(false)); // 10

        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student2>> topScoreBySex =
                Stream.of(stuArr).collect(partitioningBy(Student2::isMale, maxBy(Comparator.comparingInt(Student2::getScore))));

        System.out.println("남학생 1등 = " + topScoreBySex.get(true).get().score);
        System.out.println("여학생 1등 = " + topScoreBySex.get(false).get().score);

        Map<Boolean, Student2> topScoreBySex2 = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, collectingAndThen(maxBy(Comparator.comparingInt(Student2::getScore)), Optional::get)));
        System.out.println("남학생 1등 = " + topScoreBySex2.get(true).score);
        System.out.println("여학생 1등 = " + topScoreBySex2.get(false).score);

        System.out.printf("%n4. 다중분할 (성별 불합격자, 100점이하)%n");

        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex =
                Stream.of(stuArr).collect(partitioningBy(Student2::isMale, partitioningBy(s -> s.getScore() <= 100)));

        List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student2> failedFemaleStu = failedStuBySex.get(false).get(true);

        for (Student2 student2 : failedMaleStu) {
            System.out.println(student2);
        }
        System.out.println();
        for (Student2 student2 : failedFemaleStu) {
            System.out.println(student2);
        }



    }
}

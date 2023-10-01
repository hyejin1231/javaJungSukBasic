package org.example.ch14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * ch14. 스트림의 그룹화와 분할
 */
class Student3 {
    String name;
    boolean isMale; // 성별
    int hak;        // 학년
    int ban;        // 반
    int score;

    Student3(String name, boolean isMale, int hak, int ban, int score) {
        this.name	= name;
        this.isMale	= isMale;
        this.hak   	= hak;
        this.ban	= ban;
        this.score 	= score;
    }

    String	getName() 	 { return name;    }
    boolean isMale()  	 { return isMale;  }
    int		getHak()   	 { return hak;	   }
    int		getBan()  	 { return ban;	   }
    int		getScore()	 { return score;   }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
    }

    enum Level {
        HIGH, MID, LOW
    }
}
public class Ex14_18 {
    public static void main(String[] args) {
        Student3[] stuArr = {
                new Student3("나자바", true,  1, 1, 300),
                new Student3("김지미", false, 1, 1, 250),
                new Student3("김자바", true,  1, 1, 200),
                new Student3("이지미", false, 1, 2, 150),
                new Student3("남자바", true,  1, 2, 100),
                new Student3("안지미", false, 1, 2,  50),
                new Student3("황지미", false, 1, 3, 100),
                new Student3("강지미", false, 1, 3, 150),
                new Student3("이자바", true,  1, 3, 200),
                new Student3("나자바", true,  2, 1, 300),
                new Student3("김지미", false, 2, 1, 250),
                new Student3("김자바", true,  2, 1, 200),
                new Student3("이지미", false, 2, 2, 150),
                new Student3("남자바", true,  2, 2, 100),
                new Student3("안지미", false, 2, 2,  50),
                new Student3("황지미", false, 2, 3, 100),
                new Student3("강지미", false, 2, 3, 150),
                new Student3("이자바", true,  2, 3, 200)
        };

        System.out.println("1. 단순그룹화 (반별로 그룹화) ");
        Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr).collect(groupingBy(Student3::getBan));
        for (List<Student3> ban : stuByBan.values()) {
            for (Student3 student3 : ban) {
                System.out.println(student3);
            }
            System.out.println();
        }

        System.out.println("2. 단순그룹화 (성적별로 그룹화)");
        Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr).collect(groupingBy(s -> {
            if (s.getScore() >= 200) return Student3.Level.HIGH;
            else if (s.getScore() >= 100) return Student3.Level.MID;
            else return Student3.Level.LOW;
        }));

        TreeSet<Student3.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (Student3.Level key : keySet) {
            System.out.println("[" + key + "]");

            for (Student3 student3 : stuByLevel.get(key)) {
                System.out.println(student3);
            }
            System.out.println();
        }

        System.out.println("3. 단순그룹화 + 통계 (성적별 학생수)");
        Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr).collect(groupingBy(s -> {
            if (s.getScore() >= 200) return Student3.Level.HIGH;
            else if (s.getScore() >= 100) return Student3.Level.MID;
            else return Student3.Level.LOW;
        }, counting()));

        for (Student3.Level key : stuCntByLevel.keySet()) {
            System.out.println("[" +key +"] - " + stuCntByLevel.get(key) + "명" );
        }

        System.out.println("4. 다중그룹화 (학년별, 반별)");
        Map<Integer, Map<Integer, List<Student3>>> stuByHakAndBan =
                Stream.of(stuArr).collect(groupingBy(Student3::getHak, groupingBy(Student3::getBan)));

        for (Map<Integer, List<Student3>> hak : stuByHakAndBan.values()) {
            for (List<Student3> ban : hak.values()) {
                for (Student3 student3 : ban) {
                    System.out.println(student3);
                }
                System.out.println();
            }
        }

        System.out.println("5. 다중그룹화 + 통계 (학년별, 반별 1등)");
        Map<Integer, Map<Integer, Student3>> topStuByHakAndBan =
                Stream.of(stuArr).collect(groupingBy(Student3::getHak,
                        groupingBy(Student3::getBan,
                                collectingAndThen(maxBy(Comparator.comparingInt(Student3::getScore)), Optional::get))));

        for (Map<Integer, Student3> ban : topStuByHakAndBan.values()) {
            for (Student3 student3 : ban.values()) {
                System.out.println(student3);
            }
        }

        System.out.println("6. 다중그룹화 + 통계 (학년별, 반별 성적 그룹) ");
        Map<String, Set<Student3.Level>> stuByScoreGroup = Stream.of(stuArr).collect(groupingBy(s -> s.getHak() + "-" + s.getBan(), mapping(s -> {
            if (s.getScore() >= 200) return Student3.Level.HIGH;
            else if (s.getScore() >= 100) return Student3.Level.MID;
            else return Student3.Level.LOW;
        }, toSet())));

        Set<String> keySet2 = stuByScoreGroup.keySet();
        for (String key : keySet2) {
            System.out.println("["+key+"]" + stuByScoreGroup.get(key));
        }
    }
}

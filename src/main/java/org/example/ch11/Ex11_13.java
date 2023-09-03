package org.example.ch11;

import java.util.HashSet;
import java.util.Objects;

/**
 * ch11. HashSet (2)
 * : HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인해야 한다.
 * -> 같은 객체가 있으면 저장하지 않고, 없으면 저장한다.
 * add() 를 할 때 equals 와 hashCode() 를 호출함 (equals(), hashCode()가 오버라이딩 되어 있어야 함)
 */
public class Ex11_13 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc"); // 중복으로 저장 안됨
        set.add(new Person("David", 10));
        set.add(new Person("David", 10)); // equals, hashCode 오버라이딩하면 중복으로 저장 안됨

        System.out.println("set = " + set);

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // equals() 와 hashCode() 메서드를 오버라이딩해야함
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

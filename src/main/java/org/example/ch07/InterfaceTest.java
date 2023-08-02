package org.example.ch07;

/**
 * ch07. 인터페이스의 장점 1
 * : 느슨한 결합으로 변경 최소화 할 수 있음
 */
class A {
    public void method(B b) { // A가 만약 C를 사용하려면 여기도 변경해야함
        b.method();
    }
}

class A_2 {
    public void method(I i) {
        i.method();
    }
}

interface I {
    public void method(); // 선언과 구현을 분리
}

class B {
    public void method() {
        System.out.println("B.method");
    }
}

class B_2 implements I {
    @Override
    public void method() {
        System.out.println("B_2.method");
    }
}

class C {
    public void method() {
        System.out.println("C.method");
    }
}

class C_2 implements I {
    @Override
    public void method() {
        System.out.println("C_2.method");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용 (A가 B를 의존한다.)

        A_2 a_2 = new A_2();
        a_2.method(new B_2());
        a_2.method(new C_2());
    }
}

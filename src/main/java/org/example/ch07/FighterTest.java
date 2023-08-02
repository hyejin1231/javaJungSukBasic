package org.example.ch07;

/**
 * ch07. 인터페이스와 다형성
 */
abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);
    void stop() {
        System.out.println("stop!");
    }
}

interface Fightable {
    // 인터페이스의 모든 메서드는 public !!
    void move(int x, int y); // public abstract 생략

    void attack(Fightable fightable); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {

    @Override
    public void move(int x, int y) { // 추상메서드는 충돌이 상관없으므로 다중 상속 가능함
        System.out.println("[ " + x + ", " + y + " ] 이동");
    }

    @Override
    public void attack(Fightable fightable) {
        System.out.println(fightable + "를 공격 !!! ");
    }

    // Fightable 인터페이스를 구현한 객체를 반환해야 한다.
    Fightable getFightable() {
        return new Fighter(); // (Fightable) 형변환 생략
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.move(100, 100);
        fighter.attack(new Fighter());

        Unit2 unit2 = new Fighter();
        unit2.move(200, 300);
        // unit2.attack(new Fighter()); // error! unit2는 attack 메서드가 없으므로 호출 불가

        Fightable fightable = new Fighter();
        fightable.move(500, 400);
//        fightable.stop(); // error ! fightagle 은 stop 메서드가 없으므로 호출

        Fightable fightable1 = fighter.getFightable();
    }
}

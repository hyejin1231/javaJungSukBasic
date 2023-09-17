package org.example.ch13;

/**
 * ch13. 쓰레드의 우선순위, 쓰레드 그룹
 * 쓰레드의 우선순위 (-> 근데 희망사항에 불과함..^^;; -> 희망사항을 담아 Os 스케줄러에게 요청하는 것)
 * : 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업 시간을 갖게 할 수 있다.
 */
public class Ex13_7 {
    public static void main(String[] args) {
        Thread7_1 thread71 = new Thread7_1();
        Thread7_2 thread72 = new Thread7_2();

        thread71.setPriority(5);
        thread72.setPriority(7); // 우선순위를 더 높에 할당은 해봄

        System.out.println("thread71.getPriority = " + thread71.getPriority());
        System.out.println("thread72.getPriority = " +thread72.getPriority());

        thread71.start();
        thread72.start();
    }
}

class Thread7_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 10000000; x++); // 시간 지연용 for
        }
    }
}

class Thread7_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 10000000; x++); // 시간 지연용 for
        }
    }
}


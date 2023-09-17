package org.example.ch13;

/**
 * ch13. 데몬 쓰레드, 쓰레드의 상태
 * 데몬 쓰레드 (daemon thread)
 * : 일반 쓰레드의 작업을 돕는 보조적인 역할을 수행
 * 일반 쓰레드가 모두 종료되면 자동적으로 종료된다.
 * 가비지 컬렉터, 자동 저장, 화면 자동 갱시 등에 사용된다.
 * 무한 루프와 조건문을 사용해서 실행 후 대기하다가 특정 조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
 */
public class Ex13_9 implements Runnable{

    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex13_9());
        thread.setDaemon(true);

        thread.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(i);

            if (i == 5) autoSave = true; // 5초부터 자동 저장 실행
        }

        System.out.println("프로그램을 종료합니다. "); // 메인 쓰레드가 종료되면 데몬쓰레드는 같이 종료됨
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000); // 3초마다
            } catch (InterruptedException e) {

            }

            // autuSave 값이 true 이면 autuSave() 호출
            if (autoSave) {
                autoSave();
            }
        }
    }

    private void autoSave() {
        System.out.println("작엄 파일이 자동 저장 되었습니다.");
    }
}



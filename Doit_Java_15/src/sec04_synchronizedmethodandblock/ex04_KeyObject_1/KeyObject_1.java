package sec04_synchronizedmethodandblock.ex04_KeyObject_1;
// 3개의 동기화 영역이 동일한 열쇠로 동기화됐을 떄
class MyData {
    synchronized void abc() { // this 객체가 갖고 있는 하나의 열쇠를 함께 사용
        for(int i = 0; i < 3; i++) {
            System.out.println(i + "sec");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
    synchronized void bcd() { // this 객체가 갖고 있는 하나의 열쇠를 함께 사용
        for(int i = 0; i < 3; i++) {
            System.out.println(i + "초");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
    void cde() { // this 객체가 갖고 있는 하나의 열쇠를 함께 사용
        synchronized(this) {
            for(int i = 0; i < 3; i++) {
                System.out.println(i + "번째");
                try {Thread.sleep(1000);} catch (InterruptedException e) {}
            }
        }
    }
}

public class KeyObject_1 {
    public static void main(String[] args) {
        // 공유 객체
        MyData myData = new MyData();
        // 3개의 쓰레드가 각각의 메서드 호출
        new Thread() {
            public void run() {
                myData.abc();
            };
        }.start();
        new Thread() {
            public void run() {
                myData.bcd();
            };
        }.start();
        new Thread() {
            public void run() {
                myData.cde();
            }
        }.start();
    }
}

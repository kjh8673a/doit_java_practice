package sec03_throwsexception.ex03_ThrowsException_3;

// 1. 하위 메서드에 직접 예외를 처리할 때
class A {
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Class cls = Class.forName("java.lang.Object"); // ClassNotFoundException
            Thread.sleep(1000); // InterruptedException
        } catch (InterruptedException e) {
            // 예외 처리 구문
        }
    }
}

// 2. 예외를 호출 메서드로 전가할 때
class B {
    void abc() {
        try {
            bcd(); // InterruptedException
        } catch (InterruptedException e) {
            // 예외 처리 구문
        }
    }
    void vcd() throws InterruptedException, ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object"); // ClassNotFournException
        Thread.sleep(1000); // InterruptedException
    }
}
public class ThrowsException_3 {
    public static void main(String[] args) {
        
    }
}

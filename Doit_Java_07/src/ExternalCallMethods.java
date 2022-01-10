package src;

// 클래스의 정의
class A2 {
    // 리턴 타입 void, 입력매개변수 없음.
    void print() {
        System.out.println("안녕");
    }

    // 리턴 타입 int, 입력매개변수 없음.
    int data() {
        return 3;
    }

    // 리턴 타입 double, 입력매개변수 2개
    double sum(int a, double b) {
        return a + b;
    }

    // 리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
    void printMonth(int m) {
        if (m < 0 || m > 12) {
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m + "월입니다.");
    }
}

public class ExternalCallMethods {
    public static void main(String[] args) {
        // 객체 생성
        A2 a2 = new A2();
        // 메서드 호출(멤버 활용)
        a2.print();
        int k = a2.data();
        a2.data();
        System.out.println(k);
        double result = a2.sum(3, 5.2);
        System.out.println(result);
        a2.printMonth(5);
        a2.printMonth(15);
    }
}

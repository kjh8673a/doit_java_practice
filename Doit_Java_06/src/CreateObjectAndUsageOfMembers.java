// 클래스(붕어빵 기계) 정의
class A06 {
    int m = 3;

    void print() {
        System.out.println("객체 생성 및 활용");
    }
}

public class CreateObjectAndUsageOfMembers {
    public static void main(String[] args) {
        // 클래스로 객체(붕어빵) 생성
        A06 a06 = new A06();

        // 클래스 멤버 활용(붕어빵 먹기)
        // @필드 활용: 필드에 값을 읽기 / 쓰기
        a06.m = 5;
        System.out.println(a06.m);

        // @메서드 활용:메서드를 호출
        a06.print();
    }
}

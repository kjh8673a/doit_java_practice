// 클래스의 정의
class A07tm1 {
    A07tm1() {
        System.out.println("첫 번째 생성자");
    }
    A07tm1(int a) {
        this(); // 반드시 생성자의 첫 줄에 위치해야 함.
        System.out.println("두 번째 생성자");
    }
    /*
    void abc() {
        this(); // 메서드에서는 this() 메서드 사용 불가능
    }
    */
}
public class ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        A07tm1 a1 = new A07tm1(); // 첫 번째 생성자 호출
        System.out.println();
        A07tm1 a2 = new A07tm1(3); // 두 번째 생성자 호출(생성자의 내부에서 첫 번째 생성자 호출)
    }
}
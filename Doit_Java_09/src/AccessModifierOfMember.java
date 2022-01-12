import sec01_1.A;
import sec01_1.B;
import sec01_2.C;
import sec01_2.D; // 서로 다른 패키지에 있는 A, B, C, D 클래스 임포트

public class AccessModifierOfMember {
    public static void main(String[] args) {
        // 클래스의 객체 생성 및 print() 메서드 호출
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}

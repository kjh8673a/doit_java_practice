package sec01_2;

import sec01_1.A;

public class D extends A { // D 클래스는 A 클래스의 자식 클래스
    public void print() {
        // 멤버 활용
        System.out.print(a + " "); // 자식 클래스는 다른 패키지에 있어도 객체의 생성없이 protected 접근 지정자 필드까지 접근 가능
        System.out.print(b + " ");
        // System.out.print(c + " ");
        // System.out.print(d);
        System.out.println();
    }
}

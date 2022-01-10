class A07tm2 {
    int m1, m2, m3, m4;

    A07tm2() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    A07tm2(int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    A07tm2(int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() { // class A07tm2 의 모듵 필드값을 출력
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}

class B07tm2 {
    int m1, m2, m3, m4;

    B07tm2() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    B07tm2(int a) {
        this(); // B07tm2() 생성자 호출
        m1 = a;
    }

    B07tm2(int a, int b) {
        this(a); // B07tm2(int a) 생성자 호출
        m2 = b;
    }

    /*
     * B07tm2(int a, int b) { // B07tm2() 생성자를 호출하고, 두 필드값을 한 번에 수정할 수도 있음.
     * this();
     * m1 = a;
     * m2 = b;
     * }
     */
    void print() {
        System.out.print(m1 + " ");
        System.out.print(m2 + " ");
        System.out.print(m3 + " ");
        System.out.print(m4);
        System.out.println();
    }
}

public class ThisMethod_2 {
    public static void main(String[] args) {
        // 3가지 객체 생성(this() 미사용)
        A07tm2 a1 = new A07tm2();
        A07tm2 a2 = new A07tm2(10);
        A07tm2 a3 = new A07tm2(10, 20);
        a1.print();
        a2.print();
        a3.print();
        System.out.println();

        // 3가지 객체 생성(this() 사용)
        B07tm2 b1 = new B07tm2();
        B07tm2 b2 = new B07tm2(10);
        B07tm2 b3 = new B07tm2(10, 20);
        b1.print();
        b2.print();
        b3.print();
    }
}

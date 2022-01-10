class A07d {
    int m;

    void work() {
        System.out.println(m);
    }
    // 생성자를 포함하지 않으면 컴파일러가 기본 생성자를 자동으로 추가
    /*
     * A07d() {
     * 
     * }
     */
}

class B07d {
    int m;

    void work() {
        System.out.println(m);
    }

    // 기본 생성자를 직접 정의
    B07d() {

    }
}

class C07d {
    int m;

    void work() {
        System.out.println(m); // 생성자로 넘어온 값
    }

    // 입력매개변수를 포함하고 있는 생성자 정의
    C07d(int a) {
        m = a; // 입력매개변수로 전달된 값으로 필드 초기화
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {

        // 클래스의 객체 생성
        A07d a = new A07d(); // 컴파일러가 자동으로 추가한 기본 생성자를 호출해 객체 생성
        B07d b = new B07d(); // 직접 정의한 기본 생성자를 호출해 객체 생성
        // C c = new C(); // 기본 생성자 호출 불가능
        C07d c = new C07d(3); // 직접 정의한 생성자를 호출해 객체 생성

        // 메서드 호출
        a.work();
        b.work();
        c.work();
    }
}
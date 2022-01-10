// 클래스 생성
class A07f {
    int m = 3; // 필드
    int n = 4; // 필드
    void work1() {
        int k = 5; // 지역 변수
        System.out.println(k);
        work2(3); // work2() 안에 정의된 지역 변수를 스택 메모리에 추가
    }
    void work2(int i) { // 인수를 변수 i에 대입해 입력매개변수로 활용
        int j = 4;
        System.out.println(i + j);
    }
}
public class FieldComponent {
    public static void main(String[] args) {
        A07f a = new A07f();
        System.out.println(a.m);
        System.out.println(a.n);
        a.work1(); // work1() 안에 정의된 지역 변수를 스택 메모리에 추가
    }
}
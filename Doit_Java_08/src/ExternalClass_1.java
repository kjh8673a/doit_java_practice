class A08e { // 외부 클래스는 public 선언 불가능
    int m = 3;
    int n = 4;

    void print() {
        System.out.println(m + ", " + n);
    }
}

public class ExternalClass_1 {
    public static void main(String[] args) {
        A08e a08e = new A08e(); // public 여부와 관계엾이 같은 패키지 내에서는 객체의 생성 및 활용 가능
        a08e.print(); 
    }
}

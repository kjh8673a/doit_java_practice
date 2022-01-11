import sec01.A; // sec01 패키지 내의 A 클래스를 임포트

public class PackageImport_2 {
    public static void main(String[] args) {
        A a = new A(); // 클래스 A를 임포트했으므로 A a = new A()로 객체 생성 가능

        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}

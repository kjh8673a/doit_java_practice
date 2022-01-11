public class PackageImport_1 {
    public static void main(String[] args) {
        sec01.A a = new sec01.A(); // 다른 패키지의 클래스를 사용할 때는 패키지명을 포함한 풀네임을 사용해야 함.

        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}

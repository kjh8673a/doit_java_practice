package StaticField;

class Asf {
    int m = 3; // 인스턴스 필드
    static int n = 5; // 정적 필드
}

public class StaticField_2 {
    public static void main(String[] args) {
        Asf a1 = new Asf();
        Asf a2 = new Asf();

        // 인스턴스 필드
        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m); // 5
        System.out.println(a2.m); // 6

        // 정적 필드
        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n); // 8
        System.out.println(a2.n); // 8

        Asf.n = 9;
        System.out.println(a1.n); // 9
        System.out.println(a2.n); // 9
    }
}

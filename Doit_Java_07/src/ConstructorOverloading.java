class A07c {
    A07c() {
        System.out.println("첫 번째 생성자");
    }
    A07c(int a) {
        System.out.println("두 번째 생성자");
    }
    A07c(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        A07c a1 = new A07c();
        A07c a2 = new A07c(3);
        A07c a3 = new A07c(3, 5); 
    }
}
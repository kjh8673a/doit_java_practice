package sec01_1;

public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4; // public부터 private까지 4가지의 서로 다른 접근 지정자를 포함하고 있는 필드 선언

    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d); // 같은 클래스 내의 멤버인 print() 메서드 내부에서는 모든 접근 지정자에 접근 가능
        System.out.println();
    }
}

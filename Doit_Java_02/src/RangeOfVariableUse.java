public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3; // 변수 value1이 생성되는 시점
        {
            int value2 = 5; // 변수 value2가 생성되는 시점
            System.out.println(value1); // 3
            System.out.println(value2); // 5
        } // 변수 value2가 사라지는 시점

        System.out.println(value1); // 3
        // System.out.println(value2); // 오류
    } // 변수 value1이 사라지는 시점
}
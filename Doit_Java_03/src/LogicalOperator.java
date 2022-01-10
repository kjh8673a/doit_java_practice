public class LogicalOperator {
    public static void main(String[] args) {
        // 논리 연산자
        // @AND (&&)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && (5 < 3));
        System.out.println((5 <= 5) && (7 > 2)); // true
        System.out.println();

        // @OR (||)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || (5 < 3)); // false
        System.out.println((5 <= 5) || (7 > 2)); // true
        System.out.println();

        // @XOR (^)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ (5 < 3)); // false
        System.out.println((5 <= 5) ^ (7 > 2)); // false
        System.out.println();

        // @NOT (!)
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(false || !(5 < 3)); // true
        System.out.println((5 <= 5) || !(7 > 2)); // true
        System.out.println();

        // 비트 연산자로 논리 연산 수행
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(true | (5 < 3)); // true
        System.out.println((5 <= 5) | (7 > 2)); // true
        System.out.println();

        // @쇼트 서킷 사용 여부 (논리 연산자는 O, 비트 연산자는 X)
        int value1 = 3;
        System.out.println(false && ++value1 > 6); // false (수행하지 않음)
        System.out.println(value1); // 3

        int value2 = 3;
        System.out.println(false & ++value2 > 6); // false (수행함)
        System.out.println(value2); // 4

        int value3 = 3;
        System.out.println(true || ++value3 > 6); // true (수행하지 않음)
        System.out.println(value3); // 3

        int value4 = 3;
        System.out.println(true | ++value4 > 6); // true (수행함)
        System.out.println(value4); // 4
    }
}
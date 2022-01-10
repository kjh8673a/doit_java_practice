public class TypeCasting_1 {
    public static void main(String[] args) {
        // 캐스팅 방법 1: 자료형
        int value1 = (int) 5.3;
        long value2 = (long) 10;
        float value3 = (float) 5.8;
        double value4 = (double) 16; // (자료형) 삽입으로 타입 변환

        System.out.println(value1); // 5
        System.out.println(value2); // 10
        System.out.println(value3); // 5.8
        System.out.println(value4); // 16.0
        System.out.println();

        // 캐스팅 방법 2: L, F
        long value5 = 10L;
        long value6 = 10l; // long형으로 타입 변환
        float value7 = 5.8F;
        float value8 = 5.8f; // float형으로 타입 변환

        System.out.println(value5); // 10
        System.out.println(value6); // 10
        System.out.println(value7); // 5.8
        System.out.println(value8); // 5.8
    }
}

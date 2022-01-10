public class OperationBetweenDataType {
    public static void main(String[] args) {
        // 같은 자료형 간의 연산
        int value1 = 3 + 5;
        int value2 = 8 / 5; // int / int = int
        float value3 = 3.0f + 5.0f;
        double value4 = 8.0 / 5.0;

        byte data1 = 3;
        byte data2 = 5;
        // byte value5 = data1 + data2; // data1 + data2는 int형이므로 오류 발생 (byte=int형태)
        int value5 = data1 + data2;

        System.out.println(value1); // 8
        System.out.println(value2); // 1
        System.out.println(value3); // 8.0
        System.out.println(value4); // 1.6
        System.out.println(value5); // 8
        System.out.println();

        // 다른 자료형 간의 연산
        // int value6 = 5 + 3.5; // 5 + 3.5는 double형이므로 오류 발생 (int=double형태)
        double value6 = 5 + 3.5;
        int value7 = 5 + (int)3.5;

        double value8 = 5 / 2.0;
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4;
        double value10 = data3 + data4; // data3 + data4는 int형이므로 자동 타입 변환 수행

        System.out.println(value6); // 8.5
        System.out.println(value7); // 8
        System.out.println(value8); // 2.5
        System.out.println(value9); // 8
        System.out.println(value10); // 8.0

    }
}

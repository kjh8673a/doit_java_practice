// length() : 문자열의 길이를 리턴한다.
// charAt() : 문자열에서 특정 인덱스에 위치해 있는 문자를 알아 낸다.
// indexOf() : 문자열에서 특정 문자나 특정 문자열을 뒤에서부터 찾아 위칫값을 알아낸다.
// String.valueOf() : 기본 자료형을 문자열로 바꾸는 정적 메서드다.
// concat() : 2개의 문자열을 연결한다. + 연산자와 동일한 기능을 수행한다.
// getBytes() : 문자열을 byte 배열로 변환한다. 자바 입출력 과정에서 주로 사용한다.
// toCharArray() : 문자열을 char 배열로 변환한다. 자바 입출력 과정에서 주로 사용한다.

import java.util.Arrays;

public class MethodsOfString_1 {
    public static void main(String[] args) {
        // 문자열 길이
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13
        System.out.println();

        // 문자열 검색
        // @charAt()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();

        // @indexOf(), lastIndexOf()
        System.out.println(str1.indexOf('a')); // 앞에서부터 첫 번째 'a'가 위치한 인덱스
        System.out.println(str1.lastIndexOf('a')); // 뒤에서부터 첫 번째 'a'가 위치한 인덱스
        System.out.println(str1.indexOf('a', 8));
        System.out.println(str1.lastIndexOf('a', 8));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.lastIndexOf("Java"));
        System.out.println(str2.indexOf("하세요"));
        System.out.println(str2.lastIndexOf("하세요"));
        System.out.println(str2.indexOf("Bye")); // 해당 문자(열)이 없는 경우 -1 리턴
        System.out.println(str2.lastIndexOf("고맙습니다."));
        System.out.println();

        // 문자열 변환 및 연결
        // @String.valueOf(기본 자료형): 기본 자료형 -> 문자열 변환
        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3); // 2.3
        System.out.println(str4); // false

        // @concat(): 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5); // 2.3false

        // String.valueOf() + concat()
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));

        // 문자열 byte[] 또는 char[]로 변환
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";

        // @getBytes(): 문자열 -> byte[] 변환
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1)); // [72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 33]
        System.out.println(Arrays.toString(array2)); // [-66, -56, -77, -25, -57, -49, -68, -68, -65, -28]

        // @toCharArray(): 문자열 -> char[] 변환
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3)); // [H, e, l, l, o, , J, a, v, a, !]
        System.out.println(Arrays.toString(array4)); // [안, 녕, 하, 세, 요]
    }
}
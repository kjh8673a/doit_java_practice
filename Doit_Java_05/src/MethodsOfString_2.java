// toLowerCase() : 영문 문자를 모두 소문자로 변환한다.
// toUpperCase() : 영문 문자를 모두 대문자로 변환한다.
// relace() : 일부 문자열을 다른 문자열로 대체한다.
// substring() : 문자열의 일부만을 포함하는 새로운 문자열 객체를 생성한다.
// split() : 특정 기호를 기준으로 문자열을 분리한다.
// trim() : 문자열의 좌우 공백을 제거한다.
// equals() : 두 문자열의 위칫값이 아닌 실제 데이터값을 비교한다. 이때 대소문자를 구분한다.
// equalsIgnoreCase() : 두 문자열의 위칫값이 아닌 실제 데이터값을 비교한다. 이때 대소문자을 구분하지 않는다.

package src;

import java.util.Arrays;

public class MethodsOfString_2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), tUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // @replace()
        System.out.println(str1.replace("Study", "공부")); // Java 공부

        // @substring()
        System.out.println(str1.substring(0, 5)); // Java

        // @split()
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray)); // [abc, def, ghi, jkl]

        // @trim()
        System.out.println("   abc   ".trim()); // abc

        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @stack 메모리 비교(==): 위치(번지) 비교
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str4 == str2); // false

        // @equals(), equalsIgnoreCase(): 내용 비교
        System.out.println(str2.equals(str3)); // ture
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equalsIgnoreCase(str4)); // true
    }
}

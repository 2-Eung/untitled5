import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println(message.length()); // 문자열의 길이
        System.out.println(message.toUpperCase()); // 문자열을 모두 대문자로 변환
        System.out.println(message.toLowerCase()); // 문자열을 모두 소문자로 변환
        System.out.println(message.indexOf("l")); // 특정 요소와 같은 인덱스번호를 출력하고 종료. 인덱스번호여서 0 부터 세야한다. (공백포함)
        /*int a;
        for (int i = 0; i < message.length; i++) {
            if (message[i] == "J"){ // 일반적인 배열이 아니라 String을 이용한 '문자열' 이어서 배열명[n] 으로 접근이 불가능하다.
                a = i;
                System.out.println(i);
            }*/
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'l') { // '문자' 여서 ' ' 를 사용한다.
                System.out.println(i);
            }
        }
        System.out.println(message.substring(3,8)); // 뒤의 숫자부터는 출력하지 않는다.
        System.out.println(message.charAt(11));     // 스트링은 널문자가 없나??? 12하면 오류난다.

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0,7));
        System.out.println(address.substring(37,42));
        System.out.println(address.substring(address.length()-5 , address.length())); // 노란밑줄은 입력안하면 어짜피 끝값인데 끝값을 왜입력했냐

    }
}
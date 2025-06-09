import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.indexOf("l")); // 인덱스번호여서 0 부터 세야한다. (공백포함)
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
    }
}
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {2, 4, 6, 8, 10};
        for (int i = 0; i < numbers.length; i++) { // 여기서 '배열'의 length 는 값이 고정되어있기에 값의 의미로 쓰인다.
            sum += numbers[i];
        }
        System.out.println(sum);

        String message = "Hello, Java!";             // 아래에서 '문자열'의 length 는 값이 고정되어있지 않기에
        for (int i = 0; i < message.length(); i++) { // 함수로 그 값을 구하고 사용되어야 해서 ()이 포함된 함수 이다.
            if (message.charAt(i) == 'l') { // '문자' 여서 ' ' 를 사용한다.
                System.out.println(i);
            }
        }
    }
}
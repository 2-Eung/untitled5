import java.util.Arrays;
public class Main {
    public static int sums(int[] a) { // 굳이 함수로 할 필요는 없다 있다면 2,3,4,5,배수로 n개의 숫자를 출력한다 라고하면
        int dd = 0;                   // 매개변수로 배수의 값과 n 을 받아서 함수형식으로 만들 수 있다.
        for (int i = 0; i < a.length; i++) {
            dd += a[i];
        };
        return dd;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = sums(numbers);
        System.out.println(sum);
    }
}
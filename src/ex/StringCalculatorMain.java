package ex;

import java.util.Scanner;

public class StringCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringCalculator cal = new StringCalculator();
        StringSplit split = new StringSplit();

        System.out.println("계산식을 입력하세요: ");
        String value = scanner.nextLine();

        String[] values = split.split(value);

        int result = cal.calculate(values);
        System.out.println("결과: " + result);

    }
}

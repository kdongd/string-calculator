package ex;



public class StringCalculator {


     public int calculate(String[] values) {
         int result = exception(values[0]);

         for (int i = 1; i < values.length; i += 2) {
             String operator = values[i];
             int number = Integer.parseInt(values[i+1]);

             switch (operator) {
                 case "+" :
                     result += number;
                     break;

                 case "-" :
                     result -= number;
                     break;

                 case "*" :
                     result *= number;
                     break;

                 case "/" :
                     result /= number;
                     break;

                 default :
                     throw new IllegalArgumentException("잘못된 연산자 입력: " + operator);
             }
         } return result;
     }

     private int exception(String value) {
         try {
             return Integer.parseInt(value);
         } catch (NumberFormatException e) {
             throw new IllegalArgumentException("첫 값은 숫자를 입력해야 합니다: " + value);
         }
     }


}

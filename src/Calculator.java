import java.util.Scanner;

public class Calculator {
    Num num = new Num();
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] array = input.split("\\s");

    public void getResult(){
        calculate(array[0], array[2], array[1]);
    }

    public void calculate(String str1, String str2, String op) {
        if (num.checkNumberType(str1) && num.checkNumberType(str2)){
            int number1 = Integer.parseInt(str1);
            int number2 = Integer.parseInt(str2);
            num.checkRange(number1);
            num.checkRange(number2);
            System.out.println(evaluate(number1, number2, op));
        }
        else {
            System.out.println(evaluate(str1, str2, op));
        }
    }

    public int evaluate(int num1, int num2, String op){
        int output;
        switch(op) {
            case "+":
                output = num1 + num2;
                break;
            case "-":
                output = num1 - num2;
                break;
            case "/":
                output = num1 / num2;
                break;
            case "*":
                output = num1*num2;
                break;
            default:
                output = 0;
        }
        return output;
    }

    public String evaluate(String str1, String str2, String op){
        Roman roman1 = new Roman();
        Roman roman2 = new Roman();
        roman1.romanToDecimal(str1);
        roman2.romanToDecimal(str2);
        int num1 = roman1.getDecimal();
        int num2 = roman2.getDecimal();

        int intermediate = this.evaluate(num1, num2, op);
        roman1.decimalToRoman(intermediate);
        String output = roman1.getRoman();
        return output;
    }

}

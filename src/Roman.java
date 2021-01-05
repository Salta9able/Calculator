public class Roman {
    int decimal;
    String roman;

    public void romanToDecimal(String element) {
        switch (element) {
            case "I":
                decimal = 1;
                break;
            case "II":
                decimal = 2;
                break;
            case "III":
                decimal = 3;
                break;
            case "IV":
                decimal = 4;
                break;
            case "V":
                decimal = 5;
                break;
            case "VI":
                decimal = 6;
                break;
            case "VII":
                decimal = 7;
                break;
            case "VIII":
                decimal = 8;
                break;
            default:
                throw new NumberFormatException("out of range");
        }
    }

    public void decimalToRoman(double inp) {
        int element;
        if (inp % 1 == 0) {
            element = (int) inp;
        }
        else {
            element = (int) Math.ceil(inp);
        }
        switch (element) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
            case 10:
                roman = "X";
                break;
            default:
                System.out.println("for output larger than 10 please switch to decimal numbers");
        }
    }

    public int getDecimal() {
        return decimal;
    }
    public String getRoman(){
        return roman;
    }
}

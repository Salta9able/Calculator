
public class Num {

    public boolean checkNumberType(String str) {
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }

    public void checkRange(int number){
        if (number > 10 || number <= 0) {
            throw new IllegalArgumentException("please enter numbers within range from 1 to 10");
        }
    }
}

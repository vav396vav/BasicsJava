package Final.qwen;

public class FinalCheck {
    public boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public String reverseStrinhg(String input){
        if (input == null){
            return null;
        }else {
            return input;
        }
    }

    public int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        if (array == null ){
            throw new IllegalArgumentException("Array is null or empty");
        }else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }
}

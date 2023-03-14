import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



    }


    static int singleNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;

    }

    static int minSplit(int amount) {
        int res = 0;
        int[] arr = {50, 20, 10, 5, 1};
        for (int j : arr) {
            int currentcoins = amount / j;
            res += currentcoins;
            amount = amount - j * currentcoins;


        }


        return res;
    }

    static int notContains(int[] array) {
        Arrays.sort(array);
        int min = 1;
        for (int j : array) {
            if (j == min) {
                min++;
            }
        }
        return min;

    }
     static String binaryAdd(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    static int countVariants(int stairsCount){
        if (stairsCount==1||stairsCount==2){
            return stairsCount;
        }
        int current=0;
        int previous=2;
        int previous2=1;
        for (int i=3;i<stairsCount;i++){
            current+=previous+previous2;
            previous2=previous;
            previous=current;
        }
        return current;


    }


}

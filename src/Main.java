import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("a");


        sum(14, 15);
        System.out.println(PISq());
        System.out.println(susumuota(2, 8));
        int[] numbers = {4, 8, 9, 7, 2};
        printArr(numbers);
        System.out.println(numbers);
        printArr(randomArr(2, 9));
        System.out.println(" ");
        System.out.println("----------6---------");

        System.out.println(arrSum(randomArr(2, 9)));

        System.out.println("-------------7---------------");
        System.out.println(arrMiddle(randomArr(2,9)));

        System.out.println("------------8-----------");


    }


    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int susumuota(int k, int o) {
        return (k * o);
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }


    public static int[] randomArr(int min, int max) {
        int[] numbers2 = new int[5];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = min + (int) (Math.random() * (max - min));

        }
        return numbers2;
    }

    public static int arrSum ( int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static int arrMiddle (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / arr.length;
        }
        return sum;
    }









}
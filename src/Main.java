import java.sql.SQLOutput;
import java.util.Arrays;

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
        System.out.println(arrMiddle(randomArr(2, 9)));

        System.out.println("------------8-----------");
        int square1 = 6;
        int square2 = 8;
        Square(20, 5);
        System.out.println("--------------9----------------");
        System.out.println("sakinyje yra raidziu ir tarpu: " + sentenceLoop("Šiandien labai graži diena"));
        System.out.println("-------------10---------------");
        System.out.println("uzkoduotas sakinys: " + sentenceLoopBack("uzkoduotas sakinys"));
        String sentence = "cia yra sakinys";
        System.out.println("--------------1---------------");
        text(sentence);
        System.out.println("-----------------2--------------");
//        String result = randomString(15);
//        System.out.println(result);
//        printLettersAndNumbers(result);
        System.out.println(randomMixedString(20));
        System.out.println("-------3-------");
//        System.out.println(roundnumber(8));

//        int[] array = {3,8,7,2,6};
//        String prntArray = sortArray(array);
//        System.out.println(prntArray);

//        int min = 33;
//        int max = 100;
        System.out.println(rndArray(22,100));

        sortArray(rndArray(4,4));
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

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static double arrMiddle(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / (double) arr.length;
        }
        return sum;
    }


    public static void Square(int square1, int square2) {
        for (int i = 0; i < square1; i++) {
            String x = "";
            for (int a = 0; a < square2; a++) {
                x += "*";
            }
            System.out.println(x);
        }
    }


    public static int sentenceLoop(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            count += +1;
        }
        return count;
    }


    public static String sentenceLoopBack(String sentence) {
        int i, len = sentence.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--) {
            dest.append(sentence.charAt(i));
        }

        return dest.toString();
    }


    public static void text(String sentence) {
        System.out.println("-----" + sentence + "-------");
    }


//    public static String randomString(int lenght) {
//        String rndString = "abcdefghijklmnopqrstuvwxyz0123456789";
//        String random = "";
//
//        for (int i = 0; i < lenght; i++) {
//            random += rndString.charAt((int) (Math.random() * rndString.length()));
//        }
//
//
//        return random;
//    }
//
//    public static void printLettersAndNumbers(String text){
//        for (int i = 0; i < text.length(); i++) {
//            System.out.println(text.charAt(i));
//            System.out.println(Character.isDigit(text.charAt(i)));
//
//
//
//
//        }
//    }

    public static int randomMixedString(int length) {

        String alphanumeric = "abcdefghijklmnopqrstuvwxyz0123456789";
        String rndStr = "";

        for (int i = 0; i < length; i++) {
            rndStr += alphanumeric.charAt((int) (Math.random() * alphanumeric.length()));
        }
        System.out.println(rndStr);


        String nums = "";
        for (int i = 0; i < rndStr.length(); i++) {
            if (Character.isDigit(rndStr.charAt(i))) {
                nums += rndStr.charAt(i);


            } else {
                if (nums.length() != 0) {
                    System.out.println("[" + nums + "]");
                    nums = "";
                }
                System.out.println(rndStr.charAt(i));
            }

        }


        return length;
    }


public static int roundnumber( int number){
        int count = 0;
    for (int i = 2; i <= number ; i++) {
        if (number % i == 0)
    count++;
    }
    return count;
}

public static int[] rndArray(int min, int max){
        int[] arr = new int [ 5 ];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = min + (int) (Math.random() * (max - min +1));
        System.out.println(arr[i] );

    }
    System.out.println(" ");
    return arr;
}
    
    public static int[] sortArray (int [] number) {
        for (int i = 0; i < number.length; i++) {
            for (int a = i; a < number.length; a++) {
                if (roundnumber(number[i]) > roundnumber(number[a])) {
                    int temp = number[i];
                    number[i] = number[a];
                    number[a] = temp;


                }
                System.out.println(Arrays.toString(number));
            }
        }
        return number;


    }
}
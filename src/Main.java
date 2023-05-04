import java.io.FileInputStream;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner skanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс массива в который хотите запимать значение 1");
//        int index ;
//        while (true) {
//            try {
//                 index = skanner.nextInt();
//                 break;
//
//            } catch (Exception e) {
//                System.out.println("введено не число");
//                skanner.next();
//            }
//        }
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Индекс за пределвами массива");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
//        System.out.println(sum);
//    }
//
//    private static int sum2d(String[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//           for (int j = 0; j < arr[i].length; j++) {
//                try {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                } catch (Exception e) {
//                    int val = 0;
//                    sum += val;
//                }
//            }
//        }
//        return sum;
//    }
//}

public class Main {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (Throwable e) {
            e.printStackTrace();
/* } catch (StackOverflowError error) {
System.out.println("Что-то сломалось");*/
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }
}
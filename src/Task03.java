import java.util.Arrays;
import java.util.Scanner;

//Task03: Дан Массив nums = [3, 2, 4, 3, 3, 1, 5, 3, 3,]  и число val = 3,
//Если в массиве есть числа, равные заданному, нужно перенести их  в конец массива.
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[] nums = {3, 2, 3, 4, 2, 3, 1, 5, 3, 3};
//        int[] nums = {3, 2, 4, 3, 1, 5, 3, 3};
        System.out.println(Arrays.toString(nums));
//        var lastElement = nums[nums.length - 1];
        System.out.println("Enter val:   ");
        int val = sc.nextInt();
        int temp = 0;

        for (int i = 1; i < nums.length; i++) {
            {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j-1] == val) {
                        temp = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = temp;
                    }
                }
                System.out.println(Arrays.toString(nums));
            }
        }
    }
}

//Second:
//public class Task03 {
//    public static void main(String[] args) {
//        int[] array = { 3,2,4,3,3,1,5,3,3 };
//        int value = 3;
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3){
//                counter += 1;
//            }
//        }
//        for (int i = 0; i < array.length - counter; i++) {
//            if (array[i] == value) {
//                for (int j = i; j < array.length - 1; j++) {
//                    array[j] = array[j+1];
//                }
//                array[array.length -1] = value;
//                i--;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}

//Third:
//
//import java.util.Arrays;
//
//public class Task03
//{public static void main(String[] args) {
//    int[] array = new int[] {3,2,4,3,3,1,5,3,3};
//    int val = 3;
//    int counter = 0;
//    for (int i = 0; i < array.length; i++) {
//        if (array[i] != val) {
//            array[counter] = array[i];
//            array[i] = val;
//            counter += 1;
//        }
//    }
//    System.out.println(Arrays.toString(array));
//}
//}
//4th

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Task03 {
//    public static void main(String[] args) {
//        int [] arr = new int[]{1,2,4,5,3,3}; // 1 2 4 5 3 3 3 3 3
//        int val = 3;
//        int count = 0;//4
//
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] != val) {
//                arr[count++] = arr[i];
//            }
//
//        while (count < arr.length)
//            arr[count++] = val;
//
//// for (int i : arr) {
//// System.out.println(i);
//// }
//        System.out.println(Arrays.toString(arr));
//    }
//}
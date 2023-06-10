//Task02:       Вывести максимальное количество подряд идущих чисел.
public class Task02 {
    public static void main(String[] args) {


        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                current += 1;
            } else {
                if (current > count) {
                    count = current;
                }
                current = 0;
            }
        }
        if (current > count) {
            count = current;
        }
        System.out.println(count);
    }
}
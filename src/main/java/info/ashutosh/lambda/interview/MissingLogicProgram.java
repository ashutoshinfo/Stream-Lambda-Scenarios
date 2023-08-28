package info.ashutosh.lambda.interview;
import java.util.ArrayList;
import java.util.List;

public class MissingLogicProgram {

    public static void main(String[] args) {
        Integer[] a = { 5, 8, 6, 2, 9, 7 };
        Integer[] b = { 6, 2, 5, 8, 1, 3 };

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean flag = false; // Initialize flag for each element of 'a'

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                integers.add(a[i]);
            }
        }
        System.out.println(integers);
    }
}

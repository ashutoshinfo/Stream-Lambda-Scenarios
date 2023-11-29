package info.ashutosh.lambda.interview;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatedNumbers {

    public static void main(String[] args) {
        Integer[] a = { 5, 8, 6, 2, 9, 7 };
        Integer[] b = { 6, 2, 5, 8, 1, 3 };

        List<Integer> nonRepeatedNumbers = findNonRepeatedNumbers(a, b);
        System.out.println("Non-repeated numbers: " + nonRepeatedNumbers);
    }

    public static List<Integer> findNonRepeatedNumbers(Integer[] a, Integer[] b) {
        Map<Integer, Long> numberCounts = new HashMap<>();
        
        for (Integer num : a) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0L) + 1);
        }

        for (Integer num : b) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0L) + 1);
        }

        return numberCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

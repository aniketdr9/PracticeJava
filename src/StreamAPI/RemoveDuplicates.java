package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 8, 9, 10, 11);
        List<Integer> distinctNumber = numbers.stream().distinct().collect(Collectors.toList());
        System.out.print(distinctNumber);
    }
}

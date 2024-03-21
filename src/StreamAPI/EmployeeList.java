package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob","Candice", "Dean", "Freddy", "Enum", "Greg", "Hank", "Izzy");

        names.stream().forEach(System.out::println);
    }
}

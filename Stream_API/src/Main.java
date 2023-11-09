import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Блок 1\n" + "Задача 1");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long count = numbers.stream().filter(number -> number % 2 == 0).count();
        System.out.println("Количество парных чисел: " + count);

        System.out.println("Задача 2");
        List<String> surnames = List.of("Johnson", "Smith", "Jackson", "Brown", "James");
        surnames = surnames.stream().filter(name -> name != null && !name.trim().isEmpty()).filter(surname -> surname.startsWith("J")).collect(Collectors.toList());
        System.out.println("Фамилии, начинающиеся на 'J': " + surnames);

        System.out.println("Задача 3");
        String[] strings = {"Cherry", "Date", "Police" ,"Apple", "Banana"};
        List<String> sortedStrings = Arrays.stream(strings).sorted().collect(Collectors.toList());
        System.out.println("Отсортированные строки: " + sortedStrings);

        System.out.println("Блок 2\n" + "Задача 1");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        //list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
        System.out.println(getEvenNumbersPro(list));

        System.out.println("Задача 2");
        List<String> names = List.of("Egor", "Max", "Ivan", "Petr", "Patric", "");
        names = names.stream().filter(name -> name != null && !name.trim().isEmpty()).map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Имена приведенные к верхнему регистру: " + names);
        long countNames = names.stream().filter(name -> name != null && !name.trim().isEmpty()).filter(name -> name.startsWith("E")).collect(Collectors.counting());
        System.out.println("Имен начинающихся с буквы E: " + countNames);
    }
    private static List<Integer> getEvenNumbersPro(List<Integer> num){
        return num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

}
package live_coding;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Уникальные числа в списке
 */
public class Exam {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5,  7, 9, 5, 1);

 //       System.out.println(uniqueNumbers(list));

//        Set<Integer> uniqueElements = new HashSet<>(list);
//        System.out.println(uniqueElements);

        Set<Integer> uniqueElements =new HashSet<>();
        uniqueElements.addAll(list);
    }

    public static Set<Integer> uniqueNumbers(List<Integer> numbers) {
        Set<Integer> result = new HashSet<>();
        for(Integer i : numbers) {
            result.add(i);
        }
        return result;
    }
}

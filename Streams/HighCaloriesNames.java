package highcaloriesnames;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;

public class HighCaloriesNames{
    public static void main(String[] args) {
        Dish[] dishesArray = {new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 400, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH)};
        List<Dish> dishesList = Arrays.asList(dishesArray);
        List<String> names = dishesList.stream()
            .filter(x -> x.getCalories() > 300)
            .map(x -> x.getName()).limit(3)
            .collect(toList());
        System.out.println(names);
    }
    
}

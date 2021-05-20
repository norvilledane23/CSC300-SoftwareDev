package randomintstream;
import java.util.stream.*;
import java.security.SecureRandom;

public class RandomIntStream{
    public static void main(String[] args){
        SecureRandom randomNumbers = new SecureRandom();
        
        String numbers = randomNumbers.ints(30, 10, 1001)
            .sorted()
            .filter(x -> x % 2 == 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
	System.out.printf("%s\n", numbers);
    }
}

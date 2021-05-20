package lettergrades;
import java.util.*;
import java.util.stream.Collectors;

public class LetterGrades{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> intGrades = new ArrayList<Integer>();
        int grade = 0;
        
        while(grade != -1){
            System.out.printf("Enter grade or -1 to quit: ");
            grade = scnr.nextInt();
            if(grade != -1){
                intGrades.add(grade);
            }
        }
        System.out.printf("\nGrade Letter\n");
        List<String> letterGrades = intGrades.stream()
                .map(x -> getLetterGrade(x))
                .collect(Collectors.toList());
        
        for(int i = 0;i < intGrades.size();i++){
            System.out.printf("%3d   %2s\n",intGrades.get(i),letterGrades.get(i));
        }
        
    }
    
    public static String getLetterGrade(Integer grade){
        if(grade >= 90){
            return "A";
        }
        
        else if(grade >= 80){
            return "B";
        }
        
        else if(grade >= 70){
            return "C";
        }
        
        else if(grade >= 60){
            return "D";
        }
        return "F";
    }
}

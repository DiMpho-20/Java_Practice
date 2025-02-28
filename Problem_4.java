import java.util.*;

public class Main {
    public static void main(String args[]) {
        List<String> students= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int num_students=scanner.nextInt();
        for (int i=0; i<= num_students;i++){
            String names= scanner.nextLine();
            students.add(names);

        }
        for (int i= 0 ;i< num_students;i++)
        {System.out.println(students.get(i));}
            
        
















           }
}
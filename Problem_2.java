import java.util.*;
import java.util.jar.Attributes;

public class Main{
public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
    String name1= scanner.nextLine();
    String name2=scanner.nextLine();
    char[] name1_1=name1.toCharArray();
    char[] name2_2=name2.toCharArray();
    
    if( name1.length()==name2.length()){
        boolean present = true; 
        for(char i : name1_1){
            boolean found = false;
            for( char j : name2_2){
                if(i==j){
                found=true;
                break;
                }}
                if(!found){
                    present=false;
                    break;
                }
            }
        if (present) {
            System.out.println("True");
        } else {
            System.out.println("False");
            }
        } else{
        System.out.println("False");
    }

    


 }}
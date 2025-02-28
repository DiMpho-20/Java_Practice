 import java.util.*;
 
 
 public class Main{
     public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int numR=scanner.nextInt();
        String[][] matrix= new String[numR][numR];
        for (int i=0; i<numR; i++)
		{
			 
			 for (int j=0; j<numR; j++)
			 {
				 matrix[i][j]="*";

			 }
		}
        int numC=numR;
    for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numC; j++) {
                System.out.print(matrix[i][j] +" ");
                
            }
            numC--;
            
            System.out.println(); 
             
        }
        scanner.close();
    //hehehehhehhehhehehehhehehe did it all on my own 
    // it took me an hour but i still did it heeheheheheheheh

     }
 }
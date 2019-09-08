import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
















        ArrayList A= new ArrayList();
        LinkedList B= new LinkedList();



        double initialTime= System.nanoTime();

        for (int i=1;i<=1000000;i++){
            A.add(1);
        }
        // Addition to Array List of Million Elements
        double finalTime=System.nanoTime()-initialTime;
        System.out.println("The time for adding Array List:");
        System.out.println(finalTime/1000000000);

        double initialTime1= System.nanoTime();
        for (int j=1;j<=1000000;j++){
            B.add(1);
        }
       // Addition to Linked List of million elements
        double finalTime1=System.nanoTime()-initialTime1;
        System.out.println("The time for adding linked List:");
        System.out.println(finalTime1/1000000000);

        double initialTime2= System.nanoTime();
// To access a million elements of Array List
        for (int i=1;i<=1000000;i++){

        }

        double finalTime2=System.nanoTime()-initialTime2;
        System.out.println("The time for accessing Array List:");
        System.out.println(finalTime2/1000000000);

        double initialTime3= System.nanoTime();
        for (int j=1;j<=1000000;j++){

        }
        // Access to Linked List of million elements
        double finalTime3=System.nanoTime()-initialTime3;
        System.out.println("The time for accessing linked List:");
        System.out.println(finalTime3/1000000000);

        double initialTime4= System.nanoTime();
// To delete a million elements of Array List
       int k=999998;
        while ( k>1){
            A.remove(k);
            k--;
        }

        double finalTime4=System.nanoTime()-initialTime4;
        System.out.println("The time for deleting Array List:");
        System.out.println(finalTime4/1000000000);

        double initialTime5= System.nanoTime();
        for (int j=999998;j>=1;j--){
B.remove(j);
        }
        // deletion of  Linked List of million elements
        double finalTime5=System.nanoTime()-initialTime5;
        System.out.println("The time for deleting linked List:");
        System.out.println(finalTime5/1000000000);




    }
}
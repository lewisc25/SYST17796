package objectarrays;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Christopher Lewis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.setName("Tom");
        System.out.println(s1.getName());
        
        
        
        Student [] s = new Student[5]; //create the object array
        
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        for (int i = 0; i < s.length; i++)
        {
            s[i] = new Student();   //need a constructor for each item in the array
            System.out.print("Enter id for student " + (i+1) + ": ");
            s[i].setId(k.nextInt());
            System.out.print("Enter name for student " + (i+1) + ": ");
            s[i].setName(l.nextLine());
        }
        
        for (int x = 0; x <s.length; x++)
        {
            System.out.println("Student " + (x+1) + " name: " + s[x].getName());
        }
    }

}

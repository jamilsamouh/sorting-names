
package jojo;

import java.util.Scanner;

public class alphabaticTest {
public static void main(String[] args){

   char[] name;
        Scanner input=new Scanner(System.in);
       
        do{
            System.out.println("Enter a name tha's less or equal to 5 letters:");
        name=input.nextLine().toCharArray();
        }while(name.length>5);
        alphabatic y=new alphabatic(name);

    System.out.println("The sorted name is :");
    System.out.println(y.Getalphabaticorder());
}
}
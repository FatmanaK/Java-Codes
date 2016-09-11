/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.Y;
/**
 *
 * @author Geraldo
 */
public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic her
         function tempO= new function();
         function2 tempP=new function2();
        System.out.println("Hello Welcome How are you doing today ?");
        Scanner scan= new Scanner(System.in);
        String input=scan.nextLine();
         System.out.println("");
        System.out.println("You Are saying that you are" +" " + input ); 
         System.out.println("");
        System.out.println("Do you want me to go further 1.Yes or 2.No");
        int confirm = scan.nextInt();
         System.out.println("");
        if(confirm==1){
            System.out.println("");
            System.out.println("Today we will convert Temperature into Fahrenheit and  Celcius ");
            System.out.println("");
            System.out.println("Ente the value of the temperature you want to convert");
            int temp= scan.nextInt();
            System.out.println(" Is the temperature value entered in 1.Celcius or 2.Farhrenheit ");
            int  ask =scan.nextInt();
            if(ask==1){
                tempO.converter(temp);
        }
            
           if(ask==2){
                tempP.converter(temp);
               }
        else{
              System.out.println("");
               System.out.println("Have A Nice Day");   
            
              
        }
     }
}
}


 
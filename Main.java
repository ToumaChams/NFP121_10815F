
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main  implements Printable,Showable{

public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");} 


public static void main(String args[]){  
Main obj = new Main();  
obj.print();  
obj.show();  
 }   
    
}



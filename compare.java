import java.util.Scanner;
public class compare{
 public static void main(String[] args){
 Scanner scanner =  new Scanner(System.in);

 System.out.println("enter string1: " );
 String name1= scanner.nextline();
 System.out.println(name1 );
 System.out.println("enter string2: " );
 String name2= scanner.nextline();
 System.out.println(name2 );


 boolean  result =name1.equals(name2);
 System.out.println(result);
 }
} 

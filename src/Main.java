import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Main {

public static void main(String[] args) {

 

Class2 class2 = new Class2();
class2.setX(111);
class2.setTxt("Hey There! Welcome to my Boolean algebra program written in Java. I'm Yunus by the way.");
class2.setOkay("thanks.");
class2.setNotOkay("wrong!");
String instruct = "Enter 111 to confirm your not a robot: \n";
int input1 = 0;

try {

Scanner scanner = new Scanner(System.in);
System.out.println(class2.getTxt()+"\n"+ instruct);
int userInput = scanner.nextInt();
input1=userInput;

CompletableFuture.delayedExecutor(600,TimeUnit.SECONDS).execute(()->{
    scanner.close();
});

}catch(Exception e) {
String errorMsg= "You did NOT enter 111";

System.out.println(errorMsg + "\n" + e);

 
}
 
try {

if(input1==(int) class2.getX()) {
System.out.println(class2.getOkay());
methodTwo(null);
}

if(input1 != (int) class2.getX() && input1 != 0) {
     
        System.out.println(class2.getNotOkay());
        
       System.out.println("Try again? (Y/N)");
       Scanner scannerA = new Scanner(System.in);
       //System.out.println("\n");
       String choice = scannerA.nextLine();
        if(choice.contains("y") || choice.contains("Y")){
 
       main(null);
        }else{
            System.out.println("bye.");
        }

       scannerA.close();

 }

 
}catch(Exception e) {
System.out.println(e);
}



 
  }
 

public static void methodTwo(String[] args) {
System.out.println("*****************************************************************\n");
System.out.println("Basic Boolean Guide: ");
 Scanner scanner2 = new Scanner(System.in);
System.out.println("Type '1' for Annulment Law\n "+
"Type '2' for Identity Law\n"+
 "Type '3' for Idempotent Law \n"+
  "Type '4' for Complement Law \n"+
  "Type '5' for Double Negation Law.\n ");


 int userInput2 = scanner2.nextInt();
   
   
     if(userInput2==1) {
    System.out.println("X . 0 = 0\nX + 1 = 1");
    afterInfoCards(null);
      }
      else if(userInput2==2) {
     System.out.println("X . 1 = X\nX + 0 = X");
     afterInfoCards(null);
     }
     else if(userInput2==3) {
        System.out.println("X . X = X\n	X + X = X");
        afterInfoCards(null);
        }
        else if(userInput2==4) {
            System.out.println("	X . X(inverted) = 0\nX + X(inverted) = 1");
            afterInfoCards(null);
            }
            else if(userInput2==5) {
                System.out.println("	X(double inverted) = X");
                afterInfoCards(null);
                }else{
                    System.out.println("not an acceptable choice. Starting over...");
                    main(null);
                }
  
     scanner2.close();

}

public static void afterInfoCards(String[] args){
System.out.println("*****************************************************************\n");

System.out.println("This is The Interactive Example Area:\n");
System.out.println("In this example we have three different variables.\n");
System.out.println("Let's say we want to simplify a boolean expression that has these 3 variables.\n");
System.out.println("First we need to write down the expression. Let's first determine what are going to be our variables.\n");
System.out.println("You can use letters from A-G in the English alphabet. What will be your first variable?\n");
Scanner scannerExamp = new Scanner(System.in);
String firstVariable = scannerExamp.nextLine();
String firstVar="";
if(firstVariable.contains("A")){
firstVar="A";
System.out.println("Your first var is: "+firstVar);
}

else if(firstVariable.contains("B")){
    firstVar="B";
    System.out.println("Your first var is: "+firstVar);

}

else if(firstVariable.contains("C")){
    firstVar="C";
    System.out.println("Your first var is: "+firstVar);

}

else if(firstVariable.contains("D")){
    firstVar="D";
    System.out.println("Your first var is: "+firstVar);

}

else if(firstVariable.contains("E")){
    firstVar="E";
    System.out.println("Your first var is: "+firstVar);

}

else if(firstVariable.contains("F")){
    firstVar="F";
    System.out.println("Your first var is: "+firstVar);

}

else if(firstVariable.contains("G")){
    firstVar="G";
    System.out.println("Your first var is: "+firstVar);

}

else{
System.out.println("You entered an invalid variable name. Try again.");
}

System.out.println("**************\nYour second variable is 'H' & third is 'K'.");
System.out.println("Now we have '"+firstVar+"' and 'H' and 'K'.");
System.out.println("Here is an example boolean expression with there 3 variables:\n");
System.out.println(firstVar+"H"+"("+firstVar+"+K)");
System.out.println("="+firstVar+"H"+firstVar+"+"+firstVar+"HK");
System.out.println("="+firstVar+firstVar+"H+"+firstVar+"HK");
System.out.println("="+firstVar+"H+"+firstVar+"HK");
System.out.println("="+firstVar+"H");

scannerExamp.close();
}

}


 
import java.util.Scanner;
class Math {
    public static void main(String[] args) {

        Scanner macha = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = macha.nextDouble();
        macha.nextLine();

        System.out.print("Enter number 2: ");
        double number2 = macha.nextDouble();
        macha.nextLine();

        System.out.print("which operation you want to perform?");
        String operation= macha.nextLine();

        if (operation.equals("sum")){
            System.out.printf("the sum of %f and %f is %f", number1, number2, number1  + number2 );
         }

        else if (operation.equals("sub")){
            System.out.printf("the subtraction of %f and %f is %f", number1, number2, number1 - number2 );
        }

        else if (operation.equals("div")){
            if(number2==0){
                System.out.println("you can't divide any number by zero");}
            else{
                System.out.printf("the division %f and %f is %f", number1, number2, number1  / number2 );
            }}

        else if (operation.equals("mult")){
            System.out.printf("the multiplication of %f and %f is %f", number1, number2, number1  * number2 );
        }

        else{
            System.out.println("our system can only perform few operations which are sum, sub, div and mult(for your operation to work correctly write them as they appear here) for further complex calculations visit other sources");
        }
    }
}

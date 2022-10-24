public class Expressionslambda {

    //Lambdas allows us to just pass in a specific implemetation of the print method as the Printable parameter without using all the extra steps
    //lambdas can only be used for functional interfaces.
    //if an interface has more than one abstract method, you cannot use a lambda for iy
    public static void main(String[] args) {
     Cat mycat = new Cat();
     //mycat.print();
     //this is using lambda below

     Printable lambdaPrintable =  (p,s) -> System.out.println("meowww" + s);
     printThing(lambdaPrintable);
}
    public static void printThing(Printable thing){
        thing.print("mrs","!");

    }
}

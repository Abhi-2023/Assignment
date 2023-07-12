// Question 2.. showing inheritance....
class Parent{
    public void display(){
        System.out.println("Parent Class method....");
    }
}
class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Child class overrident method...");
    }
}


// Question 3.. showing runtime polymorphism..
abstract class Infringement {
    void counterfeit(){
        System.out.println("Validate as counterfeit as per requirement ");
    }
    void brandabuse(){
        System.out.println("Validate as brandabuse as per requirement ");
    } 
    void replica(){
        System.out.println("Validate as replica as per requirement");
    }
    void copyright(){
        System.out.println("Validate as copyright as per requirement");
    }
}

class FatBrainToys extends Infringement{
    void counterfeit(){
        System.out.println("Validate the product as counterfeit if the Fat-Brain-Toy is on product");
    }
    void brandabuse(){
        System.out.println("Validate the product as brand abuse if the Fat-Brain-Toy is only in the description");
    }
    void replica(){
        System.out.println("Validate the product as replica if the Fat-Brain-Toy is not presented anywhere and the design of product is same");
    }
    void copyright(){
        System.out.println("Validate the product as copyright if the image of the product is same as given by the client even if the Fat-Brain-Toy is presented anywhere");
    }
} 
class OutwardHound extends Infringement{
    void counterfeit(){
        System.out.println("Validate the product as counterfeit if the Outward-Hound is on product");
    }
    void brandabuse(){
        System.out.println("Validate the product as brand abuse if the Outward-Hound is only in the description");
    }
    void replica(){
        System.out.println("Validate the product as replica if the Outward-Hound is not presented anywhere and the design of product is same");
    }
    void copyright(){
        System.out.println("Validate the product as copyright if the image of the product is same as given by the client even if the Outward-Hound is presented anywhere");
    }
} 
class BuffaloGames extends Infringement{
    void counterfeit(){
        System.out.println("Validate the product as counterfeit if the Buffalo-Games is on product");
    }
    void brandabuse(){
        System.out.println("Validate the product as brand abuse if the Buffalo-Games is only in the description");
    }
    void replica(){
        System.out.println("Validate the product as replica if the Buffalo-Games is not presented anywhere and the design of product is same");
    }
    void copyright(){
        System.out.println("Validate the product as copyright if the image of the product is same as given by the client even if the Buffalo-Games is presented anywhere");
    }
    void discard(){
        System.out.println("If any of the above condition doesn't lies then discard...");
    }
} 

class Validation{
    void validate(Infringement ref){
        ref.counterfeit();
        ref.brandabuse();
        ref.replica();
        ref.copyright();
        System.out.println("************----------------------**************");
    }
}

// Question 4 showing compile time polymorphism..
class showPoly{
    public void method(int a){
        System.out.println("In int method...");
    }
    public void method(String a){
        System.out.println("In int method...");
    }
    public void method(double a){
        System.out.println("In int method...");
    }
}

// Question 5. showing loose coupling
interface Parent1  
{  
    void foo();  
}  
class A implements Parent1  
{  
    // parameterized constructor  
    A(int x, int y)  
    {  
    }  
    public void foo()  
    {  
        System.out.println("In the foo method of class A.");  
    }  
}  
  
class B implements Parent1  
{  
    public void foo()  
    {  
        System.out.println("In the foo method of class B.");  
    }  
}  
   
public class AssignmentDay3 {
    public static void main(String[] args) {
        // creating an object of class B  
            B obj = new B();  
            obj.foo();
    }
}

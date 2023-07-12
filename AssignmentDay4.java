// Question 1 & 3 showing interface usage
interface Demo{
    // Functional interface.
    public void show();
}
class b implements Demo{
    @Override
    public void show(){
        System.out.println("Giving the implementation to interface designed method....")
    }
}

// Question no. 2 showing 2 concrete method and abstract method.
abstract class AbstractExample {  
    // Abstract method  
    abstract void display();  
    abstract void brushing();
    // Concrete method  
    void show()  
    {  
        System.out.println("Concrete method of abstract class");  
    }  
    void eat(){
        System.out.println("I am eating now, please don't disturbee..")
    }
}  
// Subclass of abstract class  
class SubClass extends AbstractExample {  
   
    // Implementing the abstract method  
    @Override
    void display()  
    {  
        System.out.println("Abstract method implemented");  
    }  
    @Override
    void brushing(){
        System.out.println("I am brushing now.. ")
    }
}  
   
public class AssignmentDay4 {
    
}

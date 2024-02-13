 class Person {
    void teach() {    
      System.out.println("Person can teach");
    } 
 }
 
 class MathTeacher extends Person {   
    void teach() {
      System.out.println("This teacher teaches Maths.");
    }    
 }
 class EnglishTeacher extends Person {   
    void teach() {
      System.out.println("This teacher teaches English.");
    }    
 }

public class Example3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.teach();
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.teach();
        EnglishTeacher englishTeacher = new EnglishTeacher();
        englishTeacher.teach();
    }
}


class Students{
    final static String registration = "St02";
    String name;
    long phone;

    Students(/*String registration,*/ String name, long phone) {
        // this.registration = registration;
        this.name = name;
        this.phone = phone;
    }
}

class FinalKeyword {
    public static void main(String[] args) {
        // Students st1 = new Students(/*"st11",*/ "Faisal Malik", 7088832660l);
        // st1.registration = "st01";
        // System.out.println("Registration: "+st1.registration); //Output - Registration: st01
        // System.out.println("Name: "+st1.name);
        // System.out.println("Phone: "+st1.phone);




        // final as well as static
        System.out.println(Students.registration);
    }
}

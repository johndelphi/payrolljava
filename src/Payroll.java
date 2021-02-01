import java.util.jar.Attributes.Name;

public class  Payroll {
      private String Name;
      private String Id;
      private double hours;
      private double Payrate;
      // field constructor
     public Payroll( ){
         String name;
         String id;
         
      }
      /*
      * The set Name method which accepts an argument
      *which is stored in the naem field 
      *@ parameter for Id  in the payroll class */
    
public void setName(String name){
    
    name =Name;
}
/*
 * The set Name method which accepts an argument which is stored in the payroll private field

 @ parameter for Id in the payroll class
 */
public void setIdNumber(String identity){
Id=identity;
}

/*
 * The set Name method which accepts an argument which is stored in the payrate privatefield
 * to access it we use a setmethod
 * @ parameter for payrate in the payroll class
 */
public void setPayrate(double hourlypayrate){
    hourlypayrate = Payrate;
}
/*
 * The set Name method which accepts an argument which is stored in the hours worked in the payroll,
 * class
 * 
 * @ parameter payrate in the payroll class
 */
public void hoursworked(double AmountOfHRS){
    AmountOfHRS =hours;
}

/*
*The getIdNumber method returns the value of the idnumber
*Stored in 
*
* */
public String getIIdnumber(){

    return Id;
}
/*The getName method gets the value of id stored in the name variable
*then returns it.
@ return the employee's Id number
 */
public String getName(){
    return Name;
}
/* The getPayRate method  gets the value from 
*the variable Payrate and returns it as a double
 */
public  double getPayRate(){
    return Payrate;
}
/**
 * The getHours worked method gets the number of hours worked from veriable hours and 
 returns it as a double.
 */
public double getHours(){
    return hours;
}
     public static void main(String[] args){

    Payroll employee1 = new Payroll();
    employee1.setIdNumber("re");
     employee1.setName("john");
     employee1.setPayrate(10.1);
    System.out.println(employee1.Name +"\n"+ employee1.Id + employee1.Payrate);
    
    
     }
     
     
    }
     
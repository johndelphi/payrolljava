import java.util.jar.Attributes.Name;

public class  Payroll {
      private String Name;
      private String Id;
      private double hours;
      private double Payrate;
      // field constructor
    
      /*
      * The set Name method which accepts an argument
      *which is stored in the naem field 
      *@ parameter for Id  in the payroll class */
    
public void setName(String name){
    
    this.Name = name;
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
    this.Payrate=hourlypayrate;
}
/*
 * The set Name method which accepts an argument which is stored in the hours worked in the payroll,
 * class
 * 
 * @ parameter payrate in the payroll class
 */
public void sethoursworked(double AmountOfHRS){
this.hours=AmountOfHRS;
}

/*
*The getIdNumber method returns the value of the idnumber
*Stored in 
*
* */
public String getIdnumber(){

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
     employee1.setPayrate(200);
     employee1.sethoursworked(34);
    System.out.println("employee Name: "+ employee1.Name +"\n"+ "empoyee id:" + employee1.Id);
     System.out.println("employee payrate: "+employee1.Payrate +"\n"+ employee1.hours);
    
    
     }
     
     
    }
     
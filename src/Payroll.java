import java.util.jar.Attributes.Name;

public class  Payroll {
      private String Name;
      private int Id;
      private double hours;
      private double Payrate;
      // field constructor
      public Payroll( String name, int id){
          name=Name;
          Id=id;
          
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
public void setIdNumber(int identity){
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
    AmountOfHRS=hours;
}

/*
*The getIdNumber method returns the value of the idnumber
*Stored in 
*
* */
public int getIIdnumber(){

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

/**
 * the getGrossPay computes and returns the amount of gross pay as a double
 */
     public static void main(String[] args) throws Exception {

        
    }
}

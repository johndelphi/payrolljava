import java.util.Scanner;


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
if (name==null)  {
        System.out.println("name can not be null "); 
        setName(name);
    }
    else{
    this.Name = name;
    }
}
/*
 * The set Name method which accepts an argument which is stored in the payroll private field

 @ parameter for Id in the payroll class
 */
public void setIdNumber(String identity){
   Scanner in =new Scanner(System.in);
   System.out.println("Please your Id (the fomat should be letter letter number number number number)");
   identity=in.nextLine();
    

this.Id=identity;
in.close();
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
    Scanner in =new Scanner(System.in);
    System.out.println("Please enter the amount of hours worked");
    AmountOfHRS = in.nextDouble();
            while(AmountOfHRS>84||AmountOfHRS<0)  { 
        System.out.println("Please not that hours should be greater than zero and less than 84");
      AmountOfHRS=in.nextDouble();
        
    
this.hours=AmountOfHRS;
in.close();
            }
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
    employee1.setIdNumber("t2");
    employee1.setName("john");
     employee1.setPayrate(4);
     employee1.sethoursworked(3);
    System.out.println("employee Name: "+ employee1.Name +"\n"+ "empoyee id:" + employee1.Id);
     System.out.println("employee payrate: "+employee1.Payrate +"\n"+"Amount of hours:"+employee1.hours);
    
    
     }
    }
     
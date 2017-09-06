class Employee{  
 float salary=40000;  
}  
public class IS_A extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
	 IS_A p=new IS_A();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  
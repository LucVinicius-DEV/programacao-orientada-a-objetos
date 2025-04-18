import java.util.Locale; 
import java.util.Scanner; 

public class Main { 
    
    public static void main(String[] args) { 
        
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 

        Funcionario funcionario = new Funcionario();
            System.out.print("Name: ");
            funcionario.name = sc.nextLine();
            System.out.print("Gross salary: ");
            funcionario.grossSalary = sc.nextDouble();
            System.out.print("Tax: ");
            funcionario.tax = sc.nextDouble();
            System.out.println();
            System.out.println("Employee: " + funcionario.name + ", $ " + String.format("%.2f", funcionario.netSalary()));

           System.out.println();
           System.out.print("Which percentage to increase salary? ");
           double percentage = sc.nextDouble();
           funcionario.increaseSalary(percentage);
           
            System.out.println();
            System.out.println("Updated data: " + funcionario.name + ", $ " + String.format("%.2f", funcionario.netSalary()));
        
        sc.close();
    } 
}

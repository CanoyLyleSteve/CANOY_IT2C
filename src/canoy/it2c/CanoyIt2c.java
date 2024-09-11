
package canoy.it2c;
import java.util.Scanner;

public class CanoyIt2c {
static class Applicant{
        String id;
        String name;
        double income; 
        int credit; 
        double loan; 
        
           
     public Applicant(String sid, String sname, double sincome, int scredit, double sloans) {
          
            this.id = sid;
            this.name = sname;
            this.income = sincome;
            this.credit = scredit;
            this.loan = sloans;         
            
     }
          public String toString() {
            return "ID: " + id + ", Name: " + name + ", Monthly Income: " + income +", Credit Score: " + credit + ", Existing Loans: " + loan;     
                
           }
   }
     
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the number of applicants: ");
            int numApplicants = scanner.nextInt();
            scanner.nextLine(); 
            
            Applicant[] applicants = new Applicant[numApplicants];

             for (int x = 0; x < numApplicants; x++) {
            System.out.println("\nEnter details for Applicant " + (x + 1) + ":");
            
            
             String id;
            boolean idexit;
            do {
                System.out.print("ID: ");
                id = scanner.nextLine();
                idexit = false;
                for (int y = 0; y < x; y++) {
                    if (applicants[y].id.equals(id)) {
                        idexit = true;
                        break;
                    }
                }
                if (idexit) {
                    System.out.println("ID must not be repeated. Please enter a unique ID.");
                }
            } while (idexit);
            
                 System.out.print("Name");
                 String name = scanner.nextLine();
                double income;
             do{
                 System.out.print("Monthly Income");
                 income = scanner.nextDouble();
                  if (income < 30000) {
                    System.out.println("Monthly income must be at least 30,000.");
                }
             }while(income < 30000);
             int credit;
                do {
                System.out.print("Credit Score: ");
                credit = scanner.nextInt();
                if (credit < 650) {
                    System.out.println("Credit score must be at least 650.");
                }
            } while (credit < 650);
             double loans;
            do {
                System.out.print("Existing Loans: ");
                loans = scanner.nextDouble();
                if (loans > 500000) {
                    System.out.println("Existing loans must not exceed 500,000.");
                }
            } while (loans > 500000);

            scanner.nextLine();
            
            applicants[x] = new Applicant(id, name,income, credit, loans);
        }

        
        System.out.println("\nApplication Summary:");
        for (int i = 0; i < numApplicants; i++) {
            System.out.println(applicants[i]);
        }

        scanner.close();
    }
   }

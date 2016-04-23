/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaquinhaapp;

/**
 *
 * @author gauchoescoces
 */
public class Scotland {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expense expense;
        VaquinhaApp vaquinha = new VaquinhaApp();
        
        Caliente garcia = new Caliente();
        garcia.setName("Garcia");
        //garcia.setPaidIn(500);
        expense = new Expense();
        expense.setName("Car Rental Big");
        expense.setValue(151.82);
        garcia.addExpense(expense);
        
        expense = new Expense();
        expense.setName("Tolls");
        expense.setValue(31.60);
        garcia.addExpense(expense);        
        
        expense = new Expense();
        expense.setName("Fuel Big Car");
        expense.setValue(32.50);
        garcia.addExpense(expense);        
        
        
        
        Caliente forsyth = new Caliente();
        forsyth.setName("Forsyth");
        //forsyth.setPaidIn(122.99);
        //forsyth.setPaidIn(100);
        expense = new Expense();
        expense.setName("Car Rental Small");
        expense.setValue(122.99);        
        forsyth.addExpense(expense);
        
        expense = new Expense();
        expense.setName("Tolls");
        expense.setValue(31.60);
        forsyth.addExpense(expense);        
        
        Caliente denis = new Caliente();
        denis.setName("Denis");     
        denis.setPaidIn(0);
        
        Caliente alex = new Caliente();
        alex.setName("Alex");   
        //alex.setPaidIn(60);
        expense = new Expense();
        expense.setName("Fuel Small Car");
        expense.setValue(36.34);
        alex.addExpense(expense); 
        
 
        Caliente erin = new Caliente();
        erin.setName("Erin");  
        erin.setPaidIn(0);
        
   
        
        vaquinha.addCaliente(garcia);        
        vaquinha.addCaliente(forsyth);        
        vaquinha.addCaliente(alex);        
        vaquinha.addCaliente(denis);        
        vaquinha.addCaliente(erin);
        
        Caliente.setShare(vaquinha.getEachCalienteShare());

        
        System.out.println("Total Expenses:"+vaquinha.getTotalExpenses());
        System.out.println("Caliente Share:"+vaquinha.getEachCalienteShare());
        System.out.println("---------------------------------");
        /*
        System.out.println("Garcia Balance:"+garcia.getBalance());
        System.out.println("Forsyth Balance:"+forsyth.getBalance());
        System.out.println("O'Donnell Balance:"+odonnell.getBalance());
        System.out.println("Denis Balance:"+denis.getBalance());
        System.out.println("Alex Balance:"+alex.getBalance());
        System.out.println("Erin Balance:"+erin.getBalance());
        System.out.println("Mayo Balance:"+mayo.getBalance());
        System.out.println("Ivan Balance:"+ivan.getBalance());
        */
        System.out.println("\n");
        System.out.println("Solving ...");
        
        vaquinha.solveVaquinha();
                
    } 
    

}

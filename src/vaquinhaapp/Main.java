/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaquinhaapp;

/**
 *
 * @author gauchoescoces
 */
public class Main {
    
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
        expense.setName("Car Rental Small");
        expense.setValue(200);
        garcia.addExpense(expense);
        
//        expense = new Expense();
//        expense.setName("Car Rental Big");
//        expense.setValue(100);
//        garcia.addExpense(expense);        
        
        expense = new Expense();
        expense.setName("Accommodatio/Ski pass");
        expense.setValue(300);
        garcia.addExpense(expense);        
        
        
        
        Caliente forsyth = new Caliente();
        forsyth.setName("Forsyth");
        //forsyth.setPaidIn(122.99);
        //forsyth.setPaidIn(100);
        expense = new Expense();
        expense.setName("Car Rental Small");
        expense.setValue(100);        
        forsyth.addExpense(expense);
        
        
        Caliente odonnell = new Caliente();
        odonnell.setName("O'Donnell");
        odonnell.setPaidIn(0);
        
        Caliente denis = new Caliente();
        denis.setName("Denis");     
        denis.setPaidIn(0);
        
        
        Caliente alex = new Caliente();
        alex.setName("Alex");   
        //alex.setPaidIn(60);
        //expense = new Expense();
        //expense.setName("Supermarket Small");
        //expense.setValue(23);        
        //alex.addExpense(expense);    
        
        //expense = new Expense();
        //expense.setName("Refueling Small Car");
        //expense.setValue(37);        
        //alex.addExpense(expense);
 
        Caliente erin = new Caliente();
        erin.setName("Erin");  
        erin.setPaidIn(0);
        
        Caliente mayo = new Caliente();
        mayo.setName("Mayo");  
        mayo.setPaidIn(0);
        
        
        Caliente ivan = new Caliente();
        ivan.setName("Ivan");       
        ivan.setPaidIn(0);
   
        
        vaquinha.addCaliente(garcia);        
        vaquinha.addCaliente(forsyth);        
        vaquinha.addCaliente(odonnell); 
        vaquinha.addCaliente(alex);        
        vaquinha.addCaliente(denis);        
        vaquinha.addCaliente(erin);
        vaquinha.addCaliente(ivan);        
        vaquinha.addCaliente(mayo);        
        
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

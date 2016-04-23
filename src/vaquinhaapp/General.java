/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaquinhaapp;

/**
 *
 * @author gauchoescoces
 */
public class General {
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VaquinhaApp vaquinha = new VaquinhaApp();
        
        Caliente garcia = new Caliente();
        garcia.setName("Garcia");
        
        Caliente forsyth = new Caliente();
        forsyth.setName("Forsyth");
        
        Caliente odonnell = new Caliente();
        odonnell.setName("O'Donnell");
        
        Caliente denis = new Caliente();
        denis.setName("Denis");     
        
        Caliente alex = new Caliente();
        alex.setName("Alex");   
 
        Caliente erin = new Caliente();
        erin.setName("Erin");  
        
        Caliente mayo = new Caliente();
        mayo.setName("Mayo");  
        
        Caliente ivan = new Caliente();
        ivan.setName("Ivan");
        
        
        /* Creating Expenses*/        
   
        garcia.addExpense(new Expense("Ski Package",32));
        ivan.addExpense(new Expense("Supermarket",202.24));
        ivan.addExpense(new Expense("Turism Tax",19.59));
        ivan.addExpense(new Expense("Internet",15.8));
        garcia.addExpense(new Expense("Supermarket",19.75));        
        
                
        alex.addExpense(new Expense("Supermarket",5.53));
        alex.addExpense(new Expense("Supermarket",12.64));
        
        denis.addExpense(new Expense("Supermarket",7.9));
        
        forsyth.addExpense(new Expense("Morning Shopping",14.22));
        forsyth.addExpense(new Expense("Supermarket",55.3));
        forsyth.addExpense(new Expense("Supermarket",9.48));
        forsyth.addExpense(new Expense("Supermarket",26.86));
        
        odonnell.addExpense(new Expense("Morning Shopping",9.48));
        odonnell.addExpense(new Expense("Supermarket",116.92));        
        
        
        
        vaquinha.addCaliente(garcia);        
        vaquinha.addCaliente(forsyth);        
        vaquinha.addCaliente(odonnell); 
        vaquinha.addCaliente(alex);        
        vaquinha.addCaliente(denis);        
        vaquinha.addCaliente(erin);
        vaquinha.addCaliente(ivan);        
        vaquinha.addCaliente(mayo);        
        
        Caliente.setShare(vaquinha.getEachCalienteShare());

        System.out.println("--------C A L E N T A D A   N U M B E R S -------------------");
        System.out.println("Total Expenses:"+vaquinha.getTotalExpenses());
        System.out.println("Number of Calientes:"+vaquinha.getNumberOfCalientes());
        System.out.println("Cost p/ Caliente:"+vaquinha.getEachCalienteShare());
        //System.out.println("---------------------------------");

        
        vaquinha.solveVaquinha();
                
    } 
    

}

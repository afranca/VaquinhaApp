/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vaquinhaapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gauchoescoces
 */
public class Caliente {
    
    private static double share = 0;
    public static void setShare(double share) {
        Caliente.share = share;
    }
    
    
    private String name;
    private List<Expense> expenses ;
    private double balance=0;
    private double paidIn=0;;
    private double payment=0;
    
    
    private double totalExpenses;

    public Caliente() {
       expenses = new ArrayList<>();
    }
      
    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
        this.totalExpenses = getTotalExpenses();        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    public double getBalance() {
        
		return getPaidIn()+ getTotalExpenses() -getPayment() - share + balance ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

	public void resetBalance() {
		
		double calculatedBalance = getPaidIn()+ getTotalExpenses() -getPayment() - share;
		
		this.balance = calculatedBalance*(-1);
	}	    
    
    public double getPaidIn() {        
        return paidIn;
    }

    public void setPaidIn(double paidIn) {
        this.paidIn = paidIn;
    }


    private double getTotalExpenses() {        
        double counter=0;
        Iterator<Expense> expenseIt = getExpenses().iterator();
        while(expenseIt.hasNext()){
            Expense expense = expenseIt.next();
            counter += expense.getValue();
        }     
        return  counter;
       
    }

	public double getPayment() {
		return payment;
	}

	public void addPayment(double payment) {
		this.payment = this.payment +payment;
	}
    
	public String toString(){
		return getName() + "::" + getBalance();		
	}

    
}

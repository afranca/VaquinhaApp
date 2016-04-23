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
public class VaquinhaApp {

    //private double totalExpenses;
    
    private List<Caliente> calientes = new ArrayList<>();

    public List<Caliente> getCalientes() {
        return calientes;
    }

    public void setCalientes(List<Caliente> calientes) {
        this.calientes = calientes;
    }
    
    public void addCaliente(Caliente caliente) {
        this.calientes.add(caliente);
    } 

    public double getTotalExpenses() {
        double counter=0;
        
        Iterator<Caliente> calienteIt = calientes.iterator();
        while(calienteIt.hasNext()){
            Caliente caliente = calienteIt.next();
            Iterator<Expense> expenseIt = caliente.getExpenses().iterator();
            while(expenseIt.hasNext()){
                Expense expense = expenseIt.next();
                counter += expense.getValue();
            }
            
        }
        return counter;
    }

    public int getNumberOfCalientes() {
        return calientes.size();
    }
    
    public double getEachCalienteShare() {
        return (getTotalExpenses() / calientes.size());
    }    
    
    
    public void solveVaquinha(){
    	/* Create list of negative balances*/
    	ArrayList<Caliente> calientesNegativeList = new ArrayList<Caliente>();
    	
    	/* Create list of positive balances*/
    	ArrayList<Caliente> calientesPositiveList = new ArrayList<Caliente>();
    	
    	/* Separate positive balances from negatives balances */
    	separatePositiveAndNegativeBalances(calientesNegativeList,calientesPositiveList);   	
    	
    	/* Display positive balances  */
    	//System.out.println("--------P O S I T I V E -- B A L A N C E S-------------------");
    	
    	System.out.println("\n-------- B A L A N C E S -------------------");
    	displayCalientesBalances(calientesPositiveList);
    	
    	/* Display negative balances */
    	//System.out.println("--------N E G A T I V E -- B A L A N C E S-------------------");
    	displayCalientesBalances(calientesNegativeList);
    	
    	
    	System.out.println("\n--------S O L V I N G - C A L E N T A D A - B A L A N C E S-------------------");
    	//System.out.println("\n\n## Solving the payments ##");
    	Iterator<Caliente> it = calientesPositiveList.iterator();
    	while(it.hasNext()){
    		Caliente calientePositiveBalance = it.next();
    		payment(calientePositiveBalance,calientesNegativeList);
    	}
    	
    	
    	
    	/* Separate positive balances from negatives balances */
    	//System.out.println("--------P O S I T I V E-------------------");
    	//displayCalientesBalances(calientesPositiveList);
    	
    	/* Separate positive balances from negatives balances */
    	//System.out.println("--------N E G A T I V E-------------------");
    	//displayCalientesBalances(calientes);

    	/* final balances */
    	System.out.println("\n--------F I N A L -- B A L A N C E S-------------------");
    	displayCalientesBalances(calientes);
    	      	
    	
    	
    }

    
	private void payment(Caliente calientePositive, ArrayList<Caliente> calientesNegative) {		
		Iterator<Caliente> it = calientesNegative.iterator();    	 
    	while (it.hasNext()){
    		Caliente calienteNegative = it.next();
    		double valueToBePaid = calienteNegative.getBalance()*-1;
    		if (calientePositive.getBalance() > valueToBePaid && calientePositive.getBalance()!=0 && valueToBePaid!=0){    			
    			calientePositive.addPayment(valueToBePaid);
    			calienteNegative.resetBalance();
    			System.out.println("->"+calienteNegative.getName()+" pays "+valueToBePaid+" to "+calientePositive.getName());
    		} else if (calientePositive.getBalance() < valueToBePaid && calientePositive.getBalance()!=0  && valueToBePaid!=0) {
    			//TODO Revise this logic as it is not working for the last caliente on the list
    			double balance =  calientePositive.getBalance();
    			valueToBePaid = valueToBePaid - balance;
    			//calienteNegative.setBalance(valueToBePaid);
    			calienteNegative.setBalance(balance);
    			calientePositive.resetBalance();
    			System.out.println("->"+calienteNegative.getName()+" pays "+balance+" to "+calientePositive.getName());
    		} else if(valueToBePaid==0) {
    			//System.out.println("->"+calienteNegative.getName()+" is already square");
    			//System.out.println("->"+calienteNegative.getName()+" has no outstanding balance: £"+calienteNegative.getBalance());
    			//System.out.println("->Jumping onto next negative Caliente ");
    			//return;    			
    		}  else	if (calientePositive.getBalance() == 0){
    			//System.out.println("->"+calientePositive.getName()+" is already square");
    			//System.out.println("->"+calientePositive.getName()+" balance is now "+ calientePositive.getBalance());
    			//System.out.println("->Jumping onto next positive Caliente ");
    			return;
    		}
    	}
    	calientePositive.resetBalance();
	}    
    
	private void displayCalientesBalances(List<Caliente> calientesGroupByBalance) {
		Iterator<Caliente> it = calientesGroupByBalance.iterator();    	 
    	while (it.hasNext()){
    		Caliente caliente = it.next();
    		System.out.println(caliente.getName()+" Balance:"+caliente.getBalance());
    		
    	}
	}    
    

	private void separatePositiveAndNegativeBalances(List<Caliente> calientesNegative,List<Caliente> calientesPositive) {
		Iterator<Caliente> it = calientes.iterator();    	 
    	while (it.hasNext()){
    		Caliente caliente = it.next();
    		if (caliente.getBalance() > 0){
    			calientesPositive.add(caliente);    			
    		}else {
    			calientesNegative.add(caliente);    			
    		}
    	}
	}	

}

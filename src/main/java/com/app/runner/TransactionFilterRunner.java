package com.app.runner;

import java.util.List;
import java.util.stream.Collectors;

import com.app.builder.TransactionBuilder;
import com.app.model.Transaction;



public class TransactionFilterRunner {
	
	
	       public static List<Transaction>  sortByTxnAsc(List<Transaction> list){
	    	   
	    	   List<Transaction> sortByascTxn=list.stream().sorted((a,b)->a.getTxnid().compareTo(b.getTxnid()))
                       .collect(Collectors.toList());



              sortByascTxn.forEach(System.out::println);
              return sortByascTxn;
	    	   
	                	  
	        }
	       
	       
         public static List<Transaction>  sortByTxnDec(List<Transaction> list){
        	 List<Transaction> sortBydecTxn=list.stream().sorted((a,b)->b.getTxnid().compareTo(a.getTxnid()))
                     .collect(Collectors.toList());
     	    
     		
     	    sortBydecTxn.forEach(System.out::println);
     	    return  sortBydecTxn;
	    	   
	                	  
	        }
	
	   
	   public static  List<Transaction>   getOnlySuccessTransactions(List<Transaction> list) {
		   
		   List<Transaction> successStatus  = list.stream()
                   .filter(v-> v.getStatus()=="Success")
                   .collect(Collectors.toList());

            successStatus.forEach(System.out::println);
            
            return successStatus;
		   
	   }
	
	
	
	   public static List<Transaction> getOnlyElectronicTransactions(List<Transaction> list) { 
		   
			List<Transaction> electronics=list.stream().filter(v->v.getTxntype()=="electronics").collect(Collectors.toList());
			electronics.forEach(System.out::println);
			return electronics;
	   }

	public static void main(String[] args) {
		
		// Note : to increase  code readability  
		//I  have created separate static method to each filter logic
		
		List<Transaction> list=TransactionBuilder.getTxnList();
		
		String txnType = "electronics";
		String status  = "success";
		String cardnumber = "5678923456789738";
		String sortType   = "asc";
		String sortField  = "txnid";
	
		String card13th14thDigit = cardnumber.substring(13,14); 
		
		if( !"00".equals(card13th14thDigit)) {
		
		//Scenario 1 : Get only electronic transactions - input txntype = electronics
			         getOnlyElectronicTransactions(list);
		
		//Scenario 2 : Get only success transactions - input status = success
			         getOnlySuccessTransactions(list);
		
		//Scenario 3 : only primary card holder can view these txn. i.e. don't send tnx to non primary members
			
		//Scenraion 4 : By defaulr all the txns are in ascending order, send descending order also based on user request
			              sortByTxnAsc(list);
		
		//descending order
			              sortByTxnDec(list);
			
		//Scenario 5  : Don't send failure txn details. 

	}
		
   else {
			
			//todo : user defined exception - your not authorised to view these transactions
		}

}
}

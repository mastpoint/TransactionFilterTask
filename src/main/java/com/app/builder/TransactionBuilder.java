package com.app.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.model.Transaction;

public class TransactionBuilder {
	
	
	public static List<Transaction> getTxnList() {
		List<Transaction> transList = new ArrayList<Transaction>();

		Transaction txn1 = new Transaction();

		txn1.setAmount(10000.00f);
		txn1.setDate(new Date());
		txn1.setMechantname("Reliance Mart");
		txn1.setRemakrs("NA");
		txn1.setStatus("Success");
		txn1.setTxnid("1122334");
		txn1.setTxntype("electronics");

		Transaction txn2 = new Transaction();

		txn2.setAmount(50000.00f);
		txn2.setDate(new Date());
		txn2.setMechantname("Central Mart");
		txn2.setRemakrs("NA");
		txn2.setStatus("Pending");
		txn2.setTxnid("3321567");
		txn2.setTxntype("lifestyle");

		Transaction txn3 = new Transaction();

		txn3.setAmount(50500.00f);
		txn3.setDate(new Date());
		txn3.setMechantname("Shoppers Stop");
		txn3.setRemakrs("NA");
		txn3.setStatus("Cancelled");
		txn3.setTxnid("9876456");
		txn3.setTxntype("cloths");

		Transaction txn4 = new Transaction();

		txn4.setAmount(65000.00f);
		txn4.setDate(new Date());
		txn4.setMechantname("Amazon online");
		txn4.setRemakrs("NA");
		txn4.setStatus("Success");
		txn4.setTxnid("5672458");
		txn4.setTxntype("electronics");
		
		
		transList.add(txn1);
		transList.add(txn2);
		transList.add(txn3);
		transList.add(txn4);
		
		return  transList;
	}

}

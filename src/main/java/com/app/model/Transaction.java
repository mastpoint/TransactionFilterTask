package com.app.model;

import java.util.Date;

import lombok.Data;

@Data
public class Transaction {
	
	private String txnid; 						   
	private Date date;   						
	private float amount; 
	private String mechantname;
	private String status;
	private String txntype;			
	private String remakrs;

}

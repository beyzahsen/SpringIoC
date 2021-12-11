package com.springDemo;
import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDal implements ICustomerDal{

	@Value("${database.sqlConnectionString}")
	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.print("Connection String: " + this.connectionString);
		System.out.println("MySql veritabanýna eklendi");
	}
	

}

package com.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAdapter {
	
	public Connection dbConnect()
	{
		Connection con=null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/gas","root","ganii1234");
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}
		return con;
	}

}

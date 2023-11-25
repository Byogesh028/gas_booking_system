package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bookdao {


	public String addUser(Bookpojo bpojo)throws SQLException
	{
	String sql = "insert into book values(?,?,?,?,?)";
		DBAdapter adapter = new DBAdapter();
		Connection con = adapter.dbConnect();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, bpojo.getCusname());
		pst.setString(2, bpojo.getCid());
		pst.setString(3, bpojo.getAadhar_no());
		//pst.setString(4, bpojo.getAdd());
		pst.setString(4 ,bpojo.getOrdet_date());
		pst.setString(5, bpojo.getCtype());

		int i = pst.executeUpdate();
	
		if(i>0)
			return "Success";
		else
			return "Not success";
		
	}
	


	}



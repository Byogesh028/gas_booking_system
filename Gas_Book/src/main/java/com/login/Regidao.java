package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Regidao {
	
	public String addUser(RegiPojo rpojo)throws SQLException
	{
		String sql = "insert into regi values(?,?,?,?)";
		DBAdapter adapter = new DBAdapter();
		Connection con = adapter.dbConnect();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, rpojo.getName());
		pst.setString(2, rpojo.getEmail());
		pst.setString(3, rpojo.getPwd());
		pst.setString(4, rpojo.getPhone());

		int i = pst.executeUpdate();
	
		if(i>0)
			return "Success";
		else
			return "Not success";
		
	}
	

}

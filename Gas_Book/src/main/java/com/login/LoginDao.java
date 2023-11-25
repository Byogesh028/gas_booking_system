package com.login;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class LoginDao {
	
	public String validateUser(LoginPojo lpojo)throws SQLException
	{
		String sql = "select * from regi where mail=? and password=?";
		DBAdapter adapter = new DBAdapter();
		Connection con = adapter.dbConnect();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, lpojo.getEmail());
		pst.setString(2, lpojo.getPwd());
		
		ResultSet rs =  pst.executeQuery();
		if(rs.last())
		{
			return "Success";
		}
		else
		{
			return "error";
		}
	}

}

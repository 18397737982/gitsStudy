package com.gy.dao;

import com.gy.springframe.DBConnection;

public class DBHelper {
	@DBConnection(driverClass="com.mysql.jdbc.Driver",password="a",url="jdbc:mysql://localhost:3306/",username="a")
	public void  getCon(){}
}

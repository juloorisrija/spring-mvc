package com.training.springmvc.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springmvc.model.User;

@Repository
public class HomeDaoImpl implements HomeDao{

	@Override
	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();

		Connection con = null;

		 

		try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		 

		//Scanner sc = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3306/infinite";

		String user = "root";

		String pass = "India@123";

	    con = DriverManager.getConnection(url,user,pass);

		Statement stmt = con.createStatement();
		if(con!=null) {
			System.out.println("connected");
		}

		ResultSet rs = stmt.executeQuery("select * from username");

		while(rs.next()) {

		userList.add(new User(rs.getString(1), rs.getString(2)));

		//userList.add(new User("ram","123"));

		 

		}

		 

		}

		catch (Exception e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		finally {

		try {

		con.close();

		} catch (SQLException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		}

		 

		return userList;

		}


	}



package com.test.db;

import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBUtil {
	/**
	 * ���ݿ������ļ�
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	//�������ݿ�����
	public static void main(String[] args)  {
		
		
		try {
			//1.�������ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ���ݿ�����
			 Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			 //�����������

			 //Statement st = conn.createStatement();
			 
			 //ִ��SQL��� ����
//			 int flag= st.executeUpdate();
			 System.out.println("end");
		}catch (SQLException e) {
			System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
	}
}

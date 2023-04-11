package com.dm.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	
	final String USER_INSERT="insert into membertbl values (?, ?, ?, ?, ?, ?);";
	final String USER_LIST="select * from membertbl WHERE memberid != 'admin';";
	final String LOGIN_INSERT="select memberid from membertbl where memberid = ?";
	final String USER_UPDATEFORM="select * from membertbl WHERE memberid =?;";
	final String USER_UPDATE="UPDATE membertbl SET password = ?, name = ?, gender = ?, phone = ?, email = ? WHERE memberid = ?";
	final String USER_FINDID="select * from membertbl WHERE email = ? and phone = ?;";
	final String USER_FINDPWD="select * from membertbl WHERE memberid = ? and phone = ?;";
	
	final String USER_DELETE="delete from membertbl WHERE memberid = ?";
	final String USER_PASSWORD="UPDATE membertbl SET password = ? WHERE memberid = ?";
	final String USER_EMAIL="UPDATE membertbl SET email = ? WHERE memberid = ?";
	public void insertMember(MemberDTO mem) throws SQLException {
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_INSERT);
			pstmt.setString(1, mem.getMemberid());
			pstmt.setString(2, mem.getPassword());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getGender());
			pstmt.setString(5, mem.getPhone());
			pstmt.setString(6, mem.getEmail());
			pstmt.executeUpdate(); //3단계
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(pstmt, conn);
			
		}
	}
	
	public ArrayList<MemberDTO> selectMemberList() throws SQLException {
		ArrayList<MemberDTO> aList = new ArrayList<MemberDTO>();
		ResultSet rs =null;
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_LIST);
			rs = pstmt.executeQuery(); //3단계
			while(rs.next()) {
				MemberDTO rd = new MemberDTO();
				rd.setMemberid(rs.getString("memberid"));
				rd.setPassword(rs.getString("password"));
				rd.setName(rs.getString("name"));
				rd.setGender(rs.getString("gender"));
				rd.setPhone(rs.getString("phone"));
				rd.setEmail(rs.getString("email"));
				aList.add(rd);
			}
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(rs, pstmt, conn);	
		}
		
		return aList;
	}
	
	public MemberDTO findMemberList(String _id) throws SQLException {
		MemberDTO memInfo = null;
		ResultSet rs =null;
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_UPDATEFORM);
			pstmt.setString(1, _id);
			rs = pstmt.executeQuery(); //3단계
			rs.next();
			memInfo = new MemberDTO();
			memInfo.setMemberid(rs.getString("memberid"));
			memInfo.setPassword(rs.getString("password"));
			memInfo.setName(rs.getString("name"));
			memInfo.setGender(rs.getString("gender"));
			memInfo.setPhone(rs.getString("phone"));
			memInfo.setEmail(rs.getString("email"));
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(rs, pstmt, conn);	
		}
		
		return memInfo;
	}
	
	public MemberDTO findId(String email, String phone) throws SQLException {
		MemberDTO memInfo = null;
		ResultSet rs =null;
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_FINDID);
			pstmt.setString(1, email);
			pstmt.setString(2, phone);
			rs = pstmt.executeQuery(); //3단계
			rs.next();
			memInfo = new MemberDTO();
			memInfo.setMemberid(rs.getString("memberid"));
			memInfo.setPassword(rs.getString("password"));
			memInfo.setName(rs.getString("name"));
			memInfo.setGender(rs.getString("gender"));
			memInfo.setPhone(rs.getString("phone"));
			memInfo.setEmail(rs.getString("email"));
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(rs, pstmt, conn);	
		}
		
		return memInfo;
	}
	
	public MemberDTO findPwd(String id, String phone) throws SQLException {
		MemberDTO memInfo = null;
		ResultSet rs =null;
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_FINDPWD);
			pstmt.setString(1, id);
			pstmt.setString(2, phone);
			rs = pstmt.executeQuery(); //3단계
			rs.next();
			memInfo = new MemberDTO();
			memInfo.setMemberid(rs.getString("memberid"));
			memInfo.setPassword(rs.getString("password"));
			memInfo.setName(rs.getString("name"));
			memInfo.setGender(rs.getString("gender"));
			memInfo.setPhone(rs.getString("phone"));
			memInfo.setEmail(rs.getString("email"));
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(rs, pstmt, conn);	
		}
		
		return memInfo;
	}
	
	public void updateMember(MemberDTO mem) {
		String id = mem.getMemberid();
		String pwd = mem.getPassword();
		String name = mem.getName();
		String gender = mem.getGender();
		String phone = mem.getPhone();
		String email = mem.getEmail();
		try {
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_UPDATE);
			pstmt.setString(1, pwd);
			pstmt.setString(2, name);
			pstmt.setString(3, gender);
			pstmt.setString(4, phone);
			pstmt.setString(5, email);
			pstmt.setString(6, id);
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			JDBCutill.close(pstmt, conn);
		}
	}
	
	
	public void updatePassword(String id, String pw) {
		try {
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_PASSWORD);
			pstmt.setString(1, pw);
            pstmt.setString(2, id);
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			JDBCutill.close(pstmt, conn);
		}
	}
	
	public void updateEmail(String id, String email) {
		try {
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_EMAIL);
			pstmt.setString(1, email);
            pstmt.setString(2, id);
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}finally {
			JDBCutill.close(pstmt, conn);
		}
	}
	
	
	public void deleteMember(String id) {
		try {
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(USER_DELETE);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		}catch(Exception e){
			
		}finally {
			JDBCutill.close(pstmt, conn);
		}
	}
	
	public boolean loginCheck(String id, String pw) {
        ResultSet rs = null;
        boolean loginCon = false;
        try {
            conn = JDBCutill.getConnection();
            String strQuery = "select memberid, password from membertbl where memberid = ? and password = ?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setString(1, id);
            pstmt.setString(2, pw);
            rs = pstmt.executeQuery();
            loginCon = rs.next();
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
        	JDBCutill.close(rs, pstmt, conn);
        }
        return loginCon;
    }
	
	public boolean checkId(String id) {
        ResultSet rs = null;
        boolean checkCon = false;
        try {
            conn = JDBCutill.getConnection();
            String strQuery = "select memberid from membertbl where memberid = ?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            checkCon = rs.next();

        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
        	JDBCutill.close(rs, pstmt, conn);
        }
        return checkCon;
    }
	
	public boolean checkEmail(String id, String email) {
		ResultSet rs = null;
        boolean checkCon = false;
        try {
            conn = JDBCutill.getConnection();
            String strQuery = "select memberid, email from membertbl where memberid = ? and email = ?";
            pstmt = conn.prepareStatement(strQuery);
            pstmt.setString(1, id);
            pstmt.setString(2, email);
            rs = pstmt.executeQuery();
            checkCon = rs.next();
        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        } finally {
        	JDBCutill.close(rs, pstmt, conn);
        }
        return checkCon;
    }
	
	/*
	public int login(String id, String pw) throws SQLException {
		ResultSet rs =null;
		try{
			conn = JDBCutill.getConnection();
			pstmt = conn.prepareStatement(LOGIN_INSERT);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); 
			
			if (rs.next()) {
				if(rs.getString("password").equals(pw)) {
					return 1;
				} else {
					return 0;
				}
			}
		}catch(Exception e){
			
		}finally{
			JDBCutill.close(pstmt, conn);
		}
		return -1;
	}
	*/
	
}


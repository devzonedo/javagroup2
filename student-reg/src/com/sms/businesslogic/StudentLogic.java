package com.sms.businesslogic;

import com.sms.bean.StudentBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentLogic {

    public int addStudent(StudentBean stu) {
        Connection con = null;
        boolean flag = false;

        int studID = 0;

        try {
            con = new DBConnection().getConnection();
            String sql = "INSERT INTO tbl_student (fname,lname,nic,city,tp,gender,subject_name)  VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, stu.getFname());
            ps.setString(2, stu.getLname());
            ps.setString(3, stu.getNic());
            ps.setString(4, stu.getCity());
            ps.setInt(5, stu.getTp());
            ps.setString(6, stu.getGender());
            ps.setString(7, stu.getSubject_name());

            if (ps.executeUpdate() == 1) {
                ResultSet rs = ps.getGeneratedKeys();
                rs.next();
                studID = rs.getInt(1);
            }

            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return studID;
    }

    public StudentBean getStudent(int id) {
        Connection con = null;
        StudentBean sb = new StudentBean();
        try {
            
            con = new DBConnection().getConnection();
            String sql = " SELECT * FROM tbl_student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sb.setId(rs.getInt("id"));
                sb.setFname(rs.getString("fname"));
                sb.setLname(rs.getString("lname"));
                sb.setNic(rs.getString("nic"));
                sb.setCity(rs.getString("city"));
                sb.setGender(rs.getString("gender"));
                sb.setSubject_name(rs.getString("subject_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sb;
    }

}

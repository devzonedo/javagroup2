package com.sms.businesslogic;

import com.sms.bean.StudentBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentLogic {

    public boolean addStudent(StudentBean stu) {
        Connection con = null;
        boolean flag = false;
        try {
            con = new DBConnection().getConnection();
            String sql = "INSERT INTO tbl_student (fname,lname,nic,city,tp,gender,subject_name)  VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, stu.getFname());
            ps.setString(2, stu.getLname());
            ps.setString(3, stu.getNic());
            ps.setString(4, stu.getCity());
            ps.setInt(5, stu.getTp());
            ps.setString(6, stu.getGender());
            ps.setString(7, stu.getSubject_name());

            ps.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

}

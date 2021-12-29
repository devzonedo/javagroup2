/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.businesslogic;

import com.sms.bean.UserBean;
import com.sms.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author devzo
 */
public class UserLogic {

    public UserBean getLogin(String username, String password) {
        Connection con = null;

        UserBean ub = new UserBean();

        try {
            con = new DBConnection().getConnection();
            String sql = "SELECT * FROM tbl_user WHERE username = ? AND pword = PASSWORD(?) AND status_code = 'ACTIVE'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ub.setId(rs.getInt("id"));
                ub.setUsername(rs.getString("username"));
                ub.setUser_role(rs.getString("user_role"));
                ub.setFlag(true);
//                System.out.println("id:" + rs.getInt("id"));
//                System.out.println("username:" + rs.getString("username"));
//                System.out.println("password:" + rs.getString("pword"));
//                System.out.println("user_role:" + rs.getString("user_role"));
//                System.out.println("status_code:" + rs.getString("status_code"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ub;
    }

    public void setUser(UserBean ub) {
        Connection con = null;
        boolean flag = false;
        try {
            con = new DBConnection().getConnection();
            String sql = "INSERT INTO tbl_user\n"
                    + "            (username,\n"
                    + "             pword,\n"
                    + "             user_role,\n"
                    + "             status_code)\n"
                    + "VALUES (?,\n"
                    + "        PASSWORD(?),\n"
                    + "        ?,\n"
                    + "        ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ub.getUsername());
            ps.setString(2, ub.getUsername());
            ps.setString(3, ub.getUser_role());
            ps.setString(4, "ACTIVE");

            ps.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

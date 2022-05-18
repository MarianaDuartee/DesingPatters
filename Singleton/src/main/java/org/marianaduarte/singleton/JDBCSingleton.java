package org.marianaduarte.singleton;

import java.sql.*;

public class JDBCSingleton {
    private static JDBCSingleton jdbc;

    private JDBCSingleton(){}

    public static JDBCSingleton getInstance(){
        if(jdbc == null){
            synchronized (JDBCSingleton.class){
                if(jdbc == null){
                    jdbc = new JDBCSingleton();
                }
            }
        }
        return jdbc;
    }

    private static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tema10","marianaduarte","mariilegra");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  connection;
    }

    public int insert(String name, String pass){
        Connection con = null;
        PreparedStatement ps = null;
        int counter = 0;

        try{
            con = this.getConnection();
            ps = con.prepareStatement("INSERT INTO userdata(userName, userPassword) VALUES (?,?)");
            ps.setString(1,name);
            ps.setString(2,pass);
            counter = ps.executeUpdate();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return counter;
    }

    public void viewData(String name){
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            c = this.getConnection();
            ps = c.prepareStatement("SELECT * FROM userdata WHERE userName=?");
            ps.setString(1,name);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Name = "+ rs.getString(2) + "\t"+"Password = "+rs.getString(3));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int update(String name, String password){
        Connection con = null;
        PreparedStatement ps = null;
        int counter = 0;
        try{
            con = this.getConnection();
            ps = con.prepareStatement("UPDATE userdata SET userPassword=? WHERE userName="+name+"");
            ps.setString(1,password);
            counter = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return counter;
    }

    public int delete(int userId){
        Connection c = null;
        PreparedStatement ps = null;
        int counter = 0;
        try {
            c = this.getConnection();
            ps = c.prepareStatement("DELETE FROM userdata WHERE userId="+userId+"");
            counter = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if(c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
     return counter;
    }
}

package com.tms.zl.utils;


import java.sql.*;

/**
 * Created by Administrator on 13-12-16.
 */
public class SqlHelper {

    PreparedStatement ps = null;
    Connection ct = null;
    ResultSet rs = null;

    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/tmsforzl";
    String user="root";
    String passwd="19860612a";

    public SqlHelper() {
        try {
            Class.forName(driver);
            ct = DriverManager.getConnection(url,user,passwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据库的增，删，改方法
     * @param sql sql语句
     * @param whereConditiions where子句的条件
     * @return 是否修改成功
     */
    public boolean modifyOpertion(String sql, String[] whereConditiions){
        boolean b=true;

        try{
            Class.forName(driver);
            ct = DriverManager.getConnection(url,user,passwd);
            ps = ct.prepareStatement(sql);
            for(int i=0; i<whereConditiions.length; i++){
                ps.setString(i+1, whereConditiions[i]);
            }
            if(ps.executeUpdate() != 1){
                b=false;
            }

        }catch(Exception e){
            b=false;
            e.printStackTrace();
        }finally{
            this.close();
        }
        return b;
    }

    /**
     * 带条件的数据库查询语句
     * @param sql sql语句
     * @param whereConditiions where子句的条件
     * @return 结果集
     */
    public ResultSet query(String sql,String[] whereConditiions){
        try{
            Class.forName(driver);
            ct = DriverManager.getConnection(url, user, passwd);
            ps=ct.prepareStatement(sql);
            if(whereConditiions != null && whereConditiions.length > 0) {
                for(int i=0;i<whereConditiions.length;i++){
                    ps.setString(i+1, whereConditiions[i]);
                }
            }
            rs=ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }

    /**
     * 关闭数据库的方法
     */
    public void close(){
        try{
            if(rs!=null) rs.close();
            if(ps!=null) ps.close();
            if(ct!=null) ct.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}


import com.mysql.jdbc.Connection;
import 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atul_
 */
public class Myconnection {

    /**
     *
     * @return
     */
    public static Connection getConnection();
    try{
            Connection conn=DriverManager("dbc:mysql://localhost:3306/docappt","root","");
}
    catch(SQLException ex)
    {
        System.out.println(ex.getMessage());
    }
    return conn;

    
    


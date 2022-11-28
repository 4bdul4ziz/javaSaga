/*
 * Construct a map to contain 10 values of employee name and designation. Write a simple JDBC Connectivity application that uses the above map to populate a table named EMPLOYEE. Perform the below operations using JDBC Statements.
a. Fetch the name of employees with designation as ‘Manager’.
b. Fetch the different designations available in Employee table.
c. Update the designation of managers from ‘Manager’ to ‘MGR’.
d. Delete all the records with designation ‘Clerk’. Display the count of rows that were deleted during this transaction.
e. Execute the statement to drop EMPLOYEE table. Consider including exceptions to check if the table exists before performing drop operation.
 * 
 */

import java.sql.*;
import java.util.*;

public class employeeJDBC {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jl", "root", "azizrahim");
            stmt = con.createStatement();
            Map<String, String> employee = new HashMap<String, String>();
            employee.put("John", "Manager");
            employee.put("Smith", "Manager");
            employee.put("David", "Manager");
            employee.put("Rahul", "Clerk");
            employee.put("Raj", "Clerk");
            employee.put("Ramesh", "Clerk");
            employee.put("Suresh", "Clerk");
            employee.put("Raju", "Clerk");
            employee.put("Rajesh", "Clerk");
            employee.put("Rakesh", "Clerk");
            //System.out.println(employee);
            String sql = "CREATE TABLE EMPLOYEE (name VARCHAR(20), designation VARCHAR(20))";
            stmt.executeUpdate(sql);
            System.out.println("Table created");
            for (Map.Entry<String, String> entry : employee.entrySet()) {
                String name = entry.getKey();
                String designation = entry.getValue();
                String sql1 = "INSERT INTO EMPLOYEE (name, designation) VALUES ('" + name + "', '" + designation + "')";
                stmt.executeUpdate(sql1);
            }
            System.out.println("Data inserted");
            String sql2 = "SELECT name FROM EMPLOYEE WHERE designation = 'Manager'";
            rs = stmt.executeQuery(sql2);
            System.out.println("Name of employees with designation as 'Manager' are:");
            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println(name);
            }
            String sql3 = "SELECT DISTINCT designation FROM EMPLOYEE";
            rs = stmt.executeQuery(sql3);
            System.out.println("Different designations available in Employee table are:");
            while (rs.next()) {
                String designation = rs.getString("designation");
                System.out.println(designation);
            }
            String sql4 = "UPDATE EMPLOYEE SET designation = 'MGR' WHERE designation = 'Manager'";
            stmt.executeUpdate(sql4);
            System.out.println("Designation of managers updated from 'Manager' to 'MGR'");
            String sql5 = "DELETE FROM EMPLOYEE WHERE designation = 'Clerk'";
            int count = stmt.executeUpdate(sql5);
            System.out.println("Number of rows deleted: " + count);
            String sql6 = "DROP TABLE EMPLOYEE";
            stmt.executeUpdate(sql6);
            System.out.println("Table dropped");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

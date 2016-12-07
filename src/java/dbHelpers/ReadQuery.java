package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Athletes;

public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
    Properties props = new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
    public void doRead(){
        try {
            String query = "Select * from athletes";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLtable(){
        String table = "";
        
        table += "<table>";
        table += "<tr>";
            table += "<th> Athlete ID </th>";
            
            table += "<th> Athlete Name </th>";
            
            table += "<th> Sport </th>";
            
            table += "<th> Nationality </th>";
            
            table += "<th> Age </th>";
        table += "</tr>";
        
        try {
            while(this.results.next()){
                Athletes athletes = new Athletes();
                athletes.setAthleteID(this.results.getInt("athleteID"));
                athletes.setAthleteName(this.results.getString("athleteName"));
                athletes.setSport(this.results.getString("sport"));
                athletes.setNationality(this.results.getString("nationality"));
                athletes.setAge(this.results.getInt("age"));
                
                table += "<tr>"
                        + "<td>"
                        + athletes.getAthleteID()
                        + "</td>"
                        
                        + "<td>"
                        + athletes.getAthleteName()
                        + "</td>"
                        
                        + "<td>"
                        + athletes.getSport()
                        + "</td>"
                        
                        + "<td>"
                        + athletes.getNationality()
                        + "</td>"
                        
                        + "<td>"
                        + athletes.getAge()
                        + "</td>"
                        
                        + "<td>"
                        + "<a href=delete?athleteID=" + athletes.getAthleteID() + "> Delete </a>"
                        + "</td>"
                        
                        + "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";
        
        return table;
    }
}

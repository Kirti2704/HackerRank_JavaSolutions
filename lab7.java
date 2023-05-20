import java.sql.*;

public class lab7 {
public static void main(String[] args) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "kirti@2022");
Statement s = c.createStatement();
String query = "create database if not exists kirtidb1;";
s.execute(query);
query = "use kirtidb1;";
s.execute(query);

query = "create table if not exists vit_university (school_Id int, school_Name varchar(100), dean int);";
s.execute(query);
query = "insert into VIT_University values (1, 'School of Advanced Sciences and languages', 9001);";
s.execute(query);
query = "insert into VIT_University values (2, 'School of Bioengineering',9002);";
s.execute(query);
query = "insert into VIT_University values (3, 'School of Computer Science and Enginerring',9003);";
s.execute(query);
query = "insert into VIT_University values (4, 'School of Electrical and Electronics engineering',9004);";
s.execute(query);
query = "insert into VIT_University values (5, 'School of Mechanical Engineering',9005);";
s.execute(query);
query = "insert into VIT_University values (6, 'VIT Buisness School',9006);";
s.execute(query);
query = "insert into VIT_University values (7, 'School of Architecture',9007);";
s.execute(query);

query = "create table if not exists programmes (programme_id int,programme_name varchar(15), school_id int, programme_chair int);";
s.execute(query);
query = "insert into programmes values (21, 'B.Tech Bioengineering', 2, 121);";
s.execute(query);
query = "insert into programmes values (22, 'Integrated M.Sc. Biotechnology ', 2, 122);";
s.execute(query);
query = "insert into programmes values (23, 'Doctor of Philosophy(PhD)', 2, 123);";
s.execute(query);
query = "insert into programmes values (41, 'B.Tech AI and Cybernetics', 4, 141);";
s.execute(query);
query = "insert into programmes values (42, 'B.Tech Electronics and Communication Engineering ', 4, 142);";
s.execute(query);
query = "insert into programmes values (43, 'B.Tech Electronics and Communication Engineering (specialization in AI and Cybernetics)', 4, 143);";
s.execute(query);
query = "insert into programmes values (44, 'M.Tech VLSI Design', 4, 144);";
s.execute(query);
query = "insert into programmes values (51, 'B.Tech Aerospace Engineering', 5, 151);";
s.execute(query);
query = "insert into programmes values (52, 'B.Tech Mechanical Engineering', 5, 152);";
s.execute(query);
query = "insert into programmes values (53, 'B.Tech Mechanical Engineering (specialization in AI and Robotics)', 5, 153);";
s.execute(query);
query = "insert into programmes values (61, 'BBA', 6, 161);";
s.execute(query);
query = "insert into programmes values (62, 'MBA', 6, 162);";
s.execute(query);
query = "insert into programmes values (71, 'B.Arch', 7, 171);";
s.execute(query);
query = "insert into programmes values (311, 'B.Tech CSE', 3, 1311);";
s.execute(query);
query = "insert into programmes values (312, 'B.Tech CSE (specialization in AI and ML)', 3, 1312);";
s.execute(query);
query = "insert into programmes values (313, 'B.Tech CSE (specialization in Gaming Technology)', 3, 1313);";
s.execute(query);
query = "insert into programmes values (314, 'B.Tech CSE (specialization in Cyber Security and Digital Forensics)', 3, 1314);";
s.execute(query);
query = "insert into programmes values (315, 'B.Tech CSE (specialization in Health Informatics)', 3, 1315);";
s.execute(query);
query = "insert into programmes values (316, 'B.Tech CSE (specialization in Cloud Computing and Automation', 3, 1316);";
s.execute(query);
query = "insert into programmes values (317, 'B.Tech CSE (specialization in Education Technology)', 3, 1317);";
s.execute(query);
query = "insert into programmes values (318, 'B.Tech CSE (specialization in E-commerce Technology)', 3, 1318);";
s.execute(query);
query = "insert into programmes values (321, 'M.Tech CSE (specialization in Cyber Security and Digital Forensics)', 3, 1321);";
s.execute(query);
query = "insert into programmes values (322, 'Master of Computer Applications', 3, 1322);";
s.execute(query);
query = "insert into programmes values (323, 'Integrated M.Tech CSE (specialization in Cyber Security)', 3, 1323);";
s.execute(query);
query = "insert into programmes values (324, 'Integrated M.Tech CSE (specialization in Computational and Data Science)', 3, 1324);";
s.execute(query);
query = "insert into programmes values (325, 'Integrated M.Tech AI', 3, 1325);";
s.execute(query);
query = "insert into programmes values (326, 'M.Tech AI and Data Science', 3, 1326);";
s.execute(query);
query = "insert into programmes values (327, 'Doctor of Philosophy(PhD)', 3, 1327);";
s.execute(query);

query = "create table if not exists faculty (faculty_id int,faculty_name varchar(15), mobile varchar(10), email_id varchar(30));";
s.execute(query);
query = "insert into faculty values (1001, 'Dr. Alangudi Balaji', '8977564021','alangudi.balaji@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1002, 'Dr. Vinod bhatt', '8977564021','vinod.bhatt@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1003, 'Simi ', '8977564021','simi@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1004, 'Manickavasagam', '8977564021','manickavasagam@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1005, 'Mayank Sharma', '8977564021','ms@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1006, 'Mamta Agarwal', '8977564021','ma@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1007, 'Anand Motwani', '8977564021','am@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1008, 'Sandeep Sahu', '8977564021','ss@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1009, 'Sandip Mal', '8977564021','sm@vitbhopal.ac.in');";
s.execute(query);
query = "insert into faculty values (1311, 'Raja', '8977564021','ra@vitbhopal.ac.in');";
s.execute(query);
ResultSet rs = s.executeQuery("select * from vit_university; ");
while (rs.next()) {
int id = rs.getInt("school_Id");
String name = rs.getString("school_name");
int dean = rs.getInt("dean");
System.out.println("ID's are" +id + " " +"name are"+ name + " "
+"dean is "+ dean);
}
ResultSet rp = s.executeQuery("select * from programmes; ");
while (rp.next()) {
String prname = rp.getString("programme_name");
System.out.println("All programmes " + prname);
}
int programmeChair = 0;
ResultSet rs3 = s.executeQuery("select * from programmes where programme_name ='B.Tech CSE';");
while(rs3.next())
{
programmeChair = rs3.getInt("programme_chair");
}
ResultSet rs4 = s.executeQuery("select * from faculty where faculty_id ="+programmeChair+" ;");
while(rs4.next())
{
System.out.println("Programme Chair Name: "+rs4.getString("faculty_name"));
}
int dean_id = 0;
ResultSet rr = s.executeQuery("select * from vIT_university whereschool_Id = 1;");
while (rr.next())
{
dean_id = rr.getInt("dean");
}
ResultSet rs5 = s.executeQuery("select * from faculty where faculty_id = " + dean_id + ";");
while (rs5.next())
{
System.out.println("Dean Email ID: " + rs5.getString("email_id")
+ ";");
}
} catch (ClassNotFoundException e) {
System.out.println(e.getMessage());
} catch (SQLException e) {
System.out.println(e.getMessage());
}
}
}

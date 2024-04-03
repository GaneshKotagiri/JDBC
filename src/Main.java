import java.sql.*;
public class Main{
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:3434/Sdata";
        String userName="postgres";
        String password="1270";
        String sql="insert into students values (8,'gaya',88)";
        String sql1="select * from students";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,userName,password);
        Statement st= con.createStatement();
        st.execute(sql);
        ResultSet rs= st.executeQuery(sql1);
        while(rs.next()){
            System.out.print(rs.getInt(1)+"-");
            System.out.print(rs.getString(2)+"-");
            System.out.println(rs.getInt(3));
        }
        con.close();
    }
}
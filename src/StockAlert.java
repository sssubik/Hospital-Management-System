
import com.repository.RepositoryClass;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Subik
 */
public class StockAlert {

    public int Alert() {
        int a;
        int count = 0;
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.stockAlert();
        try {
            while (rs.next()) {
                a = Integer.parseInt(rs.getString("istock"));
                if (a < 50) {
                    count = count + 1;
                }
            }
            return count;
        } catch (Exception e) {
            return 0;
        }
    }

    public StockTable returnTable() {
        int a;
        String Name;
        String Edate;
        StockTable St = new StockTable();
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.stockAlert();
        try {
            while (rs.next()) {
                a = Integer.parseInt(rs.getString("istock"));
                if (a < 50) {
                    Name = rs.getString("DrugName");
                    Edate = rs.getString("ExDate");

                    St.Add(Name, Edate, a);
                }
            }
            return St;
        } catch (Exception e) {
             return St;
        }
    }

}

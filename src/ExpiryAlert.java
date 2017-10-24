
import com.model.DrugModel;
import com.repository.RepositoryClass;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Subik
 */
public class ExpiryAlert {

    public int Alert() {
        String name;
        DrugModel Dm = new DrugModel();
        ExpiryTable Et = new ExpiryTable();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        ConvertToDay Cd = new ConvertToDay();
        String date;
        int day;
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.returnDate();
        int i = 0;
        try {
            while (rs.next()) {
                date = rs.getString("ExDate");
                day = Cd.Convert(formatted, date);
                if (day < 60) {
                    name = rs.getString("DrugName");
                    i = i + 1;

                }
            }
            return i;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;

        }
    }

    public ExpiryTable returnTable() {
        String name;
        DrugModel Dm = new DrugModel();
        ExpiryTable Et = new ExpiryTable();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        ConvertToDay Cd = new ConvertToDay();
        String date;
        int day;
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.returnDate();

        try {
            while (rs.next()) {
                date = rs.getString("ExDate");
                day = Cd.Convert(formatted, date);
                if (day < 60) {
                    name = rs.getString("DrugName");

                    Et.Add(name, date, day);

                }
            }

            return Et;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return Et;

        }
    }

}

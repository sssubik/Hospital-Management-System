
import com.model.AppointmentModel;
import com.repository.RepositoryClass;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Subik
 */
public class AppointmentService {

    public void insert(jpanel5 A) {
        AppointmentModel model = CTModel(A); 
        RepositoryClass Rc = new RepositoryClass();
        Rc.insertAppointment(model);
    }

    public AppointmentModel CTModel(jpanel5 A) {
        AppointmentModel model = new AppointmentModel();
        model.setDoctorName(A.getTextName().getText());
        model.setDid(Integer.parseInt(A.getTextDid().getText()));
        String date = ((JTextField) A.getDateAppointment().getDateEditor().getUiComponent()).getText();
        model.setDateAppointment(date);
        model.setTime(A.getTime());
        model.setPName(A.getTextPName().getText());
        return model;
    }
    
}

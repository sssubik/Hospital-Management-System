
import com.model.DoctorModel;
import com.repository.RepositoryClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subik
 */
public class DoctorService {
    public void insert(adoctor_jpanel S)
    {
        DoctorModel model = CTModel(S);
        RepositoryClass Rc  = new RepositoryClass();
        Rc.insertDoctor(model);
    }
    public void updateDoctor(udoctor_jpanel S)
    {
         DoctorModel model = CTModel1(S);
        RepositoryClass Rc  = new RepositoryClass();
        Rc.updateDoctor(model);
    }
    
    public DoctorModel CTModel (adoctor_jpanel S)
    {
       DoctorModel model = new DoctorModel();
       model.setDoctorName(S.getTextName().getText());
       model.setAddress(S.getTextAddress().getText());
       model.setAge(Integer.parseInt(String.valueOf(S.getTextAge().getSelectedItem())));
      // model.setDay(S.getDay());
       model.setDid(Integer.parseInt(S.getTextDid().getText()));
       model.setInTime(S.getItime());
       model.setOutTime(S.getOtime());
       model.setSpeciality(String.valueOf(S.getTextSpeciality().getSelectedItem()));
       model.setSex(String.valueOf(S.getTextSex().getSelectedItem()));
       model.setContact(Integer.parseInt(S.getTextContactNo().getText()));
       return model;
    }
   public DoctorModel CTModel1 (udoctor_jpanel S)
    {
       DoctorModel model = new DoctorModel();
       model.setDoctorName(S.getTextName().getText());
       model.setAddress(S.getTextAddress().getText());
       model.setAge(Integer.parseInt(S.getTextAge().getText()));
     //  model.setDay(S.getDay());
       model.setDid(Integer.parseInt(S.getTextDid().getText()));
       model.setInTime(S.getItime());
       model.setOutTime(S.getOtime());
       model.setSpeciality(String.valueOf(S.getTextSpeciality().getSelectedItem()));
       model.setSex(String.valueOf(S.getTextSex().getSelectedItem()));
       model.setContact(Integer.parseInt(S.getTextContactNo().getText()));
       return model;
    }
    
}

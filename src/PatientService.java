
import com.model.PatientModel;
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
public class PatientService {
    public void insert(inpatient_jpanel S)
    {
        PatientModel model = CTModel(S);
        RepositoryClass repositoryClass = new RepositoryClass();
       repositoryClass.insertInPatient(model);  
    }
    public void insertApp(InPatApp S)
    {
        PatientModel model = CTModel1(S);
        RepositoryClass repositoryClass = new RepositoryClass();
       repositoryClass.insertInPatient(model);  
    }
    public void insertOut(outpatient_jpanel S)
    {
        PatientModel model = CTModelOut(S);
        RepositoryClass repositoryClass = new RepositoryClass();
       repositoryClass.insertOutPatient(model);  
    }
    public PatientModel CTModel(inpatient_jpanel S)
    {
       PatientModel model = new PatientModel();
       model.setOpNo(Integer.parseInt(S.getTextOpno().getText()));
       model.setName(S.getTextName().getText());
       model.setAddress(S.getTextAddress().getText());
       model.setAllergy(S.getTextAllergy().getText());
       model.setContact(Integer.parseInt(S.getTextContactNo().getText()));
       model.setSex(String.valueOf(S.getTextSex().getSelectedItem()));
       model.setAge(Integer.parseInt(String.valueOf(S.getTextAge().getSelectedItem())));
       model.setDOA(S.getTextDateOfAdmission().getText());
       model.setFContact(Integer.parseInt(S.getTextFContactNo().getText()));
       model.setFName(S.getTextFName().getText());
       model.setTOA(S.getTextTimeOfAdmission().getText());
       
       return model;
    }
     public PatientModel CTModelOut(outpatient_jpanel S)
    {
        PatientModel model = new PatientModel();
       model.setOpNo(Integer.parseInt(S.getTextOpno().getText()));
       model.setName(S.getTextName().getText());
       model.setAddress(S.getTextAddress().getText());
       model.setDiagnosis(S.getTextDiagnosis().getText());
       model.setContact(Integer.parseInt(S.getTextContactNo().getText()));
       model.setSex(String.valueOf(S.getTextSex().getText()));
       model.setAge(Integer.parseInt(String.valueOf(S.getTextAge().getText())));
       model.setDOA(S.getTextDateOfAdmission().getText());
       model.setFContact(Integer.parseInt(S.getTextFContactNo().getText()));
       model.setFName(S.getTextFName().getText());
       model.setDOD(S.getTextDateOfDischarge().getText());
       model.setDName(String.valueOf(S.getTextDName().getSelectedItem()));
       
       return model;
    }
       public PatientModel CTModel1(InPatApp S)
    {
       PatientModel model = new PatientModel();
       model.setOpNo(Integer.parseInt(S.getTextOpno().getText()));
       model.setName(S.getTextName().getText());
       model.setAddress(S.getTextAddress().getText());
       model.setAllergy(S.getTextAllergy().getText());
       model.setContact(Integer.parseInt(S.getTextContactNo().getText()));
       model.setSex(String.valueOf(S.getTextSex().getSelectedItem()));
       model.setAge(Integer.parseInt(String.valueOf(S.getTextAge().getSelectedItem())));
       model.setDOA(S.getTextDateOfAdmission().getText());
       model.setFContact(Integer.parseInt(S.getTextFContactNo().getText()));
       model.setFName(S.getTextFName().getText());
       model.setTOA(S.getTextTimeOfAdmission().getText());
       
       return model;
    }
}

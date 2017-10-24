
import com.model.AdminModel;
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
public class LoginService {
    public ResultSet login(login_jframe L)
    {
        AdminModel Am = CTModel(L);
        RepositoryClass Rc = new RepositoryClass();
        ResultSet Rs = Rc.checkAdmin(Am);
        return Rs;
        
    }
   
    public AdminModel CTModel(login_jframe L)
    {
        AdminModel Am = new AdminModel();
        Am.setName(L.getTextUserName().getText());
        Am.setPassword(L.getTextPassword().getText());
        return Am;
    }
    
}

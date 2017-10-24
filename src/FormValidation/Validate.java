/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormValidation;
import java.util.regex.*;

/**
 *
 * @author Subik
 */
public class Validate {
    public boolean isString(String s)
    {
        return s.matches("[a-zA-Z, ]+");
    }
     public boolean isInteger(String s)
    {
        return s.matches("[0-9 ]+");
    }
    public boolean isEmpty(String S)
    {
        return S.matches("^$");
    }
      public boolean isStringInt(String s)
    {
        return s.matches("[a-zA-Z0-9, ]+");
    }
}
    
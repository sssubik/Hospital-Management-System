


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subik
 */
public class ConvertToDay {
     public int Convert(String inputString1, String inputString2)
    { SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
           

    try {
        Date date1 = myFormat.parse(inputString1);
    Date date2 = myFormat.parse(inputString2);
    long diff = date2.getTime() - date1.getTime();
   return (int) (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    } catch (ParseException e) {
    e.printStackTrace();
   return 0;
}
    }
    
}

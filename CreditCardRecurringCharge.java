import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
public class CreditCardRecurringCharge {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webservice.paymentxp.com/wh/webhost.aspx?MerchantID=10012&MerchantKey=c22a63ee-2e7a-4ace-96ac-0958dc8d953f&CardNumber=4111111111111111&DayOfMonthOption=15&MonthlyOption=1&OccurenceOption=2&WeekOption=0&WeekdayOption=0&StartDate=08152014&MonthOfYearOption=1&ExpirationDateMMYY=1218&TransactionAmount=1.00&TransactionType=CreditCardRecurringCharge");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String strTemp = "";
            while (null != (strTemp = br.readLine())) {
                System.out.println(strTemp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

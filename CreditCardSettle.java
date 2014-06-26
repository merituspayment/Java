import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
public class CreditCardSettle {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webservice.paymentxp.com/wh/webhost.aspx?MerchantID=10012&MerchantKey=c22a63ee-2e7a-4ace-96ac-0958dc8d953f&TransactionAmount=1.00&TransactionType=CreditCardSettle&CardNumber=4111111111111111&ExpirationDateMMYY=1218&BillingNameFirst=John&BillingNameLast=Doe&TransactionID=13051858");
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

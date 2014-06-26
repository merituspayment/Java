import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
public class CreditCardAdjust {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webservice.paymentxp.com/wh/webhost.aspx?MerchantID=10012&MerchantKey=c22a63ee-2e7a-4ace-96ac-0958dc8d953f&TransactionType=CreditCardAdjust&TransactionAmount=1.00&AuthCode=123456789&CardNumber=411111111111111&ExpirationDateMMYY=1218");
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

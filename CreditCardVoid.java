import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
public class CreditCardVoid {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webservice.paymentxp.com/wh/webhost.aspx?MerchantID=10012&MerchantKey=c22a63ee-2e7a-4ace-96ac-0958dc8d953f&AuthCode=13052353&TransactionType=CreditCardVoid");
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

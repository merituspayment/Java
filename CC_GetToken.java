import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
public class CC_GetToken {
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://webservice.paymentxp.com/wh/GetToken.aspx?CardNumber=4111111111111111ExpirationDateMMYY=1218&MerchantID=10012");
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

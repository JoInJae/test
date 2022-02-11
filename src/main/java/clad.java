import javax.xml.crypto.Data;
import java.text.DecimalFormat;

public class clad {

    public static void main(String[] args) {

        double[] Data = {209,
                403,
                283,
                244,
                319,
                243,
                279,
                155,
                0,
                0,
                303,
                463,
                1178,
                307,
                315
        };



        double hap = 0;
    for(int i = 0; i<Data.length; i++){
        hap += Data[i];
    }
    double avg = hap / Data.length;

        System.out.println(String.format("%.3f",avg));
    }
}

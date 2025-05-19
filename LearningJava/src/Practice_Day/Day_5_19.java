package Practice_Day;

import java.io.IOException;
import java.security.cert.CertificateException;

public class Day_5_19 {
    public static void main(String[] args)  /*throws Exception*/ {

        int pos = 0;
        try {
            // 例外が発生するかもしれない処理を書くブロック
            System.out.println("t-1");
            if (pos == 0)
                throw new Exception();  // pos が 0 なら Exception を発生させる
            if (pos == 1)
                throw new IOException();  // pos が 1 なら IOException を発生させる
            if (pos == 2)
                throw new CertificateException();  // pos が 2 なら CertificateException を発生させる
        } catch (CertificateException e) {
            System.out.println("CertificateException");
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

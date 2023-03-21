package amazonpay.silentpay;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class l {
    static String a(Context context, String str) throws IOException {
        FileInputStream openFileInput = context.openFileInput(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            } else {
                openFileInput.close();
                return sb2.toString();
            }
        }
    }

    static void b(Context context, String str, int i11, String str2) throws IOException {
        FileOutputStream openFileOutput = context.openFileOutput(str, i11);
        openFileOutput.write(str2.getBytes());
        openFileOutput.close();
    }

    static boolean c(Context context, String str) {
        return context.deleteFile(str);
    }
}

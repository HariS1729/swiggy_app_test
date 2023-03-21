package o5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.ByteArrayOutputStream;

@Instrumented
public class c {
    public static byte[] a(byte[] bArr, int i11, int i12, int i13) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!(i13 == 90 || i13 == 270)) {
            int i14 = i12;
            i12 = i11;
            i11 = i14;
        }
        int i15 = i11;
        int i16 = i12;
        new YuvImage(bArr, 17, i15, i16, (int[]) null).compressToJpeg(new Rect(0, 0, i11, i12), 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap decodeByteArray = BitmapFactoryInstrumentation.decodeByteArray(byteArray, 0, byteArray.length);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i13);
        Bitmap.createBitmap(decodeByteArray, 0, 0, i15, i16, matrix, false).compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }
}

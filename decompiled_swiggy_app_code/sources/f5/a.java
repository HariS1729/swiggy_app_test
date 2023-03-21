package f5;

import android.content.Context;
import android.util.Log;
import co.hyperverge.facedetection.Detectors.NDPDetector;
import com.xiaomi.mipush.sdk.Constants;
import g5.b;
import java.util.ArrayList;

/* compiled from: FaceDetectorApi */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14639a = "f5.a";

    /* renamed from: b  reason: collision with root package name */
    private static g5.a f14640b;

    public static ArrayList<ArrayList<Float>> a(byte[] bArr, int i11, int i12, int i13) {
        g5.a aVar = f14640b;
        if (aVar != null) {
            return ((NDPDetector) aVar).c(bArr, i11, i12, i13);
        }
        Log.e(f14639a, "Detector not initialized");
        return null;
    }

    public static int b(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        int i17 = i13;
        sb2.append(i13);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        int i18 = i14;
        sb2.append(i14);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        int i19 = i15;
        sb2.append(i15);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb2.append(i16);
        Log.i("touchh", sb2.toString());
        g5.a aVar = f14640b;
        if (aVar != null) {
            return ((NDPDetector) aVar).d(bArr, i11, i12, i13, i14, i15, i16, z11);
        }
        Log.e(f14639a, "Detector not initialized");
        return -1;
    }

    public static void c(Context context, int i11) {
        d();
        if (i11 == 0) {
            b bVar = new b();
            f14640b = bVar;
            bVar.a(context);
        } else if (i11 == 2) {
            NDPDetector nDPDetector = new NDPDetector();
            f14640b = nDPDetector;
            nDPDetector.a(context);
        }
    }

    public static void d() {
        g5.a aVar = f14640b;
        if (aVar != null) {
            aVar.b();
            f14640b = null;
        }
    }
}

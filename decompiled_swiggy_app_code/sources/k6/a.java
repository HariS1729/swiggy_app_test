package k6;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import bk.a;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.ak;

/* compiled from: HVBarcodeDetector */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f15417b = "co.hyperverge.hypersnapsdk.service.qr.HVBarcodeDetector";

    /* renamed from: a  reason: collision with root package name */
    private bk.a f15418a;

    public String a(Bitmap bitmap) {
        if (this.f15418a != null) {
            SparseArray<Barcode> a11 = this.f15418a.a(new ak.e.a().b(bitmap).a());
            if (a11.size() != 0) {
                return a11.valueAt(0).f44900b;
            }
        }
        return "";
    }

    public void b(Context context, int i11) {
        if (context != null) {
            this.f15418a = new a.C0551a(context).b(i11).a();
        } else {
            Log.e(f15417b, "context is null");
        }
    }
}

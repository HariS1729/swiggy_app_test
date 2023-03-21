package w5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import f5.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import w5.e;
import w5.g;
import z5.f;

@Instrumented
/* compiled from: SaveBitmapAsync */
public class p implements Runnable {
    private static final String j = p.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    Bitmap f17600a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f17601b;

    /* renamed from: c  reason: collision with root package name */
    byte[] f17602c;

    /* renamed from: d  reason: collision with root package name */
    String f17603d;

    /* renamed from: e  reason: collision with root package name */
    String f17604e;

    /* renamed from: f  reason: collision with root package name */
    a f17605f;

    /* renamed from: g  reason: collision with root package name */
    e.a f17606g;

    /* renamed from: h  reason: collision with root package name */
    HVFaceConfig f17607h;

    /* renamed from: i  reason: collision with root package name */
    List<Integer> f17608i = new ArrayList();

    /* compiled from: SaveBitmapAsync */
    public interface a {
        void a(String str, List<Integer> list);
    }

    public p(byte[] bArr, byte[] bArr2, String str, e.a aVar, String str2, HVFaceConfig hVFaceConfig, a aVar2) {
        this.f17601b = bArr;
        this.f17603d = str;
        this.f17604e = str2;
        this.f17605f = aVar2;
        this.f17606g = aVar;
        this.f17607h = hVFaceConfig;
        this.f17602c = bArr2;
    }

    public Bitmap a(int i11) {
        byte[] bArr = this.f17601b;
        Bitmap decodeByteArray = BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length);
        this.f17600a = decodeByteArray;
        Bitmap d11 = f.d(decodeByteArray, i11);
        this.f17600a = d11;
        return d11;
    }

    public Bitmap b(Bitmap bitmap) {
        if (this.f17606g == null) {
            return null;
        }
        try {
            b bVar = new b("", this.f17603d);
            List<Float> f11 = this.f17606g.f();
            bVar.d(f11.get(0).floatValue(), f11.get(1).floatValue(), f11.get(2).floatValue(), f11.get(3).floatValue());
            Bitmap c11 = g.c(bitmap, bVar, this.f17607h);
            this.f17608i = g.e(bVar, bitmap);
            return c11;
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    public void c(byte[] bArr, Bitmap bitmap) {
        try {
            Bitmap decodeByteArray = BitmapFactoryInstrumentation.decodeByteArray(bArr, 0, bArr.length);
            j.n().t(decodeByteArray, Bitmap.createScaledBitmap(bitmap, decodeByteArray.getWidth(), decodeByteArray.getHeight(), false));
        } catch (Exception e11) {
            Log.e(j, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void run() {
        Bitmap a11 = a(o5.a.b(this.f17601b));
        this.f17600a = a11;
        if (a11 == null) {
            this.f17605f.a((String) null, this.f17608i);
            return;
        }
        if (n.w() != null && n.w().F()) {
            j.n().h(this.f17600a.getHeight(), this.f17600a.getWidth());
            byte[] bArr = this.f17602c;
            if (bArr != null) {
                c(bArr, this.f17600a);
            }
        }
        try {
            File file = new File(this.f17603d, this.f17604e);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            this.f17600a.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap b11 = b(this.f17600a);
            if (b11 != null) {
                String str = this.f17603d;
                file = new File(str, "FD_crop_" + System.currentTimeMillis() + ".jpg");
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                g.a aVar = new g.a(b11.getWidth(), b11.getHeight());
                g.a f11 = g.f(aVar, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                new BitmapFactory.Options().inSampleSize = g.a(aVar, f11);
                try {
                    if (f11.f17568a < b11.getWidth()) {
                        b11 = Bitmap.createScaledBitmap(b11, f11.f17568a, f11.f17569b, true);
                    }
                } catch (Exception e11) {
                    Log.e(j, e11.getMessage());
                    if (n.w().s() != null) {
                        n.w().s().a(e11);
                    }
                }
                b11.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
                fileOutputStream2.close();
            }
            this.f17605f.a(file.getAbsolutePath(), this.f17608i);
        } catch (FileNotFoundException e12) {
            this.f17605f.a((String) null, this.f17608i);
            Log.e(j, e12.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e12);
            }
        } catch (IOException e13) {
            this.f17605f.a((String) null, this.f17608i);
            Log.e(j, e13.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e13);
            }
        }
    }
}

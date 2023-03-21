package w5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import f5.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Instrumented
/* compiled from: FileHelper */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17567a = "co.hyperverge.hypersnapsdk.c.g";

    /* compiled from: FileHelper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17568a;

        /* renamed from: b  reason: collision with root package name */
        public int f17569b;

        public a(int i11, int i12) {
            this.f17568a = i11;
            this.f17569b = i12;
        }

        public String toString() {
            return this.f17568a + " X " + this.f17569b;
        }
    }

    public static int a(a aVar, a aVar2) {
        int i11 = aVar.f17569b;
        int i12 = aVar.f17568a;
        int i13 = 1;
        if (i11 > aVar2.f17569b || i12 > aVar2.f17568a) {
            int i14 = i11 / 2;
            int i15 = i12 / 2;
            while (i14 / i13 > aVar2.f17569b && i15 / i13 > aVar2.f17568a) {
                i13 *= 2;
            }
        }
        return i13;
    }

    public static Bitmap b(Bitmap bitmap, int i11) {
        if (i11 == 1) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e11) {
            Log.e(f17567a, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            return bitmap;
        }
    }

    public static Bitmap c(Bitmap bitmap, b bVar, HVFaceConfig hVFaceConfig) {
        if (bitmap == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(bVar.c());
            int a11 = bVar.a(jSONObject.getInt("ltx"), bitmap.getWidth());
            int b11 = bVar.b(jSONObject.getInt("lty"), bitmap.getHeight());
            int a12 = bVar.a(jSONObject.getInt("rbx"), bitmap.getWidth());
            int b12 = bVar.b(jSONObject.getInt("rby"), bitmap.getHeight());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i11 = a12 - a11;
            int i12 = b12 - b11;
            float f11 = 0.0f;
            float topPadding = hVFaceConfig.getTopPadding() > 0.0f ? ((float) i12) * hVFaceConfig.getTopPadding() : 0.0f;
            float bottomPadding = hVFaceConfig.getBottomPadding() > 0.0f ? ((float) i12) * hVFaceConfig.getBottomPadding() : 0.0f;
            float leftPadding = hVFaceConfig.getLeftPadding() > 0.0f ? ((float) i11) * hVFaceConfig.getLeftPadding() : 0.0f;
            if (hVFaceConfig.getRightPadding() > 0.0f) {
                f11 = ((float) i11) * hVFaceConfig.getRightPadding();
            }
            int i13 = (int) (((float) a11) - leftPadding);
            int i14 = (int) (((float) a12) + f11);
            int i15 = (int) (((float) b11) - topPadding);
            int i16 = (int) (((float) b12) + bottomPadding);
            int i17 = 0;
            if (i13 < 0) {
                i13 = 0;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            if (i14 > width) {
                i14 = width;
            }
            if (i16 > height) {
                i16 = height;
            }
            int i18 = i14 - i13;
            int i19 = i16 - i15;
            if (i13 + i18 > width) {
                i13 = 0;
            } else {
                width = i18;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 + i19 <= height) {
                height = i19;
                i17 = i15;
            }
            return Bitmap.createBitmap(bitmap, i13, i17, width, height);
        } catch (Exception e11) {
            Log.e(f17567a, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
            return null;
        }
    }

    public static Bitmap d(String str) {
        try {
            new BitmapFactory.Options().inPreferredConfig = Bitmap.Config.ARGB_8888;
            return BitmapFactoryInstrumentation.decodeFile(str);
        } catch (Exception e11) {
            Log.e(f17567a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        } catch (OutOfMemoryError e12) {
            Log.e(f17567a, e12.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e12);
            return null;
        }
    }

    public static List<Integer> e(b bVar, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(bVar.c());
            int a11 = bVar.a(jSONObject.getInt("ltx"), bitmap.getWidth());
            int b11 = bVar.b(jSONObject.getInt("lty"), bitmap.getHeight());
            int a12 = bVar.a(jSONObject.getInt("rbx"), bitmap.getWidth());
            int b12 = bVar.b(jSONObject.getInt("rby"), bitmap.getHeight());
            arrayList.add(Integer.valueOf(a11));
            arrayList.add(Integer.valueOf(b11));
            arrayList.add(Integer.valueOf(a12));
            arrayList.add(Integer.valueOf(b12));
        } catch (JSONException e11) {
            Log.e(f17567a, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
        return arrayList;
    }

    public static a f(a aVar, int i11) {
        int i12 = aVar.f17568a;
        int i13 = aVar.f17569b;
        if (i12 > i11) {
            i13 = (i13 * i11) / i12;
        } else {
            i11 = i12;
        }
        return new a(i11, i13);
    }

    public static Bitmap g(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        switch (i11) {
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e11) {
            Log.e(f17567a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }
}

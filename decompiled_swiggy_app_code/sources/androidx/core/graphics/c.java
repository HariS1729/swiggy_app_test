package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.d;

/* compiled from: PaintCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<d<Rect, Rect>> f9239a = new ThreadLocal<>();

    /* compiled from: PaintCompat */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f11 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i11 = 0;
            while (i11 < length) {
                int charCount = Character.charCount(str.codePointAt(i11)) + i11;
                f11 += paint.measureText(str, i11, charCount);
                i11 = charCount;
            }
            if (measureText3 >= f11) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        d<Rect, Rect> b11 = b();
        paint.getTextBounds("󟿽", 0, 2, (Rect) b11.f9416a);
        paint.getTextBounds(str, 0, length, (Rect) b11.f9417b);
        return !((Rect) b11.f9416a).equals(b11.f9417b);
    }

    private static d<Rect, Rect> b() {
        ThreadLocal<d<Rect, Rect>> threadLocal = f9239a;
        d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            d<Rect, Rect> dVar2 = new d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f9416a).setEmpty();
        ((Rect) dVar.f9417b).setEmpty();
        return dVar;
    }
}

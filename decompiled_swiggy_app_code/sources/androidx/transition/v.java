package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import org.xmlpull.v1.XmlPullParser;
import y3.c;

/* compiled from: PatternPathMotion */
public class v extends c {

    /* renamed from: a  reason: collision with root package name */
    private Path f12005a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f12006b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f12007c = new Matrix();

    @SuppressLint({"RestrictedApi"})
    public v(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.k);
        try {
            String m11 = k.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m11 != null) {
                c(d.e(m11));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float b(float f11, float f12) {
        return (float) Math.sqrt((double) ((f11 * f11) + (f12 * f12)));
    }

    public Path a(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float b11 = b(f15, f16);
        double atan2 = Math.atan2((double) f16, (double) f15);
        this.f12007c.setScale(b11, b11);
        this.f12007c.postRotate((float) Math.toDegrees(atan2));
        this.f12007c.postTranslate(f11, f12);
        Path path = new Path();
        this.f12006b.transform(this.f12007c, path);
        return path;
    }

    public void c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, (float[]) null);
        float f13 = fArr[0];
        float f14 = fArr[1];
        if (f13 == f11 && f14 == f12) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f12007c.setTranslate(-f13, -f14);
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float b11 = 1.0f / b(f15, f16);
        this.f12007c.postScale(b11, b11);
        this.f12007c.postRotate((float) Math.toDegrees(-Math.atan2((double) f16, (double) f15)));
        path.transform(this.f12007c, this.f12006b);
        this.f12005a = path;
    }
}

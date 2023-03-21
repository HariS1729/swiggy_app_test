package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat */
final class f {
    private static a a(a aVar, int i11, int i12, boolean z11, int i13) {
        if (aVar != null) {
            return aVar;
        }
        if (z11) {
            return new a(i11, i13, i12);
        }
        return new a(i11, i12);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s11 = k.s(resources, theme2, attributeSet, R.styleable.GradientColor);
            float j = k.j(s11, xmlPullParser2, "startX", R.styleable.GradientColor_android_startX, 0.0f);
            float j11 = k.j(s11, xmlPullParser2, "startY", R.styleable.GradientColor_android_startY, 0.0f);
            float j12 = k.j(s11, xmlPullParser2, "endX", R.styleable.GradientColor_android_endX, 0.0f);
            float j13 = k.j(s11, xmlPullParser2, "endY", R.styleable.GradientColor_android_endY, 0.0f);
            float j14 = k.j(s11, xmlPullParser2, "centerX", R.styleable.GradientColor_android_centerX, 0.0f);
            float j15 = k.j(s11, xmlPullParser2, "centerY", R.styleable.GradientColor_android_centerY, 0.0f);
            int k = k.k(s11, xmlPullParser2, "type", R.styleable.GradientColor_android_type, 0);
            int f11 = k.f(s11, xmlPullParser2, "startColor", R.styleable.GradientColor_android_startColor, 0);
            boolean r11 = k.r(xmlPullParser2, "centerColor");
            int f12 = k.f(s11, xmlPullParser2, "centerColor", R.styleable.GradientColor_android_centerColor, 0);
            int f13 = k.f(s11, xmlPullParser2, "endColor", R.styleable.GradientColor_android_endColor, 0);
            int k11 = k.k(s11, xmlPullParser2, "tileMode", R.styleable.GradientColor_android_tileMode, 0);
            float f14 = j14;
            float j16 = k.j(s11, xmlPullParser2, "gradientRadius", R.styleable.GradientColor_android_gradientRadius, 0.0f);
            s11.recycle();
            a a11 = a(c(resources, xmlPullParser, attributeSet, theme), f11, f13, r11, f12);
            if (k == 1) {
                float f15 = f14;
                if (j16 > 0.0f) {
                    int[] iArr = a11.f9207a;
                    return new RadialGradient(f15, j15, j16, iArr, a11.f9208b, d(k11));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j11, j12, j13, a11.f9207a, a11.f9208b, d(k11));
            } else {
                return new SweepGradient(f14, j15, a11.f9207a, a11.f9208b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r3 = androidx.core.content.res.k.s(r9, r12, r11, r3)
            int r5 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r6 = r3.hasValue(r5)
            int r7 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i11) {
        if (i11 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i11 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* compiled from: GradientColorInflaterCompat */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f9207a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f9208b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f9207a = new int[size];
            this.f9208b = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                this.f9207a[i11] = list.get(i11).intValue();
                this.f9208b[i11] = list2.get(i11).floatValue();
            }
        }

        a(int i11, int i12) {
            this.f9207a = new int[]{i11, i12};
            this.f9208b = new float[]{0.0f, 1.0f};
        }

        a(int i11, int i12, int i13) {
            this.f9207a = new int[]{i11, i12, i13};
            this.f9208b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

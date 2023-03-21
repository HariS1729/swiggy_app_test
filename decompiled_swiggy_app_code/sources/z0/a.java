package z0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.d;
import androidx.core.content.res.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlVectorParser.android.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final XmlPullParser f18042a;

    /* renamed from: b  reason: collision with root package name */
    private int f18043b;

    public a(XmlPullParser xmlPullParser, int i11) {
        p.j(xmlPullParser, "xmlParser");
        this.f18042a = xmlPullParser;
        this.f18043b = i11;
    }

    private final void m(int i11) {
        this.f18043b = i11 | this.f18043b;
    }

    public final int a() {
        return this.f18043b;
    }

    public final float b(TypedArray typedArray, int i11, float f11) {
        p.j(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i11, f11);
        m(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int i11, float f11) {
        p.j(typedArray, "typedArray");
        float f12 = typedArray.getFloat(i11, f11);
        m(typedArray.getChangingConfigurations());
        return f12;
    }

    public final int d(TypedArray typedArray, int i11, int i12) {
        p.j(typedArray, "typedArray");
        int i13 = typedArray.getInt(i11, i12);
        m(typedArray.getChangingConfigurations());
        return i13;
    }

    public final boolean e(TypedArray typedArray, String str, int i11, boolean z11) {
        p.j(typedArray, "typedArray");
        p.j(str, "attrName");
        boolean e11 = k.e(typedArray, this.f18042a, str, i11, z11);
        m(typedArray.getChangingConfigurations());
        return e11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f18042a, aVar.f18042a) && this.f18043b == aVar.f18043b;
    }

    public final ColorStateList f(TypedArray typedArray, Resources.Theme theme, String str, int i11) {
        p.j(typedArray, "typedArray");
        p.j(str, "attrName");
        ColorStateList g11 = k.g(typedArray, this.f18042a, theme, str, i11);
        m(typedArray.getChangingConfigurations());
        return g11;
    }

    public final d g(TypedArray typedArray, Resources.Theme theme, String str, int i11, int i12) {
        p.j(typedArray, "typedArray");
        p.j(str, "attrName");
        d i13 = k.i(typedArray, this.f18042a, theme, str, i11, i12);
        m(typedArray.getChangingConfigurations());
        p.i(i13, "result");
        return i13;
    }

    public final float h(TypedArray typedArray, String str, int i11, float f11) {
        p.j(typedArray, "typedArray");
        p.j(str, "attrName");
        float j = k.j(typedArray, this.f18042a, str, i11, f11);
        m(typedArray.getChangingConfigurations());
        return j;
    }

    public int hashCode() {
        return (this.f18042a.hashCode() * 31) + this.f18043b;
    }

    public final int i(TypedArray typedArray, String str, int i11, int i12) {
        p.j(typedArray, "typedArray");
        p.j(str, "attrName");
        int k = k.k(typedArray, this.f18042a, str, i11, i12);
        m(typedArray.getChangingConfigurations());
        return k;
    }

    public final String j(TypedArray typedArray, int i11) {
        p.j(typedArray, "typedArray");
        String string = typedArray.getString(i11);
        m(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser k() {
        return this.f18042a;
    }

    public final TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        p.j(resources, "res");
        p.j(attributeSet, "set");
        p.j(iArr, "attrs");
        TypedArray s11 = k.s(resources, theme, attributeSet, iArr);
        p.i(s11, "obtainAttributes(\n      …          attrs\n        )");
        m(s11.getChangingConfigurations());
        return s11;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f18042a + ", config=" + this.f18043b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(XmlPullParser xmlPullParser, int i11, int i12, i iVar) {
        this(xmlPullParser, (i12 & 2) != 0 ? 0 : i11);
    }
}

package z0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.d;
import androidx.core.content.res.k;
import com.rudderstack.android.sdk.core.MessageType;
import d2.h;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u0.d0;
import u0.f0;
import u0.k1;
import u0.l1;
import u0.m1;
import u0.s;
import u0.u;
import u0.v;
import u0.y0;
import y0.c;
import y0.m;

/* compiled from: XmlVectorParser.android.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int f18064a = 0;

    public static final c.a a(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long j;
        int i11;
        a aVar2 = aVar;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        p.j(aVar2, "<this>");
        p.j(resources2, "res");
        p.j(attributeSet2, "attrs");
        b bVar = b.f18044a;
        TypedArray l11 = aVar2.l(resources2, theme2, attributeSet2, bVar.F());
        boolean e11 = aVar2.e(l11, "autoMirrored", bVar.a(), false);
        float h11 = aVar2.h(l11, "viewportWidth", bVar.H(), 0.0f);
        float h12 = aVar2.h(l11, "viewportHeight", bVar.G(), 0.0f);
        if (h11 <= 0.0f) {
            throw new XmlPullParserException(l11.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (h12 > 0.0f) {
            float b11 = aVar2.b(l11, bVar.I(), 0.0f);
            float b12 = aVar2.b(l11, bVar.n(), 0.0f);
            if (l11.hasValue(bVar.D())) {
                TypedValue typedValue = new TypedValue();
                l11.getValue(bVar.D(), typedValue);
                if (typedValue.type == 2) {
                    j = d0.f16756b.f();
                } else {
                    ColorStateList f11 = aVar2.f(l11, theme2, "tint", bVar.D());
                    if (f11 != null) {
                        j = f0.b(f11.getDefaultColor());
                    } else {
                        j = d0.f16756b.f();
                    }
                }
            } else {
                j = d0.f16756b.f();
            }
            long j11 = j;
            int d11 = aVar2.d(l11, bVar.E(), -1);
            if (d11 == -1) {
                i11 = s.f16866b.z();
            } else if (d11 == 3) {
                i11 = s.f16866b.B();
            } else if (d11 == 5) {
                i11 = s.f16866b.z();
            } else if (d11 != 9) {
                switch (d11) {
                    case 14:
                        i11 = s.f16866b.q();
                        break;
                    case 15:
                        i11 = s.f16866b.v();
                        break;
                    case 16:
                        i11 = s.f16866b.t();
                        break;
                    default:
                        i11 = s.f16866b.z();
                        break;
                }
            } else {
                i11 = s.f16866b.y();
            }
            int i12 = i11;
            float n = h.n(b11 / resources.getDisplayMetrics().density);
            float n11 = h.n(b12 / resources.getDisplayMetrics().density);
            l11.recycle();
            return new c.a((String) null, n, n11, h11, h12, j11, i12, e11, 1, (i) null);
        } else {
            throw new XmlPullParserException(l11.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    private static final int b(int i11, int i12) {
        if (i11 == 0) {
            return l1.f16824b.a();
        }
        if (i11 == 1) {
            return l1.f16824b.b();
        }
        if (i11 != 2) {
            return i12;
        }
        return l1.f16824b.c();
    }

    private static final int c(int i11, int i12) {
        if (i11 == 0) {
            return m1.f16837b.b();
        }
        if (i11 == 1) {
            return m1.f16837b.c();
        }
        if (i11 != 2) {
            return i12;
        }
        return m1.f16837b.a();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        p.j(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() >= 1 || xmlPullParser.getEventType() != 3) {
            return false;
        }
        return true;
    }

    private static final u e(d dVar) {
        if (!dVar.l()) {
            return null;
        }
        Shader f11 = dVar.f();
        if (f11 != null) {
            return v.a(f11);
        }
        return new k1(f0.b(dVar.e()), (i) null);
    }

    public static final void f(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) {
        a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        p.j(aVar3, "<this>");
        p.j(resources2, "res");
        p.j(attributeSet2, "attrs");
        p.j(aVar2, "builder");
        b bVar = b.f18044a;
        TypedArray l11 = aVar3.l(resources2, theme, attributeSet2, bVar.b());
        String j = aVar3.j(l11, bVar.c());
        if (j == null) {
            j = "";
        }
        List<y0.d> a11 = m.a(aVar3.j(l11, bVar.d()));
        l11.recycle();
        c.a.b(aVar2, j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, a11, 254, (Object) null);
    }

    public static final int g(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, c.a aVar2, int i11) {
        p.j(aVar, "<this>");
        p.j(resources, "res");
        p.j(attributeSet, "attrs");
        p.j(aVar2, "builder");
        int eventType = aVar.k().getEventType();
        if (eventType == 2) {
            String name = aVar.k().getName();
            if (name == null) {
                return i11;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals(MessageType.GROUP)) {
                        return i11;
                    }
                    h(aVar, resources, theme, attributeSet, aVar2);
                    return i11;
                } else if (!name.equals("path")) {
                    return i11;
                } else {
                    i(aVar, resources, theme, attributeSet, aVar2);
                    return i11;
                }
            } else if (!name.equals("clip-path")) {
                return i11;
            } else {
                f(aVar, resources, theme, attributeSet, aVar2);
                return i11 + 1;
            }
        } else if (eventType != 3 || !p.e(MessageType.GROUP, aVar.k().getName())) {
            return i11;
        } else {
            int i12 = i11 + 1;
            for (int i13 = 0; i13 < i12; i13++) {
                aVar2.f();
            }
            return 0;
        }
    }

    public static final void h(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) {
        a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        p.j(aVar, "<this>");
        p.j(resources, "res");
        p.j(attributeSet2, "attrs");
        p.j(aVar2, "builder");
        b bVar = b.f18044a;
        TypedArray l11 = aVar.l(resources, theme, attributeSet2, bVar.e());
        float h11 = aVar.h(l11, "rotation", bVar.i(), 0.0f);
        float c11 = aVar.c(l11, bVar.g(), 0.0f);
        float c12 = aVar.c(l11, bVar.h(), 0.0f);
        float h12 = aVar.h(l11, "scaleX", bVar.j(), 1.0f);
        float h13 = aVar.h(l11, "scaleY", bVar.k(), 1.0f);
        float h14 = aVar.h(l11, "translateX", bVar.l(), 0.0f);
        float h15 = aVar.h(l11, "translateY", bVar.m(), 0.0f);
        String j = aVar.j(l11, bVar.f());
        if (j == null) {
            j = "";
        }
        l11.recycle();
        aVar2.a(j, h11, c11, c12, h12, h13, h14, h15, m.e());
    }

    public static final void i(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, c.a aVar2) throws IllegalArgumentException {
        a aVar3 = aVar;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        p.j(aVar3, "<this>");
        p.j(resources2, "res");
        p.j(attributeSet2, "attrs");
        p.j(aVar2, "builder");
        b bVar = b.f18044a;
        TypedArray l11 = aVar3.l(resources2, theme, attributeSet2, bVar.o());
        if (k.r(aVar.k(), "pathData")) {
            String j = aVar3.j(l11, bVar.r());
            if (j == null) {
                j = "";
            }
            String str = j;
            List<y0.d> a11 = m.a(aVar3.j(l11, bVar.s()));
            d g11 = aVar.g(l11, theme, "fillColor", bVar.q(), 0);
            float h11 = aVar3.h(l11, "fillAlpha", bVar.p(), 1.0f);
            int b11 = b(aVar3.i(l11, "strokeLineCap", bVar.v(), -1), l1.f16824b.a());
            int c11 = c(aVar3.i(l11, "strokeLineJoin", bVar.w(), -1), m1.f16837b.a());
            float h12 = aVar3.h(l11, "strokeMiterLimit", bVar.x(), 1.0f);
            d g12 = aVar.g(l11, theme, "strokeColor", bVar.u(), 0);
            float h13 = aVar3.h(l11, "strokeAlpha", bVar.t(), 1.0f);
            float h14 = aVar3.h(l11, "strokeWidth", bVar.y(), 1.0f);
            float h15 = aVar3.h(l11, "trimPathEnd", bVar.z(), 1.0f);
            float h16 = aVar3.h(l11, "trimPathOffset", bVar.B(), 0.0f);
            float h17 = aVar3.h(l11, "trimPathStart", bVar.C(), 0.0f);
            int i11 = aVar3.i(l11, "fillType", bVar.A(), f18064a);
            l11.recycle();
            u e11 = e(g11);
            u e12 = e(g12);
            y0.a aVar4 = y0.f16899b;
            aVar2.c(a11, i11 == 0 ? aVar4.b() : aVar4.a(), str, e11, h11, e12, h13, h14, b11, c11, h12, h17, h15, h16);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException {
        p.j(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}

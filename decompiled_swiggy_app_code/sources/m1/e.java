package m1;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.g;
import kotlin.jvm.internal.p;
import m1.d;
import u0.l0;
import y0.c;

/* compiled from: PainterResources.android.kt */
public final class e {
    private static final l0 a(Resources resources, int i11) {
        try {
            return c.a(l0.f16822a, resources, i11);
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
        }
    }

    private static final c b(Resources.Theme theme, Resources resources, int i11, g gVar, int i12) {
        gVar.E(2112503116);
        d dVar = (d) gVar.z(AndroidCompositionLocals_androidKt.h());
        d.b bVar = new d.b(theme, i11);
        d.a b11 = dVar.b(bVar);
        if (b11 == null) {
            XmlResourceParser xml = resources.getXml(i11);
            p.i(xml, "res.getXml(id)");
            if (p.e(z0.c.j(xml).getName(), "vector")) {
                b11 = g.a(theme, resources, xml);
                dVar.d(bVar, b11);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        c b12 = b11.b();
        gVar.P();
        return b12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: u0.l0} */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.compose.ui.graphics.vector.VectorPainter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.graphics.painter.Painter c(int r9, e0.g r10, int r11) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r10.E(r0)
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r10.z(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r2)
            java.lang.Object r2 = r10.F()
            e0.g$a r3 = e0.g.f14172a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x002e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r10.y(r2)
        L_0x002e:
            r10.P()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r4 = 1
            r1.getValue(r9, r2, r4)
            java.lang.CharSequence r2 = r2.string
            r5 = 0
            if (r2 == 0) goto L_0x0047
            r6 = 2
            r7 = 0
            java.lang.String r8 = ".xml"
            boolean r6 = kotlin.text.StringsKt__StringsKt.Y(r2, r8, r5, r6, r7)
            if (r6 != r4) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            java.lang.String r6 = "res"
            if (r4 == 0) goto L_0x0070
            r2 = -738265321(0xffffffffd3fef717, float:-2.19013435E12)
            r10.E(r2)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r2 = "context.theme"
            kotlin.jvm.internal.p.i(r0, r2)
            kotlin.jvm.internal.p.i(r1, r6)
            int r11 = r11 << 6
            r11 = r11 & 896(0x380, float:1.256E-42)
            r11 = r11 | 72
            y0.c r9 = b(r0, r1, r9, r10, r11)
            androidx.compose.ui.graphics.vector.VectorPainter r9 = androidx.compose.ui.graphics.vector.VectorPainterKt.b(r9, r10, r5)
            r10.P()
            goto L_0x00b4
        L_0x0070:
            r11 = -738265196(0xffffffffd3fef794, float:-2.19015073E12)
            r10.E(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.E(r0)
            boolean r0 = r10.k(r2)
            boolean r11 = r10.k(r11)
            r11 = r11 | r0
            java.lang.Object r0 = r10.F()
            if (r11 != 0) goto L_0x0095
            java.lang.Object r11 = r3.a()
            if (r0 != r11) goto L_0x009f
        L_0x0095:
            kotlin.jvm.internal.p.i(r1, r6)
            u0.l0 r0 = a(r1, r9)
            r10.y(r0)
        L_0x009f:
            r10.P()
            r2 = r0
            u0.l0 r2 = (u0.l0) r2
            x0.a r9 = new x0.a
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.P()
        L_0x00b4:
            r10.P()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.e.c(int, e0.g, int):androidx.compose.ui.graphics.painter.Painter");
    }
}

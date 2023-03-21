package a0;

import d2.c;
import d2.e;
import d2.q;
import java.util.List;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import p1.c0;
import p1.g;
import p1.l;
import u1.i;

/* compiled from: TextFieldDelegate.kt */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final String f864a = o.D(StandardStructureTypes.H, 10);

    public static final long a(c0 c0Var, e eVar, i.b bVar, String str, int i11) {
        kotlin.jvm.internal.p.j(c0Var, "style");
        kotlin.jvm.internal.p.j(eVar, "density");
        i.b bVar2 = bVar;
        kotlin.jvm.internal.p.j(bVar2, "fontFamilyResolver");
        String str2 = str;
        kotlin.jvm.internal.p.j(str2, "text");
        List j = k.j();
        g b11 = l.b(str2, c0Var, c.b(0, 0, 0, 0, 15, (Object) null), eVar, bVar2, j, (List) null, i11, false, 64, (Object) null);
        return q.a(d(b11.a()), d(b11.getHeight()));
    }

    public static /* synthetic */ long b(c0 c0Var, e eVar, i.b bVar, String str, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = f864a;
        }
        if ((i12 & 16) != 0) {
            i11 = 1;
        }
        return a(c0Var, eVar, bVar, str, i11);
    }

    public static final String c() {
        return f864a;
    }

    private static final int d(float f11) {
        return c.c((float) Math.ceil((double) f11));
    }
}

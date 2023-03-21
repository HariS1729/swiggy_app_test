package p1;

import d2.e;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.b;
import u1.i;

/* compiled from: Paragraph.kt */
public final class l {
    public static final g a(String str, c0 c0Var, long j, e eVar, i.b bVar, List<b.C0163b<u>> list, List<b.C0163b<o>> list2, int i11, boolean z11) {
        p.j(str, "text");
        p.j(c0Var, "style");
        p.j(eVar, "density");
        i.b bVar2 = bVar;
        p.j(bVar2, "fontFamilyResolver");
        List<b.C0163b<u>> list3 = list;
        p.j(list3, "spanStyles");
        List<b.C0163b<o>> list4 = list2;
        p.j(list4, "placeholders");
        return x1.e.b(str, c0Var, list3, list4, i11, z11, j, eVar, bVar2);
    }

    public static /* synthetic */ g b(String str, c0 c0Var, long j, e eVar, i.b bVar, List list, List list2, int i11, boolean z11, int i12, Object obj) {
        int i13 = i12;
        return a(str, c0Var, j, eVar, bVar, (i13 & 32) != 0 ? k.j() : list, (i13 & 64) != 0 ? k.j() : list2, (i13 & 128) != 0 ? Integer.MAX_VALUE : i11, (i13 & 256) != 0 ? false : z11);
    }

    public static final g c(j jVar, long j, int i11, boolean z11) {
        p.j(jVar, "paragraphIntrinsics");
        return x1.e.a(jVar, i11, z11, j);
    }

    public static final int d(float f11) {
        return (int) ((float) Math.ceil((double) f11));
    }
}

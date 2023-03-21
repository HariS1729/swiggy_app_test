package androidx.compose.foundation.text;

import a0.n;
import a2.l;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.q;
import p0.d;
import p1.b;
import p1.c0;
import p1.o;
import u1.i;

/* compiled from: CoreText.kt */
public final class CoreTextKt {

    /* renamed from: a  reason: collision with root package name */
    private static final Pair<List<b.C0163b<o>>, List<b.C0163b<q<String, g, Integer, k>>>> f4449a = new Pair<>(k.j(), k.j());

    public static final void a(b bVar, List<b.C0163b<q<String, g, Integer, k>>> list, g gVar, int i11) {
        b bVar2 = bVar;
        List<b.C0163b<q<String, g, Integer, k>>> list2 = list;
        p.j(bVar2, "text");
        p.j(list2, "inlineContents");
        g t = gVar.t(-110905764);
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            b.C0163b bVar3 = list2.get(i12);
            q qVar = (q) bVar3.a();
            int b11 = bVar3.b();
            int c11 = bVar3.c();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = CoreTextKt$InlineChildren$1$2.f4450a;
            t.E(-1323940314);
            d.a aVar = d.f16037h0;
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(aVar);
            int i13 = size;
            if (!(t.u() instanceof e0.e)) {
                f.c();
            }
            t.f();
            if (t.s()) {
                t.K(a11);
            } else {
                t.c();
            }
            t.J();
            g a12 = Updater.a(t);
            Updater.c(a12, coreTextKt$InlineChildren$1$2, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b12.invoke(t0.a(t0.b(t)), t, 0);
            t.E(2058660585);
            t.E(-72427749);
            qVar.invoke(bVar2.subSequence(b11, c11).g(), t, 0);
            t.P();
            t.P();
            t.d();
            t.P();
            i12++;
            size = i13;
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new CoreTextKt$InlineChildren$2(bVar2, list2, i11));
        }
    }

    public static final Pair<List<b.C0163b<o>>, List<b.C0163b<q<String, g, Integer, k>>>> b(b bVar, Map<String, a0.a> map) {
        p.j(bVar, "text");
        p.j(map, "inlineContent");
        if (map.isEmpty()) {
            return f4449a;
        }
        List<b.C0163b<String>> f11 = bVar.f("androidx.compose.foundation.text.inlineContent", 0, bVar.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = f11.size();
        for (int i11 = 0; i11 < size; i11++) {
            b.C0163b bVar2 = f11.get(i11);
            a0.a aVar = map.get(bVar2.e());
            if (aVar != null) {
                arrayList.add(new b.C0163b(aVar.b(), bVar2.f(), bVar2.d()));
                arrayList2.add(new b.C0163b(aVar.a(), bVar2.f(), bVar2.d()));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final n c(n nVar, b bVar, c0 c0Var, e eVar, i.b bVar2, boolean z11, int i11, int i12, List<b.C0163b<o>> list) {
        b bVar3 = bVar;
        c0 c0Var2 = c0Var;
        e eVar2 = eVar;
        i.b bVar4 = bVar2;
        List<b.C0163b<o>> list2 = list;
        n nVar2 = nVar;
        p.j(nVar, "current");
        p.j(bVar, "text");
        p.j(c0Var, "style");
        p.j(eVar, "density");
        p.j(bVar4, "fontFamilyResolver");
        p.j(list2, "placeholders");
        if (!p.e(nVar.k(), bVar) || !p.e(nVar.j(), c0Var)) {
            boolean z12 = z11;
        } else if (nVar.i() == z11) {
            if (l.d(nVar.g(), i11)) {
                if (nVar.d() == i12 && p.e(nVar.a(), eVar) && p.e(nVar.h(), list2) && nVar.b() == bVar4) {
                    return nVar2;
                }
                return new n(bVar, c0Var, i12, z11, i11, eVar, bVar2, list, (kotlin.jvm.internal.i) null);
            }
            int i13 = i12;
            return new n(bVar, c0Var, i12, z11, i11, eVar, bVar2, list, (kotlin.jvm.internal.i) null);
        }
        int i14 = i11;
        int i132 = i12;
        return new n(bVar, c0Var, i12, z11, i11, eVar, bVar2, list, (kotlin.jvm.internal.i) null);
    }

    public static /* synthetic */ n d(n nVar, b bVar, c0 c0Var, e eVar, i.b bVar2, boolean z11, int i11, int i12, List list, int i13, Object obj) {
        int i14 = i13;
        return c(nVar, bVar, c0Var, eVar, bVar2, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? l.f950a.a() : i11, (i14 & 128) != 0 ? Integer.MAX_VALUE : i12, list);
    }

    public static final n e(n nVar, String str, c0 c0Var, e eVar, i.b bVar, boolean z11, int i11, int i12) {
        String str2 = str;
        c0 c0Var2 = c0Var;
        e eVar2 = eVar;
        i.b bVar2 = bVar;
        n nVar2 = nVar;
        p.j(nVar2, "current");
        p.j(str2, "text");
        p.j(c0Var2, "style");
        p.j(eVar2, "density");
        p.j(bVar2, "fontFamilyResolver");
        if (!p.e(nVar.k().g(), str2) || !p.e(nVar.j(), c0Var2)) {
            boolean z12 = z11;
        } else if (nVar.i() == z11) {
            if (l.d(nVar.g(), i11)) {
                if (nVar.d() == i12 && p.e(nVar.a(), eVar2) && nVar.b() == bVar2) {
                    return nVar2;
                }
                return new n(new b(str, (List) null, (List) null, 6, (kotlin.jvm.internal.i) null), c0Var, i12, z11, i11, eVar, bVar, (List) null, 128, (kotlin.jvm.internal.i) null);
            }
            int i13 = i12;
            return new n(new b(str, (List) null, (List) null, 6, (kotlin.jvm.internal.i) null), c0Var, i12, z11, i11, eVar, bVar, (List) null, 128, (kotlin.jvm.internal.i) null);
        }
        int i14 = i11;
        int i132 = i12;
        return new n(new b(str, (List) null, (List) null, 6, (kotlin.jvm.internal.i) null), c0Var, i12, z11, i11, eVar, bVar, (List) null, 128, (kotlin.jvm.internal.i) null);
    }
}

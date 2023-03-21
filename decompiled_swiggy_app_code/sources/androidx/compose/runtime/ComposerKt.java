package androidx.compose.runtime;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.d1;
import e0.e;
import e0.j0;
import e0.l;
import e0.n;
import e0.n0;
import e0.q0;
import e0.u0;
import e0.v0;
import e0.x;
import e0.x0;
import e0.y;
import f0.c;
import g0.a;
import g0.g;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
public final class ComposerKt {

    /* renamed from: a  reason: collision with root package name */
    private static n f5975a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final q<e<?>, x0, q0, k> f5976b = ComposerKt$removeCurrentGroupInstance$1.f5986a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final q<e<?>, x0, q0, k> f5977c = ComposerKt$skipToGroupEndInstance$1.f5988a;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final q<e<?>, x0, q0, k> f5978d = ComposerKt$endGroupInstance$1.f5985a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final q<e<?>, x0, q0, k> f5979e = ComposerKt$startRootGroup$1.f5989a;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final q<e<?>, x0, q0, k> f5980f = ComposerKt$resetSlotsInstance$1.f5987a;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f5981g = new j0("provider");

    /* renamed from: h  reason: collision with root package name */
    private static final Object f5982h = new j0("provider");

    /* renamed from: i  reason: collision with root package name */
    private static final Object f5983i = new j0("compositionLocalMap");
    private static final Object j = new j0("providerValues");
    private static final Object k = new j0("providers");

    /* renamed from: l  reason: collision with root package name */
    private static final Object f5984l = new j0("reference");

    private static final int A(u0 u0Var, int i11, int i12) {
        int i13 = 0;
        while (i11 > 0 && i11 != i12) {
            i11 = u0Var.M(i11);
            i13++;
        }
        return i13;
    }

    /* access modifiers changed from: private */
    public static final List<c> B(List<c> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (int C = C(list, i11); C < list.size(); C++) {
            c cVar = list.get(C);
            if (cVar.b() >= i12) {
                break;
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private static final int C(List<c> list, int i11) {
        int D = D(list, i11);
        return D < 0 ? -(D + 1) : D;
    }

    private static final int D(List<c> list, int i11) {
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int l11 = p.l(list.get(i13).b(), i11);
            if (l11 < 0) {
                i12 = i13 + 1;
            } else if (l11 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* access modifiers changed from: private */
    public static final c E(List<c> list, int i11, int i12) {
        int C = C(list, i11);
        if (C >= list.size()) {
            return null;
        }
        c cVar = list.get(C);
        if (cVar.b() < i12) {
            return cVar;
        }
        return null;
    }

    public static final Object F() {
        return f5983i;
    }

    public static final Object G() {
        return f5981g;
    }

    /* access modifiers changed from: private */
    public static final Object H(y yVar) {
        return yVar.d() != null ? new x(Integer.valueOf(yVar.a()), yVar.d()) : Integer.valueOf(yVar.a());
    }

    public static final Object I() {
        return f5982h;
    }

    public static final Object J() {
        return k;
    }

    public static final Object K() {
        return j;
    }

    public static final Object L() {
        return f5984l;
    }

    public static final <T> T M(g<l<Object>, ? extends d1<? extends Object>> gVar, l<T> lVar) {
        p.j(gVar, "<this>");
        p.j(lVar, HttpRequest.HEADER_KEY);
        d1 d1Var = (d1) gVar.get(lVar);
        if (d1Var != null) {
            return d1Var.getValue();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void N(List<c> list, int i11, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int D = D(list, i11);
        c cVar = null;
        if (D < 0) {
            int i12 = -(D + 1);
            if (obj != null) {
                cVar = new c();
                cVar.add(obj);
            }
            list.add(i12, new c(recomposeScopeImpl, i11, cVar));
        } else if (obj == null) {
            list.get(D).e((c<Object>) null);
        } else {
            c<Object> a11 = list.get(D).a();
            if (a11 != null) {
                a11.add(obj);
            }
        }
    }

    public static final boolean O() {
        n nVar = f5975a;
        return nVar != null && nVar.a();
    }

    /* access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> P() {
        return new HashMap<>();
    }

    /* access modifiers changed from: private */
    public static final int Q(u0 u0Var, int i11, int i12, int i13) {
        if (i11 == i12) {
            return i11;
        }
        if (i11 == i13 || i12 == i13) {
            return i13;
        }
        if (u0Var.M(i11) == i12) {
            return i12;
        }
        if (u0Var.M(i12) == i11) {
            return i11;
        }
        if (u0Var.M(i11) == u0Var.M(i12)) {
            return u0Var.M(i11);
        }
        int A = A(u0Var, i11, i13);
        int A2 = A(u0Var, i12, i13);
        int i14 = A - A2;
        for (int i15 = 0; i15 < i14; i15++) {
            i11 = u0Var.M(i11);
        }
        int i16 = A2 - A;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = u0Var.M(i12);
        }
        while (i11 != i12) {
            i11 = u0Var.M(i11);
            i12 = u0Var.M(i12);
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static final <K, V> V R(HashMap<K, LinkedHashSet<V>> hashMap, K k11) {
        V X;
        LinkedHashSet linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null || (X = s.X(linkedHashSet)) == null) {
            return null;
        }
        T(hashMap, k11, X);
        return X;
    }

    /* access modifiers changed from: private */
    public static final <K, V> boolean S(HashMap<K, LinkedHashSet<V>> hashMap, K k11, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k11, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    private static final <K, V> k T(HashMap<K, LinkedHashSet<V>> hashMap, K k11, V v) {
        LinkedHashSet linkedHashSet = hashMap.get(k11);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k11);
        }
        return k.f22762a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void U(e0.x0 r4, e0.q0 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r4, r0)
            java.lang.String r0 = "rememberManager"
            kotlin.jvm.internal.p.j(r5, r0)
            java.util.Iterator r0 = r4.d0()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof e0.r0
            if (r2 == 0) goto L_0x0022
            e0.r0 r1 = (e0.r0) r1
            r5.c(r1)
            goto L_0x000e
        L_0x0022:
            boolean r2 = r1 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r2 == 0) goto L_0x000e
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1
            e0.j r2 = r1.l()
            if (r2 == 0) goto L_0x000e
            r3 = 1
            r2.D(r3)
            r1.x()
            goto L_0x000e
        L_0x0036:
            r4.E0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerKt.U(e0.x0, e0.q0):void");
    }

    /* access modifiers changed from: private */
    public static final c V(List<c> list, int i11) {
        int D = D(list, i11);
        if (D >= 0) {
            return list.remove(D);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void W(List<c> list, int i11, int i12) {
        int C = C(list, i11);
        while (C < list.size() && list.get(C).b() < i12) {
            list.remove(C);
        }
    }

    public static final void X(boolean z11) {
        if (!z11) {
            x("Check failed".toString());
            throw new KotlinNothingValueException();
        }
    }

    public static final void Y() {
        n nVar = f5975a;
        if (nVar != null) {
            nVar.c();
            k kVar = k.f22762a;
        }
    }

    public static final void Z(int i11, int i12, int i13, String str) {
        p.j(str, "info");
        n nVar = f5975a;
        if (nVar != null) {
            nVar.b(i11, i12, i13, str);
            k kVar = k.f22762a;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean t(int i11) {
        return i11 != 0;
    }

    /* access modifiers changed from: private */
    public static final int u(boolean z11) {
        return z11 ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final List<Object> v(v0 v0Var, e0.c cVar) {
        ArrayList arrayList = new ArrayList();
        u0 o11 = v0Var.o();
        try {
            w(o11, arrayList, v0Var.a(cVar));
            k kVar = k.f22762a;
            return arrayList;
        } finally {
            o11.d();
        }
    }

    private static final void w(u0 u0Var, List<Object> list, int i11) {
        if (u0Var.G(i11)) {
            list.add(u0Var.I(i11));
            return;
        }
        int i12 = i11 + 1;
        int B = i11 + u0Var.B(i11);
        while (i12 < B) {
            w(u0Var, list, i12);
            i12 += u0Var.B(i12);
        }
    }

    public static final Void x(String str) {
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* access modifiers changed from: private */
    public static final g<l<Object>, d1<Object>> y(n0<?>[] n0VarArr, g<l<Object>, ? extends d1<? extends Object>> gVar, e0.g gVar2, int i11) {
        gVar2.E(721128344);
        g.a j11 = a.a().j();
        for (n0<?> n0Var : n0VarArr) {
            if (n0Var.a() || !z(gVar, n0Var.b())) {
                j11.put(n0Var.b(), n0Var.b().b(n0Var.c(), gVar2, 72));
            }
        }
        g<l<Object>, d1<Object>> build = j11.build();
        gVar2.P();
        return build;
    }

    public static final <T> boolean z(g<l<Object>, ? extends d1<? extends Object>> gVar, l<T> lVar) {
        p.j(gVar, "<this>");
        p.j(lVar, HttpRequest.HEADER_KEY);
        return gVar.containsKey(lVar);
    }
}

package androidx.compose.foundation.lazy;

import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.u;
import fp0.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.l;
import rp0.f;
import w.h;
import w.k;
import x.b;

/* compiled from: LazyListItemProviderImpl.kt */
public final class LazyListItemProviderImplKt {

    /* renamed from: a  reason: collision with root package name */
    private static final int f3971a = 30;

    /* renamed from: b  reason: collision with root package name */
    private static final int f3972b = 100;

    /* access modifiers changed from: private */
    public static final f b(int i11) {
        int i12 = f3971a;
        int i13 = (i11 / i12) * i12;
        int i14 = f3972b;
        return l.u(Math.max(i13 - i14, 0), i13 + i12 + i14);
    }

    public static final Map<Object, Integer> c(f fVar, b<h> bVar) {
        p.j(fVar, "range");
        p.j(bVar, "list");
        int f11 = fVar.f();
        if (f11 >= 0) {
            int min = Math.min(fVar.g(), bVar.a() - 1);
            if (min < f11) {
                return x.f();
            }
            HashMap hashMap = new HashMap();
            bVar.b(f11, min, new LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(f11, min, hashMap));
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final k d(LazyListState lazyListState, l<? super c, bp0.k> lVar, g gVar, int i11) {
        androidx.compose.runtime.snapshots.b k;
        p.j(lazyListState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(lVar, "content");
        gVar.E(-619676707);
        d1<T> m11 = androidx.compose.runtime.g.m(lVar, gVar, (i11 >> 3) & 14);
        gVar.E(1157296644);
        boolean k11 = gVar.k(lazyListState);
        Object F = gVar.F();
        if (k11 || F == g.f14172a.a()) {
            androidx.compose.runtime.snapshots.b a11 = androidx.compose.runtime.snapshots.b.f6287e.a();
            try {
                k = a11.k();
                f b11 = b(lazyListState.i());
                a11.r(k);
                a11.d();
                F = j.e(b11, (a1) null, 2, (Object) null);
                gVar.y(F);
            } catch (Throwable th2) {
                a11.d();
                throw th2;
            }
        }
        gVar.P();
        h0 h0Var = (h0) F;
        u.e(h0Var, new LazyListItemProviderImplKt$rememberItemProvider$1(lazyListState, h0Var, (c<? super LazyListItemProviderImplKt$rememberItemProvider$1>) null), gVar, 0);
        gVar.E(1157296644);
        boolean k12 = gVar.k(h0Var);
        Object F2 = gVar.F();
        if (k12 || F2 == g.f14172a.a()) {
            F2 = new LazyListItemProviderImpl(androidx.compose.runtime.g.c(new LazyListItemProviderImplKt$rememberItemProvider$2$1(m11, h0Var)));
            gVar.y(F2);
        }
        gVar.P();
        LazyListItemProviderImpl lazyListItemProviderImpl = (LazyListItemProviderImpl) F2;
        gVar.P();
        return lazyListItemProviderImpl;
    }
}

package e0;

import androidx.compose.runtime.a;
import f0.b;
import f0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Composition.kt */
public final class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14208a = new Object();

    public static final h a(e<?> eVar, a aVar) {
        p.j(eVar, "applier");
        p.j(aVar, "parent");
        return new j(aVar, eVar, (CoroutineContext) null, 4, (i) null);
    }

    /* access modifiers changed from: private */
    public static final <K, V> void d(b<K, c<V>> bVar, K k, V v) {
        if (bVar.a(k)) {
            c d11 = bVar.d(k);
            if (d11 != null) {
                d11.add(v);
                return;
            }
            return;
        }
        c cVar = new c();
        cVar.add(v);
        bp0.k kVar = bp0.k.f22762a;
        bVar.j(k, cVar);
    }
}

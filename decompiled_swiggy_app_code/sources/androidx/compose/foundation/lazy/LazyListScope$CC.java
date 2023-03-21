package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import lp0.r;

/* renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC  reason: invalid class name */
/* compiled from: LazyDsl.kt */
public final /* synthetic */ class LazyListScope$CC {
    public static /* synthetic */ void a(c cVar, Object obj, q qVar) {
        p.j(qVar, "content");
        cVar.a(obj, (Object) null, qVar);
    }

    public static /* synthetic */ void b(c cVar, int i11, l lVar, r rVar) {
        p.j(rVar, "itemContent");
        cVar.b(i11, lVar, LazyListScope$items$2.f4031a, rVar);
    }

    public static /* synthetic */ void c(c cVar, Object obj, q qVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 1) != 0) {
                obj = null;
            }
            cVar.d(obj, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    public static /* synthetic */ void d(c cVar, int i11, l lVar, r rVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                lVar = null;
            }
            cVar.c(i11, lVar, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }
}

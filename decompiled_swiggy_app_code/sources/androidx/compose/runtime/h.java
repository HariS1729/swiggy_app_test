package androidx.compose.runtime;

import bp0.k;
import e0.b1;
import e0.d1;
import e0.p;
import g0.f;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.Pair;
import lp0.a;
import lp0.l;

/* compiled from: DerivedState.kt */
final /* synthetic */ class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final b1<f<Pair<l<p<?>, k>, l<p<?>, k>>>> f6140a = new b1<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final b1<Boolean> f6141b = new b1<>();

    public static final <T> d1<T> c(a<? extends T> aVar) {
        kotlin.jvm.internal.p.j(aVar, "calculation");
        return new DerivedSnapshotState(aVar);
    }

    public static final <R> void d(l<? super d1<?>, k> lVar, l<? super d1<?>, k> lVar2, a<? extends R> aVar) {
        kotlin.jvm.internal.p.j(lVar, "start");
        kotlin.jvm.internal.p.j(lVar2, "done");
        kotlin.jvm.internal.p.j(aVar, RenderingDetails.TYPE_BLOCK);
        b1<f<Pair<l<p<?>, k>, l<p<?>, k>>>> b1Var = f6140a;
        f a11 = b1Var.a();
        try {
            f a12 = b1Var.a();
            if (a12 == null) {
                a12 = g0.a.b();
            }
            b1Var.b(a12.add(bp0.h.a(lVar, lVar2)));
            aVar.invoke();
            b1Var.b(a11);
        } catch (Throwable th2) {
            f6140a.b(a11);
            throw th2;
        }
    }
}

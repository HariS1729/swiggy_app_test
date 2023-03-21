package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import bp0.k;
import e0.a1;
import e0.d1;
import e0.h0;
import e0.l0;
import fp0.c;
import java.util.Collection;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.r;
import lp0.a;
import lp0.l;
import lp0.p;
import n0.n;

public final class g {
    public static final <T extends R, R> d1<R> a(d<? extends T> dVar, R r11, CoroutineContext coroutineContext, e0.g gVar, int i11, int i12) {
        return SnapshotStateKt__SnapshotFlowKt.b(dVar, r11, coroutineContext, gVar, i11, i12);
    }

    public static final <T> d1<T> b(r<? extends T> rVar, CoroutineContext coroutineContext, e0.g gVar, int i11, int i12) {
        return SnapshotStateKt__SnapshotFlowKt.c(rVar, coroutineContext, gVar, i11, i12);
    }

    public static final <T> d1<T> c(a<? extends T> aVar) {
        return h.c(aVar);
    }

    public static final <T> SnapshotStateList<T> d() {
        return j.a();
    }

    public static final <T> SnapshotStateList<T> e(T... tArr) {
        return j.b(tArr);
    }

    public static final <K, V> n<K, V> f() {
        return j.c();
    }

    public static final <T> h0<T> g(T t, a1<T> a1Var) {
        return j.d(t, a1Var);
    }

    public static final <T> a1<T> i() {
        return i.a();
    }

    public static final <R> void j(l<? super d1<?>, k> lVar, l<? super d1<?>, k> lVar2, a<? extends R> aVar) {
        h.d(lVar, lVar2, aVar);
    }

    public static final <T> d1<T> k(T t, Object obj, Object obj2, p<? super l0<T>, ? super c<? super k>, ? extends Object> pVar, e0.g gVar, int i11) {
        return SnapshotStateKt__ProduceStateKt.a(t, obj, obj2, pVar, gVar, i11);
    }

    public static final <T> a1<T> l() {
        return i.b();
    }

    public static final <T> d1<T> m(T t, e0.g gVar, int i11) {
        return j.f(t, gVar, i11);
    }

    public static final <T> d<T> n(a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.e(aVar);
    }

    public static final <T> a1<T> o() {
        return i.c();
    }

    public static final <T> SnapshotStateList<T> p(Collection<? extends T> collection) {
        return j.g(collection);
    }
}

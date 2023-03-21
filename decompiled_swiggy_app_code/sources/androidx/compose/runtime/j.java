package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Collection;
import kotlin.jvm.internal.p;
import n0.n;

/* compiled from: SnapshotState.kt */
final /* synthetic */ class j {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> b(T... tArr) {
        p.j(tArr, "elements");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt___ArraysKt.h0(tArr));
        return snapshotStateList;
    }

    public static final <K, V> n<K, V> c() {
        return new n<>();
    }

    public static final <T> h0<T> d(T t, a1<T> a1Var) {
        p.j(a1Var, HttpRequest.HEADER_POLICY);
        return ActualAndroid_androidKt.a(t, a1Var);
    }

    public static /* synthetic */ h0 e(Object obj, a1 a1Var, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            a1Var = g.o();
        }
        return g.g(obj, a1Var);
    }

    public static final <T> d1<T> f(T t, g gVar, int i11) {
        gVar.E(-1058319986);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = e(t, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        h0Var.setValue(t);
        gVar.P();
        return h0Var;
    }

    public static final <T> SnapshotStateList<T> g(Collection<? extends T> collection) {
        p.j(collection, "<this>");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }
}

package androidx.compose.runtime;

import bp0.f;
import e0.a1;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import n0.l;

/* compiled from: ActualAndroid.android.kt */
public final class ActualAndroid_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f f5865a = b.b(ActualAndroid_androidKt$DefaultMonotonicFrameClock$2.f5866a);

    public static final <T> l<T> a(T t, a1<T> a1Var) {
        p.j(a1Var, HttpRequest.HEADER_POLICY);
        return new ParcelableSnapshotMutableState(t, a1Var);
    }
}

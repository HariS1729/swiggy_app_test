package androidx.compose.material;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {379, 382}, m = "showSnackbar")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f5344a;

    /* renamed from: b  reason: collision with root package name */
    Object f5345b;

    /* renamed from: c  reason: collision with root package name */
    Object f5346c;

    /* renamed from: d  reason: collision with root package name */
    Object f5347d;

    /* renamed from: e  reason: collision with root package name */
    Object f5348e;

    /* renamed from: f  reason: collision with root package name */
    Object f5349f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f5350g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ SnackbarHostState f5351h;

    /* renamed from: i  reason: collision with root package name */
    int f5352i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, c<? super SnackbarHostState$showSnackbar$1> cVar) {
        super(cVar);
        this.f5351h = snackbarHostState;
    }

    public final Object invokeSuspend(Object obj) {
        this.f5350g = obj;
        this.f5352i |= Integer.MIN_VALUE;
        return this.f5351h.d((String) null, (String) null, (SnackbarDuration) null, this);
    }
}

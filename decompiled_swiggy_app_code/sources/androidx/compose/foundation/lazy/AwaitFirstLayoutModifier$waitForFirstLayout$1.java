package androidx.compose.foundation.lazy;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {417}, m = "waitForFirstLayout")
/* compiled from: LazyListState.kt */
final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3911a;

    /* renamed from: b  reason: collision with root package name */
    Object f3912b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f3913c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AwaitFirstLayoutModifier f3914d;

    /* renamed from: e  reason: collision with root package name */
    int f3915e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, c<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> cVar) {
        super(cVar);
        this.f3914d = awaitFirstLayoutModifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3913c = obj;
        this.f3915e |= Integer.MIN_VALUE;
        return this.f3914d.a(this);
    }
}

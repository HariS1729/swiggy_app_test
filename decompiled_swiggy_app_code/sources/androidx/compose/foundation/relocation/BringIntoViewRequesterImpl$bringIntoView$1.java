package androidx.compose.foundation.relocation;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import t0.h;

@d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {121}, m = "bringIntoView")
/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f4141a;

    /* renamed from: b  reason: collision with root package name */
    Object f4142b;

    /* renamed from: c  reason: collision with root package name */
    int f4143c;

    /* renamed from: d  reason: collision with root package name */
    int f4144d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f4145e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ BringIntoViewRequesterImpl f4146f;

    /* renamed from: g  reason: collision with root package name */
    int f4147g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, c<? super BringIntoViewRequesterImpl$bringIntoView$1> cVar) {
        super(cVar);
        this.f4146f = bringIntoViewRequesterImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.f4145e = obj;
        this.f4147g |= Integer.MIN_VALUE;
        return this.f4146f.a((h) null, this);
    }
}

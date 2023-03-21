package androidx.compose.ui.input.nestedscroll;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
/* compiled from: NestedScrollModifierLocal.kt */
final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f6621a;

    /* renamed from: b  reason: collision with root package name */
    long f6622b;

    /* renamed from: c  reason: collision with root package name */
    long f6623c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f6624d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NestedScrollModifierLocal f6625e;

    /* renamed from: f  reason: collision with root package name */
    int f6626f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, c<? super NestedScrollModifierLocal$onPostFling$1> cVar) {
        super(cVar);
        this.f6625e = nestedScrollModifierLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6624d = obj;
        this.f6626f |= Integer.MIN_VALUE;
        return this.f6625e.d(0, 0, this);
    }
}

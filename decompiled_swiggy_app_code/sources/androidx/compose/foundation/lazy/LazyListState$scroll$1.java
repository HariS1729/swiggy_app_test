package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {257, 258}, m = "scroll")
/* compiled from: LazyListState.kt */
final class LazyListState$scroll$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f4057a;

    /* renamed from: b  reason: collision with root package name */
    Object f4058b;

    /* renamed from: c  reason: collision with root package name */
    Object f4059c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f4060d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LazyListState f4061e;

    /* renamed from: f  reason: collision with root package name */
    int f4062f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListState$scroll$1(LazyListState lazyListState, c<? super LazyListState$scroll$1> cVar) {
        super(cVar);
        this.f4061e = lazyListState;
    }

    public final Object invokeSuspend(Object obj) {
        this.f4060d = obj;
        this.f4062f |= Integer.MIN_VALUE;
        return this.f4061e.c((MutatePriority) null, (p<? super y1.p, ? super c<? super k>, ? extends Object>) null, this);
    }
}

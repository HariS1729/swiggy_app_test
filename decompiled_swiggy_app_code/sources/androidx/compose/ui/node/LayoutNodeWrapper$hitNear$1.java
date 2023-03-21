package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeWrapper;
import bp0.k;
import k1.c;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LayoutNodeWrapper.kt */
final class LayoutNodeWrapper$hitNear$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNodeWrapper f6891a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ T f6892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LayoutNodeWrapper.d<T, C, M> f6893c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f6894d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c<C> f6895e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f6896f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f6897g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ float f6898h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeWrapper$hitNear$1(LayoutNodeWrapper layoutNodeWrapper, T t, LayoutNodeWrapper.d<T, C, M> dVar, long j, c<C> cVar, boolean z11, boolean z12, float f11) {
        super(0);
        this.f6891a = layoutNodeWrapper;
        this.f6892b = t;
        this.f6893c = dVar;
        this.f6894d = j;
        this.f6895e = cVar;
        this.f6896f = z11;
        this.f6897g = z12;
        this.f6898h = f11;
    }

    public final void invoke() {
        this.f6891a.v1(this.f6892b.d(), this.f6893c, this.f6894d, this.f6895e, this.f6896f, this.f6897g, this.f6898h);
    }
}

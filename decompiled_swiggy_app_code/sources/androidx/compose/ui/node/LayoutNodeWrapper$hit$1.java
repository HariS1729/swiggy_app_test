package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNodeWrapper;
import bp0.k;
import k1.c;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LayoutNodeWrapper.kt */
final class LayoutNodeWrapper$hit$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNodeWrapper f6884a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ T f6885b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LayoutNodeWrapper.d<T, C, M> f6886c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f6887d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c<C> f6888e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f6889f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f6890g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeWrapper$hit$1(LayoutNodeWrapper layoutNodeWrapper, T t, LayoutNodeWrapper.d<T, C, M> dVar, long j, c<C> cVar, boolean z11, boolean z12) {
        super(0);
        this.f6884a = layoutNodeWrapper;
        this.f6885b = t;
        this.f6886c = dVar;
        this.f6887d = j;
        this.f6888e = cVar;
        this.f6889f = z11;
        this.f6890g = z12;
    }

    public final void invoke() {
        this.f6884a.u1(this.f6885b.d(), this.f6886c, this.f6887d, this.f6888e, this.f6889f, this.f6890g);
    }
}

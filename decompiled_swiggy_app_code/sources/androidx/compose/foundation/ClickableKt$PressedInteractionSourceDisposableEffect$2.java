package androidx.compose.foundation;

import bp0.k;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import u.n;

/* compiled from: Clickable.kt */
final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u.k f2899a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0<n> f2900b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2901c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$PressedInteractionSourceDisposableEffect$2(u.k kVar, h0<n> h0Var, int i11) {
        super(2);
        this.f2899a = kVar;
        this.f2900b = h0Var;
        this.f2901c = i11;
    }

    public final void a(g gVar, int i11) {
        ClickableKt.a(this.f2899a, this.f2900b, gVar, this.f2901c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

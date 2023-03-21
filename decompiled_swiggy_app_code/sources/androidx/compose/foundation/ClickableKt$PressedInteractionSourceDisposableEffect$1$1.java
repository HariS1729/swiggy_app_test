package androidx.compose.foundation;

import e0.h0;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u.k;
import u.m;
import u.n;

/* compiled from: Clickable.kt */
final class ClickableKt$PressedInteractionSourceDisposableEffect$1$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<n> f2895a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f2896b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f2897a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f2898b;

        public a(h0 h0Var, k kVar) {
            this.f2897a = h0Var;
            this.f2898b = kVar;
        }

        public void dispose() {
            n nVar = (n) this.f2897a.getValue();
            if (nVar != null) {
                this.f2898b.a(new m(nVar));
                this.f2897a.setValue(null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$PressedInteractionSourceDisposableEffect$1$1(h0<n> h0Var, k kVar) {
        super(1);
        this.f2895a = h0Var;
        this.f2896b = kVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f2895a, this.f2896b);
    }
}

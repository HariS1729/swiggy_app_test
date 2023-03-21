package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.d;
import t0.f;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f4676b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4677c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f4678d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f4679e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ResolvedTextDirection f4680f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f4681g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$SelectionHandle$1(p<? super g, ? super Integer, k> pVar, d dVar, boolean z11, long j, int i11, ResolvedTextDirection resolvedTextDirection, boolean z12) {
        super(2);
        this.f4675a = pVar;
        this.f4676b = dVar;
        this.f4677c = z11;
        this.f4678d = j;
        this.f4679e = i11;
        this.f4680f = resolvedTextDirection;
        this.f4681g = z12;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) == 2 && gVar.b()) {
            gVar.h();
        } else if (this.f4675a == null) {
            gVar.E(386443790);
            d dVar = this.f4676b;
            Boolean valueOf = Boolean.valueOf(this.f4677c);
            f d11 = f.d(this.f4678d);
            boolean z11 = this.f4677c;
            long j = this.f4678d;
            gVar.E(511388516);
            boolean k = gVar.k(valueOf) | gVar.k(d11);
            Object F = gVar.F();
            if (k || F == g.f14172a.a()) {
                F = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z11, j);
                gVar.y(F);
            }
            gVar.P();
            d c11 = SemanticsModifierKt.c(dVar, false, (l) F, 1, (Object) null);
            boolean z12 = this.f4677c;
            ResolvedTextDirection resolvedTextDirection = this.f4680f;
            boolean z13 = this.f4681g;
            int i12 = this.f4679e;
            AndroidSelectionHandles_androidKt.a(c11, z12, resolvedTextDirection, z13, gVar, (i12 & 112) | (i12 & 896) | (i12 & 7168));
            gVar.P();
        } else {
            gVar.E(386444465);
            this.f4675a.invoke(gVar, Integer.valueOf((this.f4679e >> 15) & 14));
            gVar.P();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

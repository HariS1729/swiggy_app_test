package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.j1;

/* renamed from: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f2849a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j1 f2850b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(long j, j1 j1Var) {
        super(1);
        this.f2849a = j;
        this.f2850b = j1Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b(AppStateModule.APP_STATE_BACKGROUND);
        n0Var.c(d0.h(this.f2849a));
        n0Var.a().b("color", d0.h(this.f2849a));
        n0Var.a().b("shape", this.f2850b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

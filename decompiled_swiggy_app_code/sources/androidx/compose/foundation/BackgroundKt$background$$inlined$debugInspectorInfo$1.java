package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j1;
import u0.u;

/* compiled from: InspectableValue.kt */
public final class BackgroundKt$background$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f2846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f2847b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j1 f2848c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundKt$background$$inlined$debugInspectorInfo$1(float f11, u uVar, j1 j1Var) {
        super(1);
        this.f2846a = f11;
        this.f2847b = uVar;
        this.f2848c = j1Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b(AppStateModule.APP_STATE_BACKGROUND);
        n0Var.a().b("alpha", Float.valueOf(this.f2846a));
        n0Var.a().b("brush", this.f2847b);
        n0Var.a().b("shape", this.f2848c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

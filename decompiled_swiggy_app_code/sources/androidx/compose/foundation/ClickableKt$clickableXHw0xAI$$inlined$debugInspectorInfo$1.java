package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.g;

/* renamed from: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2891a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f2892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f2893c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2894d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(boolean z11, String str, g gVar, a aVar) {
        super(1);
        this.f2891a = z11;
        this.f2892b = str;
        this.f2893c = gVar;
        this.f2894d = aVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("clickable");
        n0Var.a().b("enabled", Boolean.valueOf(this.f2891a));
        n0Var.a().b("onClickLabel", this.f2892b);
        n0Var.a().b("role", this.f2893c);
        n0Var.a().b("onClick", this.f2894d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.g;
import s.h;

/* renamed from: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2885a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f2886b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f2887c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2888d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h f2889e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u.k f2890f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(boolean z11, String str, g gVar, a aVar, h hVar, u.k kVar) {
        super(1);
        this.f2885a = z11;
        this.f2886b = str;
        this.f2887c = gVar;
        this.f2888d = aVar;
        this.f2889e = hVar;
        this.f2890f = kVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("clickable");
        n0Var.a().b("enabled", Boolean.valueOf(this.f2885a));
        n0Var.a().b("onClickLabel", this.f2886b);
        n0Var.a().b("role", this.f2887c);
        n0Var.a().b("onClick", this.f2888d);
        n0Var.a().b("indication", this.f2889e);
        n0Var.a().b("interactionSource", this.f2890f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

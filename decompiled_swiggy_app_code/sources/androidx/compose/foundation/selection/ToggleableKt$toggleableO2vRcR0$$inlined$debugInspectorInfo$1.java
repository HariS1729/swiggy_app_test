package androidx.compose.foundation.selection;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.g;
import s.h;

/* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class ToggleableKt$toggleableO2vRcR0$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4178a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u.k f4179b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f4180c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f4181d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g f4182e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l f4183f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableO2vRcR0$$inlined$debugInspectorInfo$1(boolean z11, u.k kVar, h hVar, boolean z12, g gVar, l lVar) {
        super(1);
        this.f4178a = z11;
        this.f4179b = kVar;
        this.f4180c = hVar;
        this.f4181d = z12;
        this.f4182e = gVar;
        this.f4183f = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("toggleable");
        n0Var.a().b("value", Boolean.valueOf(this.f4178a));
        n0Var.a().b("interactionSource", this.f4179b);
        n0Var.a().b("indication", this.f4180c);
        n0Var.a().b("enabled", Boolean.valueOf(this.f4181d));
        n0Var.a().b("role", this.f4182e);
        n0Var.a().b("onValueChange", this.f4183f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

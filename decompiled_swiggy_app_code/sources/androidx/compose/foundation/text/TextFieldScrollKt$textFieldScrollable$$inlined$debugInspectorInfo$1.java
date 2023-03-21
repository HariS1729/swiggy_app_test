package androidx.compose.foundation.text;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldScrollerPosition f4606a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u.k f4607b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4608c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(TextFieldScrollerPosition textFieldScrollerPosition, u.k kVar, boolean z11) {
        super(1);
        this.f4606a = textFieldScrollerPosition;
        this.f4607b = kVar;
        this.f4608c = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("textFieldScrollable");
        n0Var.a().b("scrollerPosition", this.f4606a);
        n0Var.a().b("interactionSource", this.f4607b);
        n0Var.a().b("enabled", Boolean.valueOf(this.f4608c));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

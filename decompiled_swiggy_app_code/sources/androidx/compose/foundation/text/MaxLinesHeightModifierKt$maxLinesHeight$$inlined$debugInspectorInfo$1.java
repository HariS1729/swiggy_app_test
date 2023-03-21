package androidx.compose.foundation.text;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.c0;

/* compiled from: InspectableValue.kt */
public final class MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f4492a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c0 f4493b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaxLinesHeightModifierKt$maxLinesHeight$$inlined$debugInspectorInfo$1(int i11, c0 c0Var) {
        super(1);
        this.f4492a = i11;
        this.f4493b = c0Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("maxLinesHeight");
        n0Var.a().b("maxLines", Integer.valueOf(this.f4492a));
        n0Var.a().b("textStyle", this.f4493b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}

package androidx.compose.foundation.text;

import a0.s;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import bp0.k;
import i1.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1 extends Lambda implements l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4403b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4404c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$onPositionedModifier$1(TextFieldState textFieldState, boolean z11, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f4402a = textFieldState;
        this.f4403b = z11;
        this.f4404c = textFieldSelectionManager;
    }

    public final void a(m mVar) {
        p.j(mVar, "it");
        this.f4402a.u(mVar);
        if (this.f4403b) {
            if (this.f4402a.c() == HandleState.Selection) {
                if (this.f4402a.n()) {
                    this.f4404c.a0();
                } else {
                    this.f4404c.J();
                }
                this.f4402a.z(TextFieldSelectionManagerKt.c(this.f4404c, true));
                this.f4402a.y(TextFieldSelectionManagerKt.c(this.f4404c, false));
            } else if (this.f4402a.c() == HandleState.Cursor) {
                this.f4402a.w(TextFieldSelectionManagerKt.c(this.f4404c, true));
            }
        }
        s g11 = this.f4402a.g();
        if (g11 != null) {
            g11.m(mVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m) obj);
        return k.f22762a;
    }
}

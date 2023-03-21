package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import s0.o;
import t0.f;
import v1.s;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f4406b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4407c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4408d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ s f4409e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, o oVar, boolean z11, TextFieldSelectionManager textFieldSelectionManager, s sVar) {
        super(1);
        this.f4405a = textFieldState;
        this.f4406b = oVar;
        this.f4407c = z11;
        this.f4408d = textFieldSelectionManager;
        this.f4409e = sVar;
    }

    public final void a(long j) {
        boolean z11 = true;
        CoreTextFieldKt.n(this.f4405a, this.f4406b, !this.f4407c);
        if (!this.f4405a.d()) {
            return;
        }
        if (this.f4405a.c() != HandleState.Selection) {
            a0.s g11 = this.f4405a.g();
            if (g11 != null) {
                TextFieldState textFieldState = this.f4405a;
                long j11 = j;
                TextFieldDelegate.f4538a.i(j11, g11, textFieldState.j(), this.f4409e, textFieldState.i());
                if (textFieldState.q().k().length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    textFieldState.r(HandleState.Cursor);
                    return;
                }
                return;
            }
            return;
        }
        this.f4408d.p(f.d(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((f) obj).u());
        return k.f22762a;
    }
}

package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.a0;
import v1.m;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$4 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f4332a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4333b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f4334c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m f4335d;

    /* compiled from: Effects.kt */
    public static final class a implements r {
        public void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$4(a0 a0Var, TextFieldState textFieldState, TextFieldValue textFieldValue, m mVar) {
        super(1);
        this.f4332a = a0Var;
        this.f4333b = textFieldState;
        this.f4334c = textFieldValue;
        this.f4335d = mVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        if (this.f4332a != null && this.f4333b.d()) {
            TextFieldState textFieldState = this.f4333b;
            textFieldState.t(TextFieldDelegate.f4538a.h(this.f4332a, this.f4334c, textFieldState.j(), this.f4335d, this.f4333b.i(), this.f4333b.h()));
        }
        return new a();
    }
}

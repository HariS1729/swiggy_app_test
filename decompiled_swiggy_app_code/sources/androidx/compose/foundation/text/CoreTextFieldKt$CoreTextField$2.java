package androidx.compose.foundation.text;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$2 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldState f4328a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f4329a;

        public a(TextFieldState textFieldState) {
            this.f4329a = textFieldState;
        }

        public void dispose() {
            if (this.f4329a.d()) {
                CoreTextFieldKt.l(this.f4329a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$2(TextFieldState textFieldState) {
        super(1);
        this.f4328a = textFieldState;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f4328a);
    }
}

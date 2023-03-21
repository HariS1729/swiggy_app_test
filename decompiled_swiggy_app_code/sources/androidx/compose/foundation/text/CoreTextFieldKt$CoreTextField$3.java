package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$3 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4330a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldSelectionManager f4331a;

        public a(TextFieldSelectionManager textFieldSelectionManager) {
            this.f4331a = textFieldSelectionManager;
        }

        public void dispose() {
            this.f4331a.J();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$3(TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.f4330a = textFieldSelectionManager;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f4330a);
    }
}

package v1;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.p;

/* compiled from: TextInputService.kt */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f17065a;

    /* renamed from: b  reason: collision with root package name */
    private final u f17066b;

    public c0(a0 a0Var, u uVar) {
        p.j(a0Var, "textInputService");
        p.j(uVar, "platformTextInputService");
        this.f17065a = a0Var;
        this.f17066b = uVar;
    }

    public final void a() {
        this.f17065a.e(this);
    }

    public final boolean b() {
        return p.e(this.f17065a.a(), this);
    }

    public final boolean c() {
        boolean b11 = b();
        if (b11) {
            this.f17066b.e();
        }
        return b11;
    }

    public final boolean d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        p.j(textFieldValue2, "newValue");
        boolean b11 = b();
        if (b11) {
            this.f17066b.c(textFieldValue, textFieldValue2);
        }
        return b11;
    }
}

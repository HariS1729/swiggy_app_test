package v1;

import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.a0;
import p1.b;
import p1.c;

/* compiled from: EditProcessor.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private TextFieldValue f17089a = new TextFieldValue(c.f(), a0.f16041b.a(), (a0) null, (i) null);

    /* renamed from: b  reason: collision with root package name */
    private g f17090b = new g(this.f17089a.e(), this.f17089a.g(), (i) null);

    public final TextFieldValue a(List<? extends d> list) {
        p.j(list, "editCommands");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((d) list.get(i11)).a(this.f17090b);
        }
        TextFieldValue textFieldValue = new TextFieldValue(this.f17090b.q(), this.f17090b.i(), this.f17090b.d(), (i) null);
        this.f17089a = textFieldValue;
        return textFieldValue;
    }

    public final void b(TextFieldValue textFieldValue, c0 c0Var) {
        p.j(textFieldValue, "value");
        boolean z11 = true;
        boolean z12 = !p.e(textFieldValue.f(), this.f17090b.d());
        boolean z13 = false;
        if (!p.e(this.f17089a.e(), textFieldValue.e())) {
            this.f17090b = new g(textFieldValue.e(), textFieldValue.g(), (i) null);
        } else if (!a0.g(this.f17089a.g(), textFieldValue.g())) {
            this.f17090b.p(a0.l(textFieldValue.g()), a0.k(textFieldValue.g()));
            z11 = false;
            z13 = true;
        } else {
            z11 = false;
        }
        if (textFieldValue.f() == null) {
            this.f17090b.a();
        } else if (!a0.h(textFieldValue.f().r())) {
            this.f17090b.n(a0.l(textFieldValue.f().r()), a0.k(textFieldValue.f().r()));
        }
        if (z11 || (!z13 && z12)) {
            this.f17090b.a();
            textFieldValue = TextFieldValue.d(textFieldValue, (b) null, 0, (a0) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.f17089a;
        this.f17089a = textFieldValue;
        if (c0Var != null) {
            c0Var.d(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue c() {
        return this.f17089a;
    }
}

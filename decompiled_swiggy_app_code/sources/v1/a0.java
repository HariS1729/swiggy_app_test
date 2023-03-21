package v1;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TextInputService.kt */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final u f17052a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<c0> f17053b = new AtomicReference<>((Object) null);

    public a0(u uVar) {
        p.j(uVar, "platformTextInputService");
        this.f17052a = uVar;
    }

    public final c0 a() {
        return this.f17053b.get();
    }

    public final void b() {
        this.f17052a.d();
    }

    public final void c() {
        if (this.f17053b.get() != null) {
            this.f17052a.e();
        }
    }

    public c0 d(TextFieldValue textFieldValue, m mVar, l<? super List<? extends d>, k> lVar, l<? super l, k> lVar2) {
        p.j(textFieldValue, "value");
        p.j(mVar, "imeOptions");
        p.j(lVar, "onEditCommand");
        p.j(lVar2, "onImeActionPerformed");
        this.f17052a.a(textFieldValue, mVar, lVar, lVar2);
        c0 c0Var = new c0(this, this.f17052a);
        this.f17053b.set(c0Var);
        return c0Var;
    }

    public void e(c0 c0Var) {
        p.j(c0Var, "session");
        if (this.f17053b.compareAndSet(c0Var, (Object) null)) {
            this.f17052a.b();
        }
    }
}

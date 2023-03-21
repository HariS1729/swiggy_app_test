package androidx.compose.foundation.text;

import b0.h;
import b0.i;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.q;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$TextFieldCursorHandle$2$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f4444a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$2$1(long j) {
        super(1);
        this.f4444a = j;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        qVar.a(i.d(), new h(Handle.Cursor, this.f4444a, (kotlin.jvm.internal.i) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}

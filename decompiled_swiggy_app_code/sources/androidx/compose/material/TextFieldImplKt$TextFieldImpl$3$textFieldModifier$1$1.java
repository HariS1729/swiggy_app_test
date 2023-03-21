package androidx.compose.material;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.o;
import n1.q;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f5593a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5594b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1(boolean z11, String str) {
        super(1);
        this.f5593a = z11;
        this.f5594b = str;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        if (this.f5593a) {
            o.i(qVar, this.f5594b);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}

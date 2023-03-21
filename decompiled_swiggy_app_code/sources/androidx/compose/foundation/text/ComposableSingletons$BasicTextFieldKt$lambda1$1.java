package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* renamed from: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1  reason: invalid class name */
/* compiled from: BasicTextField.kt */
final class ComposableSingletons$BasicTextFieldKt$lambda1$1 extends Lambda implements q<p<? super g, ? super Integer, ? extends k>, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$BasicTextFieldKt$lambda1$1 f4316a = new ComposableSingletons$BasicTextFieldKt$lambda1$1();

    ComposableSingletons$BasicTextFieldKt$lambda1$1() {
        super(3);
    }

    public final void a(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(pVar, "innerTextField");
        if ((i11 & 14) == 0) {
            i11 |= gVar.k(pVar) ? 4 : 2;
        }
        if ((i11 & 91) != 18 || !gVar.b()) {
            pVar.invoke(gVar, Integer.valueOf(i11 & 14));
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((p) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}

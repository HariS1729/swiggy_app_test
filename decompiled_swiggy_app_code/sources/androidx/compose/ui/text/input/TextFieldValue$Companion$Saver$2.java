package androidx.compose.ui.text.input;

import androidx.compose.ui.text.SaversKt;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;
import p1.a0;
import p1.b;

/* compiled from: TextFieldValue.kt */
final class TextFieldValue$Companion$Saver$2 extends Lambda implements l<Object, TextFieldValue> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$2 f7618a = new TextFieldValue$Companion$Saver$2();

    TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: a */
    public final TextFieldValue invoke(Object obj) {
        b bVar;
        p.j(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        c<b, Object> d11 = SaversKt.d();
        Boolean bool = Boolean.FALSE;
        a0 a0Var = null;
        if (!p.e(obj2, bool) && obj2 != null) {
            bVar = d11.a(obj2);
        } else {
            bVar = null;
        }
        p.g(bVar);
        Object obj3 = list.get(1);
        c<a0, Object> k = SaversKt.k(a0.f16041b);
        if (!p.e(obj3, bool) && obj3 != null) {
            a0Var = k.a(obj3);
        }
        p.g(a0Var);
        return new TextFieldValue(bVar, a0Var.r(), (a0) null, 4, (i) null);
    }
}

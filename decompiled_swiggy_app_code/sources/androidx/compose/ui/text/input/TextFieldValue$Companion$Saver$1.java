package androidx.compose.ui.text.input;

import androidx.compose.ui.text.SaversKt;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;
import p1.a0;

/* compiled from: TextFieldValue.kt */
final class TextFieldValue$Companion$Saver$1 extends Lambda implements p<d, TextFieldValue, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$1 f7617a = new TextFieldValue$Companion$Saver$1();

    TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Object invoke(d dVar, TextFieldValue textFieldValue) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(textFieldValue, "it");
        return k.f(SaversKt.t(textFieldValue.e(), SaversKt.d(), dVar), SaversKt.t(a0.b(textFieldValue.g()), SaversKt.k(a0.f16041b), dVar));
    }
}

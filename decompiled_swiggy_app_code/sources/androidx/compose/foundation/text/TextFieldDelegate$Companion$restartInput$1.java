package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import v1.d;
import v1.f;

/* compiled from: TextFieldDelegate.kt */
final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements l<List<? extends d>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f4539a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<TextFieldValue, k> f4540b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldDelegate$Companion$restartInput$1(f fVar, l<? super TextFieldValue, k> lVar) {
        super(1);
        this.f4539a = fVar;
        this.f4540b = lVar;
    }

    public final void a(List<? extends d> list) {
        p.j(list, "it");
        TextFieldDelegate.f4538a.f(list, this.f4539a, this.f4540b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((List) obj);
        return k.f22762a;
    }
}

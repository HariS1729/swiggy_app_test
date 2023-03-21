package androidx.compose.ui.text.style;

import androidx.compose.ui.text.style.b;
import kotlin.jvm.internal.p;
import lp0.a;

/* renamed from: androidx.compose.ui.text.style.TextDrawStyle$-CC  reason: invalid class name */
/* compiled from: TextDrawStyle.kt */
public final /* synthetic */ class TextDrawStyle$CC {
    public static b a(b bVar, b bVar2) {
        p.j(bVar2, "other");
        if (bVar2.d() != null) {
            return bVar2;
        }
        return bVar.d() != null ? bVar : bVar2.c(new TextDrawStyle$merge$1(bVar));
    }

    public static b b(b bVar, a aVar) {
        p.j(aVar, "other");
        return !p.e(bVar, b.C0025b.f7670b) ? bVar : (b) aVar.invoke();
    }
}

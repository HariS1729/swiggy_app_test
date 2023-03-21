package androidx.compose.ui.semantics;

import bp0.c;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import n1.a;

/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements p<a<c<? extends Boolean>>, a<c<? extends Boolean>>, a<c<? extends Boolean>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f7459a = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    /* renamed from: a */
    public final a<c<? extends Boolean>> invoke(a<c<? extends Boolean>> aVar, a<c<? extends Boolean>> aVar2) {
        String str;
        c<? extends Boolean> cVar;
        kotlin.jvm.internal.p.j(aVar2, "childValue");
        if (aVar == null || (str = aVar.b()) == null) {
            str = aVar2.b();
        }
        if (aVar == null || (cVar = aVar.a()) == null) {
            cVar = aVar2.a();
        }
        return new a<>(str, cVar);
    }
}

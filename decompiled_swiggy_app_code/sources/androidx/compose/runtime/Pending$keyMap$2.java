package androidx.compose.runtime;

import e0.y;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Composer.kt */
final class Pending$keyMap$2 extends Lambda implements a<HashMap<Object, LinkedHashSet<y>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Pending f6028a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Pending$keyMap$2(Pending pending) {
        super(0);
        this.f6028a = pending;
    }

    /* renamed from: a */
    public final HashMap<Object, LinkedHashSet<y>> invoke() {
        HashMap<Object, LinkedHashSet<y>> n = ComposerKt.P();
        Pending pending = this.f6028a;
        int size = pending.b().size();
        for (int i11 = 0; i11 < size; i11++) {
            y yVar = pending.b().get(i11);
            boolean unused = ComposerKt.S(n, ComposerKt.H(yVar), yVar);
        }
        return n;
    }
}

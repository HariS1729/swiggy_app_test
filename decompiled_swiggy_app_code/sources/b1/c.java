package b1;

import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;
import lp0.l;

/* compiled from: InputModeManager.kt */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l<a, Boolean> f12571a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f12572b;

    private c(int i11, l<? super a, Boolean> lVar) {
        this.f12571a = lVar;
        this.f12572b = j.e(a.c(i11), (a1) null, 2, (Object) null);
    }

    public /* synthetic */ c(int i11, l lVar, i iVar) {
        this(i11, lVar);
    }

    public int a() {
        return ((a) this.f12572b.getValue()).i();
    }

    public void b(int i11) {
        this.f12572b.setValue(a.c(i11));
    }
}

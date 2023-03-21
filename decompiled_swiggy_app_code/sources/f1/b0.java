package f1;

import androidx.compose.ui.input.pointer.PointerEventPass;
import d2.p;
import i1.m;

/* compiled from: PointerEvent.kt */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private m f14480a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14481b;

    public final boolean D0() {
        return this.f14481b;
    }

    public abstract void E0();

    public abstract void F0(n nVar, PointerEventPass pointerEventPass, long j);

    public final void G0(boolean z11) {
        this.f14481b = z11;
    }

    public final void H0(m mVar) {
        this.f14480a = mVar;
    }

    public boolean P() {
        return false;
    }

    public final long a() {
        m mVar = this.f14480a;
        return mVar != null ? mVar.a() : p.f14019b.a();
    }

    public final m l0() {
        return this.f14480a;
    }

    public boolean o0() {
        return false;
    }
}

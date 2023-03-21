package f1;

import androidx.compose.ui.input.pointer.PointerInteropFilter;
import bp0.k;
import lp0.l;

/* compiled from: PointerInteropFilter.android.kt */
public final class j0 implements l<Boolean, k> {

    /* renamed from: a  reason: collision with root package name */
    private PointerInteropFilter f14504a;

    public void a(boolean z11) {
        PointerInteropFilter pointerInteropFilter = this.f14504a;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.d(z11);
        }
    }

    public final void b(PointerInteropFilter pointerInteropFilter) {
        this.f14504a = pointerInteropFilter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return k.f22762a;
    }
}

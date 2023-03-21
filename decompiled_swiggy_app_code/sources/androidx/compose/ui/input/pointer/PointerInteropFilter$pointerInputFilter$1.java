package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import f1.b0;
import f1.e0;
import f1.h;
import f1.n;
import f1.v;
import i1.m;
import java.util.List;
import t0.f;

/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter$pointerInputFilter$1 extends b0 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public PointerInteropFilter.DispatchToViewState f6652c = PointerInteropFilter.DispatchToViewState.Unknown;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter f6653d;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f6653d = pointerInteropFilter;
    }

    private final void J0(n nVar) {
        boolean z11;
        List<v> c11 = nVar.c();
        int size = c11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = false;
                break;
            } else if (c11.get(i11).m()) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            if (this.f6652c == PointerInteropFilter.DispatchToViewState.Dispatching) {
                m l02 = l0();
                if (l02 != null) {
                    e0.b(nVar, l02.t(f.f16662b.c()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.f6653d));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.f6652c = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        m l03 = l0();
        if (l03 != null) {
            e0.c(nVar, l03.t(f.f16662b.c()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.f6653d));
            if (this.f6652c == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = c11.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c11.get(i12).a();
                }
                h d11 = nVar.d();
                if (d11 != null) {
                    d11.e(!this.f6653d.a());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void K0() {
        this.f6652c = PointerInteropFilter.DispatchToViewState.Unknown;
        this.f6653d.d(false);
    }

    public void E0() {
        if (this.f6652c == PointerInteropFilter.DispatchToViewState.Dispatching) {
            e0.a(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.f6653d));
            K0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F0(f1.n r6, androidx.compose.ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.lang.String r8 = "pointerEvent"
            kotlin.jvm.internal.p.j(r6, r8)
            java.lang.String r8 = "pass"
            kotlin.jvm.internal.p.j(r7, r8)
            java.util.List r8 = r6.c()
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.f6653d
            boolean r9 = r9.a()
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0042
            int r9 = r8.size()
            r2 = 0
        L_0x001d:
            if (r2 >= r9) goto L_0x003c
            java.lang.Object r3 = r8.get(r2)
            f1.v r3 = (f1.v) r3
            boolean r4 = f1.o.b(r3)
            if (r4 != 0) goto L_0x0034
            boolean r3 = f1.o.d(r3)
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = 0
            goto L_0x0035
        L_0x0034:
            r3 = 1
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r9 = 1
            goto L_0x003d
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x003c:
            r9 = 0
        L_0x003d:
            if (r9 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = 0
            goto L_0x0043
        L_0x0042:
            r9 = 1
        L_0x0043:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.f6652c
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L_0x005b
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            r5.J0(r6)
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L_0x005b
            if (r9 != 0) goto L_0x005b
            r5.J0(r6)
        L_0x005b:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L_0x007c
            int r6 = r8.size()
            r7 = 0
        L_0x0064:
            if (r7 >= r6) goto L_0x0076
            java.lang.Object r9 = r8.get(r7)
            f1.v r9 = (f1.v) r9
            boolean r9 = f1.o.d(r9)
            if (r9 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            int r7 = r7 + 1
            goto L_0x0064
        L_0x0076:
            r0 = 1
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r5.K0()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.F0(f1.n, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }

    public boolean o0() {
        return true;
    }
}

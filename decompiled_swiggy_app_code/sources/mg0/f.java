package mg0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import in.swiggy.android.swiggylynx.R;
import in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel;
import lg0.a;

/* compiled from: FragmentLynxBindingImpl */
public class f extends e {
    private static final ViewDataBinding.i P = null;
    private static final SparseIntArray Q;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.header, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.determinateBar, 6);
        sparseIntArray.put(R.id.errorContainer, 7);
        sparseIntArray.put(R.id.cancel_icon, 8);
        sparseIntArray.put(R.id.cancel_icon_left, 9);
    }

    public f(androidx.databinding.f fVar, View view) {
        this(fVar, view, ViewDataBinding.R(fVar, view, 10, P, Q));
    }

    private boolean A0(ObservableBoolean observableBoolean, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    private boolean B0(ObservableField<Integer> observableField, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    private boolean C0(ObservableField<String> observableField, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    private boolean D0(ObservableInt observableInt, int i11) {
        if (i11 != a.f19661a) {
            return false;
        }
        synchronized (this) {
            this.O |= 8;
        }
        return true;
    }

    public boolean J() {
        synchronized (this) {
            if (this.O != 0) {
                return true;
            }
            return false;
        }
    }

    public void M() {
        synchronized (this) {
            this.O = 64;
        }
        a0();
    }

    /* access modifiers changed from: protected */
    public boolean U(int i11, Object obj, int i12) {
        if (i11 == 0) {
            return B0((ObservableField) obj, i12);
        }
        if (i11 == 1) {
            return C0((ObservableField) obj, i12);
        }
        if (i11 == 2) {
            return A0((ObservableBoolean) obj, i12);
        }
        if (i11 != 3) {
            return false;
        }
        return D0((ObservableInt) obj, i12);
    }

    public boolean m0(int i11, Object obj) {
        if (a.f19663c == i11) {
            z0((LynxFragmentViewModel) obj);
        } else if (a.f19662b != i11) {
            return false;
        } else {
            x0((xh0.a) obj);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
            r19 = this;
            r1 = r19
            monitor-enter(r19)
            long r2 = r1.O     // Catch:{ all -> 0x00f5 }
            r4 = 0
            r1.O = r4     // Catch:{ all -> 0x00f5 }
            monitor-exit(r19)     // Catch:{ all -> 0x00f5 }
            in.swiggy.android.swiggylynx.ui.fragment.viewmodel.LynxFragmentViewModel r0 = r1.N
            xh0.a r7 = r1.M
            r8 = 91
            long r8 = r8 & r2
            r10 = 88
            r12 = 82
            r14 = 81
            r6 = 0
            r17 = 0
            int r18 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r18 == 0) goto L_0x00aa
            long r8 = r2 & r14
            r14 = 1
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0069
            if (r0 == 0) goto L_0x002c
            androidx.databinding.ObservableField r8 = r0.x1()
            goto L_0x002e
        L_0x002c:
            r8 = r17
        L_0x002e:
            r1.r0(r6, r8)
            if (r8 == 0) goto L_0x003a
            java.lang.Object r8 = r8.g()
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x003c
        L_0x003a:
            r8 = r17
        L_0x003c:
            int r8 = androidx.databinding.ViewDataBinding.c0(r8)
            if (r8 != 0) goto L_0x0044
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            if (r15 == 0) goto L_0x004f
            if (r8 == 0) goto L_0x004c
            r15 = 256(0x100, double:1.265E-321)
            goto L_0x004e
        L_0x004c:
            r15 = 128(0x80, double:6.32E-322)
        L_0x004e:
            long r2 = r2 | r15
        L_0x004f:
            if (r8 == 0) goto L_0x005a
            android.widget.FrameLayout r8 = r1.L
            android.content.res.Resources r8 = r8.getResources()
            int r9 = in.swiggy.android.swiggylynx.R.dimen.dimen_56dp
            goto L_0x0062
        L_0x005a:
            android.widget.FrameLayout r8 = r1.L
            android.content.res.Resources r8 = r8.getResources()
            int r9 = in.swiggy.android.swiggylynx.R.dimen.dimen_0dp
        L_0x0062:
            float r8 = r8.getDimension(r9)
            r16 = r8
            goto L_0x006b
        L_0x0069:
            r16 = 0
        L_0x006b:
            long r8 = r2 & r12
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0086
            if (r0 == 0) goto L_0x0078
            androidx.databinding.ObservableField r8 = r0.L1()
            goto L_0x007a
        L_0x0078:
            r8 = r17
        L_0x007a:
            r1.r0(r14, r8)
            if (r8 == 0) goto L_0x0086
            java.lang.Object r8 = r8.g()
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0088
        L_0x0086:
            r8 = r17
        L_0x0088:
            long r14 = r2 & r10
            int r9 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x00a5
            if (r0 == 0) goto L_0x0095
            androidx.databinding.ObservableInt r0 = r0.M1()
            goto L_0x0097
        L_0x0095:
            r0 = r17
        L_0x0097:
            r9 = 3
            r1.r0(r9, r0)
            if (r0 == 0) goto L_0x00a5
            int r0 = r0.g()
            r9 = r8
            r8 = r16
            goto L_0x00ae
        L_0x00a5:
            r9 = r8
            r8 = r16
            r0 = 0
            goto L_0x00ae
        L_0x00aa:
            r9 = r17
            r0 = 0
            r8 = 0
        L_0x00ae:
            r14 = 100
            long r14 = r14 & r2
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00c7
            if (r7 == 0) goto L_0x00bb
            androidx.databinding.ObservableBoolean r17 = r7.b()
        L_0x00bb:
            r7 = r17
            r14 = 2
            r1.r0(r14, r7)
            if (r7 == 0) goto L_0x00c7
            boolean r6 = r7.g()
        L_0x00c7:
            if (r16 == 0) goto L_0x00d2
            android.widget.FrameLayout r7 = r1.H
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            jb0.c.e(r7, r6)
        L_0x00d2:
            long r6 = r2 & r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x00dd
            android.view.View r6 = r1.I
            ct.j.P(r6, r0)
        L_0x00dd:
            long r6 = r2 & r12
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00e8
            android.view.View r0 = r1.I
            di0.o.a(r0, r9)
        L_0x00e8:
            r6 = 81
            long r2 = r2 & r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00f4
            android.widget.FrameLayout r0 = r1.L
            jb0.c.x(r0, r8)
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x00f5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg0.f.r():void");
    }

    public void x0(xh0.a aVar) {
        this.M = aVar;
        synchronized (this) {
            this.O |= 32;
        }
        e(a.f19662b);
        super.a0();
    }

    public void z0(LynxFragmentViewModel lynxFragmentViewModel) {
        this.N = lynxFragmentViewModel;
        synchronized (this) {
            this.O |= 16;
        }
        e(a.f19663c);
        super.a0();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 4, objArr[8], objArr[9], objArr[6], objArr[7], objArr[0], objArr[4], objArr[3], objArr[1], objArr[5], objArr[2]);
        this.O = -1;
        this.F.setTag((Object) null);
        this.H.setTag((Object) null);
        this.I.setTag((Object) null);
        this.L.setTag((Object) null);
        k0(view);
        M();
    }
}

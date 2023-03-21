package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.k;
import androidx.transition.b0;
import java.util.ArrayList;
import java.util.Iterator;
import y3.c;
import y3.e;

/* compiled from: TransitionSet */
public class f0 extends b0 {
    private ArrayList<b0> L = new ArrayList<>();
    private boolean M = true;
    int N;
    boolean O = false;
    private int P = 0;

    /* compiled from: TransitionSet */
    class a extends d0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f11903a;

        a(b0 b0Var) {
            this.f11903a = b0Var;
        }

        public void d(b0 b0Var) {
            this.f11903a.h0();
            b0Var.d0(this);
        }
    }

    /* compiled from: TransitionSet */
    static class b extends d0 {

        /* renamed from: a  reason: collision with root package name */
        f0 f11905a;

        b(f0 f0Var) {
            this.f11905a = f0Var;
        }

        public void b(b0 b0Var) {
            f0 f0Var = this.f11905a;
            if (!f0Var.O) {
                f0Var.r0();
                this.f11905a.O = true;
            }
        }

        public void d(b0 b0Var) {
            f0 f0Var = this.f11905a;
            int i11 = f0Var.N - 1;
            f0Var.N = i11;
            if (i11 == 0) {
                f0Var.O = false;
                f0Var.u();
            }
            b0Var.d0(this);
        }
    }

    public f0() {
    }

    private void J0() {
        b bVar = new b(this);
        Iterator<b0> it2 = this.L.iterator();
        while (it2.hasNext()) {
            it2.next().b(bVar);
        }
        this.N = this.L.size();
    }

    private void z0(b0 b0Var) {
        this.L.add(b0Var);
        b0Var.f11846r = this;
    }

    public b0 A0(int i11) {
        if (i11 < 0 || i11 >= this.L.size()) {
            return null;
        }
        return this.L.get(i11);
    }

    public int B0() {
        return this.L.size();
    }

    /* renamed from: C0 */
    public f0 d0(b0.g gVar) {
        return (f0) super.d0(gVar);
    }

    /* renamed from: D0 */
    public f0 e0(View view) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).e0(view);
        }
        return (f0) super.e0(view);
    }

    /* renamed from: E0 */
    public f0 j0(long j) {
        ArrayList<b0> arrayList;
        super.j0(j);
        if (this.f11835c >= 0 && (arrayList = this.L) != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.L.get(i11).j0(j);
            }
        }
        return this;
    }

    /* renamed from: F0 */
    public f0 l0(TimeInterpolator timeInterpolator) {
        this.P |= 1;
        ArrayList<b0> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.L.get(i11).l0(timeInterpolator);
            }
        }
        return (f0) super.l0(timeInterpolator);
    }

    public f0 G0(int i11) {
        if (i11 == 0) {
            this.M = true;
        } else if (i11 == 1) {
            this.M = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i11);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H0 */
    public f0 p0(ViewGroup viewGroup) {
        super.p0(viewGroup);
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).p0(viewGroup);
        }
        return this;
    }

    /* renamed from: I0 */
    public f0 q0(long j) {
        return (f0) super.q0(j);
    }

    public void b0(View view) {
        super.b0(view);
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).b0(view);
        }
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        super.cancel();
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).cancel();
        }
    }

    public void f0(View view) {
        super.f0(view);
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).f0(view);
        }
    }

    /* access modifiers changed from: protected */
    public void h0() {
        if (this.L.isEmpty()) {
            r0();
            u();
            return;
        }
        J0();
        if (!this.M) {
            for (int i11 = 1; i11 < this.L.size(); i11++) {
                this.L.get(i11 - 1).b(new a(this.L.get(i11)));
            }
            b0 b0Var = this.L.get(0);
            if (b0Var != null) {
                b0Var.h0();
                return;
            }
            return;
        }
        Iterator<b0> it2 = this.L.iterator();
        while (it2.hasNext()) {
            it2.next().h0();
        }
    }

    /* access modifiers changed from: package-private */
    public void i0(boolean z11) {
        super.i0(z11);
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).i0(z11);
        }
    }

    public void k(h0 h0Var) {
        if (T(h0Var.f11936b)) {
            Iterator<b0> it2 = this.L.iterator();
            while (it2.hasNext()) {
                b0 next = it2.next();
                if (next.T(h0Var.f11936b)) {
                    next.k(h0Var);
                    h0Var.f11937c.add(next);
                }
            }
        }
    }

    public void k0(b0.f fVar) {
        super.k0(fVar);
        this.P |= 8;
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).k0(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(h0 h0Var) {
        super.m(h0Var);
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).m(h0Var);
        }
    }

    public void n(h0 h0Var) {
        if (T(h0Var.f11936b)) {
            Iterator<b0> it2 = this.L.iterator();
            while (it2.hasNext()) {
                b0 next = it2.next();
                if (next.T(h0Var.f11936b)) {
                    next.n(h0Var);
                    h0Var.f11937c.add(next);
                }
            }
        }
    }

    public void n0(c cVar) {
        super.n0(cVar);
        this.P |= 4;
        if (this.L != null) {
            for (int i11 = 0; i11 < this.L.size(); i11++) {
                this.L.get(i11).n0(cVar);
            }
        }
    }

    public void o0(e eVar) {
        super.o0(eVar);
        this.P |= 2;
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.L.get(i11).o0(eVar);
        }
    }

    /* renamed from: q */
    public b0 clone() {
        f0 f0Var = (f0) super.clone();
        f0Var.L = new ArrayList<>();
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            f0Var.z0(this.L.get(i11).clone());
        }
        return f0Var;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, i0 i0Var, i0 i0Var2, ArrayList<h0> arrayList, ArrayList<h0> arrayList2) {
        long K = K();
        int size = this.L.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = this.L.get(i11);
            if (K > 0 && (this.M || i11 == 0)) {
                long K2 = b0Var.K();
                if (K2 > 0) {
                    b0Var.q0(K2 + K);
                } else {
                    b0Var.q0(K);
                }
            }
            b0Var.s(viewGroup, i0Var, i0Var2, arrayList, arrayList2);
        }
    }

    /* access modifiers changed from: package-private */
    public String s0(String str) {
        String s02 = super.s0(str);
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(s02);
            sb2.append("\n");
            sb2.append(this.L.get(i11).s0(str + "  "));
            s02 = sb2.toString();
        }
        return s02;
    }

    /* renamed from: t0 */
    public f0 b(b0.g gVar) {
        return (f0) super.b(gVar);
    }

    /* renamed from: u0 */
    public f0 c(int i11) {
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            this.L.get(i12).c(i11);
        }
        return (f0) super.c(i11);
    }

    /* renamed from: v0 */
    public f0 d(View view) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).d(view);
        }
        return (f0) super.d(view);
    }

    /* renamed from: w0 */
    public f0 e(Class<?> cls) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).e(cls);
        }
        return (f0) super.e(cls);
    }

    public b0 x(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.L.size(); i12++) {
            this.L.get(i12).x(i11, z11);
        }
        return super.x(i11, z11);
    }

    /* renamed from: x0 */
    public f0 f(String str) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).f(str);
        }
        return (f0) super.f(str);
    }

    public b0 y(Class<?> cls, boolean z11) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).y(cls, z11);
        }
        return super.y(cls, z11);
    }

    public f0 y0(b0 b0Var) {
        z0(b0Var);
        long j = this.f11835c;
        if (j >= 0) {
            b0Var.j0(j);
        }
        if ((this.P & 1) != 0) {
            b0Var.l0(E());
        }
        if ((this.P & 2) != 0) {
            b0Var.o0(I());
        }
        if ((this.P & 4) != 0) {
            b0Var.n0(H());
        }
        if ((this.P & 8) != 0) {
            b0Var.k0(D());
        }
        return this;
    }

    public b0 z(String str, boolean z11) {
        for (int i11 = 0; i11 < this.L.size(); i11++) {
            this.L.get(i11).z(str, z11);
        }
        return super.z(str, z11);
    }

    @SuppressLint({"RestrictedApi"})
    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.f11825i);
        G0(k.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}

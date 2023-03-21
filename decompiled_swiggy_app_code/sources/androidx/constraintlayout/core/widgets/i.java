package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.b;
import java.util.HashSet;
import m2.b;

/* compiled from: VirtualLayout */
public class i extends b {
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    private int f8365a1 = 0;

    /* renamed from: b1  reason: collision with root package name */
    private int f8366b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    private int f8367c1 = 0;

    /* renamed from: d1  reason: collision with root package name */
    private int f8368d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    private int f8369e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    private boolean f8370f1 = false;

    /* renamed from: g1  reason: collision with root package name */
    private int f8371g1 = 0;

    /* renamed from: h1  reason: collision with root package name */
    private int f8372h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    protected b.a f8373i1 = new b.a();

    /* renamed from: j1  reason: collision with root package name */
    b.C0027b f8374j1 = null;

    public boolean A1(HashSet<ConstraintWidget> hashSet) {
        for (int i11 = 0; i11 < this.W0; i11++) {
            if (hashSet.contains(this.V0[i11])) {
                return true;
            }
        }
        return false;
    }

    public int B1() {
        return this.Y0;
    }

    public int C1() {
        return this.f8368d1;
    }

    public int D1() {
        return this.f8369e1;
    }

    public int E1() {
        return this.X0;
    }

    public boolean F1() {
        return this.f8370f1;
    }

    /* access modifiers changed from: protected */
    public void G1(boolean z11) {
        this.f8370f1 = z11;
    }

    public void c(d dVar) {
        z1();
    }

    public void z1() {
        for (int i11 = 0; i11 < this.W0; i11++) {
            ConstraintWidget constraintWidget = this.V0[i11];
            if (constraintWidget != null) {
                constraintWidget.a1(true);
            }
        }
    }
}

package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow */
public class g extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f8064g = 128;

    /* renamed from: h  reason: collision with root package name */
    private SolverVariable[] f8065h = new SolverVariable[128];

    /* renamed from: i  reason: collision with root package name */
    private SolverVariable[] f8066i = new SolverVariable[128];
    private int j = 0;
    b k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    c f8067l;

    /* compiled from: PriorityGoalRow */
    class a implements Comparator<SolverVariable> {
        a() {
        }

        /* renamed from: a */
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f8011c - solverVariable2.f8011c;
        }
    }

    /* compiled from: PriorityGoalRow */
    class b {

        /* renamed from: a  reason: collision with root package name */
        SolverVariable f8069a;

        /* renamed from: b  reason: collision with root package name */
        g f8070b;

        public b(g gVar) {
            this.f8070b = gVar;
        }

        public boolean a(SolverVariable solverVariable, float f11) {
            boolean z11 = true;
            if (this.f8069a.f8009a) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = this.f8069a.f8017i;
                    fArr[i11] = fArr[i11] + (solverVariable.f8017i[i11] * f11);
                    if (Math.abs(fArr[i11]) < 1.0E-4f) {
                        this.f8069a.f8017i[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    g.this.G(this.f8069a);
                }
                return false;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                float f12 = solverVariable.f8017i[i12];
                if (f12 != 0.0f) {
                    float f13 = f12 * f11;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.f8069a.f8017i[i12] = f13;
                } else {
                    this.f8069a.f8017i[i12] = 0.0f;
                }
            }
            return true;
        }

        public void b(SolverVariable solverVariable) {
            this.f8069a = solverVariable;
        }

        public final boolean c() {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = this.f8069a.f8017i[i11];
                if (f11 > 0.0f) {
                    return false;
                }
                if (f11 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(SolverVariable solverVariable) {
            int i11 = 8;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                float f11 = solverVariable.f8017i[i11];
                float f12 = this.f8069a.f8017i[i11];
                if (f12 == f11) {
                    i11--;
                } else if (f12 < f11) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f8069a.f8017i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f8069a != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = str + this.f8069a.f8017i[i11] + " ";
                }
            }
            return str + "] " + this.f8069a;
        }
    }

    public g(c cVar) {
        super(cVar);
        this.f8067l = cVar;
    }

    private final void F(SolverVariable solverVariable) {
        int i11;
        int i12 = this.j + 1;
        SolverVariable[] solverVariableArr = this.f8065h;
        if (i12 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f8065h = solverVariableArr2;
            this.f8066i = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f8065h;
        int i13 = this.j;
        solverVariableArr3[i13] = solverVariable;
        int i14 = i13 + 1;
        this.j = i14;
        if (i14 > 1 && solverVariableArr3[i14 - 1].f8011c > solverVariable.f8011c) {
            int i15 = 0;
            while (true) {
                i11 = this.j;
                if (i15 >= i11) {
                    break;
                }
                this.f8066i[i15] = this.f8065h[i15];
                i15++;
            }
            Arrays.sort(this.f8066i, 0, i11, new a());
            for (int i16 = 0; i16 < this.j; i16++) {
                this.f8065h[i16] = this.f8066i[i16];
            }
        }
        solverVariable.f8009a = true;
        solverVariable.a(this);
    }

    /* access modifiers changed from: private */
    public final void G(SolverVariable solverVariable) {
        int i11 = 0;
        while (i11 < this.j) {
            if (this.f8065h[i11] == solverVariable) {
                while (true) {
                    int i12 = this.j;
                    if (i11 < i12 - 1) {
                        SolverVariable[] solverVariableArr = this.f8065h;
                        int i13 = i11 + 1;
                        solverVariableArr[i11] = solverVariableArr[i13];
                        i11 = i13;
                    } else {
                        this.j = i12 - 1;
                        solverVariable.f8009a = false;
                        return;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z11) {
        SolverVariable solverVariable = bVar.f8032a;
        if (solverVariable != null) {
            b.a aVar = bVar.f8036e;
            int i11 = aVar.i();
            for (int i12 = 0; i12 < i11; i12++) {
                SolverVariable b11 = aVar.b(i12);
                float k11 = aVar.k(i12);
                this.k.b(b11);
                if (this.k.a(solverVariable, k11)) {
                    F(b11);
                }
                this.f8033b += bVar.f8033b * k11;
            }
            G(solverVariable);
        }
    }

    public SolverVariable a(d dVar, boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.j; i12++) {
            SolverVariable solverVariable = this.f8065h[i12];
            if (!zArr[solverVariable.f8011c]) {
                this.k.b(solverVariable);
                if (i11 == -1) {
                    if (!this.k.c()) {
                    }
                } else if (!this.k.d(this.f8065h[i11])) {
                }
                i11 = i12;
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f8065h[i11];
    }

    public void c(SolverVariable solverVariable) {
        this.k.b(solverVariable);
        this.k.e();
        solverVariable.f8017i[solverVariable.f8013e] = 1.0f;
        F(solverVariable);
    }

    public void clear() {
        this.j = 0;
        this.f8033b = 0.0f;
    }

    public boolean isEmpty() {
        return this.j == 0;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f8033b + ") : ";
        for (int i11 = 0; i11 < this.j; i11++) {
            this.k.b(this.f8065h[i11]);
            str = str + this.k + " ";
        }
        return str;
    }
}

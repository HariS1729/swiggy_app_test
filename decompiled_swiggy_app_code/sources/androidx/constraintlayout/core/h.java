package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: SolverVariableValues */
public class h implements b.a {
    private static float n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f8072a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f8073b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f8074c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f8075d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f8076e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f8077f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f8078g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f8079h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f8080i = new int[16];
    int j = 0;
    int k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f8081l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f8082m;

    h(b bVar, c cVar) {
        this.f8081l = bVar;
        this.f8082m = cVar;
        clear();
    }

    private void l(SolverVariable solverVariable, int i11) {
        int[] iArr;
        int i12 = solverVariable.f8011c % this.f8074c;
        int[] iArr2 = this.f8075d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            iArr2[i12] = i11;
        } else {
            while (true) {
                iArr = this.f8076e;
                if (iArr[i13] == -1) {
                    break;
                }
                i13 = iArr[i13];
            }
            iArr[i13] = i11;
        }
        this.f8076e[i11] = -1;
    }

    private void m(int i11, SolverVariable solverVariable, float f11) {
        this.f8077f[i11] = solverVariable.f8011c;
        this.f8078g[i11] = f11;
        this.f8079h[i11] = -1;
        this.f8080i[i11] = -1;
        solverVariable.a(this.f8081l);
        solverVariable.f8019m++;
        this.j++;
    }

    private int n() {
        for (int i11 = 0; i11 < this.f8073b; i11++) {
            if (this.f8077f[i11] == -1) {
                return i11;
            }
        }
        return -1;
    }

    private void o() {
        int i11 = this.f8073b * 2;
        this.f8077f = Arrays.copyOf(this.f8077f, i11);
        this.f8078g = Arrays.copyOf(this.f8078g, i11);
        this.f8079h = Arrays.copyOf(this.f8079h, i11);
        this.f8080i = Arrays.copyOf(this.f8080i, i11);
        this.f8076e = Arrays.copyOf(this.f8076e, i11);
        for (int i12 = this.f8073b; i12 < i11; i12++) {
            this.f8077f[i12] = -1;
            this.f8076e[i12] = -1;
        }
        this.f8073b = i11;
    }

    private void q(int i11, SolverVariable solverVariable, float f11) {
        int n11 = n();
        m(n11, solverVariable, f11);
        if (i11 != -1) {
            this.f8079h[n11] = i11;
            int[] iArr = this.f8080i;
            iArr[n11] = iArr[i11];
            iArr[i11] = n11;
        } else {
            this.f8079h[n11] = -1;
            if (this.j > 0) {
                this.f8080i[n11] = this.k;
                this.k = n11;
            } else {
                this.f8080i[n11] = -1;
            }
        }
        int[] iArr2 = this.f8080i;
        if (iArr2[n11] != -1) {
            this.f8079h[iArr2[n11]] = n11;
        }
        l(solverVariable, n11);
    }

    private void r(SolverVariable solverVariable) {
        int[] iArr;
        int i11 = solverVariable.f8011c;
        int i12 = i11 % this.f8074c;
        int[] iArr2 = this.f8075d;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f8077f[i13] == i11) {
                int[] iArr3 = this.f8076e;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
                return;
            }
            while (true) {
                iArr = this.f8076e;
                if (iArr[i13] == -1 || this.f8077f[iArr[i13]] == i11) {
                    int i14 = iArr[i13];
                } else {
                    i13 = iArr[i13];
                }
            }
            int i142 = iArr[i13];
            if (i142 != -1 && this.f8077f[i142] == i11) {
                iArr[i13] = iArr[i142];
                iArr[i142] = -1;
            }
        }
    }

    public boolean a(SolverVariable solverVariable) {
        return p(solverVariable) != -1;
    }

    public SolverVariable b(int i11) {
        int i12 = this.j;
        if (i12 == 0) {
            return null;
        }
        int i13 = this.k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11 && i13 != -1) {
                return this.f8082m.f8041d[this.f8077f[i13]];
            }
            i13 = this.f8080i[i13];
            if (i13 == -1) {
                break;
            }
        }
        return null;
    }

    public void c(SolverVariable solverVariable, float f11) {
        float f12 = n;
        if (f11 <= (-f12) || f11 >= f12) {
            if (this.j == 0) {
                m(0, solverVariable, f11);
                l(solverVariable, 0);
                this.k = 0;
                return;
            }
            int p11 = p(solverVariable);
            if (p11 != -1) {
                this.f8078g[p11] = f11;
                return;
            }
            if (this.j + 1 >= this.f8073b) {
                o();
            }
            int i11 = this.j;
            int i12 = this.k;
            int i13 = -1;
            for (int i14 = 0; i14 < i11; i14++) {
                int[] iArr = this.f8077f;
                int i15 = iArr[i12];
                int i16 = solverVariable.f8011c;
                if (i15 == i16) {
                    this.f8078g[i12] = f11;
                    return;
                }
                if (iArr[i12] < i16) {
                    i13 = i12;
                }
                i12 = this.f8080i[i12];
                if (i12 == -1) {
                    break;
                }
            }
            q(i13, solverVariable, f11);
            return;
        }
        h(solverVariable, true);
    }

    public void clear() {
        int i11 = this.j;
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable b11 = b(i12);
            if (b11 != null) {
                b11.i(this.f8081l);
            }
        }
        for (int i13 = 0; i13 < this.f8073b; i13++) {
            this.f8077f[i13] = -1;
            this.f8076e[i13] = -1;
        }
        for (int i14 = 0; i14 < this.f8074c; i14++) {
            this.f8075d[i14] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    public float d(SolverVariable solverVariable) {
        int p11 = p(solverVariable);
        if (p11 != -1) {
            return this.f8078g[p11];
        }
        return 0.0f;
    }

    public void e(float f11) {
        int i11 = this.j;
        int i12 = this.k;
        int i13 = 0;
        while (i13 < i11) {
            float[] fArr = this.f8078g;
            fArr[i12] = fArr[i12] / f11;
            i12 = this.f8080i[i12];
            if (i12 != -1) {
                i13++;
            } else {
                return;
            }
        }
    }

    public void f(SolverVariable solverVariable, float f11, boolean z11) {
        float f12 = n;
        if (f11 <= (-f12) || f11 >= f12) {
            int p11 = p(solverVariable);
            if (p11 == -1) {
                c(solverVariable, f11);
                return;
            }
            float[] fArr = this.f8078g;
            fArr[p11] = fArr[p11] + f11;
            float f13 = fArr[p11];
            float f14 = n;
            if (f13 > (-f14) && fArr[p11] < f14) {
                fArr[p11] = 0.0f;
                h(solverVariable, z11);
            }
        }
    }

    public void g() {
        int i11 = this.j;
        int i12 = this.k;
        int i13 = 0;
        while (i13 < i11) {
            float[] fArr = this.f8078g;
            fArr[i12] = fArr[i12] * -1.0f;
            i12 = this.f8080i[i12];
            if (i12 != -1) {
                i13++;
            } else {
                return;
            }
        }
    }

    public float h(SolverVariable solverVariable, boolean z11) {
        int p11 = p(solverVariable);
        if (p11 == -1) {
            return 0.0f;
        }
        r(solverVariable);
        float f11 = this.f8078g[p11];
        if (this.k == p11) {
            this.k = this.f8080i[p11];
        }
        this.f8077f[p11] = -1;
        int[] iArr = this.f8079h;
        if (iArr[p11] != -1) {
            int[] iArr2 = this.f8080i;
            iArr2[iArr[p11]] = iArr2[p11];
        }
        int[] iArr3 = this.f8080i;
        if (iArr3[p11] != -1) {
            iArr[iArr3[p11]] = iArr[p11];
        }
        this.j--;
        solverVariable.f8019m--;
        if (z11) {
            solverVariable.i(this.f8081l);
        }
        return f11;
    }

    public int i() {
        return this.j;
    }

    public float j(b bVar, boolean z11) {
        float d11 = d(bVar.f8032a);
        h(bVar.f8032a, z11);
        h hVar = (h) bVar.f8036e;
        int i11 = hVar.i();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int[] iArr = hVar.f8077f;
            if (iArr[i13] != -1) {
                f(this.f8082m.f8041d[iArr[i13]], hVar.f8078g[i13] * d11, z11);
                i12++;
            }
            i13++;
        }
        return d11;
    }

    public float k(int i11) {
        int i12 = this.j;
        int i13 = this.k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11) {
                return this.f8078g[i13];
            }
            i13 = this.f8080i[i13];
            if (i13 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public int p(SolverVariable solverVariable) {
        int[] iArr;
        if (!(this.j == 0 || solverVariable == null)) {
            int i11 = solverVariable.f8011c;
            int i12 = this.f8075d[i11 % this.f8074c];
            if (i12 == -1) {
                return -1;
            }
            if (this.f8077f[i12] == i11) {
                return i12;
            }
            while (true) {
                iArr = this.f8076e;
                if (iArr[i12] != -1 && this.f8077f[iArr[i12]] != i11) {
                    i12 = iArr[i12];
                }
            }
            if (iArr[i12] != -1 && this.f8077f[iArr[i12]] == i11) {
                return iArr[i12];
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i11 = this.j;
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable b11 = b(i12);
            if (b11 != null) {
                String str4 = str3 + b11 + " = " + k(i12) + " ";
                int p11 = p(b11);
                String str5 = str4 + "[p: ";
                if (this.f8079h[p11] != -1) {
                    str = str5 + this.f8082m.f8041d[this.f8077f[this.f8079h[p11]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f8080i[p11] != -1) {
                    str2 = str6 + this.f8082m.f8041d[this.f8077f[this.f8080i[p11]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}

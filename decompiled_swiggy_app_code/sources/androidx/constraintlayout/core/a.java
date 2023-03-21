package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f8022l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f8023a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f8024b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f8025c;

    /* renamed from: d  reason: collision with root package name */
    private int f8026d = 8;

    /* renamed from: e  reason: collision with root package name */
    private SolverVariable f8027e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f8028f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f8029g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f8030h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f8031i = -1;
    private int j = -1;
    private boolean k = false;

    a(b bVar, c cVar) {
        this.f8024b = bVar;
        this.f8025c = cVar;
    }

    public boolean a(SolverVariable solverVariable) {
        int i11 = this.f8031i;
        if (i11 == -1) {
            return false;
        }
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            if (this.f8028f[i11] == solverVariable.f8011c) {
                return true;
            }
            i11 = this.f8029g[i11];
            i12++;
        }
        return false;
    }

    public SolverVariable b(int i11) {
        int i12 = this.f8031i;
        int i13 = 0;
        while (i12 != -1 && i13 < this.f8023a) {
            if (i13 == i11) {
                return this.f8025c.f8041d[this.f8028f[i12]];
            }
            i12 = this.f8029g[i12];
            i13++;
        }
        return null;
    }

    public final void c(SolverVariable solverVariable, float f11) {
        if (f11 == 0.0f) {
            h(solverVariable, true);
            return;
        }
        int i11 = this.f8031i;
        if (i11 == -1) {
            this.f8031i = 0;
            this.f8030h[0] = f11;
            this.f8028f[0] = solverVariable.f8011c;
            this.f8029g[0] = -1;
            solverVariable.f8019m++;
            solverVariable.a(this.f8024b);
            this.f8023a++;
            if (!this.k) {
                int i12 = this.j + 1;
                this.j = i12;
                int[] iArr = this.f8028f;
                if (i12 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i13 = 0;
        int i14 = -1;
        while (i11 != -1 && i13 < this.f8023a) {
            int[] iArr2 = this.f8028f;
            int i15 = iArr2[i11];
            int i16 = solverVariable.f8011c;
            if (i15 == i16) {
                this.f8030h[i11] = f11;
                return;
            }
            if (iArr2[i11] < i16) {
                i14 = i11;
            }
            i11 = this.f8029g[i11];
            i13++;
        }
        int i17 = this.j;
        int i18 = i17 + 1;
        if (this.k) {
            int[] iArr3 = this.f8028f;
            if (iArr3[i17] != -1) {
                i17 = iArr3.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr4 = this.f8028f;
        if (i17 >= iArr4.length && this.f8023a < iArr4.length) {
            int i19 = 0;
            while (true) {
                int[] iArr5 = this.f8028f;
                if (i19 >= iArr5.length) {
                    break;
                } else if (iArr5[i19] == -1) {
                    i17 = i19;
                    break;
                } else {
                    i19++;
                }
            }
        }
        int[] iArr6 = this.f8028f;
        if (i17 >= iArr6.length) {
            i17 = iArr6.length;
            int i21 = this.f8026d * 2;
            this.f8026d = i21;
            this.k = false;
            this.j = i17 - 1;
            this.f8030h = Arrays.copyOf(this.f8030h, i21);
            this.f8028f = Arrays.copyOf(this.f8028f, this.f8026d);
            this.f8029g = Arrays.copyOf(this.f8029g, this.f8026d);
        }
        this.f8028f[i17] = solverVariable.f8011c;
        this.f8030h[i17] = f11;
        if (i14 != -1) {
            int[] iArr7 = this.f8029g;
            iArr7[i17] = iArr7[i14];
            iArr7[i14] = i17;
        } else {
            this.f8029g[i17] = this.f8031i;
            this.f8031i = i17;
        }
        solverVariable.f8019m++;
        solverVariable.a(this.f8024b);
        int i22 = this.f8023a + 1;
        this.f8023a = i22;
        if (!this.k) {
            this.j++;
        }
        int[] iArr8 = this.f8028f;
        if (i22 >= iArr8.length) {
            this.k = true;
        }
        if (this.j >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final void clear() {
        int i11 = this.f8031i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            SolverVariable solverVariable = this.f8025c.f8041d[this.f8028f[i11]];
            if (solverVariable != null) {
                solverVariable.i(this.f8024b);
            }
            i11 = this.f8029g[i11];
            i12++;
        }
        this.f8031i = -1;
        this.j = -1;
        this.k = false;
        this.f8023a = 0;
    }

    public final float d(SolverVariable solverVariable) {
        int i11 = this.f8031i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            if (this.f8028f[i11] == solverVariable.f8011c) {
                return this.f8030h[i11];
            }
            i11 = this.f8029g[i11];
            i12++;
        }
        return 0.0f;
    }

    public void e(float f11) {
        int i11 = this.f8031i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            float[] fArr = this.f8030h;
            fArr[i11] = fArr[i11] / f11;
            i11 = this.f8029g[i11];
            i12++;
        }
    }

    public void f(SolverVariable solverVariable, float f11, boolean z11) {
        float f12 = f8022l;
        if (f11 <= (-f12) || f11 >= f12) {
            int i11 = this.f8031i;
            if (i11 == -1) {
                this.f8031i = 0;
                this.f8030h[0] = f11;
                this.f8028f[0] = solverVariable.f8011c;
                this.f8029g[0] = -1;
                solverVariable.f8019m++;
                solverVariable.a(this.f8024b);
                this.f8023a++;
                if (!this.k) {
                    int i12 = this.j + 1;
                    this.j = i12;
                    int[] iArr = this.f8028f;
                    if (i12 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i13 = 0;
            int i14 = -1;
            while (i11 != -1 && i13 < this.f8023a) {
                int[] iArr2 = this.f8028f;
                int i15 = iArr2[i11];
                int i16 = solverVariable.f8011c;
                if (i15 == i16) {
                    float[] fArr = this.f8030h;
                    float f13 = fArr[i11] + f11;
                    float f14 = f8022l;
                    if (f13 > (-f14) && f13 < f14) {
                        f13 = 0.0f;
                    }
                    fArr[i11] = f13;
                    if (f13 == 0.0f) {
                        if (i11 == this.f8031i) {
                            this.f8031i = this.f8029g[i11];
                        } else {
                            int[] iArr3 = this.f8029g;
                            iArr3[i14] = iArr3[i11];
                        }
                        if (z11) {
                            solverVariable.i(this.f8024b);
                        }
                        if (this.k) {
                            this.j = i11;
                        }
                        solverVariable.f8019m--;
                        this.f8023a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i11] < i16) {
                    i14 = i11;
                }
                i11 = this.f8029g[i11];
                i13++;
            }
            int i17 = this.j;
            int i18 = i17 + 1;
            if (this.k) {
                int[] iArr4 = this.f8028f;
                if (iArr4[i17] != -1) {
                    i17 = iArr4.length;
                }
            } else {
                i17 = i18;
            }
            int[] iArr5 = this.f8028f;
            if (i17 >= iArr5.length && this.f8023a < iArr5.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr6 = this.f8028f;
                    if (i19 >= iArr6.length) {
                        break;
                    } else if (iArr6[i19] == -1) {
                        i17 = i19;
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            int[] iArr7 = this.f8028f;
            if (i17 >= iArr7.length) {
                i17 = iArr7.length;
                int i21 = this.f8026d * 2;
                this.f8026d = i21;
                this.k = false;
                this.j = i17 - 1;
                this.f8030h = Arrays.copyOf(this.f8030h, i21);
                this.f8028f = Arrays.copyOf(this.f8028f, this.f8026d);
                this.f8029g = Arrays.copyOf(this.f8029g, this.f8026d);
            }
            this.f8028f[i17] = solverVariable.f8011c;
            this.f8030h[i17] = f11;
            if (i14 != -1) {
                int[] iArr8 = this.f8029g;
                iArr8[i17] = iArr8[i14];
                iArr8[i14] = i17;
            } else {
                this.f8029g[i17] = this.f8031i;
                this.f8031i = i17;
            }
            solverVariable.f8019m++;
            solverVariable.a(this.f8024b);
            this.f8023a++;
            if (!this.k) {
                this.j++;
            }
            int i22 = this.j;
            int[] iArr9 = this.f8028f;
            if (i22 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    public void g() {
        int i11 = this.f8031i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            float[] fArr = this.f8030h;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f8029g[i11];
            i12++;
        }
    }

    public final float h(SolverVariable solverVariable, boolean z11) {
        if (this.f8027e == solverVariable) {
            this.f8027e = null;
        }
        int i11 = this.f8031i;
        if (i11 == -1) {
            return 0.0f;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f8023a) {
            if (this.f8028f[i11] == solverVariable.f8011c) {
                if (i11 == this.f8031i) {
                    this.f8031i = this.f8029g[i11];
                } else {
                    int[] iArr = this.f8029g;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    solverVariable.i(this.f8024b);
                }
                solverVariable.f8019m--;
                this.f8023a--;
                this.f8028f[i11] = -1;
                if (this.k) {
                    this.j = i11;
                }
                return this.f8030h[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f8029g[i11];
        }
        return 0.0f;
    }

    public int i() {
        return this.f8023a;
    }

    public float j(b bVar, boolean z11) {
        float d11 = d(bVar.f8032a);
        h(bVar.f8032a, z11);
        b.a aVar = bVar.f8036e;
        int i11 = aVar.i();
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable b11 = aVar.b(i12);
            f(b11, aVar.d(b11) * d11, z11);
        }
        return d11;
    }

    public float k(int i11) {
        int i12 = this.f8031i;
        int i13 = 0;
        while (i12 != -1 && i13 < this.f8023a) {
            if (i13 == i11) {
                return this.f8030h[i12];
            }
            i12 = this.f8029g[i12];
            i13++;
        }
        return 0.0f;
    }

    public String toString() {
        int i11 = this.f8031i;
        String str = "";
        int i12 = 0;
        while (i11 != -1 && i12 < this.f8023a) {
            str = ((str + " -> ") + this.f8030h[i11] + " : ") + this.f8025c.f8041d[this.f8028f[i11]];
            i11 = this.f8029g[i11];
            i12++;
        }
        return str;
    }
}

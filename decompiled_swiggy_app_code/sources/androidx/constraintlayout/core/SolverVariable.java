package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: r  reason: collision with root package name */
    private static int f8008r = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8009a;

    /* renamed from: b  reason: collision with root package name */
    private String f8010b;

    /* renamed from: c  reason: collision with root package name */
    public int f8011c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f8012d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8013e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f8014f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8015g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f8016h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f8017i = new float[9];
    Type j;
    b[] k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f8018l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f8019m = 0;
    boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    int f8020o = -1;

    /* renamed from: p  reason: collision with root package name */
    float f8021p = 0.0f;
    HashSet<b> q = null;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type, String str) {
        this.j = type;
    }

    static void h() {
        f8008r++;
    }

    public final void a(b bVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f8018l;
            if (i11 >= i12) {
                b[] bVarArr = this.k;
                if (i12 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i13 = this.f8018l;
                bVarArr2[i13] = bVar;
                this.f8018l = i13 + 1;
                return;
            } else if (this.k[i11] != bVar) {
                i11++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public int compareTo(SolverVariable solverVariable) {
        return this.f8011c - solverVariable.f8011c;
    }

    public final void i(b bVar) {
        int i11 = this.f8018l;
        int i12 = 0;
        while (i12 < i11) {
            if (this.k[i12] == bVar) {
                while (i12 < i11 - 1) {
                    b[] bVarArr = this.k;
                    int i13 = i12 + 1;
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
                this.f8018l--;
                return;
            }
            i12++;
        }
    }

    public void j() {
        this.f8010b = null;
        this.j = Type.UNKNOWN;
        this.f8013e = 0;
        this.f8011c = -1;
        this.f8012d = -1;
        this.f8014f = 0.0f;
        this.f8015g = false;
        this.n = false;
        this.f8020o = -1;
        this.f8021p = 0.0f;
        int i11 = this.f8018l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.k[i12] = null;
        }
        this.f8018l = 0;
        this.f8019m = 0;
        this.f8009a = false;
        Arrays.fill(this.f8017i, 0.0f);
    }

    public void k(d dVar, float f11) {
        this.f8014f = f11;
        this.f8015g = true;
        this.n = false;
        this.f8020o = -1;
        this.f8021p = 0.0f;
        int i11 = this.f8018l;
        this.f8012d = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.k[i12].A(dVar, this, false);
        }
        this.f8018l = 0;
    }

    public void l(Type type, String str) {
        this.j = type;
    }

    public final void m(d dVar, b bVar) {
        int i11 = this.f8018l;
        for (int i12 = 0; i12 < i11; i12++) {
            this.k[i12].B(dVar, bVar, false);
        }
        this.f8018l = 0;
    }

    public String toString() {
        if (this.f8010b != null) {
            return "" + this.f8010b;
        }
        return "" + this.f8011c;
    }
}

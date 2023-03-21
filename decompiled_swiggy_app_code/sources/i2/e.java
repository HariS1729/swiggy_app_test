package i2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private b f14925a;

    /* renamed from: b  reason: collision with root package name */
    private b f14926b;

    /* renamed from: c  reason: collision with root package name */
    private String f14927c;

    /* renamed from: d  reason: collision with root package name */
    private int f14928d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f14929e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f14930f = 0;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<c> f14931g = new ArrayList<>();

    /* compiled from: KeyCycleOscillator */
    class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f14946a, cVar2.f14946a);
        }
    }

    /* compiled from: KeyCycleOscillator */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f14933a;

        /* renamed from: b  reason: collision with root package name */
        h f14934b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14935c = 0;

        /* renamed from: d  reason: collision with root package name */
        private final int f14936d = 1;

        /* renamed from: e  reason: collision with root package name */
        private final int f14937e = 2;

        /* renamed from: f  reason: collision with root package name */
        float[] f14938f;

        /* renamed from: g  reason: collision with root package name */
        double[] f14939g;

        /* renamed from: h  reason: collision with root package name */
        float[] f14940h;

        /* renamed from: i  reason: collision with root package name */
        float[] f14941i;
        float[] j;
        float[] k;

        /* renamed from: l  reason: collision with root package name */
        int f14942l;

        /* renamed from: m  reason: collision with root package name */
        b f14943m;
        double[] n;

        /* renamed from: o  reason: collision with root package name */
        double[] f14944o;

        /* renamed from: p  reason: collision with root package name */
        float f14945p;

        b(int i11, String str, int i12, int i13) {
            h hVar = new h();
            this.f14934b = hVar;
            this.f14942l = i11;
            this.f14933a = i12;
            hVar.e(i11, str);
            this.f14938f = new float[i13];
            this.f14939g = new double[i13];
            this.f14940h = new float[i13];
            this.f14941i = new float[i13];
            this.j = new float[i13];
            this.k = new float[i13];
        }

        public double a(float f11) {
            b bVar = this.f14943m;
            if (bVar != null) {
                bVar.d((double) f11, this.n);
            } else {
                double[] dArr = this.n;
                dArr[0] = (double) this.f14941i[0];
                dArr[1] = (double) this.j[0];
                dArr[2] = (double) this.f14938f[0];
            }
            double[] dArr2 = this.n;
            return dArr2[0] + (this.f14934b.c((double) f11, dArr2[1]) * this.n[2]);
        }

        public void b(int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f14939g[i11] = ((double) i12) / 100.0d;
            this.f14940h[i11] = f11;
            this.f14941i[i11] = f12;
            this.j[i11] = f13;
            this.f14938f[i11] = f14;
        }

        public void c(float f11) {
            this.f14945p = f11;
            int length = this.f14939g.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.f14938f;
            this.n = new double[(fArr.length + 2)];
            this.f14944o = new double[(fArr.length + 2)];
            if (this.f14939g[0] > 0.0d) {
                this.f14934b.a(0.0d, this.f14940h[0]);
            }
            double[] dArr2 = this.f14939g;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f14934b.a(1.0d, this.f14940h[length2]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                dArr[i11][0] = (double) this.f14941i[i11];
                dArr[i11][1] = (double) this.j[i11];
                dArr[i11][2] = (double) this.f14938f[i11];
                this.f14934b.a(this.f14939g[i11], this.f14940h[i11]);
            }
            this.f14934b.d();
            double[] dArr3 = this.f14939g;
            if (dArr3.length > 1) {
                this.f14943m = b.a(0, dArr3, dArr);
            } else {
                this.f14943m = null;
            }
        }
    }

    /* compiled from: KeyCycleOscillator */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        int f14946a;

        /* renamed from: b  reason: collision with root package name */
        float f14947b;

        /* renamed from: c  reason: collision with root package name */
        float f14948c;

        /* renamed from: d  reason: collision with root package name */
        float f14949d;

        /* renamed from: e  reason: collision with root package name */
        float f14950e;

        public c(int i11, float f11, float f12, float f13, float f14) {
            this.f14946a = i11;
            this.f14947b = f14;
            this.f14948c = f12;
            this.f14949d = f11;
            this.f14950e = f13;
        }
    }

    public float a(float f11) {
        return (float) this.f14926b.a(f11);
    }

    /* access modifiers changed from: protected */
    public void b(Object obj) {
    }

    public void c(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14) {
        int i14 = i13;
        this.f14931g.add(new c(i11, f11, f12, f13, f14));
        if (i14 != -1) {
            this.f14930f = i14;
        }
        this.f14928d = i12;
        this.f14929e = str;
    }

    public void d(int i11, int i12, String str, int i13, float f11, float f12, float f13, float f14, Object obj) {
        int i14 = i13;
        this.f14931g.add(new c(i11, f11, f12, f13, f14));
        if (i14 != -1) {
            this.f14930f = i14;
        }
        this.f14928d = i12;
        b(obj);
        this.f14929e = str;
    }

    public void e(String str) {
        this.f14927c = str;
    }

    public void f(float f11) {
        int size = this.f14931g.size();
        if (size != 0) {
            Collections.sort(this.f14931g, new a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c11 = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.f14926b = new b(this.f14928d, this.f14929e, this.f14930f, size);
            Iterator<c> it2 = this.f14931g.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                c next = it2.next();
                float f12 = next.f14949d;
                dArr[i11] = ((double) f12) * 0.01d;
                double[] dArr3 = dArr2[i11];
                float f13 = next.f14947b;
                dArr3[c11] = (double) f13;
                double[] dArr4 = dArr2[i11];
                float f14 = next.f14948c;
                dArr4[1] = (double) f14;
                double[] dArr5 = dArr2[i11];
                float f15 = next.f14950e;
                dArr5[2] = (double) f15;
                this.f14926b.b(i11, next.f14946a, f12, f14, f15, f13);
                i11++;
                c11 = 0;
            }
            this.f14926b.c(f11);
            this.f14925a = b.a(0, dArr, dArr2);
        }
    }

    public boolean g() {
        return this.f14930f == 1;
    }

    public String toString() {
        String str = this.f14927c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<c> it2 = this.f14931g.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            str = str + "[" + next.f14946a + " , " + decimalFormat.format((double) next.f14947b) + "] ";
        }
        return str;
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.d;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.fontbox.afm.AFMParser;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class c {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f8792h = {0, 4, 8};

    /* renamed from: i  reason: collision with root package name */
    private static SparseIntArray f8793i = new SparseIntArray();
    private static SparseIntArray j = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    private boolean f8794a;

    /* renamed from: b  reason: collision with root package name */
    public String f8795b;

    /* renamed from: c  reason: collision with root package name */
    public String f8796c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f8797d = 0;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, ConstraintAttribute> f8798e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f8799f = true;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, a> f8800g = new HashMap<>();

    /* compiled from: ConstraintSet */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f8801a;

        /* renamed from: b  reason: collision with root package name */
        String f8802b;

        /* renamed from: c  reason: collision with root package name */
        public final d f8803c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final C0030c f8804d = new C0030c();

        /* renamed from: e  reason: collision with root package name */
        public final b f8805e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final e f8806f = new e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f8807g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        C0029a f8808h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        static class C0029a {

            /* renamed from: a  reason: collision with root package name */
            int[] f8809a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            int[] f8810b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            int f8811c = 0;

            /* renamed from: d  reason: collision with root package name */
            int[] f8812d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            float[] f8813e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            int f8814f = 0;

            /* renamed from: g  reason: collision with root package name */
            int[] f8815g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            String[] f8816h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            int f8817i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            int f8818l = 0;

            C0029a() {
            }

            /* access modifiers changed from: package-private */
            public void a(int i11, float f11) {
                int i12 = this.f8814f;
                int[] iArr = this.f8812d;
                if (i12 >= iArr.length) {
                    this.f8812d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8813e;
                    this.f8813e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8812d;
                int i13 = this.f8814f;
                iArr2[i13] = i11;
                float[] fArr2 = this.f8813e;
                this.f8814f = i13 + 1;
                fArr2[i13] = f11;
            }

            /* access modifiers changed from: package-private */
            public void b(int i11, int i12) {
                int i13 = this.f8811c;
                int[] iArr = this.f8809a;
                if (i13 >= iArr.length) {
                    this.f8809a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8810b;
                    this.f8810b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8809a;
                int i14 = this.f8811c;
                iArr3[i14] = i11;
                int[] iArr4 = this.f8810b;
                this.f8811c = i14 + 1;
                iArr4[i14] = i12;
            }

            /* access modifiers changed from: package-private */
            public void c(int i11, String str) {
                int i12 = this.f8817i;
                int[] iArr = this.f8815g;
                if (i12 >= iArr.length) {
                    this.f8815g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8816h;
                    this.f8816h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8815g;
                int i13 = this.f8817i;
                iArr2[i13] = i11;
                String[] strArr2 = this.f8816h;
                this.f8817i = i13 + 1;
                strArr2[i13] = str;
            }

            /* access modifiers changed from: package-private */
            public void d(int i11, boolean z11) {
                int i12 = this.f8818l;
                int[] iArr = this.j;
                if (i12 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i13 = this.f8818l;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.k;
                this.f8818l = i13 + 1;
                zArr2[i13] = z11;
            }

            /* access modifiers changed from: package-private */
            public void e(a aVar) {
                for (int i11 = 0; i11 < this.f8811c; i11++) {
                    c.Q(aVar, this.f8809a[i11], this.f8810b[i11]);
                }
                for (int i12 = 0; i12 < this.f8814f; i12++) {
                    c.P(aVar, this.f8812d[i12], this.f8813e[i12]);
                }
                for (int i13 = 0; i13 < this.f8817i; i13++) {
                    c.R(aVar, this.f8815g[i13], this.f8816h[i13]);
                }
                for (int i14 = 0; i14 < this.f8818l; i14++) {
                    c.S(aVar, this.j[i14], this.k[i14]);
                }
            }
        }

        /* access modifiers changed from: private */
        public void g(int i11, ConstraintLayout.b bVar) {
            this.f8801a = i11;
            b bVar2 = this.f8805e;
            bVar2.j = bVar.f8720e;
            bVar2.k = bVar.f8722f;
            bVar2.f8840l = bVar.f8724g;
            bVar2.f8842m = bVar.f8726h;
            bVar2.n = bVar.f8728i;
            bVar2.f8845o = bVar.j;
            bVar2.f8847p = bVar.k;
            bVar2.q = bVar.f8732l;
            bVar2.f8850r = bVar.f8734m;
            bVar2.f8851s = bVar.n;
            bVar2.t = bVar.f8737o;
            bVar2.f8852u = bVar.f8744s;
            bVar2.v = bVar.t;
            bVar2.f8853w = bVar.f8747u;
            bVar2.f8854x = bVar.v;
            bVar2.f8855y = bVar.G;
            bVar2.f8856z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f8739p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.f8742r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f8834h = bVar.f8716c;
            bVar2.f8830f = bVar.f8712a;
            bVar2.f8832g = bVar.f8714b;
            bVar2.f8826d = bVar.width;
            bVar2.f8828e = bVar.height;
            bVar2.H = bVar.leftMargin;
            bVar2.I = bVar.rightMargin;
            bVar2.J = bVar.topMargin;
            bVar2.K = bVar.bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f8844n0 = bVar.f8713a0;
            bVar2.f8846o0 = bVar.f8715b0;
            bVar2.Z = bVar.P;
            bVar2.f8821a0 = bVar.Q;
            bVar2.f8823b0 = bVar.T;
            bVar2.f8825c0 = bVar.U;
            bVar2.f8827d0 = bVar.R;
            bVar2.f8829e0 = bVar.S;
            bVar2.f8831f0 = bVar.V;
            bVar2.f8833g0 = bVar.W;
            bVar2.f8843m0 = bVar.f8717c0;
            bVar2.P = bVar.f8752x;
            bVar2.R = bVar.f8754z;
            bVar2.O = bVar.f8750w;
            bVar2.Q = bVar.f8753y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f8849q0 = bVar.f8719d0;
            bVar2.L = bVar.getMarginEnd();
            this.f8805e.M = bVar.getMarginStart();
        }

        /* access modifiers changed from: private */
        public void h(int i11, d.a aVar) {
            g(i11, aVar);
            this.f8803c.f8872d = aVar.f8887x0;
            e eVar = this.f8806f;
            eVar.f8876b = aVar.A0;
            eVar.f8877c = aVar.B0;
            eVar.f8878d = aVar.C0;
            eVar.f8879e = aVar.D0;
            eVar.f8880f = aVar.E0;
            eVar.f8881g = aVar.F0;
            eVar.f8882h = aVar.G0;
            eVar.j = aVar.H0;
            eVar.k = aVar.I0;
            eVar.f8884l = aVar.J0;
            eVar.n = aVar.f8889z0;
            eVar.f8885m = aVar.f8888y0;
        }

        /* access modifiers changed from: private */
        public void i(a aVar, int i11, d.a aVar2) {
            h(i11, aVar2);
            if (aVar instanceof Barrier) {
                b bVar = this.f8805e;
                bVar.f8838j0 = 1;
                Barrier barrier = (Barrier) aVar;
                bVar.f8835h0 = barrier.getType();
                this.f8805e.f8839k0 = barrier.getReferencedIds();
                this.f8805e.f8837i0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0029a aVar2 = this.f8808h;
            if (aVar2 != null) {
                aVar2.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.f8805e;
            bVar.f8720e = bVar2.j;
            bVar.f8722f = bVar2.k;
            bVar.f8724g = bVar2.f8840l;
            bVar.f8726h = bVar2.f8842m;
            bVar.f8728i = bVar2.n;
            bVar.j = bVar2.f8845o;
            bVar.k = bVar2.f8847p;
            bVar.f8732l = bVar2.q;
            bVar.f8734m = bVar2.f8850r;
            bVar.n = bVar2.f8851s;
            bVar.f8737o = bVar2.t;
            bVar.f8744s = bVar2.f8852u;
            bVar.t = bVar2.v;
            bVar.f8747u = bVar2.f8853w;
            bVar.v = bVar2.f8854x;
            bVar.leftMargin = bVar2.H;
            bVar.rightMargin = bVar2.I;
            bVar.topMargin = bVar2.J;
            bVar.bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f8752x = bVar2.P;
            bVar.f8754z = bVar2.R;
            bVar.G = bVar2.f8855y;
            bVar.H = bVar2.f8856z;
            bVar.f8739p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.f8742r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f8713a0 = bVar2.f8844n0;
            bVar.f8715b0 = bVar2.f8846o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f8821a0;
            bVar.T = bVar2.f8823b0;
            bVar.U = bVar2.f8825c0;
            bVar.R = bVar2.f8827d0;
            bVar.S = bVar2.f8829e0;
            bVar.V = bVar2.f8831f0;
            bVar.W = bVar2.f8833g0;
            bVar.Z = bVar2.G;
            bVar.f8716c = bVar2.f8834h;
            bVar.f8712a = bVar2.f8830f;
            bVar.f8714b = bVar2.f8832g;
            bVar.width = bVar2.f8826d;
            bVar.height = bVar2.f8828e;
            String str = bVar2.f8843m0;
            if (str != null) {
                bVar.f8717c0 = str;
            }
            bVar.f8719d0 = bVar2.f8849q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f8805e.L);
            bVar.b();
        }

        /* renamed from: f */
        public a clone() {
            a aVar = new a();
            aVar.f8805e.a(this.f8805e);
            aVar.f8804d.a(this.f8804d);
            aVar.f8803c.a(this.f8803c);
            aVar.f8806f.a(this.f8806f);
            aVar.f8801a = this.f8801a;
            aVar.f8808h = this.f8808h;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet */
    public static class b {

        /* renamed from: r0  reason: collision with root package name */
        private static SparseIntArray f8819r0;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8820a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f8821a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8822b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f8823b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8824c = false;

        /* renamed from: c0  reason: collision with root package name */
        public int f8825c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f8826d;

        /* renamed from: d0  reason: collision with root package name */
        public int f8827d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f8828e;

        /* renamed from: e0  reason: collision with root package name */
        public int f8829e0 = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f8830f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f8831f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public int f8832g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public float f8833g0 = 1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f8834h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f8835h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8836i = true;

        /* renamed from: i0  reason: collision with root package name */
        public int f8837i0 = 0;
        public int j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f8838j0 = -1;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f8839k0;

        /* renamed from: l  reason: collision with root package name */
        public int f8840l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f8841l0;

        /* renamed from: m  reason: collision with root package name */
        public int f8842m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public String f8843m0;
        public int n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f8844n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f8845o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f8846o0 = false;

        /* renamed from: p  reason: collision with root package name */
        public int f8847p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f8848p0 = true;
        public int q = -1;

        /* renamed from: q0  reason: collision with root package name */
        public int f8849q0 = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f8850r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f8851s = -1;
        public int t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f8852u = -1;
        public int v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f8853w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f8854x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f8855y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f8856z = 0.5f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8819r0 = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            f8819r0.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            f8819r0.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            f8819r0.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            f8819r0.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            f8819r0.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            f8819r0.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            f8819r0.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            f8819r0.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f8819r0.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            f8819r0.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            f8819r0.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            f8819r0.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            f8819r0.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            f8819r0.append(R.styleable.Layout_guidelineUseRtl, 90);
            f8819r0.append(R.styleable.Layout_android_orientation, 26);
            f8819r0.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            f8819r0.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            f8819r0.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            f8819r0.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            f8819r0.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            f8819r0.append(R.styleable.Layout_layout_goneMarginTop, 16);
            f8819r0.append(R.styleable.Layout_layout_goneMarginRight, 14);
            f8819r0.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            f8819r0.append(R.styleable.Layout_layout_goneMarginStart, 15);
            f8819r0.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            f8819r0.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            f8819r0.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            f8819r0.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            f8819r0.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            f8819r0.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            f8819r0.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            f8819r0.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            f8819r0.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            f8819r0.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            f8819r0.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            f8819r0.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            f8819r0.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            f8819r0.append(R.styleable.Layout_android_layout_marginLeft, 23);
            f8819r0.append(R.styleable.Layout_android_layout_marginRight, 27);
            f8819r0.append(R.styleable.Layout_android_layout_marginStart, 30);
            f8819r0.append(R.styleable.Layout_android_layout_marginEnd, 8);
            f8819r0.append(R.styleable.Layout_android_layout_marginTop, 33);
            f8819r0.append(R.styleable.Layout_android_layout_marginBottom, 2);
            f8819r0.append(R.styleable.Layout_android_layout_width, 22);
            f8819r0.append(R.styleable.Layout_android_layout_height, 21);
            f8819r0.append(R.styleable.Layout_layout_constraintWidth, 41);
            f8819r0.append(R.styleable.Layout_layout_constraintHeight, 42);
            f8819r0.append(R.styleable.Layout_layout_constrainedWidth, 41);
            f8819r0.append(R.styleable.Layout_layout_constrainedHeight, 42);
            f8819r0.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            f8819r0.append(R.styleable.Layout_layout_constraintCircle, 61);
            f8819r0.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            f8819r0.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            f8819r0.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            f8819r0.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            f8819r0.append(R.styleable.Layout_chainUseRtl, 71);
            f8819r0.append(R.styleable.Layout_barrierDirection, 72);
            f8819r0.append(R.styleable.Layout_barrierMargin, 73);
            f8819r0.append(R.styleable.Layout_constraint_referenced_ids, 74);
            f8819r0.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.f8820a = bVar.f8820a;
            this.f8826d = bVar.f8826d;
            this.f8822b = bVar.f8822b;
            this.f8828e = bVar.f8828e;
            this.f8830f = bVar.f8830f;
            this.f8832g = bVar.f8832g;
            this.f8834h = bVar.f8834h;
            this.f8836i = bVar.f8836i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.f8840l = bVar.f8840l;
            this.f8842m = bVar.f8842m;
            this.n = bVar.n;
            this.f8845o = bVar.f8845o;
            this.f8847p = bVar.f8847p;
            this.q = bVar.q;
            this.f8850r = bVar.f8850r;
            this.f8851s = bVar.f8851s;
            this.t = bVar.t;
            this.f8852u = bVar.f8852u;
            this.v = bVar.v;
            this.f8853w = bVar.f8853w;
            this.f8854x = bVar.f8854x;
            this.f8855y = bVar.f8855y;
            this.f8856z = bVar.f8856z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f8821a0 = bVar.f8821a0;
            this.f8823b0 = bVar.f8823b0;
            this.f8825c0 = bVar.f8825c0;
            this.f8827d0 = bVar.f8827d0;
            this.f8829e0 = bVar.f8829e0;
            this.f8831f0 = bVar.f8831f0;
            this.f8833g0 = bVar.f8833g0;
            this.f8835h0 = bVar.f8835h0;
            this.f8837i0 = bVar.f8837i0;
            this.f8838j0 = bVar.f8838j0;
            this.f8843m0 = bVar.f8843m0;
            int[] iArr = bVar.f8839k0;
            if (iArr == null || bVar.f8841l0 != null) {
                this.f8839k0 = null;
            } else {
                this.f8839k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f8841l0 = bVar.f8841l0;
            this.f8844n0 = bVar.f8844n0;
            this.f8846o0 = bVar.f8846o0;
            this.f8848p0 = bVar.f8848p0;
            this.f8849q0 = bVar.f8849q0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.f8822b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = f8819r0.get(index);
                switch (i12) {
                    case 1:
                        this.f8850r = c.H(obtainStyledAttributes, index, this.f8850r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = c.H(obtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.f8847p = c.H(obtainStyledAttributes, index, this.f8847p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f8854x = c.H(obtainStyledAttributes, index, this.f8854x);
                        break;
                    case 10:
                        this.f8853w = c.H(obtainStyledAttributes, index, this.f8853w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f8830f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8830f);
                        break;
                    case 18:
                        this.f8832g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8832g);
                        break;
                    case 19:
                        this.f8834h = obtainStyledAttributes.getFloat(index, this.f8834h);
                        break;
                    case 20:
                        this.f8855y = obtainStyledAttributes.getFloat(index, this.f8855y);
                        break;
                    case 21:
                        this.f8828e = obtainStyledAttributes.getLayoutDimension(index, this.f8828e);
                        break;
                    case 22:
                        this.f8826d = obtainStyledAttributes.getLayoutDimension(index, this.f8826d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = c.H(obtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = c.H(obtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f8840l = c.H(obtainStyledAttributes, index, this.f8840l);
                        break;
                    case 29:
                        this.f8842m = c.H(obtainStyledAttributes, index, this.f8842m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f8852u = c.H(obtainStyledAttributes, index, this.f8852u);
                        break;
                    case 32:
                        this.v = c.H(obtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f8845o = c.H(obtainStyledAttributes, index, this.f8845o);
                        break;
                    case 35:
                        this.n = c.H(obtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.f8856z = obtainStyledAttributes.getFloat(index, this.f8856z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        c.I(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.I(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.B = c.H(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.f8831f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8833g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f8835h0 = obtainStyledAttributes.getInt(index, this.f8835h0);
                                        break;
                                    case 73:
                                        this.f8837i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8837i0);
                                        break;
                                    case 74:
                                        this.f8841l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f8848p0 = obtainStyledAttributes.getBoolean(index, this.f8848p0);
                                        break;
                                    case 76:
                                        this.f8849q0 = obtainStyledAttributes.getInt(index, this.f8849q0);
                                        break;
                                    case 77:
                                        this.f8851s = c.H(obtainStyledAttributes, index, this.f8851s);
                                        break;
                                    case 78:
                                        this.t = c.H(obtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f8821a0 = obtainStyledAttributes.getInt(index, this.f8821a0);
                                        break;
                                    case 83:
                                        this.f8825c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8825c0);
                                        break;
                                    case 84:
                                        this.f8823b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8823b0);
                                        break;
                                    case 85:
                                        this.f8829e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8829e0);
                                        break;
                                    case 86:
                                        this.f8827d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8827d0);
                                        break;
                                    case 87:
                                        this.f8844n0 = obtainStyledAttributes.getBoolean(index, this.f8844n0);
                                        break;
                                    case 88:
                                        this.f8846o0 = obtainStyledAttributes.getBoolean(index, this.f8846o0);
                                        break;
                                    case 89:
                                        this.f8843m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f8836i = obtainStyledAttributes.getBoolean(index, this.f8836i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8819r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8819r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0030c {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f8857o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8858a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f8859b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f8860c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f8861d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f8862e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f8863f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f8864g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f8865h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f8866i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f8867l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f8868m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8857o = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            f8857o.append(R.styleable.Motion_pathMotionArc, 2);
            f8857o.append(R.styleable.Motion_transitionEasing, 3);
            f8857o.append(R.styleable.Motion_drawPath, 4);
            f8857o.append(R.styleable.Motion_animateRelativeTo, 5);
            f8857o.append(R.styleable.Motion_animateCircleAngleTo, 6);
            f8857o.append(R.styleable.Motion_motionStagger, 7);
            f8857o.append(R.styleable.Motion_quantizeMotionSteps, 8);
            f8857o.append(R.styleable.Motion_quantizeMotionPhase, 9);
            f8857o.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(C0030c cVar) {
            this.f8858a = cVar.f8858a;
            this.f8859b = cVar.f8859b;
            this.f8861d = cVar.f8861d;
            this.f8862e = cVar.f8862e;
            this.f8863f = cVar.f8863f;
            this.f8866i = cVar.f8866i;
            this.f8864g = cVar.f8864g;
            this.f8865h = cVar.f8865h;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.f8858a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f8857o.get(index)) {
                    case 1:
                        this.f8866i = obtainStyledAttributes.getFloat(index, this.f8866i);
                        break;
                    case 2:
                        this.f8862e = obtainStyledAttributes.getInt(index, this.f8862e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f8861d = i2.c.f14916c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f8861d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f8863f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8859b = c.H(obtainStyledAttributes, index, this.f8859b);
                        break;
                    case 6:
                        this.f8860c = obtainStyledAttributes.getInteger(index, this.f8860c);
                        break;
                    case 7:
                        this.f8864g = obtainStyledAttributes.getFloat(index, this.f8864g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 != 1) {
                            if (i12 != 3) {
                                this.f8868m = obtainStyledAttributes.getInteger(index, this.n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f8867l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f8868m = -1;
                                    break;
                                } else {
                                    this.n = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f8868m = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f8868m = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f8869a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f8870b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f8871c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f8872d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f8873e = Float.NaN;

        public void a(d dVar) {
            this.f8869a = dVar.f8869a;
            this.f8870b = dVar.f8870b;
            this.f8872d = dVar.f8872d;
            this.f8873e = dVar.f8873e;
            this.f8871c = dVar.f8871c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.f8869a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.f8872d = obtainStyledAttributes.getFloat(index, this.f8872d);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.f8870b = obtainStyledAttributes.getInt(index, this.f8870b);
                    this.f8870b = c.f8792h[this.f8870b];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.f8871c = obtainStyledAttributes.getInt(index, this.f8871c);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.f8873e = obtainStyledAttributes.getFloat(index, this.f8873e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class e {

        /* renamed from: o  reason: collision with root package name */
        private static SparseIntArray f8874o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8875a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f8876b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f8877c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f8878d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f8879e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f8880f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f8881g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f8882h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f8883i = -1;
        public float j = 0.0f;
        public float k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f8884l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f8885m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8874o = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            f8874o.append(R.styleable.Transform_android_rotationX, 2);
            f8874o.append(R.styleable.Transform_android_rotationY, 3);
            f8874o.append(R.styleable.Transform_android_scaleX, 4);
            f8874o.append(R.styleable.Transform_android_scaleY, 5);
            f8874o.append(R.styleable.Transform_android_transformPivotX, 6);
            f8874o.append(R.styleable.Transform_android_transformPivotY, 7);
            f8874o.append(R.styleable.Transform_android_translationX, 8);
            f8874o.append(R.styleable.Transform_android_translationY, 9);
            f8874o.append(R.styleable.Transform_android_translationZ, 10);
            f8874o.append(R.styleable.Transform_android_elevation, 11);
            f8874o.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.f8875a = eVar.f8875a;
            this.f8876b = eVar.f8876b;
            this.f8877c = eVar.f8877c;
            this.f8878d = eVar.f8878d;
            this.f8879e = eVar.f8879e;
            this.f8880f = eVar.f8880f;
            this.f8881g = eVar.f8881g;
            this.f8882h = eVar.f8882h;
            this.f8883i = eVar.f8883i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.f8884l = eVar.f8884l;
            this.f8885m = eVar.f8885m;
            this.n = eVar.n;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.f8875a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f8874o.get(index)) {
                    case 1:
                        this.f8876b = obtainStyledAttributes.getFloat(index, this.f8876b);
                        break;
                    case 2:
                        this.f8877c = obtainStyledAttributes.getFloat(index, this.f8877c);
                        break;
                    case 3:
                        this.f8878d = obtainStyledAttributes.getFloat(index, this.f8878d);
                        break;
                    case 4:
                        this.f8879e = obtainStyledAttributes.getFloat(index, this.f8879e);
                        break;
                    case 5:
                        this.f8880f = obtainStyledAttributes.getFloat(index, this.f8880f);
                        break;
                    case 6:
                        this.f8881g = obtainStyledAttributes.getDimension(index, this.f8881g);
                        break;
                    case 7:
                        this.f8882h = obtainStyledAttributes.getDimension(index, this.f8882h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.f8884l = obtainStyledAttributes.getDimension(index, this.f8884l);
                        break;
                    case 11:
                        this.f8885m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.f8883i = c.H(obtainStyledAttributes, index, this.f8883i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f8793i.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        f8793i.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        f8793i.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        f8793i.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        f8793i.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        f8793i.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        f8793i.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        f8793i.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        f8793i.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f8793i.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        f8793i.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f8793i.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        f8793i.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        f8793i.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        f8793i.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        f8793i.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        f8793i.append(R.styleable.Constraint_guidelineUseRtl, 99);
        f8793i.append(R.styleable.Constraint_android_orientation, 27);
        f8793i.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        f8793i.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        f8793i.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        f8793i.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        f8793i.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        f8793i.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        f8793i.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        f8793i.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        f8793i.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        f8793i.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        f8793i.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        f8793i.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        f8793i.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f8793i.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        f8793i.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        f8793i.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        f8793i.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        f8793i.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        f8793i.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        f8793i.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        f8793i.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        f8793i.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        f8793i.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        f8793i.append(R.styleable.Constraint_android_layout_marginRight, 28);
        f8793i.append(R.styleable.Constraint_android_layout_marginStart, 31);
        f8793i.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        f8793i.append(R.styleable.Constraint_android_layout_marginTop, 34);
        f8793i.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        f8793i.append(R.styleable.Constraint_android_layout_width, 23);
        f8793i.append(R.styleable.Constraint_android_layout_height, 21);
        f8793i.append(R.styleable.Constraint_layout_constraintWidth, 95);
        f8793i.append(R.styleable.Constraint_layout_constraintHeight, 96);
        f8793i.append(R.styleable.Constraint_android_visibility, 22);
        f8793i.append(R.styleable.Constraint_android_alpha, 43);
        f8793i.append(R.styleable.Constraint_android_elevation, 44);
        f8793i.append(R.styleable.Constraint_android_rotationX, 45);
        f8793i.append(R.styleable.Constraint_android_rotationY, 46);
        f8793i.append(R.styleable.Constraint_android_rotation, 60);
        f8793i.append(R.styleable.Constraint_android_scaleX, 47);
        f8793i.append(R.styleable.Constraint_android_scaleY, 48);
        f8793i.append(R.styleable.Constraint_android_transformPivotX, 49);
        f8793i.append(R.styleable.Constraint_android_transformPivotY, 50);
        f8793i.append(R.styleable.Constraint_android_translationX, 51);
        f8793i.append(R.styleable.Constraint_android_translationY, 52);
        f8793i.append(R.styleable.Constraint_android_translationZ, 53);
        f8793i.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        f8793i.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        f8793i.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        f8793i.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        f8793i.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        f8793i.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        f8793i.append(R.styleable.Constraint_layout_constraintCircle, 61);
        f8793i.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        f8793i.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        f8793i.append(R.styleable.Constraint_animateRelativeTo, 64);
        f8793i.append(R.styleable.Constraint_transitionEasing, 65);
        f8793i.append(R.styleable.Constraint_drawPath, 66);
        f8793i.append(R.styleable.Constraint_transitionPathRotate, 67);
        f8793i.append(R.styleable.Constraint_motionStagger, 79);
        f8793i.append(R.styleable.Constraint_android_id, 38);
        f8793i.append(R.styleable.Constraint_motionProgress, 68);
        f8793i.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        f8793i.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        f8793i.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        f8793i.append(R.styleable.Constraint_chainUseRtl, 71);
        f8793i.append(R.styleable.Constraint_barrierDirection, 72);
        f8793i.append(R.styleable.Constraint_barrierMargin, 73);
        f8793i.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        f8793i.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        f8793i.append(R.styleable.Constraint_pathMotionArc, 76);
        f8793i.append(R.styleable.Constraint_layout_constraintTag, 77);
        f8793i.append(R.styleable.Constraint_visibilityMode, 78);
        f8793i.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        f8793i.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        f8793i.append(R.styleable.Constraint_polarRelativeTo, 82);
        f8793i.append(R.styleable.Constraint_transformPivotTarget, 83);
        f8793i.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        f8793i.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        f8793i.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = j;
        int i11 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i11, 6);
        j.append(i11, 7);
        j.append(R.styleable.ConstraintOverride_android_orientation, 27);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        j.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        j.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        j.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        j.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        j.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        j.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        j.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        j.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        j.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        j.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        j.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        j.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        j.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        j.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        j.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        j.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        j.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        j.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        j.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        j.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        j.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        j.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        j.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        j.append(R.styleable.ConstraintOverride_android_visibility, 22);
        j.append(R.styleable.ConstraintOverride_android_alpha, 43);
        j.append(R.styleable.ConstraintOverride_android_elevation, 44);
        j.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        j.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        j.append(R.styleable.ConstraintOverride_android_rotation, 60);
        j.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        j.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        j.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        j.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        j.append(R.styleable.ConstraintOverride_android_translationX, 51);
        j.append(R.styleable.ConstraintOverride_android_translationY, 52);
        j.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        j.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        j.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        j.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        j.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        j.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        j.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        j.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        j.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        j.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        j.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        j.append(R.styleable.ConstraintOverride_drawPath, 66);
        j.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        j.append(R.styleable.ConstraintOverride_motionStagger, 79);
        j.append(R.styleable.ConstraintOverride_android_id, 38);
        j.append(R.styleable.ConstraintOverride_motionTarget, 98);
        j.append(R.styleable.ConstraintOverride_motionProgress, 68);
        j.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        j.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        j.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        j.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        j.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        j.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        j.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        j.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        j.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        j.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        j.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        j.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        j.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        j.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        j.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        j.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        j.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        j.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* access modifiers changed from: private */
    public static int H(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        return resourceId == -1 ? typedArray.getInt(i11, -1) : resourceId;
    }

    static void I(Object obj, TypedArray typedArray, int i11, int i12) {
        if (obj != null) {
            int i13 = typedArray.peekValue(i11).type;
            if (i13 != 3) {
                int i14 = -2;
                boolean z11 = false;
                if (i13 != 5) {
                    int i15 = typedArray.getInt(i11, 0);
                    if (i15 != -4) {
                        i14 = (i15 == -3 || !(i15 == -2 || i15 == -1)) ? 0 : i15;
                    } else {
                        z11 = true;
                    }
                } else {
                    i14 = typedArray.getDimensionPixelSize(i11, 0);
                }
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i12 == 0) {
                        bVar.width = i14;
                        bVar.f8713a0 = z11;
                        return;
                    }
                    bVar.height = i14;
                    bVar.f8715b0 = z11;
                } else if (obj instanceof b) {
                    b bVar2 = (b) obj;
                    if (i12 == 0) {
                        bVar2.f8826d = i14;
                        bVar2.f8844n0 = z11;
                        return;
                    }
                    bVar2.f8828e = i14;
                    bVar2.f8846o0 = z11;
                } else if (obj instanceof a.C0029a) {
                    a.C0029a aVar = (a.C0029a) obj;
                    if (i12 == 0) {
                        aVar.b(23, i14);
                        aVar.d(80, z11);
                        return;
                    }
                    aVar.b(21, i14);
                    aVar.d(81, z11);
                }
            } else {
                J(obj, typedArray.getString(i11), i12);
            }
        }
    }

    static void J(Object obj, String str, int i11) {
        if (str != null) {
            int indexOf = str.indexOf(61);
            int length = str.length();
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    String trim = substring.trim();
                    String trim2 = substring2.trim();
                    if ("ratio".equalsIgnoreCase(trim)) {
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                            if (i11 == 0) {
                                bVar.width = 0;
                            } else {
                                bVar.height = 0;
                            }
                            K(bVar, trim2);
                        } else if (obj instanceof b) {
                            ((b) obj).A = trim2;
                        } else if (obj instanceof a.C0029a) {
                            ((a.C0029a) obj).c(5, trim2);
                        }
                    } else if ("weight".equalsIgnoreCase(trim)) {
                        try {
                            float parseFloat = Float.parseFloat(trim2);
                            if (obj instanceof ConstraintLayout.b) {
                                ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                                if (i11 == 0) {
                                    bVar2.width = 0;
                                    bVar2.L = parseFloat;
                                    return;
                                }
                                bVar2.height = 0;
                                bVar2.M = parseFloat;
                            } else if (obj instanceof b) {
                                b bVar3 = (b) obj;
                                if (i11 == 0) {
                                    bVar3.f8826d = 0;
                                    bVar3.W = parseFloat;
                                    return;
                                }
                                bVar3.f8828e = 0;
                                bVar3.V = parseFloat;
                            } else if (obj instanceof a.C0029a) {
                                a.C0029a aVar = (a.C0029a) obj;
                                if (i11 == 0) {
                                    aVar.b(23, 0);
                                    aVar.a(39, parseFloat);
                                    return;
                                }
                                aVar.b(21, 0);
                                aVar.a(40, parseFloat);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i11 == 0) {
                                bVar4.width = 0;
                                bVar4.V = max;
                                bVar4.P = 2;
                                return;
                            }
                            bVar4.height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i11 == 0) {
                                bVar5.f8826d = 0;
                                bVar5.f8831f0 = max;
                                bVar5.Z = 2;
                                return;
                            }
                            bVar5.f8828e = 0;
                            bVar5.f8833g0 = max;
                            bVar5.f8821a0 = 2;
                        } else if (obj instanceof a.C0029a) {
                            a.C0029a aVar2 = (a.C0029a) obj;
                            if (i11 == 0) {
                                aVar2.b(23, 0);
                                aVar2.b(54, 2);
                                return;
                            }
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            }
        }
    }

    static void K(ConstraintLayout.b bVar, String str) {
        float f11 = Float.NaN;
        int i11 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(AFMParser.CHARMETRICS_W)) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase(StandardStructureTypes.H)) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i12);
                if (substring2.length() > 0) {
                    f11 = Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i12, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f11 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.I = str;
        bVar.J = f11;
        bVar.K = i11;
    }

    private void L(Context context, a aVar, TypedArray typedArray, boolean z11) {
        if (z11) {
            M(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (!(index == R.styleable.Constraint_android_id || R.styleable.Constraint_android_layout_marginStart == index || R.styleable.Constraint_android_layout_marginEnd == index)) {
                aVar.f8804d.f8858a = true;
                aVar.f8805e.f8822b = true;
                aVar.f8803c.f8869a = true;
                aVar.f8806f.f8875a = true;
            }
            switch (f8793i.get(index)) {
                case 1:
                    b bVar = aVar.f8805e;
                    bVar.f8850r = H(typedArray, index, bVar.f8850r);
                    break;
                case 2:
                    b bVar2 = aVar.f8805e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f8805e;
                    bVar3.q = H(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.f8805e;
                    bVar4.f8847p = H(typedArray, index, bVar4.f8847p);
                    break;
                case 5:
                    aVar.f8805e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f8805e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f8805e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f8805e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f8805e;
                    bVar8.f8854x = H(typedArray, index, bVar8.f8854x);
                    break;
                case 10:
                    b bVar9 = aVar.f8805e;
                    bVar9.f8853w = H(typedArray, index, bVar9.f8853w);
                    break;
                case 11:
                    b bVar10 = aVar.f8805e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f8805e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f8805e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f8805e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f8805e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f8805e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f8805e;
                    bVar16.f8830f = typedArray.getDimensionPixelOffset(index, bVar16.f8830f);
                    break;
                case 18:
                    b bVar17 = aVar.f8805e;
                    bVar17.f8832g = typedArray.getDimensionPixelOffset(index, bVar17.f8832g);
                    break;
                case 19:
                    b bVar18 = aVar.f8805e;
                    bVar18.f8834h = typedArray.getFloat(index, bVar18.f8834h);
                    break;
                case 20:
                    b bVar19 = aVar.f8805e;
                    bVar19.f8855y = typedArray.getFloat(index, bVar19.f8855y);
                    break;
                case 21:
                    b bVar20 = aVar.f8805e;
                    bVar20.f8828e = typedArray.getLayoutDimension(index, bVar20.f8828e);
                    break;
                case 22:
                    d dVar = aVar.f8803c;
                    dVar.f8870b = typedArray.getInt(index, dVar.f8870b);
                    d dVar2 = aVar.f8803c;
                    dVar2.f8870b = f8792h[dVar2.f8870b];
                    break;
                case 23:
                    b bVar21 = aVar.f8805e;
                    bVar21.f8826d = typedArray.getLayoutDimension(index, bVar21.f8826d);
                    break;
                case 24:
                    b bVar22 = aVar.f8805e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f8805e;
                    bVar23.j = H(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.f8805e;
                    bVar24.k = H(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.f8805e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f8805e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f8805e;
                    bVar27.f8840l = H(typedArray, index, bVar27.f8840l);
                    break;
                case 30:
                    b bVar28 = aVar.f8805e;
                    bVar28.f8842m = H(typedArray, index, bVar28.f8842m);
                    break;
                case 31:
                    b bVar29 = aVar.f8805e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f8805e;
                    bVar30.f8852u = H(typedArray, index, bVar30.f8852u);
                    break;
                case 33:
                    b bVar31 = aVar.f8805e;
                    bVar31.v = H(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.f8805e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f8805e;
                    bVar33.f8845o = H(typedArray, index, bVar33.f8845o);
                    break;
                case 36:
                    b bVar34 = aVar.f8805e;
                    bVar34.n = H(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.f8805e;
                    bVar35.f8856z = typedArray.getFloat(index, bVar35.f8856z);
                    break;
                case 38:
                    aVar.f8801a = typedArray.getResourceId(index, aVar.f8801a);
                    break;
                case 39:
                    b bVar36 = aVar.f8805e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f8805e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f8805e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f8805e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.f8803c;
                    dVar3.f8872d = typedArray.getFloat(index, dVar3.f8872d);
                    break;
                case 44:
                    e eVar = aVar.f8806f;
                    eVar.f8885m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f8806f;
                    eVar2.f8877c = typedArray.getFloat(index, eVar2.f8877c);
                    break;
                case 46:
                    e eVar3 = aVar.f8806f;
                    eVar3.f8878d = typedArray.getFloat(index, eVar3.f8878d);
                    break;
                case 47:
                    e eVar4 = aVar.f8806f;
                    eVar4.f8879e = typedArray.getFloat(index, eVar4.f8879e);
                    break;
                case 48:
                    e eVar5 = aVar.f8806f;
                    eVar5.f8880f = typedArray.getFloat(index, eVar5.f8880f);
                    break;
                case 49:
                    e eVar6 = aVar.f8806f;
                    eVar6.f8881g = typedArray.getDimension(index, eVar6.f8881g);
                    break;
                case 50:
                    e eVar7 = aVar.f8806f;
                    eVar7.f8882h = typedArray.getDimension(index, eVar7.f8882h);
                    break;
                case 51:
                    e eVar8 = aVar.f8806f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f8806f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    e eVar10 = aVar.f8806f;
                    eVar10.f8884l = typedArray.getDimension(index, eVar10.f8884l);
                    break;
                case 54:
                    b bVar40 = aVar.f8805e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f8805e;
                    bVar41.f8821a0 = typedArray.getInt(index, bVar41.f8821a0);
                    break;
                case 56:
                    b bVar42 = aVar.f8805e;
                    bVar42.f8823b0 = typedArray.getDimensionPixelSize(index, bVar42.f8823b0);
                    break;
                case 57:
                    b bVar43 = aVar.f8805e;
                    bVar43.f8825c0 = typedArray.getDimensionPixelSize(index, bVar43.f8825c0);
                    break;
                case 58:
                    b bVar44 = aVar.f8805e;
                    bVar44.f8827d0 = typedArray.getDimensionPixelSize(index, bVar44.f8827d0);
                    break;
                case 59:
                    b bVar45 = aVar.f8805e;
                    bVar45.f8829e0 = typedArray.getDimensionPixelSize(index, bVar45.f8829e0);
                    break;
                case 60:
                    e eVar11 = aVar.f8806f;
                    eVar11.f8876b = typedArray.getFloat(index, eVar11.f8876b);
                    break;
                case 61:
                    b bVar46 = aVar.f8805e;
                    bVar46.B = H(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f8805e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f8805e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0030c cVar = aVar.f8804d;
                    cVar.f8859b = H(typedArray, index, cVar.f8859b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f8804d.f8861d = i2.c.f14916c[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f8804d.f8861d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f8804d.f8863f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0030c cVar2 = aVar.f8804d;
                    cVar2.f8866i = typedArray.getFloat(index, cVar2.f8866i);
                    break;
                case 68:
                    d dVar4 = aVar.f8803c;
                    dVar4.f8873e = typedArray.getFloat(index, dVar4.f8873e);
                    break;
                case 69:
                    aVar.f8805e.f8831f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f8805e.f8833g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f8805e;
                    bVar49.f8835h0 = typedArray.getInt(index, bVar49.f8835h0);
                    break;
                case 73:
                    b bVar50 = aVar.f8805e;
                    bVar50.f8837i0 = typedArray.getDimensionPixelSize(index, bVar50.f8837i0);
                    break;
                case 74:
                    aVar.f8805e.f8841l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f8805e;
                    bVar51.f8848p0 = typedArray.getBoolean(index, bVar51.f8848p0);
                    break;
                case 76:
                    C0030c cVar3 = aVar.f8804d;
                    cVar3.f8862e = typedArray.getInt(index, cVar3.f8862e);
                    break;
                case 77:
                    aVar.f8805e.f8843m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f8803c;
                    dVar5.f8871c = typedArray.getInt(index, dVar5.f8871c);
                    break;
                case 79:
                    C0030c cVar4 = aVar.f8804d;
                    cVar4.f8864g = typedArray.getFloat(index, cVar4.f8864g);
                    break;
                case 80:
                    b bVar52 = aVar.f8805e;
                    bVar52.f8844n0 = typedArray.getBoolean(index, bVar52.f8844n0);
                    break;
                case 81:
                    b bVar53 = aVar.f8805e;
                    bVar53.f8846o0 = typedArray.getBoolean(index, bVar53.f8846o0);
                    break;
                case 82:
                    C0030c cVar5 = aVar.f8804d;
                    cVar5.f8860c = typedArray.getInteger(index, cVar5.f8860c);
                    break;
                case 83:
                    e eVar12 = aVar.f8806f;
                    eVar12.f8883i = H(typedArray, index, eVar12.f8883i);
                    break;
                case 84:
                    C0030c cVar6 = aVar.f8804d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    C0030c cVar7 = aVar.f8804d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 != 1) {
                        if (i12 != 3) {
                            C0030c cVar8 = aVar.f8804d;
                            cVar8.f8868m = typedArray.getInteger(index, cVar8.n);
                            break;
                        } else {
                            aVar.f8804d.f8867l = typedArray.getString(index);
                            if (aVar.f8804d.f8867l.indexOf("/") <= 0) {
                                aVar.f8804d.f8868m = -1;
                                break;
                            } else {
                                aVar.f8804d.n = typedArray.getResourceId(index, -1);
                                aVar.f8804d.f8868m = -2;
                                break;
                            }
                        }
                    } else {
                        aVar.f8804d.n = typedArray.getResourceId(index, -1);
                        C0030c cVar9 = aVar.f8804d;
                        if (cVar9.n == -1) {
                            break;
                        } else {
                            cVar9.f8868m = -2;
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8793i.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f8805e;
                    bVar54.f8851s = H(typedArray, index, bVar54.f8851s);
                    break;
                case 92:
                    b bVar55 = aVar.f8805e;
                    bVar55.t = H(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.f8805e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f8805e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    I(aVar.f8805e, typedArray, index, 0);
                    break;
                case 96:
                    I(aVar.f8805e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f8805e;
                    bVar58.f8849q0 = typedArray.getInt(index, bVar58.f8849q0);
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8793i.get(index));
                    break;
            }
        }
        b bVar59 = aVar.f8805e;
        if (bVar59.f8841l0 != null) {
            bVar59.f8839k0 = null;
        }
    }

    private static void M(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0029a aVar2 = new a.C0029a();
        aVar.f8808h = aVar2;
        aVar.f8804d.f8858a = false;
        aVar.f8805e.f8822b = false;
        aVar.f8803c.f8869a = false;
        aVar.f8806f.f8875a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            switch (j.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.f8805e.K));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.f8805e.E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.f8805e.F));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.f8805e.L));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.f8805e.R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.f8805e.S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.f8805e.O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.f8805e.Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.f8805e.T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.f8805e.P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.f8805e.f8830f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.f8805e.f8832g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.f8805e.f8834h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.f8805e.f8855y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.f8805e.f8828e));
                    break;
                case 22:
                    aVar2.b(22, f8792h[typedArray.getInt(index, aVar.f8803c.f8870b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.f8805e.f8826d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.f8805e.H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.f8805e.G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.f8805e.I));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.f8805e.M));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.f8805e.J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.f8805e.f8856z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f8801a);
                    aVar.f8801a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.f8805e.W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.f8805e.V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.f8805e.X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.f8805e.Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.f8803c.f8872d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f8806f.n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f8806f.f8877c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f8806f.f8878d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f8806f.f8879e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f8806f.f8880f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f8806f.f8881g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f8806f.f8882h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f8806f.j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f8806f.k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f8806f.f8884l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.f8805e.Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.f8805e.f8821a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.f8805e.f8823b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.f8805e.f8825c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.f8805e.f8827d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.f8805e.f8829e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f8806f.f8876b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.f8805e.C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.f8805e.D));
                    break;
                case 64:
                    aVar2.b(64, H(typedArray, index, aVar.f8804d.f8859b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, i2.c.f14916c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.f8804d.f8866i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.f8803c.f8873e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.f8805e.f8835h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.f8805e.f8837i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.f8805e.f8848p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.f8804d.f8862e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.f8803c.f8871c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.f8804d.f8864g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.f8805e.f8844n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.f8805e.f8846o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.f8804d.f8860c));
                    break;
                case 83:
                    aVar2.b(83, H(typedArray, index, aVar.f8806f.f8883i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.f8804d.k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.f8804d.j));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 != 1) {
                        if (i12 != 3) {
                            C0030c cVar = aVar.f8804d;
                            cVar.f8868m = typedArray.getInteger(index, cVar.n);
                            aVar2.b(88, aVar.f8804d.f8868m);
                            break;
                        } else {
                            aVar.f8804d.f8867l = typedArray.getString(index);
                            aVar2.c(90, aVar.f8804d.f8867l);
                            if (aVar.f8804d.f8867l.indexOf("/") <= 0) {
                                aVar.f8804d.f8868m = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.f8804d.n = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.f8804d.n);
                                aVar.f8804d.f8868m = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f8804d.n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.f8804d.n);
                        C0030c cVar2 = aVar.f8804d;
                        if (cVar2.n == -1) {
                            break;
                        } else {
                            cVar2.f8868m = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8793i.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.f8805e.N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.f8805e.U));
                    break;
                case 95:
                    I(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    I(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.f8805e.f8849q0));
                    break;
                case 98:
                    if (!MotionLayout.f8375p1) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f8801a = typedArray.getResourceId(index, aVar.f8801a);
                            break;
                        } else {
                            aVar.f8802b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f8801a);
                        aVar.f8801a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f8802b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.f8805e.f8836i));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8793i.get(index));
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void P(a aVar, int i11, float f11) {
        if (i11 == 19) {
            aVar.f8805e.f8834h = f11;
        } else if (i11 == 20) {
            aVar.f8805e.f8855y = f11;
        } else if (i11 == 37) {
            aVar.f8805e.f8856z = f11;
        } else if (i11 == 60) {
            aVar.f8806f.f8876b = f11;
        } else if (i11 == 63) {
            aVar.f8805e.D = f11;
        } else if (i11 == 79) {
            aVar.f8804d.f8864g = f11;
        } else if (i11 == 85) {
            aVar.f8804d.j = f11;
        } else if (i11 == 87) {
        } else {
            if (i11 == 39) {
                aVar.f8805e.W = f11;
            } else if (i11 != 40) {
                switch (i11) {
                    case 43:
                        aVar.f8803c.f8872d = f11;
                        return;
                    case 44:
                        e eVar = aVar.f8806f;
                        eVar.n = f11;
                        eVar.f8885m = true;
                        return;
                    case 45:
                        aVar.f8806f.f8877c = f11;
                        return;
                    case 46:
                        aVar.f8806f.f8878d = f11;
                        return;
                    case 47:
                        aVar.f8806f.f8879e = f11;
                        return;
                    case 48:
                        aVar.f8806f.f8880f = f11;
                        return;
                    case 49:
                        aVar.f8806f.f8881g = f11;
                        return;
                    case 50:
                        aVar.f8806f.f8882h = f11;
                        return;
                    case 51:
                        aVar.f8806f.j = f11;
                        return;
                    case 52:
                        aVar.f8806f.k = f11;
                        return;
                    case 53:
                        aVar.f8806f.f8884l = f11;
                        return;
                    default:
                        switch (i11) {
                            case 67:
                                aVar.f8804d.f8866i = f11;
                                return;
                            case 68:
                                aVar.f8803c.f8873e = f11;
                                return;
                            case 69:
                                aVar.f8805e.f8831f0 = f11;
                                return;
                            case 70:
                                aVar.f8805e.f8833g0 = f11;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            } else {
                aVar.f8805e.V = f11;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void Q(a aVar, int i11, int i12) {
        if (i11 == 6) {
            aVar.f8805e.E = i12;
        } else if (i11 == 7) {
            aVar.f8805e.F = i12;
        } else if (i11 == 8) {
            aVar.f8805e.L = i12;
        } else if (i11 == 27) {
            aVar.f8805e.G = i12;
        } else if (i11 == 28) {
            aVar.f8805e.I = i12;
        } else if (i11 == 41) {
            aVar.f8805e.X = i12;
        } else if (i11 == 42) {
            aVar.f8805e.Y = i12;
        } else if (i11 == 61) {
            aVar.f8805e.B = i12;
        } else if (i11 == 62) {
            aVar.f8805e.C = i12;
        } else if (i11 == 72) {
            aVar.f8805e.f8835h0 = i12;
        } else if (i11 != 73) {
            switch (i11) {
                case 2:
                    aVar.f8805e.K = i12;
                    return;
                case 11:
                    aVar.f8805e.R = i12;
                    return;
                case 12:
                    aVar.f8805e.S = i12;
                    return;
                case 13:
                    aVar.f8805e.O = i12;
                    return;
                case 14:
                    aVar.f8805e.Q = i12;
                    return;
                case 15:
                    aVar.f8805e.T = i12;
                    return;
                case 16:
                    aVar.f8805e.P = i12;
                    return;
                case 17:
                    aVar.f8805e.f8830f = i12;
                    return;
                case 18:
                    aVar.f8805e.f8832g = i12;
                    return;
                case 31:
                    aVar.f8805e.M = i12;
                    return;
                case 34:
                    aVar.f8805e.J = i12;
                    return;
                case 38:
                    aVar.f8801a = i12;
                    return;
                case 64:
                    aVar.f8804d.f8859b = i12;
                    return;
                case 66:
                    aVar.f8804d.f8863f = i12;
                    return;
                case 76:
                    aVar.f8804d.f8862e = i12;
                    return;
                case 78:
                    aVar.f8803c.f8871c = i12;
                    return;
                case 93:
                    aVar.f8805e.N = i12;
                    return;
                case 94:
                    aVar.f8805e.U = i12;
                    return;
                case 97:
                    aVar.f8805e.f8849q0 = i12;
                    return;
                default:
                    switch (i11) {
                        case 21:
                            aVar.f8805e.f8828e = i12;
                            return;
                        case 22:
                            aVar.f8803c.f8870b = i12;
                            return;
                        case 23:
                            aVar.f8805e.f8826d = i12;
                            return;
                        case 24:
                            aVar.f8805e.H = i12;
                            return;
                        default:
                            switch (i11) {
                                case 54:
                                    aVar.f8805e.Z = i12;
                                    return;
                                case 55:
                                    aVar.f8805e.f8821a0 = i12;
                                    return;
                                case 56:
                                    aVar.f8805e.f8823b0 = i12;
                                    return;
                                case 57:
                                    aVar.f8805e.f8825c0 = i12;
                                    return;
                                case 58:
                                    aVar.f8805e.f8827d0 = i12;
                                    return;
                                case 59:
                                    aVar.f8805e.f8829e0 = i12;
                                    return;
                                default:
                                    switch (i11) {
                                        case 82:
                                            aVar.f8804d.f8860c = i12;
                                            return;
                                        case 83:
                                            aVar.f8806f.f8883i = i12;
                                            return;
                                        case 84:
                                            aVar.f8804d.k = i12;
                                            return;
                                        default:
                                            switch (i11) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    aVar.f8804d.f8868m = i12;
                                                    return;
                                                case 89:
                                                    aVar.f8804d.n = i12;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            aVar.f8805e.f8837i0 = i12;
        }
    }

    /* access modifiers changed from: private */
    public static void R(a aVar, int i11, String str) {
        if (i11 == 5) {
            aVar.f8805e.A = str;
        } else if (i11 == 65) {
            aVar.f8804d.f8861d = str;
        } else if (i11 == 74) {
            b bVar = aVar.f8805e;
            bVar.f8841l0 = str;
            bVar.f8839k0 = null;
        } else if (i11 == 77) {
            aVar.f8805e.f8843m0 = str;
        } else if (i11 == 87) {
        } else {
            if (i11 != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f8804d.f8867l = str;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void S(a aVar, int i11, boolean z11) {
        if (i11 == 44) {
            aVar.f8806f.f8885m = z11;
        } else if (i11 == 75) {
            aVar.f8805e.f8848p0 = z11;
        } else if (i11 == 87) {
        } else {
            if (i11 == 80) {
                aVar.f8805e.f8844n0 = z11;
            } else if (i11 != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                aVar.f8805e.f8846o0 = z11;
            }
        }
    }

    private String X(int i11) {
        switch (i11) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        M(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] v(View view, String str) {
        int i11;
        Object s11;
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i11 = R.id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i11 = 0;
            }
            if (i11 == 0) {
                i11 = context.getResources().getIdentifier(trim, DistributedTracing.NR_ID_ATTRIBUTE, context.getPackageName());
            }
            if (i11 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (s11 = ((ConstraintLayout) view.getParent()).s(0, trim)) != null && (s11 instanceof Integer)) {
                i11 = ((Integer) s11).intValue();
            }
            iArr[i13] = i11;
            i12++;
            i13++;
        }
        return i13 != split.length ? Arrays.copyOf(iArr, i13) : iArr;
    }

    private a w(Context context, AttributeSet attributeSet, boolean z11) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z11 ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        L(context, aVar, obtainStyledAttributes, z11);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a x(int i11) {
        if (!this.f8800g.containsKey(Integer.valueOf(i11))) {
            this.f8800g.put(Integer.valueOf(i11), new a());
        }
        return this.f8800g.get(Integer.valueOf(i11));
    }

    public int[] A() {
        Integer[] numArr = (Integer[]) this.f8800g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    public a B(int i11) {
        return x(i11);
    }

    public int C(int i11) {
        return x(i11).f8803c.f8870b;
    }

    public int D(int i11) {
        return x(i11).f8803c.f8871c;
    }

    public int E(int i11) {
        return x(i11).f8805e.f8826d;
    }

    public void F(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a w11 = w(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        w11.f8805e.f8820a = true;
                    }
                    this.f8800g.put(Integer.valueOf(w11.f8801a), w11);
                }
            }
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.f8800g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f8801a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.f8807g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.ConstraintAttribute.i(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.c$c r0 = r2.f8804d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.c$b r0 = r2.f8805e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.c$e r0 = r2.f8806f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.c$d r0 = r2.f8803c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.w(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$b r2 = r0.f8805e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f8838j0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.w(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$b r2 = r0.f8805e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f8820a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f8822b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.w(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.c$a r0 = r9.w(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.G(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void N(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f8799f || id2 != -1) {
                if (!this.f8800g.containsKey(Integer.valueOf(id2))) {
                    this.f8800g.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f8800g.get(Integer.valueOf(id2));
                if (aVar != null) {
                    if (!aVar.f8805e.f8822b) {
                        aVar.g(id2, bVar);
                        if (childAt instanceof a) {
                            aVar.f8805e.f8839k0 = ((a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                aVar.f8805e.f8848p0 = barrier.getAllowsGoneWidget();
                                aVar.f8805e.f8835h0 = barrier.getType();
                                aVar.f8805e.f8837i0 = barrier.getMargin();
                            }
                        }
                        aVar.f8805e.f8822b = true;
                    }
                    d dVar = aVar.f8803c;
                    if (!dVar.f8869a) {
                        dVar.f8870b = childAt.getVisibility();
                        aVar.f8803c.f8872d = childAt.getAlpha();
                        aVar.f8803c.f8869a = true;
                    }
                    e eVar = aVar.f8806f;
                    if (!eVar.f8875a) {
                        eVar.f8875a = true;
                        eVar.f8876b = childAt.getRotation();
                        aVar.f8806f.f8877c = childAt.getRotationX();
                        aVar.f8806f.f8878d = childAt.getRotationY();
                        aVar.f8806f.f8879e = childAt.getScaleX();
                        aVar.f8806f.f8880f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            e eVar2 = aVar.f8806f;
                            eVar2.f8881g = pivotX;
                            eVar2.f8882h = pivotY;
                        }
                        aVar.f8806f.j = childAt.getTranslationX();
                        aVar.f8806f.k = childAt.getTranslationY();
                        aVar.f8806f.f8884l = childAt.getTranslationZ();
                        e eVar3 = aVar.f8806f;
                        if (eVar3.f8885m) {
                            eVar3.n = childAt.getElevation();
                        }
                    }
                }
                i11++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void O(c cVar) {
        for (Integer next : cVar.f8800g.keySet()) {
            int intValue = next.intValue();
            a aVar = cVar.f8800g.get(next);
            if (!this.f8800g.containsKey(Integer.valueOf(intValue))) {
                this.f8800g.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f8800g.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.f8805e;
                if (!bVar.f8822b) {
                    bVar.a(aVar.f8805e);
                }
                d dVar = aVar2.f8803c;
                if (!dVar.f8869a) {
                    dVar.a(aVar.f8803c);
                }
                e eVar = aVar2.f8806f;
                if (!eVar.f8875a) {
                    eVar.a(aVar.f8806f);
                }
                C0030c cVar2 = aVar2.f8804d;
                if (!cVar2.f8858a) {
                    cVar2.a(aVar.f8804d);
                }
                for (String next2 : aVar.f8807g.keySet()) {
                    if (!aVar2.f8807g.containsKey(next2)) {
                        aVar2.f8807g.put(next2, aVar.f8807g.get(next2));
                    }
                }
            }
        }
    }

    public void T(int i11, String str) {
        x(i11).f8805e.A = str;
    }

    public void U(boolean z11) {
        this.f8799f = z11;
    }

    public void V(boolean z11) {
        this.f8794a = z11;
    }

    public void W(int i11, float f11) {
        x(i11).f8805e.f8856z = f11;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f8800g.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else if (this.f8799f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f8800g.containsKey(Integer.valueOf(id2)) && (aVar = this.f8800g.get(Integer.valueOf(id2))) != null) {
                ConstraintAttribute.j(childAt, aVar.f8807g);
            }
        }
    }

    public void h(c cVar) {
        for (a next : cVar.f8800g.values()) {
            if (next.f8808h != null) {
                if (next.f8802b != null) {
                    for (Integer intValue : this.f8800g.keySet()) {
                        a y11 = y(intValue.intValue());
                        String str = y11.f8805e.f8843m0;
                        if (str != null && next.f8802b.matches(str)) {
                            next.f8808h.e(y11);
                            y11.f8807g.putAll((HashMap) next.f8807g.clone());
                        }
                    }
                } else {
                    next.f8808h.e(y(next.f8801a));
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public void j(a aVar, ConstraintWidget constraintWidget, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        a aVar2;
        int id2 = aVar.getId();
        if (this.f8800g.containsKey(Integer.valueOf(id2)) && (aVar2 = this.f8800g.get(Integer.valueOf(id2))) != null && (constraintWidget instanceof m2.b)) {
            aVar.p(aVar2, (m2.b) constraintWidget, bVar, sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(ConstraintLayout constraintLayout, boolean z11) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f8800g.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f8800g.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.d(childAt));
            } else if (this.f8799f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f8800g.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f8800g.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f8805e.f8838j0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f8805e.f8835h0);
                            barrier.setMargin(aVar.f8805e.f8837i0);
                            barrier.setAllowsGoneWidget(aVar.f8805e.f8848p0);
                            b bVar = aVar.f8805e;
                            int[] iArr = bVar.f8839k0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f8841l0;
                                if (str != null) {
                                    bVar.f8839k0 = v(barrier, str);
                                    barrier.setReferencedIds(aVar.f8805e.f8839k0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.b();
                        aVar.e(bVar2);
                        if (z11) {
                            ConstraintAttribute.j(childAt, aVar.f8807g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f8803c;
                        if (dVar.f8871c == 0) {
                            childAt.setVisibility(dVar.f8870b);
                        }
                        childAt.setAlpha(aVar.f8803c.f8872d);
                        childAt.setRotation(aVar.f8806f.f8876b);
                        childAt.setRotationX(aVar.f8806f.f8877c);
                        childAt.setRotationY(aVar.f8806f.f8878d);
                        childAt.setScaleX(aVar.f8806f.f8879e);
                        childAt.setScaleY(aVar.f8806f.f8880f);
                        e eVar = aVar.f8806f;
                        if (eVar.f8883i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f8806f.f8883i);
                            if (findViewById != null) {
                                float top = ((float) (findViewById.getTop() + findViewById.getBottom())) / 2.0f;
                                float left = ((float) (findViewById.getLeft() + findViewById.getRight())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(left - ((float) childAt.getLeft()));
                                    childAt.setPivotY(top - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f8881g)) {
                                childAt.setPivotX(aVar.f8806f.f8881g);
                            }
                            if (!Float.isNaN(aVar.f8806f.f8882h)) {
                                childAt.setPivotY(aVar.f8806f.f8882h);
                            }
                        }
                        childAt.setTranslationX(aVar.f8806f.j);
                        childAt.setTranslationY(aVar.f8806f.k);
                        childAt.setTranslationZ(aVar.f8806f.f8884l);
                        e eVar2 = aVar.f8806f;
                        if (eVar2.f8885m) {
                            childAt.setElevation(eVar2.n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            a aVar2 = this.f8800g.get(num);
            if (aVar2 != null) {
                if (aVar2.f8805e.f8838j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f8805e;
                    int[] iArr2 = bVar3.f8839k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f8841l0;
                        if (str2 != null) {
                            bVar3.f8839k0 = v(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f8805e.f8839k0);
                        }
                    }
                    barrier2.setType(aVar2.f8805e.f8835h0);
                    barrier2.setMargin(aVar2.f8805e.f8837i0);
                    ConstraintLayout.b q = constraintLayout.generateDefaultLayoutParams();
                    barrier2.w();
                    aVar2.e(q);
                    constraintLayout.addView(barrier2, q);
                }
                if (aVar2.f8805e.f8820a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b q11 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(q11);
                    constraintLayout.addView(guideline, q11);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof a) {
                ((a) childAt2).j(constraintLayout);
            }
        }
    }

    public void l(int i11, ConstraintLayout.b bVar) {
        a aVar;
        if (this.f8800g.containsKey(Integer.valueOf(i11)) && (aVar = this.f8800g.get(Integer.valueOf(i11))) != null) {
            aVar.e(bVar);
        }
    }

    public void n(int i11, int i12) {
        a aVar;
        if (this.f8800g.containsKey(Integer.valueOf(i11)) && (aVar = this.f8800g.get(Integer.valueOf(i11))) != null) {
            switch (i12) {
                case 1:
                    b bVar = aVar.f8805e;
                    bVar.k = -1;
                    bVar.j = -1;
                    bVar.H = -1;
                    bVar.O = Integer.MIN_VALUE;
                    return;
                case 2:
                    b bVar2 = aVar.f8805e;
                    bVar2.f8842m = -1;
                    bVar2.f8840l = -1;
                    bVar2.I = -1;
                    bVar2.Q = Integer.MIN_VALUE;
                    return;
                case 3:
                    b bVar3 = aVar.f8805e;
                    bVar3.f8845o = -1;
                    bVar3.n = -1;
                    bVar3.J = 0;
                    bVar3.P = Integer.MIN_VALUE;
                    return;
                case 4:
                    b bVar4 = aVar.f8805e;
                    bVar4.f8847p = -1;
                    bVar4.q = -1;
                    bVar4.K = 0;
                    bVar4.R = Integer.MIN_VALUE;
                    return;
                case 5:
                    b bVar5 = aVar.f8805e;
                    bVar5.f8850r = -1;
                    bVar5.f8851s = -1;
                    bVar5.t = -1;
                    bVar5.N = 0;
                    bVar5.U = Integer.MIN_VALUE;
                    return;
                case 6:
                    b bVar6 = aVar.f8805e;
                    bVar6.f8852u = -1;
                    bVar6.v = -1;
                    bVar6.M = 0;
                    bVar6.T = Integer.MIN_VALUE;
                    return;
                case 7:
                    b bVar7 = aVar.f8805e;
                    bVar7.f8853w = -1;
                    bVar7.f8854x = -1;
                    bVar7.L = 0;
                    bVar7.S = Integer.MIN_VALUE;
                    return;
                case 8:
                    b bVar8 = aVar.f8805e;
                    bVar8.D = -1.0f;
                    bVar8.C = -1;
                    bVar8.B = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void o(Context context, int i11) {
        p((ConstraintLayout) LayoutInflater.from(context).inflate(i11, (ViewGroup) null));
    }

    public void p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8800g.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f8799f || id2 != -1) {
                if (!this.f8800g.containsKey(Integer.valueOf(id2))) {
                    this.f8800g.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f8800g.get(Integer.valueOf(id2));
                if (aVar != null) {
                    aVar.f8807g = ConstraintAttribute.b(this.f8798e, childAt);
                    aVar.g(id2, bVar);
                    aVar.f8803c.f8870b = childAt.getVisibility();
                    aVar.f8803c.f8872d = childAt.getAlpha();
                    aVar.f8806f.f8876b = childAt.getRotation();
                    aVar.f8806f.f8877c = childAt.getRotationX();
                    aVar.f8806f.f8878d = childAt.getRotationY();
                    aVar.f8806f.f8879e = childAt.getScaleX();
                    aVar.f8806f.f8880f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar.f8806f;
                        eVar.f8881g = pivotX;
                        eVar.f8882h = pivotY;
                    }
                    aVar.f8806f.j = childAt.getTranslationX();
                    aVar.f8806f.k = childAt.getTranslationY();
                    aVar.f8806f.f8884l = childAt.getTranslationZ();
                    e eVar2 = aVar.f8806f;
                    if (eVar2.f8885m) {
                        eVar2.n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f8805e.f8848p0 = barrier.getAllowsGoneWidget();
                        aVar.f8805e.f8839k0 = barrier.getReferencedIds();
                        aVar.f8805e.f8835h0 = barrier.getType();
                        aVar.f8805e.f8837i0 = barrier.getMargin();
                    }
                }
                i11++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void q(c cVar) {
        this.f8800g.clear();
        for (Integer next : cVar.f8800g.keySet()) {
            a aVar = cVar.f8800g.get(next);
            if (aVar != null) {
                this.f8800g.put(next, aVar.clone());
            }
        }
    }

    public void r(d dVar) {
        int childCount = dVar.getChildCount();
        this.f8800g.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = dVar.getChildAt(i11);
            d.a aVar = (d.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f8799f || id2 != -1) {
                if (!this.f8800g.containsKey(Integer.valueOf(id2))) {
                    this.f8800g.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = this.f8800g.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        aVar2.i((a) childAt, id2, aVar);
                    }
                    aVar2.h(id2, aVar);
                }
                i11++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void s(int i11, int i12, int i13, int i14) {
        if (!this.f8800g.containsKey(Integer.valueOf(i11))) {
            this.f8800g.put(Integer.valueOf(i11), new a());
        }
        a aVar = this.f8800g.get(Integer.valueOf(i11));
        if (aVar != null) {
            switch (i12) {
                case 1:
                    if (i14 == 1) {
                        b bVar = aVar.f8805e;
                        bVar.j = i13;
                        bVar.k = -1;
                        return;
                    } else if (i14 == 2) {
                        b bVar2 = aVar.f8805e;
                        bVar2.k = i13;
                        bVar2.j = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("left to " + X(i14) + " undefined");
                    }
                case 2:
                    if (i14 == 1) {
                        b bVar3 = aVar.f8805e;
                        bVar3.f8840l = i13;
                        bVar3.f8842m = -1;
                        return;
                    } else if (i14 == 2) {
                        b bVar4 = aVar.f8805e;
                        bVar4.f8842m = i13;
                        bVar4.f8840l = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 3:
                    if (i14 == 3) {
                        b bVar5 = aVar.f8805e;
                        bVar5.n = i13;
                        bVar5.f8845o = -1;
                        bVar5.f8850r = -1;
                        bVar5.f8851s = -1;
                        bVar5.t = -1;
                        return;
                    } else if (i14 == 4) {
                        b bVar6 = aVar.f8805e;
                        bVar6.f8845o = i13;
                        bVar6.n = -1;
                        bVar6.f8850r = -1;
                        bVar6.f8851s = -1;
                        bVar6.t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 4:
                    if (i14 == 4) {
                        b bVar7 = aVar.f8805e;
                        bVar7.q = i13;
                        bVar7.f8847p = -1;
                        bVar7.f8850r = -1;
                        bVar7.f8851s = -1;
                        bVar7.t = -1;
                        return;
                    } else if (i14 == 3) {
                        b bVar8 = aVar.f8805e;
                        bVar8.f8847p = i13;
                        bVar8.q = -1;
                        bVar8.f8850r = -1;
                        bVar8.f8851s = -1;
                        bVar8.t = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 5:
                    if (i14 == 5) {
                        b bVar9 = aVar.f8805e;
                        bVar9.f8850r = i13;
                        bVar9.q = -1;
                        bVar9.f8847p = -1;
                        bVar9.n = -1;
                        bVar9.f8845o = -1;
                        return;
                    } else if (i14 == 3) {
                        b bVar10 = aVar.f8805e;
                        bVar10.f8851s = i13;
                        bVar10.q = -1;
                        bVar10.f8847p = -1;
                        bVar10.n = -1;
                        bVar10.f8845o = -1;
                        return;
                    } else if (i14 == 4) {
                        b bVar11 = aVar.f8805e;
                        bVar11.t = i13;
                        bVar11.q = -1;
                        bVar11.f8847p = -1;
                        bVar11.n = -1;
                        bVar11.f8845o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 6:
                    if (i14 == 6) {
                        b bVar12 = aVar.f8805e;
                        bVar12.v = i13;
                        bVar12.f8852u = -1;
                        return;
                    } else if (i14 == 7) {
                        b bVar13 = aVar.f8805e;
                        bVar13.f8852u = i13;
                        bVar13.v = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 7:
                    if (i14 == 7) {
                        b bVar14 = aVar.f8805e;
                        bVar14.f8854x = i13;
                        bVar14.f8853w = -1;
                        return;
                    } else if (i14 == 6) {
                        b bVar15 = aVar.f8805e;
                        bVar15.f8853w = i13;
                        bVar15.f8854x = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                default:
                    throw new IllegalArgumentException(X(i12) + " to " + X(i14) + " unknown");
            }
        }
    }

    public void t(int i11, int i12, int i13, int i14, int i15) {
        if (!this.f8800g.containsKey(Integer.valueOf(i11))) {
            this.f8800g.put(Integer.valueOf(i11), new a());
        }
        a aVar = this.f8800g.get(Integer.valueOf(i11));
        if (aVar != null) {
            switch (i12) {
                case 1:
                    if (i14 == 1) {
                        b bVar = aVar.f8805e;
                        bVar.j = i13;
                        bVar.k = -1;
                    } else if (i14 == 2) {
                        b bVar2 = aVar.f8805e;
                        bVar2.k = i13;
                        bVar2.j = -1;
                    } else {
                        throw new IllegalArgumentException("Left to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.H = i15;
                    return;
                case 2:
                    if (i14 == 1) {
                        b bVar3 = aVar.f8805e;
                        bVar3.f8840l = i13;
                        bVar3.f8842m = -1;
                    } else if (i14 == 2) {
                        b bVar4 = aVar.f8805e;
                        bVar4.f8842m = i13;
                        bVar4.f8840l = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.I = i15;
                    return;
                case 3:
                    if (i14 == 3) {
                        b bVar5 = aVar.f8805e;
                        bVar5.n = i13;
                        bVar5.f8845o = -1;
                        bVar5.f8850r = -1;
                        bVar5.f8851s = -1;
                        bVar5.t = -1;
                    } else if (i14 == 4) {
                        b bVar6 = aVar.f8805e;
                        bVar6.f8845o = i13;
                        bVar6.n = -1;
                        bVar6.f8850r = -1;
                        bVar6.f8851s = -1;
                        bVar6.t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.J = i15;
                    return;
                case 4:
                    if (i14 == 4) {
                        b bVar7 = aVar.f8805e;
                        bVar7.q = i13;
                        bVar7.f8847p = -1;
                        bVar7.f8850r = -1;
                        bVar7.f8851s = -1;
                        bVar7.t = -1;
                    } else if (i14 == 3) {
                        b bVar8 = aVar.f8805e;
                        bVar8.f8847p = i13;
                        bVar8.q = -1;
                        bVar8.f8850r = -1;
                        bVar8.f8851s = -1;
                        bVar8.t = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.K = i15;
                    return;
                case 5:
                    if (i14 == 5) {
                        b bVar9 = aVar.f8805e;
                        bVar9.f8850r = i13;
                        bVar9.q = -1;
                        bVar9.f8847p = -1;
                        bVar9.n = -1;
                        bVar9.f8845o = -1;
                        return;
                    } else if (i14 == 3) {
                        b bVar10 = aVar.f8805e;
                        bVar10.f8851s = i13;
                        bVar10.q = -1;
                        bVar10.f8847p = -1;
                        bVar10.n = -1;
                        bVar10.f8845o = -1;
                        return;
                    } else if (i14 == 4) {
                        b bVar11 = aVar.f8805e;
                        bVar11.t = i13;
                        bVar11.q = -1;
                        bVar11.f8847p = -1;
                        bVar11.n = -1;
                        bVar11.f8845o = -1;
                        return;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                case 6:
                    if (i14 == 6) {
                        b bVar12 = aVar.f8805e;
                        bVar12.v = i13;
                        bVar12.f8852u = -1;
                    } else if (i14 == 7) {
                        b bVar13 = aVar.f8805e;
                        bVar13.f8852u = i13;
                        bVar13.v = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.M = i15;
                    return;
                case 7:
                    if (i14 == 7) {
                        b bVar14 = aVar.f8805e;
                        bVar14.f8854x = i13;
                        bVar14.f8853w = -1;
                    } else if (i14 == 6) {
                        b bVar15 = aVar.f8805e;
                        bVar15.f8853w = i13;
                        bVar15.f8854x = -1;
                    } else {
                        throw new IllegalArgumentException("right to " + X(i14) + " undefined");
                    }
                    aVar.f8805e.L = i15;
                    return;
                default:
                    throw new IllegalArgumentException(X(i12) + " to " + X(i14) + " unknown");
            }
        }
    }

    public void u(int i11, int i12) {
        x(i11).f8805e.f8825c0 = i12;
    }

    public a y(int i11) {
        if (this.f8800g.containsKey(Integer.valueOf(i11))) {
            return this.f8800g.get(Integer.valueOf(i11));
        }
        return null;
    }

    public int z(int i11) {
        return x(i11).f8805e.f8828e;
    }
}

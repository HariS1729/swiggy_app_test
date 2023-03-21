package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.j;
import androidx.constraintlayout.core.widgets.analyzer.l;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k2.b;

public class ConstraintWidget {
    public static float U0 = 0.5f;
    public int A;
    int A0;
    public float B;
    int B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    boolean I0;
    private int[] J;
    int J0;
    private float K;
    int K0;
    private boolean L;
    boolean L0;
    private boolean M;
    boolean M0;
    private boolean N;
    public float[] N0;
    private int O;
    protected ConstraintWidget[] O0;
    private int P;
    protected ConstraintWidget[] P0;
    public ConstraintAnchor Q;
    ConstraintWidget Q0;
    public ConstraintAnchor R;
    ConstraintWidget R0;
    public ConstraintAnchor S;
    public int S0;
    public ConstraintAnchor T;
    public int T0;
    public ConstraintAnchor U;
    ConstraintAnchor V;
    ConstraintAnchor W;
    public ConstraintAnchor X;
    public ConstraintAnchor[] Y;
    protected ArrayList<ConstraintAnchor> Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8168a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean[] f8169a0;

    /* renamed from: b  reason: collision with root package name */
    public WidgetRun[] f8170b;

    /* renamed from: b0  reason: collision with root package name */
    public DimensionBehaviour[] f8171b0;

    /* renamed from: c  reason: collision with root package name */
    public c f8172c;

    /* renamed from: c0  reason: collision with root package name */
    public ConstraintWidget f8173c0;

    /* renamed from: d  reason: collision with root package name */
    public c f8174d;

    /* renamed from: d0  reason: collision with root package name */
    int f8175d0;

    /* renamed from: e  reason: collision with root package name */
    public j f8176e;

    /* renamed from: e0  reason: collision with root package name */
    int f8177e0;

    /* renamed from: f  reason: collision with root package name */
    public l f8178f;

    /* renamed from: f0  reason: collision with root package name */
    public float f8179f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f8180g;

    /* renamed from: g0  reason: collision with root package name */
    protected int f8181g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f8182h;

    /* renamed from: h0  reason: collision with root package name */
    protected int f8183h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8184i;

    /* renamed from: i0  reason: collision with root package name */
    protected int f8185i0;
    private boolean j;

    /* renamed from: j0  reason: collision with root package name */
    int f8186j0;
    private boolean k;

    /* renamed from: k0  reason: collision with root package name */
    int f8187k0;

    /* renamed from: l  reason: collision with root package name */
    private int f8188l;

    /* renamed from: l0  reason: collision with root package name */
    protected int f8189l0;

    /* renamed from: m  reason: collision with root package name */
    private int f8190m;

    /* renamed from: m0  reason: collision with root package name */
    protected int f8191m0;
    public b n;

    /* renamed from: n0  reason: collision with root package name */
    int f8192n0;

    /* renamed from: o  reason: collision with root package name */
    public String f8193o;

    /* renamed from: o0  reason: collision with root package name */
    protected int f8194o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8195p;

    /* renamed from: p0  reason: collision with root package name */
    protected int f8196p0;
    private boolean q;

    /* renamed from: q0  reason: collision with root package name */
    float f8197q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8198r;

    /* renamed from: r0  reason: collision with root package name */
    float f8199r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8200s;

    /* renamed from: s0  reason: collision with root package name */
    private Object f8201s0;
    public int t;

    /* renamed from: t0  reason: collision with root package name */
    private int f8202t0;

    /* renamed from: u  reason: collision with root package name */
    public int f8203u;

    /* renamed from: u0  reason: collision with root package name */
    private int f8204u0;
    private int v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f8205v0;

    /* renamed from: w  reason: collision with root package name */
    public int f8206w;

    /* renamed from: w0  reason: collision with root package name */
    private String f8207w0;

    /* renamed from: x  reason: collision with root package name */
    public int f8208x;

    /* renamed from: x0  reason: collision with root package name */
    private String f8209x0;

    /* renamed from: y  reason: collision with root package name */
    public int[] f8210y;

    /* renamed from: y0  reason: collision with root package name */
    int f8211y0;

    /* renamed from: z  reason: collision with root package name */
    public int f8212z;

    /* renamed from: z0  reason: collision with root package name */
    int f8213z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8214a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8215b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8215b = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8215b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8215b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8215b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8214a = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f8214a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f8214a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        this.f8168a = false;
        this.f8170b = new WidgetRun[2];
        this.f8176e = null;
        this.f8178f = null;
        this.f8180g = new boolean[]{true, true};
        this.f8182h = false;
        this.f8184i = true;
        this.j = false;
        this.k = true;
        this.f8188l = -1;
        this.f8190m = -1;
        this.n = new b(this);
        this.f8195p = false;
        this.q = false;
        this.f8198r = false;
        this.f8200s = false;
        this.t = -1;
        this.f8203u = -1;
        this.v = 0;
        this.f8206w = 0;
        this.f8208x = 0;
        this.f8210y = new int[2];
        this.f8212z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.f8169a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f8171b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f8173c0 = null;
        this.f8175d0 = 0;
        this.f8177e0 = 0;
        this.f8179f0 = 0.0f;
        this.f8181g0 = -1;
        this.f8183h0 = 0;
        this.f8185i0 = 0;
        this.f8186j0 = 0;
        this.f8187k0 = 0;
        this.f8189l0 = 0;
        this.f8191m0 = 0;
        this.f8192n0 = 0;
        float f11 = U0;
        this.f8197q0 = f11;
        this.f8199r0 = f11;
        this.f8202t0 = 0;
        this.f8204u0 = 0;
        this.f8205v0 = false;
        this.f8207w0 = null;
        this.f8209x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    private void C0(StringBuilder sb2, String str, float f11, float f12) {
        if (f11 != f12) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f11);
            sb2.append(",\n");
        }
    }

    private void D0(StringBuilder sb2, String str, int i11, int i12) {
        if (i11 != i12) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i11);
            sb2.append(",\n");
        }
    }

    private void E0(StringBuilder sb2, String str, float f11, int i11) {
        if (f11 != 0.0f) {
            sb2.append(str);
            sb2.append(" :  [");
            sb2.append(f11);
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb2.append(i11);
            sb2.append("");
            sb2.append("],\n");
        }
    }

    private void S(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, int i16, float f11, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        D0(sb2, "      size", i11, 0);
        D0(sb2, "      min", i12, 0);
        D0(sb2, "      max", i13, Integer.MAX_VALUE);
        D0(sb2, "      matchMin", i15, 0);
        D0(sb2, "      matchDef", i16, 0);
        C0(sb2, "      matchPercent", f11, 1.0f);
        sb2.append("    },\n");
    }

    private void T(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f8163f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(constraintAnchor.f8163f);
            sb2.append("'");
            if (!(constraintAnchor.f8165h == Integer.MIN_VALUE && constraintAnchor.f8164g == 0)) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb2.append(constraintAnchor.f8164g);
                if (constraintAnchor.f8165h != Integer.MIN_VALUE) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb2.append(constraintAnchor.f8165h);
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:262:0x046d, code lost:
        if ((r4 instanceof androidx.constraintlayout.core.widgets.a) != false) goto L_0x0472;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0458 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x055e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:377:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:381:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(androidx.constraintlayout.core.d r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.core.SolverVariable r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.core.widgets.ConstraintAnchor r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r11 = r42
            r12 = r43
            r13 = r46
            r14 = r47
            r15 = r50
            r1 = r51
            r2 = r59
            r3 = r60
            r4 = r61
            androidx.constraintlayout.core.SolverVariable r9 = r10.q(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.q(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r46.j()
            androidx.constraintlayout.core.SolverVariable r7 = r10.q(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r47.j()
            androidx.constraintlayout.core.SolverVariable r6 = r10.q(r5)
            androidx.constraintlayout.core.d.w()
            boolean r16 = r46.o()
            boolean r17 = r47.o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.X
            boolean r18 = r5.o()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r53 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r58
        L_0x0051:
            int[] r20 = androidx.constraintlayout.core.widgets.ConstraintWidget.a.f8215b
            int r21 = r44.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f8188l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r38 == 0) goto L_0x007d
            r0.f8188l = r14
            r49 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f8190m
            if (r2 == r14) goto L_0x0088
            if (r38 != 0) goto L_0x0088
            r0.f8190m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r49
        L_0x008a:
            int r14 = r0.f8204u0
            r49 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r49
        L_0x0098:
            if (r63 == 0) goto L_0x00b6
            if (r16 != 0) goto L_0x00a6
            if (r17 != 0) goto L_0x00a6
            if (r18 != 0) goto L_0x00a6
            r2 = r48
            r10.f(r9, r2)
            goto L_0x00b6
        L_0x00a6:
            if (r16 == 0) goto L_0x00b6
            if (r17 != 0) goto L_0x00b6
            int r2 = r46.f()
            r24 = r6
            r6 = 8
            r10.e(r9, r7, r2, r6)
            goto L_0x00ba
        L_0x00b6:
            r24 = r6
            r6 = 8
        L_0x00ba:
            if (r19 != 0) goto L_0x00e5
            if (r45 == 0) goto L_0x00d3
            r2 = 3
            r6 = 0
            r10.e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00ca
            r10.h(r8, r9, r15, r2)
        L_0x00ca:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d8
            r10.j(r8, r9, r1, r2)
            goto L_0x00d8
        L_0x00d3:
            r2 = 8
            r10.e(r8, r9, r14, r2)
        L_0x00d8:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
        L_0x00e1:
            r24 = r3
            goto L_0x01e3
        L_0x00e5:
            r1 = 2
            if (r5 == r1) goto L_0x0108
            if (r53 != 0) goto L_0x0108
            r1 = 1
            if (r12 == r1) goto L_0x00ef
            if (r12 != 0) goto L_0x0108
        L_0x00ef:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00f9
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00f9:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r41
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e1
        L_0x0108:
            r1 = -2
            if (r3 != r1) goto L_0x010d
            r2 = r14
            goto L_0x010e
        L_0x010d:
            r2 = r3
        L_0x010e:
            if (r4 != r1) goto L_0x0112
            r1 = r14
            goto L_0x0113
        L_0x0112:
            r1 = r4
        L_0x0113:
            if (r14 <= 0) goto L_0x0119
            r3 = 1
            if (r12 == r3) goto L_0x0119
            r14 = 0
        L_0x0119:
            if (r2 <= 0) goto L_0x0124
            r3 = 8
            r10.h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0124:
            if (r1 <= 0) goto L_0x013d
            if (r39 == 0) goto L_0x012d
            r3 = 1
            if (r12 != r3) goto L_0x012d
            r3 = 0
            goto L_0x012e
        L_0x012d:
            r3 = 1
        L_0x012e:
            if (r3 == 0) goto L_0x0136
            r3 = 8
            r10.j(r8, r9, r1, r3)
            goto L_0x0138
        L_0x0136:
            r3 = 8
        L_0x0138:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x013f
        L_0x013d:
            r3 = 8
        L_0x013f:
            r4 = 1
            if (r12 != r4) goto L_0x0167
            if (r39 == 0) goto L_0x0148
            r10.e(r8, r9, r14, r3)
            goto L_0x0159
        L_0x0148:
            if (r55 == 0) goto L_0x0152
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
            goto L_0x0159
        L_0x0152:
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
        L_0x0159:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
            r24 = r2
            r2 = r7
            goto L_0x01e3
        L_0x0167:
            r3 = 2
            if (r12 != r3) goto L_0x01d2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r46.k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x0194
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r46.k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r6) goto L_0x017b
            goto L_0x0194
        L_0x017b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.q(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.q(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.q(r4)
            goto L_0x01aa
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.q(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.q(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.q(r4)
        L_0x01aa:
            r14 = r3
            r6 = r4
            androidx.constraintlayout.core.b r3 = r37.r()
            r4 = r8
            r45 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r51 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r62
            androidx.constraintlayout.core.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            if (r39 == 0) goto L_0x01c9
            r19 = 0
        L_0x01c9:
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = r41
            goto L_0x01e3
        L_0x01d2:
            r45 = r1
            r51 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = 1
        L_0x01e3:
            if (r63 == 0) goto L_0x0553
            if (r55 == 0) goto L_0x01e9
            goto L_0x0553
        L_0x01e9:
            if (r16 != 0) goto L_0x01f4
            if (r17 != 0) goto L_0x01f4
            if (r18 != 0) goto L_0x01f4
        L_0x01ef:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x0523
        L_0x01f4:
            if (r16 == 0) goto L_0x020d
            if (r17 != 0) goto L_0x020d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f8161d
            if (r39 == 0) goto L_0x0205
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 == 0) goto L_0x0205
            r2 = 8
            goto L_0x0206
        L_0x0205:
            r2 = 5
        L_0x0206:
            r20 = r39
            r1 = r2
        L_0x0209:
            r2 = r15
        L_0x020a:
            r3 = 0
            goto L_0x0525
        L_0x020d:
            if (r16 != 0) goto L_0x023d
            if (r17 == 0) goto L_0x023d
            int r1 = r47.f()
            int r1 = -r1
            r2 = 8
            r10.e(r14, r15, r1, r2)
            if (r39 == 0) goto L_0x01ef
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0235
            boolean r1 = r9.f8015g
            if (r1 == 0) goto L_0x0235
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f8173c0
            if (r1 == 0) goto L_0x0235
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            if (r38 == 0) goto L_0x0231
            r1.F1(r13)
            goto L_0x01ef
        L_0x0231:
            r1.K1(r13)
            goto L_0x01ef
        L_0x0235:
            r1 = 5
            r3 = 0
            r10.h(r9, r11, r3, r1)
            r2 = r15
            goto L_0x0523
        L_0x023d:
            r3 = 0
            if (r16 == 0) goto L_0x0521
            if (r17 == 0) goto L_0x0521
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r1.f8161d
            r6 = r47
            r7 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.f8161d
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r36.N()
            r16 = 6
            if (r25 == 0) goto L_0x0393
            if (r12 != 0) goto L_0x02be
            if (r4 != 0) goto L_0x0282
            if (r24 != 0) goto L_0x0282
            boolean r1 = r2.f8015g
            if (r1 == 0) goto L_0x0275
            boolean r1 = r15.f8015g
            if (r1 == 0) goto L_0x0275
            int r1 = r46.f()
            r4 = 8
            r10.e(r9, r2, r1, r4)
            int r1 = r47.f()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
            return
        L_0x0275:
            r4 = 8
            r1 = 8
            r17 = 8
            r18 = 0
            r21 = 1
            r23 = 0
            goto L_0x028d
        L_0x0282:
            r4 = 8
            r1 = 5
            r17 = 5
            r18 = 1
            r21 = 0
            r23 = 1
        L_0x028d:
            boolean r4 = r8 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 != 0) goto L_0x02a8
            boolean r4 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 == 0) goto L_0x0296
            goto L_0x02a8
        L_0x0296:
            r4 = r43
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
            goto L_0x02b9
        L_0x02a8:
            r4 = r43
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
            r22 = 4
        L_0x02b9:
            r23 = r1
            r1 = 3
            goto L_0x03e7
        L_0x02be:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02e0
            boolean r1 = r8 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 != 0) goto L_0x02d8
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r1 == 0) goto L_0x02cc
            goto L_0x02d8
        L_0x02cc:
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 5
            goto L_0x03df
        L_0x02d8:
            r4 = r43
            r1 = 3
            r7 = 1
        L_0x02dc:
            r18 = 5
            goto L_0x03db
        L_0x02e0:
            r1 = 1
            if (r12 != r1) goto L_0x02f1
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 8
            goto L_0x03e1
        L_0x02f1:
            r1 = 3
            if (r12 != r1) goto L_0x0383
            int r1 = r0.H
            r7 = -1
            if (r1 != r7) goto L_0x031d
            if (r56 == 0) goto L_0x0309
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            if (r39 == 0) goto L_0x0306
            r20 = 5
            goto L_0x0311
        L_0x0306:
            r20 = 4
            goto L_0x0311
        L_0x0309:
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 8
        L_0x0311:
            r22 = 5
            r23 = 8
        L_0x0315:
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x03e7
        L_0x031d:
            if (r53 == 0) goto L_0x0347
            r1 = r59
            r7 = 2
            if (r1 == r7) goto L_0x032a
            r7 = 1
            if (r1 != r7) goto L_0x0328
            goto L_0x032b
        L_0x0328:
            r1 = 0
            goto L_0x032c
        L_0x032a:
            r7 = 1
        L_0x032b:
            r1 = 1
        L_0x032c:
            if (r1 != 0) goto L_0x0332
            r1 = 8
            r4 = 5
            goto L_0x0334
        L_0x0332:
            r1 = 5
            r4 = 4
        L_0x0334:
            r23 = r1
            r22 = r4
            r1 = 3
            r18 = 5
            r20 = 6
            r26 = 1
            r27 = 1
            r28 = 1
            r4 = r43
            goto L_0x03e7
        L_0x0347:
            r7 = 1
            if (r4 <= 0) goto L_0x0354
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 5
            goto L_0x0380
        L_0x0354:
            if (r4 != 0) goto L_0x0377
            if (r24 != 0) goto L_0x0377
            if (r56 != 0) goto L_0x0364
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 8
            goto L_0x0380
        L_0x0364:
            if (r8 == r3) goto L_0x036a
            if (r5 == r3) goto L_0x036a
            r1 = 4
            goto L_0x036b
        L_0x036a:
            r1 = 5
        L_0x036b:
            r4 = r43
            r23 = r1
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x0315
        L_0x0377:
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
        L_0x0380:
            r23 = 5
            goto L_0x0315
        L_0x0383:
            r7 = 1
            r4 = r43
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
            goto L_0x03e5
        L_0x0393:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f8015g
            if (r1 == 0) goto L_0x03d6
            boolean r1 = r15.f8015g
            if (r1 == 0) goto L_0x03d6
            int r1 = r46.f()
            int r3 = r47.f()
            r4 = 8
            r53 = r37
            r54 = r9
            r55 = r2
            r56 = r1
            r57 = r52
            r58 = r15
            r59 = r14
            r60 = r3
            r61 = r4
            r53.c(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r39 == 0) goto L_0x03d5
            if (r19 == 0) goto L_0x03d5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f8163f
            if (r1 == 0) goto L_0x03cc
            int r1 = r47.f()
            r4 = r43
            goto L_0x03cf
        L_0x03cc:
            r4 = r43
            r1 = 0
        L_0x03cf:
            if (r15 == r4) goto L_0x03d5
            r2 = 5
            r10.h(r4, r14, r1, r2)
        L_0x03d5:
            return
        L_0x03d6:
            r4 = r43
            r1 = 3
            goto L_0x02dc
        L_0x03db:
            r20 = 6
            r22 = 4
        L_0x03df:
            r23 = 5
        L_0x03e1:
            r26 = 1
            r27 = 1
        L_0x03e5:
            r28 = 0
        L_0x03e7:
            if (r26 == 0) goto L_0x03f2
            if (r2 != r15) goto L_0x03f2
            if (r8 == r3) goto L_0x03f2
            r26 = 0
            r29 = 0
            goto L_0x03f4
        L_0x03f2:
            r29 = 1
        L_0x03f4:
            if (r27 == 0) goto L_0x043a
            if (r25 != 0) goto L_0x0409
            if (r54 != 0) goto L_0x0409
            if (r56 != 0) goto L_0x0409
            if (r2 != r11) goto L_0x0409
            if (r15 != r4) goto L_0x0409
            r20 = 0
            r23 = 8
            r27 = 8
            r29 = 0
            goto L_0x040d
        L_0x0409:
            r27 = r20
            r20 = r39
        L_0x040d:
            int r30 = r46.f()
            int r31 = r47.f()
            r13 = 3
            r1 = r37
            r41 = r2
            r7 = 5
            r13 = 8
            r17 = 4
            r18 = 1
            r2 = r9
            r32 = r3
            r3 = r41
            r4 = r30
            r33 = r5
            r5 = r52
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x044c
        L_0x043a:
            r41 = r2
            r32 = r3
            r33 = r5
            r34 = r8
            r35 = r9
            r13 = 8
            r17 = 4
            r18 = 1
            r20 = r39
        L_0x044c:
            r2 = r29
            int r1 = r0.f8204u0
            if (r1 != r13) goto L_0x0459
            boolean r1 = r47.m()
            if (r1 != 0) goto L_0x0459
            return
        L_0x0459:
            r1 = r41
            if (r26 == 0) goto L_0x048e
            if (r20 == 0) goto L_0x0474
            if (r1 == r15) goto L_0x0474
            if (r25 != 0) goto L_0x0474
            r3 = r34
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r4 != 0) goto L_0x0470
            r4 = r33
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 == 0) goto L_0x0478
            goto L_0x0472
        L_0x0470:
            r4 = r33
        L_0x0472:
            r5 = 6
            goto L_0x047a
        L_0x0474:
            r4 = r33
            r3 = r34
        L_0x0478:
            r5 = r23
        L_0x047a:
            int r6 = r46.f()
            r8 = r35
            r10.h(r8, r1, r6, r5)
            int r6 = r47.f()
            int r6 = -r6
            r10.j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x0494
        L_0x048e:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x0494:
            if (r20 == 0) goto L_0x04a8
            if (r57 == 0) goto L_0x04a8
            boolean r5 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 != 0) goto L_0x04a8
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r5 != 0) goto L_0x04a8
            r5 = r32
            if (r4 == r5) goto L_0x04aa
            r2 = 1
            r6 = 6
            r7 = 6
            goto L_0x04ae
        L_0x04a8:
            r5 = r32
        L_0x04aa:
            r6 = r22
            r7 = r23
        L_0x04ae:
            if (r2 == 0) goto L_0x04f7
            if (r28 == 0) goto L_0x04d8
            if (r56 == 0) goto L_0x04b6
            if (r40 == 0) goto L_0x04d8
        L_0x04b6:
            if (r3 == r5) goto L_0x04bd
            if (r4 != r5) goto L_0x04bb
            goto L_0x04bd
        L_0x04bb:
            r2 = r6
            goto L_0x04be
        L_0x04bd:
            r2 = 6
        L_0x04be:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.f
            if (r9 != 0) goto L_0x04c6
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.f
            if (r9 == 0) goto L_0x04c7
        L_0x04c6:
            r2 = 5
        L_0x04c7:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.a
            if (r9 != 0) goto L_0x04cf
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.a
            if (r9 == 0) goto L_0x04d0
        L_0x04cf:
            r2 = 5
        L_0x04d0:
            if (r56 == 0) goto L_0x04d3
            r2 = 5
        L_0x04d3:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x04d9
        L_0x04d8:
            r2 = r6
        L_0x04d9:
            if (r20 == 0) goto L_0x04e8
            int r2 = java.lang.Math.min(r7, r2)
            if (r53 == 0) goto L_0x04e8
            if (r56 != 0) goto L_0x04e8
            if (r3 == r5) goto L_0x04e7
            if (r4 != r5) goto L_0x04e8
        L_0x04e7:
            r2 = 4
        L_0x04e8:
            int r3 = r46.f()
            r10.e(r8, r1, r3, r2)
            int r3 = r47.f()
            int r3 = -r3
            r10.e(r14, r15, r3, r2)
        L_0x04f7:
            if (r20 == 0) goto L_0x0508
            if (r11 != r1) goto L_0x0500
            int r2 = r46.f()
            goto L_0x0501
        L_0x0500:
            r2 = 0
        L_0x0501:
            if (r1 == r11) goto L_0x0508
            r1 = 5
            r10.h(r8, r11, r2, r1)
            goto L_0x0509
        L_0x0508:
            r1 = 5
        L_0x0509:
            if (r20 == 0) goto L_0x0209
            if (r25 == 0) goto L_0x0209
            r2 = r15
            if (r50 != 0) goto L_0x020a
            if (r24 != 0) goto L_0x020a
            if (r25 == 0) goto L_0x051c
            r3 = 3
            if (r12 != r3) goto L_0x051c
            r3 = 0
            r10.h(r14, r8, r3, r13)
            goto L_0x0525
        L_0x051c:
            r3 = 0
            r10.h(r14, r8, r3, r1)
            goto L_0x0525
        L_0x0521:
            r2 = r15
            r1 = 5
        L_0x0523:
            r20 = r39
        L_0x0525:
            if (r20 == 0) goto L_0x0552
            if (r19 == 0) goto L_0x0552
            r4 = r47
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f8163f
            if (r5 == 0) goto L_0x0533
            int r3 = r47.f()
        L_0x0533:
            r5 = r43
            if (r2 == r5) goto L_0x0552
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x054f
            boolean r2 = r14.f8015g
            if (r2 == 0) goto L_0x054f
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f8173c0
            if (r2 == 0) goto L_0x054f
            androidx.constraintlayout.core.widgets.d r2 = (androidx.constraintlayout.core.widgets.d) r2
            if (r38 == 0) goto L_0x054b
            r2.E1(r4)
            goto L_0x054e
        L_0x054b:
            r2.J1(r4)
        L_0x054e:
            return
        L_0x054f:
            r10.h(r5, r14, r3, r1)
        L_0x0552:
            return
        L_0x0553:
            r5 = r43
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            if (r1 >= r7) goto L_0x0596
            if (r39 == 0) goto L_0x0596
            if (r19 == 0) goto L_0x0596
            r10.h(r8, r11, r3, r13)
            if (r38 != 0) goto L_0x0570
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            if (r1 != 0) goto L_0x056e
            goto L_0x0570
        L_0x056e:
            r2 = 0
            goto L_0x0571
        L_0x0570:
            r2 = 1
        L_0x0571:
            if (r38 != 0) goto L_0x0591
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            if (r1 == 0) goto L_0x0591
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f8161d
            float r2 = r1.f8179f0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0590
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f8171b0
            r2 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x0590
            r1 = r1[r18]
            if (r1 != r4) goto L_0x0590
            r2 = 1
            goto L_0x0591
        L_0x0590:
            r2 = 0
        L_0x0591:
            if (r2 == 0) goto L_0x0596
            r10.h(r5, r14, r3, r13)
        L_0x0596:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private boolean j0(int i11) {
        int i12 = i11 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.Y;
        if (!(constraintAnchorArr[i12].f8163f == null || constraintAnchorArr[i12].f8163f.f8163f == constraintAnchorArr[i12])) {
            int i13 = i12 + 1;
            return constraintAnchorArr[i13].f8163f != null && constraintAnchorArr[i13].f8163f.f8163f == constraintAnchorArr[i13];
        }
    }

    public float A() {
        return this.f8197q0;
    }

    public void A0() {
        this.f8195p = false;
        this.q = false;
        this.f8198r = false;
        this.f8200s = false;
        int size = this.Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Z.get(i11).r();
        }
    }

    public int B() {
        return this.J0;
    }

    public void B0(androidx.constraintlayout.core.c cVar) {
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
        this.X.s(cVar);
        this.V.s(cVar);
        this.W.s(cVar);
    }

    public DimensionBehaviour C() {
        return this.f8171b0[0];
    }

    public int D() {
        ConstraintAnchor constraintAnchor = this.Q;
        int i11 = 0;
        if (constraintAnchor != null) {
            i11 = 0 + constraintAnchor.f8164g;
        }
        ConstraintAnchor constraintAnchor2 = this.S;
        return constraintAnchor2 != null ? i11 + constraintAnchor2.f8164g : i11;
    }

    public int E() {
        return this.O;
    }

    public int F() {
        return this.P;
    }

    public void F0(boolean z11) {
        this.f8205v0 = z11;
    }

    public int G() {
        return b0();
    }

    public void G0(int i11) {
        this.f8192n0 = i11;
        this.L = i11 > 0;
    }

    public int H(int i11) {
        if (i11 == 0) {
            return a0();
        }
        if (i11 == 1) {
            return z();
        }
        return 0;
    }

    public void H0(Object obj) {
        this.f8201s0 = obj;
    }

    public int I() {
        return this.J[1];
    }

    public void I0(String str) {
        this.f8207w0 = str;
    }

    public int J() {
        return this.J[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void J0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f8179f0 = r9
            r8.f8181g0 = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f8179f0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.J0(java.lang.String):void");
    }

    public int K() {
        return this.f8196p0;
    }

    public void K0(int i11) {
        if (this.L) {
            int i12 = i11 - this.f8192n0;
            int i13 = this.f8177e0 + i12;
            this.f8185i0 = i12;
            this.R.t(i12);
            this.T.t(i13);
            this.U.t(i11);
            this.q = true;
        }
    }

    public int L() {
        return this.f8194o0;
    }

    public void L0(int i11, int i12) {
        if (!this.f8195p) {
            this.Q.t(i11);
            this.S.t(i12);
            this.f8183h0 = i11;
            this.f8175d0 = i12 - i11;
            this.f8195p = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.T;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget M(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f8163f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f8163f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8161d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f8163f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f8163f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8161d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.M(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public void M0(int i11) {
        this.Q.t(i11);
        this.f8183h0 = i11;
    }

    public ConstraintWidget N() {
        return this.f8173c0;
    }

    public void N0(int i11) {
        this.R.t(i11);
        this.f8185i0 = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget O(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f8163f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f8163f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8161d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f8163f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f8163f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8161d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.O(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public void O0(int i11, int i12) {
        if (!this.q) {
            this.R.t(i11);
            this.T.t(i12);
            this.f8185i0 = i11;
            this.f8177e0 = i12 - i11;
            if (this.L) {
                this.U.t(i11 + this.f8192n0);
            }
            this.q = true;
        }
    }

    public int P() {
        return b0() + this.f8175d0;
    }

    public void P0(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        this.f8183h0 = i11;
        this.f8185i0 = i12;
        if (this.f8204u0 == 8) {
            this.f8175d0 = 0;
            this.f8177e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f8171b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i17 < (i16 = this.f8175d0)) {
            i17 = i16;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i18 < (i15 = this.f8177e0)) {
            i18 = i15;
        }
        this.f8175d0 = i17;
        this.f8177e0 = i18;
        int i19 = this.f8196p0;
        if (i18 < i19) {
            this.f8177e0 = i19;
        }
        int i21 = this.f8194o0;
        if (i17 < i21) {
            this.f8175d0 = i21;
        }
        int i22 = this.A;
        if (i22 > 0 && dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f8175d0 = Math.min(this.f8175d0, i22);
        }
        int i23 = this.D;
        if (i23 > 0 && this.f8171b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f8177e0 = Math.min(this.f8177e0, i23);
        }
        int i24 = this.f8175d0;
        if (i17 != i24) {
            this.f8188l = i24;
        }
        int i25 = this.f8177e0;
        if (i18 != i25) {
            this.f8190m = i25;
        }
    }

    public WidgetRun Q(int i11) {
        if (i11 == 0) {
            return this.f8176e;
        }
        if (i11 == 1) {
            return this.f8178f;
        }
        return null;
    }

    public void Q0(boolean z11) {
        this.L = z11;
    }

    public void R(StringBuilder sb2) {
        sb2.append("  " + this.f8193o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f8175d0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f8177e0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f8183h0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f8185i0);
        sb2.append("\n");
        T(sb2, "left", this.Q);
        T(sb2, "top", this.R);
        T(sb2, "right", this.S);
        T(sb2, "bottom", this.T);
        T(sb2, "baseline", this.U);
        T(sb2, "centerX", this.V);
        T(sb2, "centerY", this.W);
        S(sb2, "    width", this.f8175d0, this.f8194o0, this.J[0], this.f8188l, this.f8212z, this.f8206w, this.B, this.N0[0]);
        S(sb2, "    height", this.f8177e0, this.f8196p0, this.J[1], this.f8190m, this.C, this.f8208x, this.E, this.N0[1]);
        E0(sb2, "    dimensionRatio", this.f8179f0, this.f8181g0);
        C0(sb2, "    horizontalBias", this.f8197q0, U0);
        C0(sb2, "    verticalBias", this.f8199r0, U0);
        D0(sb2, "    horizontalChainStyle", this.J0, 0);
        D0(sb2, "    verticalChainStyle", this.K0, 0);
        sb2.append("  }");
    }

    public void R0(int i11) {
        this.f8177e0 = i11;
        int i12 = this.f8196p0;
        if (i11 < i12) {
            this.f8177e0 = i12;
        }
    }

    public void S0(float f11) {
        this.f8197q0 = f11;
    }

    public void T0(int i11) {
        this.J0 = i11;
    }

    public int U() {
        return c0();
    }

    public void U0(int i11, int i12) {
        this.f8183h0 = i11;
        int i13 = i12 - i11;
        this.f8175d0 = i13;
        int i14 = this.f8194o0;
        if (i13 < i14) {
            this.f8175d0 = i14;
        }
    }

    public float V() {
        return this.f8199r0;
    }

    public void V0(DimensionBehaviour dimensionBehaviour) {
        this.f8171b0[0] = dimensionBehaviour;
    }

    public int W() {
        return this.K0;
    }

    public void W0(int i11, int i12, int i13, float f11) {
        this.f8206w = i11;
        this.f8212z = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.A = i13;
        this.B = f11;
        if (f11 > 0.0f && f11 < 1.0f && i11 == 0) {
            this.f8206w = 2;
        }
    }

    public DimensionBehaviour X() {
        return this.f8171b0[1];
    }

    public void X0(float f11) {
        this.N0[0] = f11;
    }

    public int Y() {
        int i11 = 0;
        if (this.Q != null) {
            i11 = 0 + this.R.f8164g;
        }
        return this.S != null ? i11 + this.T.f8164g : i11;
    }

    /* access modifiers changed from: protected */
    public void Y0(int i11, boolean z11) {
        this.f8169a0[i11] = z11;
    }

    public int Z() {
        return this.f8204u0;
    }

    public void Z0(boolean z11) {
        this.M = z11;
    }

    public int a0() {
        if (this.f8204u0 == 8) {
            return 0;
        }
        return this.f8175d0;
    }

    public void a1(boolean z11) {
        this.N = z11;
    }

    public int b0() {
        ConstraintWidget constraintWidget = this.f8173c0;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.f8183h0;
        }
        return ((d) constraintWidget).f8309c1 + this.f8183h0;
    }

    public void b1(int i11, int i12) {
        this.O = i11;
        this.P = i12;
        e1(false);
    }

    public int c0() {
        ConstraintWidget constraintWidget = this.f8173c0;
        if (constraintWidget == null || !(constraintWidget instanceof d)) {
            return this.f8185i0;
        }
        return ((d) constraintWidget).f8310d1 + this.f8185i0;
    }

    public void c1(int i11) {
        this.J[1] = i11;
    }

    public boolean d0() {
        return this.L;
    }

    public void d1(int i11) {
        this.J[0] = i11;
    }

    public void e(d dVar, d dVar2, HashSet<ConstraintWidget> hashSet, int i11, boolean z11) {
        if (z11) {
            if (hashSet.contains(this)) {
                g.a(dVar, dVar2, this);
                hashSet.remove(this);
                g(dVar2, dVar.Z1(64));
            } else {
                return;
            }
        }
        if (i11 == 0) {
            HashSet<ConstraintAnchor> d11 = this.Q.d();
            if (d11 != null) {
                Iterator<ConstraintAnchor> it2 = d11.iterator();
                while (it2.hasNext()) {
                    it2.next().f8161d.e(dVar, dVar2, hashSet, i11, true);
                }
            }
            HashSet<ConstraintAnchor> d12 = this.S.d();
            if (d12 != null) {
                Iterator<ConstraintAnchor> it3 = d12.iterator();
                while (it3.hasNext()) {
                    it3.next().f8161d.e(dVar, dVar2, hashSet, i11, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> d13 = this.R.d();
        if (d13 != null) {
            Iterator<ConstraintAnchor> it4 = d13.iterator();
            while (it4.hasNext()) {
                it4.next().f8161d.e(dVar, dVar2, hashSet, i11, true);
            }
        }
        HashSet<ConstraintAnchor> d14 = this.T.d();
        if (d14 != null) {
            Iterator<ConstraintAnchor> it5 = d14.iterator();
            while (it5.hasNext()) {
                it5.next().f8161d.e(dVar, dVar2, hashSet, i11, true);
            }
        }
        HashSet<ConstraintAnchor> d15 = this.U.d();
        if (d15 != null) {
            Iterator<ConstraintAnchor> it6 = d15.iterator();
            while (it6.hasNext()) {
                it6.next().f8161d.e(dVar, dVar2, hashSet, i11, true);
            }
        }
    }

    public boolean e0(int i11) {
        if (i11 == 0) {
            return (this.Q.f8163f != null ? 1 : 0) + (this.S.f8163f != null ? 1 : 0) < 2;
        }
        if ((this.R.f8163f != null ? 1 : 0) + (this.T.f8163f != null ? 1 : 0) + (this.U.f8163f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public void e1(boolean z11) {
        this.f8184i = z11;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return (this instanceof i) || (this instanceof f);
    }

    public boolean f0() {
        int size = this.Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.Z.get(i11).m()) {
                return true;
            }
        }
        return false;
    }

    public void f1(int i11) {
        if (i11 < 0) {
            this.f8196p0 = 0;
        } else {
            this.f8196p0 = i11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:184:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x05a4  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x05df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(androidx.constraintlayout.core.d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.Q
            androidx.constraintlayout.core.SolverVariable r13 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.S
            androidx.constraintlayout.core.SolverVariable r12 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.R
            androidx.constraintlayout.core.SolverVariable r11 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.T
            androidx.constraintlayout.core.SolverVariable r10 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.U
            androidx.constraintlayout.core.SolverVariable r9 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0054
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f8171b0
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f8171b0
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            int r3 = r15.v
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0054
            r5 = r0
            r4 = r2
            goto L_0x0056
        L_0x004f:
            r5 = r0
            r4 = 0
            goto L_0x0056
        L_0x0052:
            r4 = r2
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            r5 = 0
        L_0x0056:
            int r0 = r15.f8204u0
            r3 = 8
            if (r0 != r3) goto L_0x0071
            boolean r0 = r15.f8205v0
            if (r0 != 0) goto L_0x0071
            boolean r0 = r53.f0()
            if (r0 != 0) goto L_0x0071
            boolean[] r0 = r15.f8169a0
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0071
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0071
            return
        L_0x0071:
            boolean r0 = r15.f8195p
            r2 = 5
            if (r0 != 0) goto L_0x007a
            boolean r8 = r15.q
            if (r8 == 0) goto L_0x00f7
        L_0x007a:
            if (r0 == 0) goto L_0x00a9
            int r0 = r15.f8183h0
            r14.f(r13, r0)
            int r0 = r15.f8183h0
            int r8 = r15.f8175d0
            int r0 = r0 + r8
            r14.f(r12, r0)
            if (r4 == 0) goto L_0x00a9
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x00a9
            boolean r8 = r15.k
            if (r8 == 0) goto L_0x00a0
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.Q
            r0.F1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.S
            r0.E1(r8)
            goto L_0x00a9
        L_0x00a0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.S
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r12, r6, r2)
        L_0x00a9:
            boolean r0 = r15.q
            if (r0 == 0) goto L_0x00ea
            int r0 = r15.f8185i0
            r14.f(r11, r0)
            int r0 = r15.f8185i0
            int r8 = r15.f8177e0
            int r0 = r0 + r8
            r14.f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.U
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x00ca
            int r0 = r15.f8185i0
            int r8 = r15.f8192n0
            int r0 = r0 + r8
            r14.f(r9, r0)
        L_0x00ca:
            if (r5 == 0) goto L_0x00ea
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x00ea
            boolean r8 = r15.k
            if (r8 == 0) goto L_0x00e1
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.R
            r0.K1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.T
            r0.J1(r8)
            goto L_0x00ea
        L_0x00e1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.T
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r10, r6, r2)
        L_0x00ea:
            boolean r0 = r15.f8195p
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r15.q
            if (r0 == 0) goto L_0x00f7
            r15.f8195p = r6
            r15.q = r6
            return
        L_0x00f7:
            boolean r0 = androidx.constraintlayout.core.d.f8042r
            if (r55 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f8176e
            if (r0 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.l r8 = r15.f8178f
            if (r8 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f8234h
            boolean r1 = r2.j
            if (r1 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8234h
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f8235i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017f
            int r0 = r2.f8223g
            r14.f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f8176e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            int r0 = r0.f8223g
            r14.f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8234h
            int r0 = r0.f8223g
            r14.f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            int r0 = r0.f8223g
            r14.f(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.k
            int r0 = r0.f8223g
            r14.f(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x017a
            if (r4 == 0) goto L_0x0161
            boolean[] r0 = r15.f8180g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0161
            boolean r0 = r53.m0()
            if (r0 != 0) goto L_0x0161
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.S
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r12, r6, r3)
        L_0x0161:
            if (r5 == 0) goto L_0x017a
            boolean[] r0 = r15.f8180g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017a
            boolean r0 = r53.o0()
            if (r0 != 0) goto L_0x017a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.T
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r14.h(r0, r10, r6, r3)
        L_0x017a:
            r15.f8195p = r6
            r15.q = r6
            return
        L_0x017f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r15.j0(r6)
            if (r0 == 0) goto L_0x0192
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.d) r0
            r0.B1(r15, r6)
            r0 = 1
            goto L_0x0196
        L_0x0192:
            boolean r0 = r53.m0()
        L_0x0196:
            boolean r1 = r15.j0(r7)
            if (r1 == 0) goto L_0x01a5
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.f8173c0
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.d) r1
            r1.B1(r15, r7)
            r1 = 1
            goto L_0x01a9
        L_0x01a5:
            boolean r1 = r53.o0()
        L_0x01a9:
            if (r0 != 0) goto L_0x01c8
            if (r4 == 0) goto L_0x01c8
            int r2 = r15.f8204u0
            if (r2 == r3) goto L_0x01c8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            if (r2 != 0) goto L_0x01c8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            if (r2 != 0) goto L_0x01c8
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.S
            androidx.constraintlayout.core.SolverVariable r2 = r14.q(r2)
            r14.h(r2, r12, r6, r7)
        L_0x01c8:
            if (r1 != 0) goto L_0x01eb
            if (r5 == 0) goto L_0x01eb
            int r2 = r15.f8204u0
            if (r2 == r3) goto L_0x01eb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            if (r2 != 0) goto L_0x01eb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            if (r2 != 0) goto L_0x01eb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.U
            if (r2 != 0) goto L_0x01eb
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.T
            androidx.constraintlayout.core.SolverVariable r2 = r14.q(r2)
            r14.h(r2, r10, r6, r7)
        L_0x01eb:
            r29 = r0
            r28 = r1
            goto L_0x01f4
        L_0x01f0:
            r28 = 0
            r29 = 0
        L_0x01f4:
            int r0 = r15.f8175d0
            int r1 = r15.f8194o0
            if (r0 >= r1) goto L_0x01fb
            goto L_0x01fc
        L_0x01fb:
            r1 = r0
        L_0x01fc:
            int r2 = r15.f8177e0
            int r8 = r15.f8196p0
            if (r2 >= r8) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r8 = r2
        L_0x0204:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.f8171b0
            r7 = r3[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0210
            r7 = 1
            goto L_0x0211
        L_0x0210:
            r7 = 0
        L_0x0211:
            r20 = 1
            r1 = r3[r20]
            r23 = r8
            if (r1 == r6) goto L_0x021b
            r1 = 1
            goto L_0x021c
        L_0x021b:
            r1 = 0
        L_0x021c:
            int r8 = r15.f8181g0
            r15.H = r8
            r27 = r9
            float r9 = r15.f8179f0
            r15.I = r9
            r30 = r10
            int r10 = r15.f8206w
            r31 = r11
            int r11 = r15.f8208x
            r24 = 0
            r25 = 4
            r32 = r12
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02c2
            int r12 = r15.f8204u0
            r33 = r13
            r13 = 8
            if (r12 == r13) goto L_0x02c4
            r12 = 0
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0248
            if (r10 != 0) goto L_0x0248
            r10 = 3
        L_0x0248:
            r12 = 1
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0250
            if (r11 != 0) goto L_0x0250
            r11 = 3
        L_0x0250:
            r13 = 0
            r14 = r3[r13]
            if (r14 != r6) goto L_0x0262
            r13 = r3[r12]
            if (r13 != r6) goto L_0x0262
            r12 = 3
            if (r10 != r12) goto L_0x0263
            if (r11 != r12) goto L_0x0263
            r15.u1(r4, r5, r7, r1)
            goto L_0x02b6
        L_0x0262:
            r12 = 3
        L_0x0263:
            r1 = 0
            r7 = r3[r1]
            if (r7 != r6) goto L_0x0289
            if (r10 != r12) goto L_0x0289
            r15.H = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r3[r2]
            if (r0 == r6) goto L_0x027f
            r35 = r11
            r34 = r23
            r14 = 0
            r21 = 0
            r36 = 4
            goto L_0x02cf
        L_0x027f:
            r36 = r10
            r35 = r11
            r34 = r23
            r14 = 1
            r21 = 0
            goto L_0x02cf
        L_0x0289:
            r2 = 1
            r1 = r3[r2]
            if (r1 != r6) goto L_0x02b6
            r1 = 3
            if (r11 != r1) goto L_0x02b6
            r15.H = r2
            r1 = -1
            if (r8 != r1) goto L_0x029b
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.I = r1
        L_0x029b:
            float r1 = r15.I
            float r0 = (float) r0
            float r1 = r1 * r0
            int r8 = (int) r1
            r21 = 0
            r0 = r3[r21]
            r34 = r8
            r36 = r10
            if (r0 == r6) goto L_0x02b1
            r1 = r22
            r14 = 0
            r35 = 4
            goto L_0x02cf
        L_0x02b1:
            r35 = r11
            r1 = r22
            goto L_0x02c0
        L_0x02b6:
            r21 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
        L_0x02c0:
            r14 = 1
            goto L_0x02cf
        L_0x02c2:
            r33 = r13
        L_0x02c4:
            r21 = 0
            r36 = r10
            r35 = r11
            r1 = r22
            r34 = r23
            r14 = 0
        L_0x02cf:
            int[] r0 = r15.f8210y
            r0[r21] = r36
            r2 = 1
            r0[r2] = r35
            r15.f8182h = r14
            if (r14 == 0) goto L_0x02e4
            int r0 = r15.H
            r2 = -1
            if (r0 == 0) goto L_0x02e1
            if (r0 != r2) goto L_0x02e5
        L_0x02e1:
            r18 = 1
            goto L_0x02e7
        L_0x02e4:
            r2 = -1
        L_0x02e5:
            r18 = 0
        L_0x02e7:
            if (r14 == 0) goto L_0x02f3
            int r0 = r15.H
            r3 = 1
            if (r0 == r3) goto L_0x02f0
            if (r0 != r2) goto L_0x02f3
        L_0x02f0:
            r37 = 1
            goto L_0x02f5
        L_0x02f3:
            r37 = 0
        L_0x02f5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f8171b0
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x0304
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.d
            if (r0 == 0) goto L_0x0304
            r9 = 1
            goto L_0x0305
        L_0x0304:
            r9 = 0
        L_0x0305:
            if (r9 == 0) goto L_0x030a
            r22 = 0
            goto L_0x030c
        L_0x030a:
            r22 = r1
        L_0x030c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.X
            boolean r0 = r0.o()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f8169a0
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0433
            boolean r0 = r15.f8195p
            if (r0 != 0) goto L_0x0433
            if (r55 == 0) goto L_0x038a
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f8176e
            if (r0 == 0) goto L_0x038a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f8234h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x038a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x033a
            goto L_0x038a
        L_0x033a:
            if (r55 == 0) goto L_0x0386
            int r0 = r1.f8223g
            r12 = r54
            r11 = r33
            r12.f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.j r0 = r15.f8176e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            int r0 = r0.f8223g
            r10 = r32
            r12.f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x0370
            if (r4 == 0) goto L_0x0370
            boolean[] r0 = r15.f8180g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0370
            boolean r0 = r53.m0()
            if (r0 != 0) goto L_0x0370
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.S
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r3 = 8
            r12.h(r0, r10, r1, r3)
        L_0x0370:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0447
        L_0x0386:
            r12 = r54
            goto L_0x0433
        L_0x038a:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x039e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.S
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r7 = r0
            goto L_0x03a0
        L_0x039e:
            r7 = r40
        L_0x03a0:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x03ad
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.Q
            androidx.constraintlayout.core.SolverVariable r0 = r12.q(r0)
            r16 = r0
            goto L_0x03af
        L_0x03ad:
            r16 = r40
        L_0x03af:
            boolean[] r0 = r15.f8180g
            r19 = 0
            boolean r21 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f8171b0
            r32 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.S
            r41 = r2
            int r2 = r15.f8183h0
            r42 = r2
            int r2 = r15.f8194o0
            int[] r3 = r15.J
            r44 = r3[r19]
            float r3 = r15.f8197q0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03d4
            r45 = 1
            goto L_0x03d6
        L_0x03d4:
            r45 = 0
        L_0x03d6:
            int r0 = r15.f8212z
            r24 = r0
            int r0 = r15.A
            r25 = r0
            float r0 = r15.B
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r17 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r18
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0447
        L_0x0433:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0447:
            if (r55 == 0) goto L_0x04ad
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            if (r0 == 0) goto L_0x04a0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f8234h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x04a0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x04a0
            int r0 = r1.f8223g
            r14 = r54
            r13 = r51
            r14.f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f8235i
            int r0 = r0.f8223g
            r12 = r50
            r14.f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.l r0 = r15.f8178f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.k
            int r0 = r0.f8223g
            r1 = r49
            r14.f(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x049a
            if (r28 != 0) goto L_0x049a
            if (r47 == 0) goto L_0x049a
            boolean[] r2 = r15.f8180g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0496
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.T
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r2 = 8
            r10 = 0
            r14.h(r0, r12, r10, r2)
            goto L_0x049e
        L_0x0496:
            r2 = 8
            r10 = 0
            goto L_0x049e
        L_0x049a:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x049e:
            r7 = 0
            goto L_0x04bc
        L_0x04a0:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x04bb
        L_0x04ad:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x04bb:
            r7 = 1
        L_0x04bc:
            int r0 = r15.f8203u
            r3 = 2
            if (r0 != r3) goto L_0x04c3
            r6 = 0
            goto L_0x04c4
        L_0x04c3:
            r6 = r7
        L_0x04c4:
            if (r6 == 0) goto L_0x05a4
            boolean r0 = r15.q
            if (r0 != 0) goto L_0x05a4
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f8171b0
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04d8
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.d
            if (r0 == 0) goto L_0x04d8
            r9 = 1
            goto L_0x04d9
        L_0x04d8:
            r9 = 0
        L_0x04d9:
            if (r9 == 0) goto L_0x04dd
            r34 = 0
        L_0x04dd:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x04e9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.T
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r7 = r0
            goto L_0x04eb
        L_0x04e9:
            r7 = r40
        L_0x04eb:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f8173c0
            if (r0 == 0) goto L_0x04f7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.R
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r6 = r0
            goto L_0x04f9
        L_0x04f7:
            r6 = r40
        L_0x04f9:
            int r0 = r15.f8192n0
            if (r0 > 0) goto L_0x0501
            int r0 = r15.f8204u0
            if (r0 != r2) goto L_0x0541
        L_0x0501:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f8163f
            if (r3 == 0) goto L_0x052e
            int r0 = r53.r()
            r14.e(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f8163f
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.U
            int r3 = r3.f()
            r14.e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x052b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.T
            androidx.constraintlayout.core.SolverVariable r0 = r14.q(r0)
            r1 = 5
            r14.h(r7, r0, r10, r1)
        L_0x052b:
            r27 = 0
            goto L_0x0543
        L_0x052e:
            int r3 = r15.f8204u0
            if (r3 != r2) goto L_0x053a
            int r0 = r0.f()
            r14.e(r1, r13, r0, r2)
            goto L_0x0541
        L_0x053a:
            int r0 = r53.r()
            r14.e(r1, r13, r0, r2)
        L_0x0541:
            r27 = r38
        L_0x0543:
            boolean[] r0 = r15.f8180g
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f8171b0
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.T
            int r1 = r15.f8185i0
            int r2 = r15.f8196p0
            int[] r10 = r15.J
            r16 = r10[r11]
            float r10 = r15.f8199r0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0564
            r18 = 1
            goto L_0x0566
        L_0x0564:
            r18 = 0
        L_0x0566:
            int r0 = r15.C
            r24 = r0
            int r0 = r15.D
            r25 = r0
            float r0 = r15.E
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05a8
        L_0x05a4:
            r33 = r12
            r38 = r13
        L_0x05a8:
            if (r32 == 0) goto L_0x05d5
            r6 = 8
            r7 = r53
            int r0 = r7.H
            r1 = 1
            if (r0 != r1) goto L_0x05c3
            float r5 = r7.I
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05d7
        L_0x05c3:
            float r5 = r7.I
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05d7
        L_0x05d5:
            r7 = r53
        L_0x05d7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.X
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x05ff
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.j()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.h()
            float r1 = r7.K
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.X
            int r2 = r2.f()
            r3 = r54
            r3.b(r7, r0, r1, r2)
        L_0x05ff:
            r0 = 0
            r7.f8195p = r0
            r7.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.d, boolean):void");
    }

    public boolean g0() {
        return (this.f8188l == -1 && this.f8190m == -1) ? false : true;
    }

    public void g1(int i11) {
        if (i11 < 0) {
            this.f8194o0 = 0;
        } else {
            this.f8194o0 = i11;
        }
    }

    public boolean h() {
        return this.f8204u0 != 8;
    }

    public boolean h0(int i11, int i12) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i11 == 0) {
            ConstraintAnchor constraintAnchor3 = this.Q.f8163f;
            if (constraintAnchor3 == null || !constraintAnchor3.n() || (constraintAnchor2 = this.S.f8163f) == null || !constraintAnchor2.n() || (this.S.f8163f.e() - this.S.f()) - (this.Q.f8163f.e() + this.Q.f()) < i12) {
                return false;
            }
            return true;
        }
        ConstraintAnchor constraintAnchor4 = this.R.f8163f;
        if (constraintAnchor4 == null || !constraintAnchor4.n() || (constraintAnchor = this.T.f8163f) == null || !constraintAnchor.n() || (this.T.f8163f.e() - this.T.f()) - (this.R.f8163f.e() + this.R.f()) < i12) {
            return false;
        }
        return true;
        return false;
    }

    public void h1(int i11, int i12) {
        this.f8183h0 = i11;
        this.f8185i0 = i12;
    }

    public void i0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i11, int i12) {
        q(type).b(constraintWidget.q(type2), i11, i12, true);
    }

    public void i1(ConstraintWidget constraintWidget) {
        this.f8173c0 = constraintWidget;
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public void j1(float f11) {
        this.f8199r0 = f11;
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i11) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z11;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor q11 = q(type4);
                ConstraintAnchor q12 = constraintWidget.q(type2);
                ConstraintAnchor q13 = q(ConstraintAnchor.Type.RIGHT);
                q11.a(q12, 0);
                q13.a(q12, 0);
                q(type6).a(q12, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor q14 = constraintWidget.q(type2);
                q(type3).a(q14, 0);
                q(ConstraintAnchor.Type.BOTTOM).a(q14, 0);
                q(type7).a(q14, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                q(type8).a(constraintWidget.q(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                q(type9).a(constraintWidget.q(type9), 0);
                q(type6).a(constraintWidget.q(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                q(type10).a(constraintWidget.q(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                q(type11).a(constraintWidget.q(type11), 0);
                q(type7).a(constraintWidget.q(type2), 0);
            } else {
                ConstraintAnchor q15 = q(type);
                ConstraintAnchor q16 = constraintWidget.q(type2);
                if (q15.p(q16)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor q17 = q(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor q18 = q(ConstraintAnchor.Type.BOTTOM);
                        if (q17 != null) {
                            q17.q();
                        }
                        if (q18 != null) {
                            q18.q();
                        }
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor q19 = q(type12);
                        if (q19 != null) {
                            q19.q();
                        }
                        ConstraintAnchor q21 = q(type5);
                        if (q21.j() != q16) {
                            q21.q();
                        }
                        ConstraintAnchor g11 = q(type).g();
                        ConstraintAnchor q22 = q(type7);
                        if (q22.o()) {
                            g11.q();
                            q22.q();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor q23 = q(type5);
                        if (q23.j() != q16) {
                            q23.q();
                        }
                        ConstraintAnchor g12 = q(type).g();
                        ConstraintAnchor q24 = q(type6);
                        if (q24.o()) {
                            g12.q();
                            q24.q();
                        }
                    }
                    q15.a(q16, i11);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor q25 = q(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor q26 = q(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor q27 = q(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor q28 = q(type16);
            boolean z12 = true;
            if ((q25 == null || !q25.o()) && (q26 == null || !q26.o())) {
                k(type13, constraintWidget, type13, 0);
                k(type14, constraintWidget, type14, 0);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((q27 == null || !q27.o()) && (q28 == null || !q28.o())) {
                k(type15, constraintWidget, type15, 0);
                k(type16, constraintWidget, type16, 0);
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                q(type5).a(constraintWidget.q(type5), 0);
            } else if (z11) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                q(type17).a(constraintWidget.q(type17), 0);
            } else if (z12) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                q(type18).a(constraintWidget.q(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                k(type19, constraintWidget, type2, 0);
                k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                q(type5).a(constraintWidget.q(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                k(type20, constraintWidget, type2, 0);
                k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                q(type5).a(constraintWidget.q(type2), 0);
            }
        }
    }

    public boolean k0() {
        return this.f8198r;
    }

    public void k1(int i11) {
        this.K0 = i11;
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i11) {
        if (constraintAnchor.h() == this) {
            k(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i11);
        }
    }

    public boolean l0(int i11) {
        return this.f8169a0[i11];
    }

    public void l1(int i11, int i12) {
        this.f8185i0 = i11;
        int i13 = i12 - i11;
        this.f8177e0 = i13;
        int i14 = this.f8196p0;
        if (i13 < i14) {
            this.f8177e0 = i14;
        }
    }

    public void m(ConstraintWidget constraintWidget, float f11, int i11) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        i0(type, constraintWidget, type, i11, 0);
        this.K = f11;
    }

    public boolean m0() {
        ConstraintAnchor constraintAnchor = this.Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8163f;
        if (constraintAnchor2 != null && constraintAnchor2.f8163f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f8163f;
        return constraintAnchor4 != null && constraintAnchor4.f8163f == constraintAnchor3;
    }

    public void m1(DimensionBehaviour dimensionBehaviour) {
        this.f8171b0[1] = dimensionBehaviour;
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.t = constraintWidget.t;
        this.f8203u = constraintWidget.f8203u;
        this.f8206w = constraintWidget.f8206w;
        this.f8208x = constraintWidget.f8208x;
        int[] iArr = this.f8210y;
        int[] iArr2 = constraintWidget.f8210y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f8212z = constraintWidget.f8212z;
        this.A = constraintWidget.A;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.I = constraintWidget.I;
        int[] iArr3 = constraintWidget.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.M = constraintWidget.M;
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f8171b0 = (DimensionBehaviour[]) Arrays.copyOf(this.f8171b0, 2);
        ConstraintWidget constraintWidget2 = null;
        this.f8173c0 = this.f8173c0 == null ? null : hashMap.get(constraintWidget.f8173c0);
        this.f8175d0 = constraintWidget.f8175d0;
        this.f8177e0 = constraintWidget.f8177e0;
        this.f8179f0 = constraintWidget.f8179f0;
        this.f8181g0 = constraintWidget.f8181g0;
        this.f8183h0 = constraintWidget.f8183h0;
        this.f8185i0 = constraintWidget.f8185i0;
        this.f8186j0 = constraintWidget.f8186j0;
        this.f8187k0 = constraintWidget.f8187k0;
        this.f8189l0 = constraintWidget.f8189l0;
        this.f8191m0 = constraintWidget.f8191m0;
        this.f8192n0 = constraintWidget.f8192n0;
        this.f8194o0 = constraintWidget.f8194o0;
        this.f8196p0 = constraintWidget.f8196p0;
        this.f8197q0 = constraintWidget.f8197q0;
        this.f8199r0 = constraintWidget.f8199r0;
        this.f8201s0 = constraintWidget.f8201s0;
        this.f8202t0 = constraintWidget.f8202t0;
        this.f8204u0 = constraintWidget.f8204u0;
        this.f8205v0 = constraintWidget.f8205v0;
        this.f8207w0 = constraintWidget.f8207w0;
        this.f8209x0 = constraintWidget.f8209x0;
        this.f8211y0 = constraintWidget.f8211y0;
        this.f8213z0 = constraintWidget.f8213z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        this.G0 = constraintWidget.G0;
        this.H0 = constraintWidget.H0;
        this.J0 = constraintWidget.J0;
        this.K0 = constraintWidget.K0;
        this.L0 = constraintWidget.L0;
        this.M0 = constraintWidget.M0;
        float[] fArr = this.N0;
        float[] fArr2 = constraintWidget.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.Q0;
        this.Q0 = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.R0;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.R0 = constraintWidget2;
    }

    public boolean n0() {
        return this.M;
    }

    public void n1(int i11, int i12, int i13, float f11) {
        this.f8208x = i11;
        this.C = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.D = i13;
        this.E = f11;
        if (f11 > 0.0f && f11 < 1.0f && i11 == 0) {
            this.f8208x = 2;
        }
    }

    public void o(d dVar) {
        dVar.q(this.Q);
        dVar.q(this.R);
        dVar.q(this.S);
        dVar.q(this.T);
        if (this.f8192n0 > 0) {
            dVar.q(this.U);
        }
    }

    public boolean o0() {
        ConstraintAnchor constraintAnchor = this.R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8163f;
        if (constraintAnchor2 != null && constraintAnchor2.f8163f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f8163f;
        return constraintAnchor4 != null && constraintAnchor4.f8163f == constraintAnchor3;
    }

    public void o1(float f11) {
        this.N0[1] = f11;
    }

    public void p() {
        if (this.f8176e == null) {
            this.f8176e = new j(this);
        }
        if (this.f8178f == null) {
            this.f8178f = new l(this);
        }
    }

    public boolean p0() {
        return this.N;
    }

    public void p1(int i11) {
        this.f8204u0 = i11;
    }

    public ConstraintAnchor q(ConstraintAnchor.Type type) {
        switch (a.f8214a[type.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean q0() {
        return this.f8184i && this.f8204u0 != 8;
    }

    public void q1(int i11) {
        this.f8175d0 = i11;
        int i12 = this.f8194o0;
        if (i11 < i12) {
            this.f8175d0 = i12;
        }
    }

    public int r() {
        return this.f8192n0;
    }

    public boolean r0() {
        return this.f8195p || (this.Q.n() && this.S.n());
    }

    public void r1(int i11) {
        if (i11 >= 0 && i11 <= 3) {
            this.v = i11;
        }
    }

    public float s(int i11) {
        if (i11 == 0) {
            return this.f8197q0;
        }
        if (i11 == 1) {
            return this.f8199r0;
        }
        return -1.0f;
    }

    public boolean s0() {
        return this.q || (this.R.n() && this.T.n());
    }

    public void s1(int i11) {
        this.f8183h0 = i11;
    }

    public int t() {
        return c0() + this.f8177e0;
    }

    public boolean t0() {
        return this.f8200s;
    }

    public void t1(int i11) {
        this.f8185i0 = i11;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f8209x0 != null) {
            str = "type: " + this.f8209x0 + " ";
        } else {
            str = str2;
        }
        sb2.append(str);
        if (this.f8207w0 != null) {
            str2 = "id: " + this.f8207w0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f8183h0);
        sb2.append(", ");
        sb2.append(this.f8185i0);
        sb2.append(") - (");
        sb2.append(this.f8175d0);
        sb2.append(" x ");
        sb2.append(this.f8177e0);
        sb2.append(")");
        return sb2.toString();
    }

    public Object u() {
        return this.f8201s0;
    }

    public void u0() {
        this.f8198r = true;
    }

    public void u1(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.H == -1) {
            if (z13 && !z14) {
                this.H = 0;
            } else if (!z13 && z14) {
                this.H = 1;
                if (this.f8181g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.o() || !this.T.o())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.o() || !this.S.o())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.o() || !this.T.o() || !this.Q.o() || !this.S.o())) {
            if (this.R.o() && this.T.o()) {
                this.H = 0;
            } else if (this.Q.o() && this.S.o()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i11 = this.f8212z;
            if (i11 > 0 && this.C == 0) {
                this.H = 0;
            } else if (i11 == 0 && this.C > 0) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public String v() {
        return this.f8207w0;
    }

    public void v0() {
        this.f8200s = true;
    }

    public void v1(boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean k11 = z11 & this.f8176e.k();
        boolean k12 = z12 & this.f8178f.k();
        j jVar = this.f8176e;
        int i13 = jVar.f8234h.f8223g;
        l lVar = this.f8178f;
        int i14 = lVar.f8234h.f8223g;
        int i15 = jVar.f8235i.f8223g;
        int i16 = lVar.f8235i.f8223g;
        int i17 = i16 - i14;
        if (i15 - i13 < 0 || i17 < 0 || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE) {
            i15 = 0;
            i13 = 0;
            i16 = 0;
            i14 = 0;
        }
        int i18 = i15 - i13;
        int i19 = i16 - i14;
        if (k11) {
            this.f8183h0 = i13;
        }
        if (k12) {
            this.f8185i0 = i14;
        }
        if (this.f8204u0 == 8) {
            this.f8175d0 = 0;
            this.f8177e0 = 0;
            return;
        }
        if (k11) {
            if (this.f8171b0[0] == DimensionBehaviour.FIXED && i18 < (i12 = this.f8175d0)) {
                i18 = i12;
            }
            this.f8175d0 = i18;
            int i21 = this.f8194o0;
            if (i18 < i21) {
                this.f8175d0 = i21;
            }
        }
        if (k12) {
            if (this.f8171b0[1] == DimensionBehaviour.FIXED && i19 < (i11 = this.f8177e0)) {
                i19 = i11;
            }
            this.f8177e0 = i19;
            int i22 = this.f8196p0;
            if (i19 < i22) {
                this.f8177e0 = i22;
            }
        }
    }

    public DimensionBehaviour w(int i11) {
        if (i11 == 0) {
            return C();
        }
        if (i11 == 1) {
            return X();
        }
        return null;
    }

    public boolean w0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f8171b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void w1(d dVar, boolean z11) {
        l lVar;
        j jVar;
        int x11 = dVar.x(this.Q);
        int x12 = dVar.x(this.R);
        int x13 = dVar.x(this.S);
        int x14 = dVar.x(this.T);
        if (z11 && (jVar = this.f8176e) != null) {
            DependencyNode dependencyNode = jVar.f8234h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = jVar.f8235i;
                if (dependencyNode2.j) {
                    x11 = dependencyNode.f8223g;
                    x13 = dependencyNode2.f8223g;
                }
            }
        }
        if (z11 && (lVar = this.f8178f) != null) {
            DependencyNode dependencyNode3 = lVar.f8234h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = lVar.f8235i;
                if (dependencyNode4.j) {
                    x12 = dependencyNode3.f8223g;
                    x14 = dependencyNode4.f8223g;
                }
            }
        }
        int i11 = x14 - x12;
        if (x13 - x11 < 0 || i11 < 0 || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE || x14 == Integer.MIN_VALUE || x14 == Integer.MAX_VALUE) {
            x14 = 0;
            x11 = 0;
            x12 = 0;
            x13 = 0;
        }
        P0(x11, x12, x13, x14);
    }

    public float x() {
        return this.f8179f0;
    }

    public void x0() {
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f8173c0 = null;
        this.K = 0.0f;
        this.f8175d0 = 0;
        this.f8177e0 = 0;
        this.f8179f0 = 0.0f;
        this.f8181g0 = -1;
        this.f8183h0 = 0;
        this.f8185i0 = 0;
        this.f8189l0 = 0;
        this.f8191m0 = 0;
        this.f8192n0 = 0;
        this.f8194o0 = 0;
        this.f8196p0 = 0;
        float f11 = U0;
        this.f8197q0 = f11;
        this.f8199r0 = f11;
        DimensionBehaviour[] dimensionBehaviourArr = this.f8171b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f8201s0 = null;
        this.f8202t0 = 0;
        this.f8204u0 = 0;
        this.f8209x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.f8203u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f8206w = 0;
        this.f8208x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f8212z = 0;
        this.C = 0;
        this.f8182h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f8180g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f8169a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f8184i = true;
        int[] iArr2 = this.f8210y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f8188l = -1;
        this.f8190m = -1;
    }

    public int y() {
        return this.f8181g0;
    }

    public void y0() {
        z0();
        j1(U0);
        S0(U0);
    }

    public int z() {
        if (this.f8204u0 == 8) {
            return 0;
        }
        return this.f8177e0;
    }

    public void z0() {
        ConstraintWidget N2 = N();
        if (N2 == null || !(N2 instanceof d) || !((d) N()).R1()) {
            int size = this.Z.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.Z.get(i11).q();
            }
        }
    }

    public ConstraintWidget(int i11, int i12, int i13, int i14) {
        this.f8168a = false;
        this.f8170b = new WidgetRun[2];
        this.f8176e = null;
        this.f8178f = null;
        this.f8180g = new boolean[]{true, true};
        this.f8182h = false;
        this.f8184i = true;
        this.j = false;
        this.k = true;
        this.f8188l = -1;
        this.f8190m = -1;
        this.n = new b(this);
        this.f8195p = false;
        this.q = false;
        this.f8198r = false;
        this.f8200s = false;
        this.t = -1;
        this.f8203u = -1;
        this.v = 0;
        this.f8206w = 0;
        this.f8208x = 0;
        this.f8210y = new int[2];
        this.f8212z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = 0.0f;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.f8169a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f8171b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f8173c0 = null;
        this.f8179f0 = 0.0f;
        this.f8181g0 = -1;
        this.f8186j0 = 0;
        this.f8187k0 = 0;
        this.f8189l0 = 0;
        this.f8191m0 = 0;
        this.f8192n0 = 0;
        float f11 = U0;
        this.f8197q0 = f11;
        this.f8199r0 = f11;
        this.f8202t0 = 0;
        this.f8204u0 = 0;
        this.f8205v0 = false;
        this.f8207w0 = null;
        this.f8209x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.f8183h0 = i11;
        this.f8185i0 = i12;
        this.f8175d0 = i13;
        this.f8177e0 = i14;
        d();
    }

    public ConstraintWidget(int i11, int i12) {
        this(0, 0, i11, i12);
    }
}

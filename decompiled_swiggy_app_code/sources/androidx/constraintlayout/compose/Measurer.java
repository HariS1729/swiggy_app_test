package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import bp0.f;
import bp0.k;
import com.newrelic.agent.android.util.SafeJsonPrimitive;
import d2.c;
import d2.e;
import d2.m;
import d2.q;
import defpackage.a2;
import e0.g;
import e0.s0;
import f2.h;
import f2.j;
import f2.s;
import i1.e0;
import i1.r;
import i1.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import p1.c0;
import u0.d0;
import u0.f0;
import u0.h1;
import u1.i;
import u1.t;
import u1.v;

/* compiled from: ConstraintLayout.kt */
public class Measurer implements b.C0027b, j {

    /* renamed from: a  reason: collision with root package name */
    private String f7975a = "";

    /* renamed from: b  reason: collision with root package name */
    private s f7976b;

    /* renamed from: c  reason: collision with root package name */
    private final d f7977c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<r, e0> f7978d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<r, Integer[]> f7979e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<r, k2.b> f7980f;

    /* renamed from: g  reason: collision with root package name */
    protected e f7981g;

    /* renamed from: h  reason: collision with root package name */
    protected w f7982h;

    /* renamed from: i  reason: collision with root package name */
    private final f f7983i;
    private final int[] j;
    private final int[] k;

    /* renamed from: l  reason: collision with root package name */
    private float f7984l;

    /* renamed from: m  reason: collision with root package name */
    private int f7985m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<h> f7986o;

    /* compiled from: ConstraintLayout.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7987a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            f7987a = iArr;
        }
    }

    public Measurer() {
        d dVar = new d(0, 0);
        dVar.b2(this);
        k kVar = k.f22762a;
        this.f7977c = dVar;
        this.f7978d = new LinkedHashMap();
        this.f7979e = new LinkedHashMap();
        this.f7980f = new LinkedHashMap();
        this.f7983i = b.a(LazyThreadSafetyMode.NONE, new Measurer$state$2(this));
        this.j = new int[2];
        this.k = new int[2];
        this.f7984l = Float.NaN;
        this.f7986o = new ArrayList<>();
    }

    private final void f(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f8246e);
        numArr[1] = Integer.valueOf(aVar.f8247f);
        numArr[2] = Integer.valueOf(aVar.f8248g);
    }

    private final long i(String str, long j11) {
        if (str != null && StringsKt__StringsKt.N0(str, '#', false, 2, (Object) null)) {
            String substring = str.substring(1);
            p.i(substring, "(this as java.lang.String).substring(startIndex)");
            if (substring.length() == 6) {
                substring = p.s("FF", substring);
            }
            try {
                return f0.b((int) Long.parseLong(substring, 16));
            } catch (Exception unused) {
            }
        }
        return j11;
    }

    static /* synthetic */ long j(Measurer measurer, String str, long j11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                j11 = d0.f16756b.a();
            }
            return measurer.i(str, j11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
    }

    private final c0 r(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        String str = hashMap2.get("size");
        long a11 = d2.r.f14022b.a();
        if (str != null) {
            a11 = d2.s.e(Float.parseFloat(str));
        }
        return new c0(j(this, hashMap2.get("color"), 0, 2, (Object) null), a11, (v) null, (u1.s) null, (t) null, (i) null, (String) null, 0, (a2.a) null, (a2.h) null, (w1.f) null, 0, (a2.e) null, (h1) null, (a2.d) null, (a2.f) null, 0, (a2.j) null, 262140, (kotlin.jvm.internal.i) null);
    }

    private final boolean s(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int[] iArr) {
        int i15 = a.f7987a[dimensionBehaviour.ordinal()];
        if (i15 == 1) {
            iArr[0] = i11;
            iArr[1] = i11;
        } else if (i15 == 2) {
            iArr[0] = 0;
            iArr[1] = i14;
            return true;
        } else if (i15 == 3) {
            if (ConstraintLayoutKt.f7936a) {
                Log.d("CCL", p.s("Measure strategy ", Integer.valueOf(i13)));
                Log.d("CCL", p.s("DW ", Integer.valueOf(i12)));
                Log.d("CCL", p.s("ODR ", Boolean.valueOf(z11)));
                Log.d("CCL", p.s("IRH ", Boolean.valueOf(z12)));
            }
            boolean z13 = z12 || ((i13 == b.a.f8240l || i13 == b.a.f8241m) && (i13 == b.a.f8241m || i12 != 1 || z11));
            if (ConstraintLayoutKt.f7936a) {
                Log.d("CCL", p.s("UD ", Boolean.valueOf(z13)));
            }
            iArr[0] = z13 ? i11 : 0;
            if (!z13) {
                i11 = i14;
            }
            iArr[1] = i11;
            if (!z13) {
                return true;
            }
        } else if (i15 == 4) {
            iArr[0] = i14;
            iArr[1] = i14;
        } else {
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
        return false;
    }

    public void a() {
    }

    public void b(ConstraintWidget constraintWidget, b.a aVar) {
        int i11;
        int i12;
        Integer num;
        String str;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        Integer num2;
        Integer num3;
        ConstraintWidget constraintWidget2 = constraintWidget;
        b.a aVar2 = aVar;
        p.j(constraintWidget2, "constraintWidget");
        p.j(aVar2, "measure");
        Object u11 = constraintWidget.u();
        if (u11 instanceof r) {
            if (ConstraintLayoutKt.f7936a) {
                Log.d("CCL", "Measuring " + LayoutIdKt.a((r) u11) + " with: " + ConstraintLayoutKt.i(constraintWidget) + 10 + ConstraintLayoutKt.j(aVar));
            }
            Integer[] numArr = this.f7979e.get(u11);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f8242a;
            p.i(dimensionBehaviour2, "measure.horizontalBehavior");
            int i13 = aVar2.f8244c;
            int i14 = constraintWidget2.f8206w;
            int i15 = aVar2.j;
            if (numArr == null || (num3 = numArr[1]) == null) {
                i11 = 0;
            } else {
                i11 = num3.intValue();
            }
            String str2 = "CCL";
            boolean z12 = false;
            s(dimensionBehaviour2, i13, i14, i15, i11 == constraintWidget.z(), constraintWidget.r0(), d2.b.n(q().x()), this.j);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar2.f8243b;
            p.i(dimensionBehaviour3, "measure.verticalBehavior");
            int i16 = aVar2.f8245d;
            int i17 = constraintWidget2.f8208x;
            int i18 = aVar2.j;
            if (numArr == null || (num2 = numArr[0]) == null) {
                i12 = 0;
            } else {
                i12 = num2.intValue();
            }
            s(dimensionBehaviour3, i16, i17, i18, i12 == constraintWidget.a0(), constraintWidget.s0(), d2.b.m(q().x()), this.k);
            int[] iArr = this.j;
            int i19 = iArr[0];
            int i21 = iArr[1];
            int[] iArr2 = this.k;
            long a11 = c.a(i19, i21, iArr2[0], iArr2[1]);
            int i22 = aVar2.j;
            Integer num4 = null;
            if (!(i22 != b.a.f8240l && i22 != b.a.f8241m && aVar2.f8242a == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget2.f8206w == 0 && aVar2.f8243b == dimensionBehaviour && constraintWidget2.f8208x == 0)) {
                if (ConstraintLayoutKt.f7936a) {
                    str = str2;
                    Log.d(str, "Measuring " + LayoutIdKt.a((r) u11) + " with " + d2.b.s(a11));
                } else {
                    str = str2;
                }
                r rVar = (r) u11;
                e0 N = rVar.N(a11);
                p().put(u11, N);
                constraintWidget2.e1(false);
                if (ConstraintLayoutKt.f7936a) {
                    Log.d(str, LayoutIdKt.a(rVar) + " is size " + N.A0() + SafeJsonPrimitive.NULL_CHAR + N.e0());
                }
                Integer valueOf = Integer.valueOf(N.A0());
                Integer valueOf2 = Integer.valueOf(constraintWidget2.f8212z);
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                Integer valueOf3 = Integer.valueOf(constraintWidget2.A);
                if (!(valueOf3.intValue() > 0)) {
                    valueOf3 = null;
                }
                int intValue = ((Number) l.p(valueOf, valueOf2, valueOf3)).intValue();
                Integer valueOf4 = Integer.valueOf(N.e0());
                Integer valueOf5 = Integer.valueOf(constraintWidget2.C);
                if (!(valueOf5.intValue() > 0)) {
                    valueOf5 = null;
                }
                Integer valueOf6 = Integer.valueOf(constraintWidget2.D);
                if (!(valueOf6.intValue() > 0)) {
                    valueOf6 = null;
                }
                int intValue2 = ((Number) l.p(valueOf4, valueOf5, valueOf6)).intValue();
                if (intValue != N.A0()) {
                    a11 = c.a(intValue, intValue, d2.b.o(a11), d2.b.m(a11));
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (intValue2 != N.e0()) {
                    a11 = c.a(d2.b.p(a11), d2.b.n(a11), intValue2, intValue2);
                    z11 = true;
                }
                if (z11) {
                    if (ConstraintLayoutKt.f7936a) {
                        Log.d(str, "Remeasuring coerced " + LayoutIdKt.a(rVar) + " with " + d2.b.s(a11));
                    }
                    p().put(u11, rVar.N(a11));
                    constraintWidget2.e1(false);
                }
            }
            e0 e0Var = this.f7978d.get(u11);
            if (e0Var == null) {
                num = null;
            } else {
                num = Integer.valueOf(e0Var.A0());
            }
            aVar2.f8246e = num == null ? constraintWidget.a0() : num.intValue();
            if (e0Var != null) {
                num4 = Integer.valueOf(e0Var.e0());
            }
            aVar2.f8247f = num4 == null ? constraintWidget.z() : num4.intValue();
            int A = (e0Var == null || !q().y(constraintWidget2)) ? Integer.MIN_VALUE : e0Var.A(AlignmentLineKt.a());
            aVar2.f8249h = A != Integer.MIN_VALUE;
            aVar2.f8248g = A;
            Map<r, Integer[]> map = this.f7979e;
            Integer[] numArr2 = map.get(u11);
            if (numArr2 == null) {
                numArr2 = new Integer[]{0, 0, Integer.MIN_VALUE};
                map.put(u11, numArr2);
            }
            f(numArr2, aVar2);
            if (!(aVar2.f8246e == aVar2.f8244c && aVar2.f8247f == aVar2.f8245d)) {
                z12 = true;
            }
            aVar2.f8250i = z12;
        }
    }

    public final void c(s sVar) {
        this.f7976b = sVar;
        if (sVar != null) {
            sVar.b(this.f7975a);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(long j11) {
        this.f7977c.q1(d2.b.n(j11));
        this.f7977c.R0(d2.b.m(j11));
        this.f7984l = Float.NaN;
        s sVar = this.f7976b;
        Integer num = null;
        float f11 = 1.0f;
        if (sVar != null) {
            Integer valueOf = sVar == null ? null : Integer.valueOf(sVar.h());
            if (valueOf == null || valueOf.intValue() != Integer.MIN_VALUE) {
                s sVar2 = this.f7976b;
                p.g(sVar2);
                int h11 = sVar2.h();
                if (h11 > this.f7977c.a0()) {
                    this.f7984l = ((float) this.f7977c.a0()) / ((float) h11);
                } else {
                    this.f7984l = 1.0f;
                }
                this.f7977c.q1(h11);
            }
        }
        s sVar3 = this.f7976b;
        if (sVar3 != null) {
            if (sVar3 != null) {
                num = Integer.valueOf(sVar3.f());
            }
            if (num == null || num.intValue() != Integer.MIN_VALUE) {
                s sVar4 = this.f7976b;
                p.g(sVar4);
                int f12 = sVar4.f();
                if (Float.isNaN(this.f7984l)) {
                    this.f7984l = 1.0f;
                }
                if (f12 > this.f7977c.z()) {
                    f11 = ((float) this.f7977c.z()) / ((float) f12);
                }
                if (f11 < this.f7984l) {
                    this.f7984l = f11;
                }
                this.f7977c.R0(f12);
            }
        }
        this.f7985m = this.f7977c.a0();
        this.n = this.f7977c.z();
    }

    public void e() {
        ConstraintWidget constraintWidget;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.f7977c.a0() + " ,");
        sb2.append("  bottom:  " + this.f7977c.z() + " ,");
        sb2.append(" } }");
        Iterator<ConstraintWidget> it2 = this.f7977c.x1().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            Object u11 = next.u();
            if (u11 instanceof r) {
                k2.b bVar = null;
                if (next.f8193o == null) {
                    r rVar = (r) u11;
                    Object a11 = LayoutIdKt.a(rVar);
                    if (a11 == null) {
                        a11 = f2.c.a(rVar);
                    }
                    if (a11 == null) {
                        str = null;
                    } else {
                        str = a11.toString();
                    }
                    next.f8193o = str;
                }
                k2.b bVar2 = this.f7980f.get(u11);
                if (!(bVar2 == null || (constraintWidget = bVar2.f15387a) == null)) {
                    bVar = constraintWidget.n;
                }
                if (bVar != null) {
                    sb2.append(SafeJsonPrimitive.NULL_CHAR + next.f8193o + ": {");
                    sb2.append(" interpolated : ");
                    bVar.d(sb2, true);
                    sb2.append("}, ");
                }
            } else if (next instanceof androidx.constraintlayout.core.widgets.f) {
                sb2.append(SafeJsonPrimitive.NULL_CHAR + next.f8193o + ": {");
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) next;
                if (fVar.y1() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + fVar.b0() + ", top: " + fVar.c0() + ", right: " + (fVar.b0() + fVar.a0()) + ", bottom: " + (fVar.c0() + fVar.z()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        p.i(sb3, "json.toString()");
        this.f7975a = sb3;
        s sVar = this.f7976b;
        if (sVar != null) {
            sVar.b(sb3);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(e0.g r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = -186577107(0xfffffffff4e10f2d, float:-1.4264827E32)
            r2 = r23
            e0.g r1 = r2.t(r1)
            java.util.ArrayList<f2.h> r2 = r0.f7986o
            java.util.Iterator r21 = r2.iterator()
        L_0x0011:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x0297
            java.lang.Object r2 = r21.next()
            f2.h r2 = (f2.h) r2
            java.lang.String r3 = r2.a()
            f2.i r4 = f2.i.f14574a
            java.util.HashMap r4 = r4.a()
            java.lang.String r5 = r2.c()
            java.lang.Object r4 = r4.get(r5)
            lp0.r r4 = (lp0.r) r4
            if (r4 == 0) goto L_0x004a
            r5 = -186576910(0xfffffffff4e10ff2, float:-1.4265017E32)
            r1.E(r5)
            java.util.HashMap r2 = r2.b()
            r5 = 64
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.invoke(r3, r2, r1, r5)
            r1.P()
            goto L_0x0011
        L_0x004a:
            r4 = -186576844(0xfffffffff4e11034, float:-1.4265081E32)
            r1.E(r4)
            java.lang.String r4 = r2.c()
            int r5 = r4.hashCode()
            r6 = 8
            java.lang.String r7 = "backgroundColor"
            r8 = 0
            java.lang.String r9 = "text"
            switch(r5) {
                case -1377687758: goto L_0x021a;
                case -1031434259: goto L_0x01d8;
                case 97739: goto L_0x00d5;
                case 3556653: goto L_0x0094;
                case 100313435: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0289
        L_0x0064:
            java.lang.String r2 = "image"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x006e
            goto L_0x0289
        L_0x006e:
            r2 = -186574977(0xfffffffff4e1177f, float:-1.4266887E32)
            r1.E(r2)
            p0.d$a r2 = p0.d.f16037h0
            p0.d r4 = androidx.compose.ui.layout.LayoutIdKt.b(r2, r3)
            r2 = 17301567(0x108003f, float:2.4979432E-38)
            androidx.compose.ui.graphics.painter.Painter r2 = m1.e.c(r2, r1, r8)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 56
            r11 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = "Placeholder Image"
            r9 = r1
            androidx.compose.foundation.ImageKt.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.P()
            goto L_0x0292
        L_0x0094:
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x009c
            goto L_0x0289
        L_0x009c:
            r4 = -186575591(0xfffffffff4e11519, float:-1.4266293E32)
            r1.E(r4)
            java.util.HashMap r4 = r2.b()
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00af
            r4 = r9
        L_0x00af:
            p0.d$a r5 = p0.d.f16037h0
            p0.d r3 = androidx.compose.ui.layout.LayoutIdKt.b(r5, r3)
            java.util.HashMap r2 = r2.b()
            p1.c0 r5 = r0.r(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32768(0x8000, float:4.5918E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.P()
            goto L_0x0292
        L_0x00d5:
            java.lang.String r5 = "box"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00df
            goto L_0x0289
        L_0x00df:
            r4 = -186576210(0xfffffffff4e112ae, float:-1.4265694E32)
            r1.E(r4)
            java.util.HashMap r4 = r2.b()
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00f3
            java.lang.String r4 = ""
        L_0x00f3:
            java.util.HashMap r5 = r2.b()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            u0.d0$a r7 = u0.d0.f16756b
            long r9 = r7.c()
            long r12 = r0.i(r5, r9)
            p0.d$a r5 = p0.d.f16037h0
            p0.d r11 = androidx.compose.ui.layout.LayoutIdKt.b(r5, r3)
            r14 = 0
            r15 = 2
            r16 = 0
            p0.d r3 = androidx.compose.foundation.BackgroundKt.d(r11, r12, r14, r15, r16)
            r7 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r1.E(r7)
            p0.a$a r7 = p0.a.f16019a
            p0.a r7 = r7.o()
            i1.t r7 = androidx.compose.foundation.layout.BoxKt.h(r7, r8, r1, r8)
            r9 = 1376089335(0x520574f7, float:1.43298249E11)
            r1.E(r9)
            e0.m0 r9 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r9 = r1.z(r9)
            d2.e r9 = (d2.e) r9
            e0.m0 r10 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r10 = r1.z(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.ui.unit.LayoutDirection) r10
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r12 = r11.a()
            lp0.q r3 = androidx.compose.ui.layout.LayoutKt.b(r3)
            e0.e r13 = r1.u()
            boolean r13 = r13 instanceof e0.e
            if (r13 != 0) goto L_0x0154
            e0.f.c()
        L_0x0154:
            r1.f()
            boolean r13 = r1.s()
            if (r13 == 0) goto L_0x0161
            r1.K(r12)
            goto L_0x0164
        L_0x0161:
            r1.c()
        L_0x0164:
            r1.J()
            e0.g r12 = androidx.compose.runtime.Updater.a(r1)
            lp0.p r13 = r11.d()
            androidx.compose.runtime.Updater.c(r12, r7, r13)
            lp0.p r7 = r11.b()
            androidx.compose.runtime.Updater.c(r12, r9, r7)
            lp0.p r7 = r11.c()
            androidx.compose.runtime.Updater.c(r12, r10, r7)
            r1.o()
            e0.g r7 = e0.t0.b(r1)
            e0.t0 r7 = e0.t0.a(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.invoke(r7, r1, r8)
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.E(r3)
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r1.E(r3)
            androidx.compose.foundation.layout.BoxScopeInstance r3 = androidx.compose.foundation.layout.BoxScopeInstance.f3698a
            float r3 = (float) r6
            float r3 = d2.h.n(r3)
            p0.d r3 = androidx.compose.foundation.layout.PaddingKt.i(r5, r3)
            java.util.HashMap r2 = r2.b()
            p1.c0 r5 = r0.r(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32816(0x8030, float:4.5985E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.P()
            r1.P()
            r1.d()
            r1.P()
            r1.P()
            r1.P()
            goto L_0x0292
        L_0x01d8:
            java.lang.String r5 = "textfield"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01e2
            goto L_0x0289
        L_0x01e2:
            r4 = -186575317(0xfffffffff4e1162b, float:-1.4266558E32)
            r1.E(r4)
            java.util.HashMap r2 = r2.b()
            java.lang.Object r2 = r2.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x01f5
            r2 = r9
        L_0x01f5:
            p0.d$a r4 = p0.d.f16037h0
            p0.d r4 = androidx.compose.ui.layout.LayoutIdKt.b(r4, r3)
            androidx.constraintlayout.compose.Measurer$createDesignElements$2 r3 = androidx.constraintlayout.compose.Measurer$createDesignElements$2.f7988a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 32760(0x7ff8, float:4.5907E-41)
            r17 = r1
            androidx.compose.foundation.text.BasicTextFieldKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.P()
            goto L_0x0292
        L_0x021a:
            java.lang.String r5 = "button"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0223
            goto L_0x0289
        L_0x0223:
            r4 = -186576772(0xfffffffff4e1107c, float:-1.4265151E32)
            r1.E(r4)
            java.util.HashMap r4 = r2.b()
            java.lang.Object r4 = r4.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0236
            r4 = r9
        L_0x0236:
            java.util.HashMap r5 = r2.b()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            u0.d0$a r7 = u0.d0.f16756b
            long r7 = r7.c()
            long r10 = r0.i(r5, r7)
            p0.d$a r5 = p0.d.f16037h0
            p0.d r3 = androidx.compose.ui.layout.LayoutIdKt.b(r5, r3)
            r5 = 20
            z.f r5 = z.g.a(r5)
            p0.d r9 = r0.d.a(r3, r5)
            r12 = 0
            r13 = 2
            r14 = 0
            p0.d r3 = androidx.compose.foundation.BackgroundKt.d(r9, r10, r12, r13, r14)
            float r5 = (float) r6
            float r5 = d2.h.n(r5)
            p0.d r3 = androidx.compose.foundation.layout.PaddingKt.i(r3, r5)
            java.util.HashMap r2 = r2.b()
            p1.c0 r5 = r0.r(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 32768(0x8000, float:4.5918E-41)
            r11 = 120(0x78, float:1.68E-43)
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r1
            androidx.compose.foundation.text.BasicTextKt.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1.P()
            goto L_0x0292
        L_0x0289:
            r2 = -186574652(0xfffffffff4e118c4, float:-1.4267201E32)
            r1.E(r2)
            r1.P()
        L_0x0292:
            r1.P()
            goto L_0x0011
        L_0x0297:
            e0.s0 r1 = r1.v()
            if (r1 != 0) goto L_0x029e
            goto L_0x02a8
        L_0x029e:
            androidx.constraintlayout.compose.Measurer$createDesignElements$3 r2 = new androidx.constraintlayout.compose.Measurer$createDesignElements$3
            r3 = r24
            r2.<init>(r0, r3)
            r1.a(r2)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.Measurer.g(e0.g, int):void");
    }

    public final void h(a2.e eVar, float f11, g gVar, int i11) {
        p.j(eVar, "<this>");
        g t = gVar.t(-756996700);
        CanvasKt.a(eVar.d(p0.d.f16037h0), new Measurer$drawDebugBounds$1(this, f11), t, 0);
        s0 v = t.v();
        if (v != null) {
            v.a(new Measurer$drawDebugBounds$2(this, eVar, f11, i11));
        }
    }

    /* access modifiers changed from: protected */
    public final e k() {
        e eVar = this.f7981g;
        if (eVar != null) {
            return eVar;
        }
        p.B("density");
        throw null;
    }

    public final float l() {
        return this.f7984l;
    }

    /* access modifiers changed from: protected */
    public final Map<r, k2.b> m() {
        return this.f7980f;
    }

    public final int n() {
        return this.n;
    }

    public final int o() {
        return this.f7985m;
    }

    /* access modifiers changed from: protected */
    public final Map<r, e0> p() {
        return this.f7978d;
    }

    /* access modifiers changed from: protected */
    public final f2.v q() {
        return (f2.v) this.f7983i.getValue();
    }

    public final void t(f2.e eVar) {
        p.j(eVar, "constraintSet");
        if (eVar instanceof f2.r) {
            ((f2.r) eVar).l(this.f7986o);
        }
    }

    public final void u(e0.a aVar, List<? extends r> list) {
        p.j(aVar, "<this>");
        p.j(list, "measurables");
        if (this.f7980f.isEmpty()) {
            Iterator<ConstraintWidget> it2 = this.f7977c.x1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                Object u11 = next.u();
                if (u11 instanceof r) {
                    this.f7980f.put(u11, new k2.b(next.n.h()));
                }
            }
        }
        int i11 = 0;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i12 = i11 + 1;
                r rVar = (r) list.get(i11);
                k2.b bVar = m().get(rVar);
                if (bVar != null) {
                    if (bVar.c()) {
                        k2.b bVar2 = m().get(rVar);
                        p.g(bVar2);
                        int i13 = bVar2.f15388b;
                        k2.b bVar3 = m().get(rVar);
                        p.g(bVar3);
                        int i14 = bVar3.f15389c;
                        e0 e0Var = p().get(rVar);
                        if (e0Var != null) {
                            e0.a.l(aVar, e0Var, m.a(i13, i14), 0.0f, 2, (Object) null);
                        }
                    } else {
                        Measurer$performLayout$1$layerBlock$1 measurer$performLayout$1$layerBlock$1 = new Measurer$performLayout$1$layerBlock$1(bVar);
                        k2.b bVar4 = m().get(rVar);
                        p.g(bVar4);
                        int i15 = bVar4.f15388b;
                        k2.b bVar5 = m().get(rVar);
                        p.g(bVar5);
                        int i16 = bVar5.f15389c;
                        float f11 = Float.isNaN(bVar.f15397m) ? 0.0f : bVar.f15397m;
                        e0 e0Var2 = p().get(rVar);
                        if (e0Var2 != null) {
                            aVar.u(e0Var2, i15, i16, f11, measurer$performLayout$1$layerBlock$1);
                        }
                    }
                    if (i12 > size) {
                        break;
                    }
                    i11 = i12;
                } else {
                    return;
                }
            }
        }
        s sVar = this.f7976b;
        if ((sVar == null ? null : sVar.g()) == LayoutInfoFlags.BOUNDS) {
            e();
        }
    }

    public final long v(long j11, LayoutDirection layoutDirection, f2.e eVar, List<? extends r> list, int i11, w wVar) {
        androidx.constraintlayout.core.state.b bVar;
        androidx.constraintlayout.core.state.b bVar2;
        Integer num;
        Integer num2;
        String obj;
        LayoutDirection layoutDirection2 = layoutDirection;
        f2.e eVar2 = eVar;
        List<? extends r> list2 = list;
        w wVar2 = wVar;
        p.j(layoutDirection2, "layoutDirection");
        p.j(eVar2, "constraintSet");
        p.j(list2, "measurables");
        p.j(wVar2, "measureScope");
        x(wVar2);
        y(wVar2);
        f2.v q = q();
        if (d2.b.l(j11)) {
            bVar = androidx.constraintlayout.core.state.b.a(d2.b.n(j11));
        } else {
            bVar = androidx.constraintlayout.core.state.b.g().n(d2.b.p(j11));
        }
        q.u(bVar);
        f2.v q11 = q();
        if (d2.b.k(j11)) {
            bVar2 = androidx.constraintlayout.core.state.b.a(d2.b.m(j11));
        } else {
            bVar2 = androidx.constraintlayout.core.state.b.g().n(d2.b.o(j11));
        }
        q11.i(bVar2);
        q().A(j11);
        q().z(layoutDirection2);
        w();
        if (eVar.d(list)) {
            q().o();
            eVar2.a(q(), list2);
            ConstraintLayoutKt.e(q(), list2);
            q().a(this.f7977c);
        } else {
            ConstraintLayoutKt.e(q(), list2);
        }
        d(j11);
        this.f7977c.g2();
        if (ConstraintLayoutKt.f7936a) {
            this.f7977c.I0("ConstraintLayout");
            ArrayList<ConstraintWidget> x12 = this.f7977c.x1();
            p.i(x12, "root.children");
            for (ConstraintWidget constraintWidget : x12) {
                Object u11 = constraintWidget.u();
                r rVar = u11 instanceof r ? (r) u11 : null;
                Object a11 = rVar == null ? null : LayoutIdKt.a(rVar);
                String str = "NOTAG";
                if (!(a11 == null || (obj = a11.toString()) == null)) {
                    str = obj;
                }
                constraintWidget.I0(str);
            }
            Log.d("CCL", p.s("ConstraintLayout is asked to measure with ", d2.b.s(j11)));
            Log.d("CCL", ConstraintLayoutKt.i(this.f7977c));
            Iterator<ConstraintWidget> it2 = this.f7977c.x1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                p.i(next, "child");
                Log.d("CCL", ConstraintLayoutKt.i(next));
            }
        }
        this.f7977c.c2(i11);
        d dVar = this.f7977c;
        dVar.X1(dVar.P1(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it3 = this.f7977c.x1().iterator();
        while (it3.hasNext()) {
            ConstraintWidget next2 = it3.next();
            Object u12 = next2.u();
            if (u12 instanceof r) {
                e0 e0Var = this.f7978d.get(u12);
                if (e0Var == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(e0Var.A0());
                }
                if (e0Var == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(e0Var.e0());
                }
                int a02 = next2.a0();
                if (num != null && a02 == num.intValue()) {
                    int z11 = next2.z();
                    if (num2 != null && z11 == num2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.f7936a) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.a((r) u12) + " to confirm size " + next2.a0() + SafeJsonPrimitive.NULL_CHAR + next2.z());
                }
                p().put(u12, ((r) u12).N(d2.b.f13990b.c(next2.a0(), next2.z())));
            }
        }
        if (ConstraintLayoutKt.f7936a) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.f7977c.a0() + SafeJsonPrimitive.NULL_CHAR + this.f7977c.z());
        }
        return q.a(this.f7977c.a0(), this.f7977c.z());
    }

    public final void w() {
        this.f7978d.clear();
        this.f7979e.clear();
        this.f7980f.clear();
    }

    /* access modifiers changed from: protected */
    public final void x(e eVar) {
        p.j(eVar, "<set-?>");
        this.f7981g = eVar;
    }

    /* access modifiers changed from: protected */
    public final void y(w wVar) {
        p.j(wVar, "<set-?>");
        this.f7982h = wVar;
    }
}

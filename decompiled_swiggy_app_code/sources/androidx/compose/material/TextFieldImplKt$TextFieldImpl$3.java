package androidx.compose.material;

import a0.i;
import androidx.compose.ui.text.input.TextFieldValue;
import bp0.k;
import c0.c0;
import d2.h;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.u;
import p0.d;
import p1.b;
import u0.d0;
import u0.j1;
import v1.f0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$TextFieldImpl$3 extends Lambda implements u<Float, d0, d0, h, Float, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5562a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5563b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b f5564c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d f5565d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5566e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f5567f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c0 f5568g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f5569h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ u.k f5570i;
    final /* synthetic */ int j;
    final /* synthetic */ TextFieldType k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ TextFieldValue f5571l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ l<TextFieldValue, k> f5572m;
    final /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ i f5573o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ a0.g f5574p;
    final /* synthetic */ p1.c0 q;

    /* renamed from: r  reason: collision with root package name */
    final /* synthetic */ boolean f5575r;

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ int f5576s;
    final /* synthetic */ f0 t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5577u;
    final /* synthetic */ p<g, Integer, k> v;

    /* renamed from: w  reason: collision with root package name */
    final /* synthetic */ j1 f5578w;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ boolean f5579x;

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5580a;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            iArr[TextFieldType.Filled.ordinal()] = 1;
            iArr[TextFieldType.Outlined.ordinal()] = 2;
            f5580a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$TextFieldImpl$3(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, b bVar, d dVar, boolean z11, int i11, c0 c0Var, boolean z12, u.k kVar, int i12, TextFieldType textFieldType, TextFieldValue textFieldValue, l<? super TextFieldValue, k> lVar, boolean z13, i iVar, a0.g gVar, p1.c0 c0Var2, boolean z14, int i13, f0 f0Var, p<? super g, ? super Integer, k> pVar3, p<? super g, ? super Integer, k> pVar4, j1 j1Var, boolean z15) {
        super(7);
        this.f5562a = pVar;
        this.f5563b = pVar2;
        this.f5564c = bVar;
        this.f5565d = dVar;
        this.f5566e = z11;
        this.f5567f = i11;
        this.f5568g = c0Var;
        this.f5569h = z12;
        this.f5570i = kVar;
        this.j = i12;
        this.k = textFieldType;
        this.f5571l = textFieldValue;
        this.f5572m = lVar;
        this.n = z13;
        this.f5573o = iVar;
        this.f5574p = gVar;
        this.q = c0Var2;
        this.f5575r = z14;
        this.f5576s = i13;
        this.t = f0Var;
        this.f5577u = pVar3;
        this.v = pVar4;
        this.f5578w = j1Var;
        this.f5579x = z15;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0337  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r49, long r50, long r52, float r54, float r55, e0.g r56, int r57) {
        /*
            r48 = this;
            r0 = r48
            r14 = r56
            r1 = r57
            r2 = r1 & 14
            r7 = 2
            r13 = r49
            if (r2 != 0) goto L_0x0018
            boolean r2 = r14.n(r13)
            if (r2 == 0) goto L_0x0015
            r2 = 4
            goto L_0x0016
        L_0x0015:
            r2 = 2
        L_0x0016:
            r2 = r2 | r1
            goto L_0x0019
        L_0x0018:
            r2 = r1
        L_0x0019:
            r3 = r1 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x002c
            r3 = r50
            boolean r5 = r14.q(r3)
            if (r5 == 0) goto L_0x0028
            r5 = 32
            goto L_0x002a
        L_0x0028:
            r5 = 16
        L_0x002a:
            r2 = r2 | r5
            goto L_0x002e
        L_0x002c:
            r3 = r50
        L_0x002e:
            r5 = r1 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0041
            r5 = r52
            boolean r8 = r14.q(r5)
            if (r8 == 0) goto L_0x003d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x003f
        L_0x003d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x003f:
            r2 = r2 | r8
            goto L_0x0043
        L_0x0041:
            r5 = r52
        L_0x0043:
            r8 = r1 & 7168(0x1c00, float:1.0045E-41)
            r12 = r54
            if (r8 != 0) goto L_0x0055
            boolean r8 = r14.n(r12)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r2 = r2 | r8
        L_0x0055:
            r36 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r36
            if (r1 != 0) goto L_0x006b
            r1 = r55
            boolean r8 = r14.n(r1)
            if (r8 == 0) goto L_0x0067
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0069
        L_0x0067:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r2 = r2 | r8
            goto L_0x006d
        L_0x006b:
            r1 = r55
        L_0x006d:
            r38 = r2
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r38 & r2
            r8 = 74898(0x12492, float:1.04954E-40)
            r2 = r2 ^ r8
            if (r2 != 0) goto L_0x0086
            boolean r2 = r56.b()
            if (r2 != 0) goto L_0x0081
            goto L_0x0086
        L_0x0081:
            r56.h()
            goto L_0x0445
        L_0x0086:
            lp0.p<e0.g, java.lang.Integer, bp0.k> r2 = r0.f5562a
            r8 = 0
            r9 = 1
            if (r2 != 0) goto L_0x008f
            r41 = r8
            goto L_0x00af
        L_0x008f:
            boolean r10 = r0.f5579x
            r11 = -985537120(0xffffffffc541e5a0, float:-3102.3516)
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1 r15 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1
            r57 = r15
            r16 = r49
            r17 = r52
            r19 = r2
            r20 = r38
            r21 = r10
            r22 = r50
            r15.<init>(r16, r17, r19, r20, r21, r22)
            r2 = r57
            l0.a r2 = l0.b.c(r11, r9, r2)
            r41 = r2
        L_0x00af:
            lp0.p<e0.g, java.lang.Integer, bp0.k> r2 = r0.f5563b
            r3 = 0
            if (r2 == 0) goto L_0x00e7
            p1.b r2 = r0.f5564c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00be
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r2 == 0) goto L_0x00e7
            r2 = -819891782(0xffffffffcf2171ba, float:-2.70858496E9)
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1 r4 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1
            c0.c0 r5 = r0.f5568g
            boolean r6 = r0.f5569h
            int r10 = r0.j
            int r11 = r0.f5567f
            lp0.p<e0.g, java.lang.Integer, bp0.k> r15 = r0.f5563b
            r21 = r15
            r15 = r4
            r16 = r55
            r17 = r5
            r18 = r6
            r19 = r10
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            l0.a r1 = l0.b.b(r14, r2, r9, r4)
            r19 = r1
            goto L_0x00e9
        L_0x00e7:
            r19 = r8
        L_0x00e9:
            c0.x$a r1 = c0.x.f12750a
            int r1 = r1.c()
            r15 = 6
            java.lang.String r1 = c0.y.a(r1, r14, r15)
            p0.d r2 = r0.f5565d
            boolean r4 = r0.f5566e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r0.f5566e
            r6 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.E(r6)
            boolean r4 = r14.k(r4)
            boolean r6 = r14.k(r1)
            r4 = r4 | r6
            java.lang.Object r6 = r56.F()
            if (r4 != 0) goto L_0x011b
            e0.g$a r4 = e0.g.f14172a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x0123
        L_0x011b:
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1 r6 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$3$textFieldModifier$1$1
            r6.<init>(r5, r1)
            r14.y(r6)
        L_0x0123:
            r56.P()
            lp0.l r6 = (lp0.l) r6
            p0.d r20 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r2, r3, r6, r9, r8)
            c0.c0 r1 = r0.f5568g
            boolean r1 = r1 instanceof c0.d0
            if (r1 == 0) goto L_0x0168
            r1 = -1061045592(0xffffffffc0c1baa8, float:-6.054035)
            r14.E(r1)
            c0.c0 r1 = r0.f5568g
            c0.d0 r1 = (c0.d0) r1
            boolean r2 = r0.f5569h
            boolean r3 = r0.f5566e
            u.k r4 = r0.f5570i
            int r5 = r0.j
            int r5 = r5 >> 3
            r5 = r5 & 14
            int r6 = r0.f5567f
            int r8 = r6 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r5 = r5 | r8
            int r6 = r6 >> 15
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | r5
            r5 = r56
            e0.d1 r1 = r1.i(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r1 = r1.v()
            r56.P()
            goto L_0x0197
        L_0x0168:
            r1 = -1061045496(0xffffffffc0c1bb08, float:-6.054081)
            r14.E(r1)
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5569h
            boolean r3 = r0.f5566e
            int r4 = r0.j
            int r4 = r4 >> 3
            r4 = r4 & 14
            int r5 = r0.f5567f
            int r6 = r5 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            int r5 = r5 >> 21
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            e0.d1 r1 = r1.g(r2, r3, r14, r4)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r1 = r1.v()
            r56.P()
        L_0x0197:
            r42 = r1
            c0.c0 r1 = r0.f5568g
            boolean r1 = r1 instanceof c0.d0
            if (r1 == 0) goto L_0x01d5
            r1 = -1061045351(0xffffffffc0c1bb99, float:-6.05415)
            r14.E(r1)
            c0.c0 r1 = r0.f5568g
            c0.d0 r1 = (c0.d0) r1
            boolean r2 = r0.f5569h
            boolean r3 = r0.f5566e
            u.k r4 = r0.f5570i
            int r5 = r0.j
            int r5 = r5 >> 3
            r5 = r5 & 14
            int r6 = r0.f5567f
            int r8 = r6 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            r5 = r5 | r8
            int r6 = r6 >> 15
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | r5
            r5 = r56
            e0.d1 r1 = r1.e(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r1 = r1.v()
            r56.P()
            goto L_0x0204
        L_0x01d5:
            r1 = -1061045254(0xffffffffc0c1bbfa, float:-6.0541964)
            r14.E(r1)
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5569h
            boolean r3 = r0.f5566e
            int r4 = r0.j
            int r4 = r4 >> 3
            r4 = r4 & 14
            int r5 = r0.f5567f
            int r6 = r5 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            int r5 = r5 >> 21
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            e0.d1 r1 = r1.c(r2, r3, r14, r4)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r1 = r1.v()
            r56.P()
        L_0x0204:
            r44 = r1
            androidx.compose.material.TextFieldType r1 = r0.k
            int[] r2 = androidx.compose.material.TextFieldImplKt$TextFieldImpl$3.a.f5580a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r37 = 3670016(0x380000, float:5.142788E-39)
            r39 = 1879048192(0x70000000, float:1.58456325E29)
            r40 = 234881024(0xe000000, float:1.5777218E-30)
            r46 = 458752(0x70000, float:6.42848E-40)
            if (r1 == r9) goto L_0x0337
            if (r1 == r7) goto L_0x0229
            r1 = -1061042329(0xffffffffc0c1c767, float:-6.055591)
            r14.E(r1)
            r56.P()
            bp0.k r1 = bp0.k.f22762a
            goto L_0x0445
        L_0x0229:
            r1 = -1061043715(0xffffffffc0c1c1fd, float:-6.05493)
            r14.E(r1)
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5569h
            boolean r3 = r0.f5566e
            u.k r4 = r0.f5570i
            int r5 = r0.j
            int r5 = r5 >> 3
            r5 = r5 & 14
            int r6 = r0.f5567f
            int r7 = r6 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r5 = r5 | r7
            int r7 = r6 >> 15
            r7 = r7 & 896(0x380, float:1.256E-42)
            r5 = r5 | r7
            int r6 = r6 >> 18
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r56
            e0.d1 r1 = r1.h(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r23 = r1.v()
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5569h
            int r3 = r0.j
            int r3 = r3 >> 3
            r3 = r3 & 14
            int r4 = r0.f5567f
            int r4 = r4 >> 24
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            e0.d1 r1 = r1.a(r2, r14, r3)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r27 = r1.v()
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5566e
            int r3 = r0.f5567f
            int r4 = r3 >> 6
            r4 = r4 & 14
            int r3 = r3 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            e0.d1 r1 = r1.d(r2, r14, r3)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r25 = r1.v()
            androidx.compose.ui.text.input.TextFieldValue r2 = r0.f5571l
            lp0.l<androidx.compose.ui.text.input.TextFieldValue, bp0.k> r3 = r0.f5572m
            boolean r4 = r0.f5569h
            boolean r5 = r0.n
            a0.i r6 = r0.f5573o
            a0.g r7 = r0.f5574p
            p1.c0 r8 = r0.q
            boolean r9 = r0.f5575r
            int r10 = r0.f5576s
            v1.f0 r11 = r0.t
            u.k r1 = r0.f5570i
            r12 = r1
            lp0.p<e0.g, java.lang.Integer, bp0.k> r1 = r0.f5577u
            r47 = 6
            r15 = r1
            lp0.p<e0.g, java.lang.Integer, bp0.k> r1 = r0.v
            r16 = r1
            u0.j1 r1 = r0.f5578w
            r29 = r1
            int r1 = r0.j
            int r17 = r1 >> 6
            r17 = r17 & 112(0x70, float:1.57E-43)
            int r13 = r1 >> 6
            r13 = r13 & 896(0x380, float:1.256E-42)
            r13 = r17 | r13
            int r14 = r1 << 6
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r13 = r13 | r14
            int r14 = r1 << 6
            r14 = r14 & r36
            r13 = r13 | r14
            int r14 = r0.f5567f
            int r17 = r14 << 3
            r17 = r17 & r46
            r13 = r13 | r17
            int r17 = a0.g.f824h
            int r17 = r17 << 18
            r13 = r13 | r17
            int r17 = r14 << 3
            r17 = r17 & r37
            r13 = r13 | r17
            int r1 = r1 << 6
            r1 = r1 & r40
            r1 = r1 | r13
            int r13 = r14 << 9
            r13 = r13 & r39
            r31 = r1 | r13
            int r1 = r14 >> 9
            r1 = r1 & 14
            int r13 = r14 >> 18
            r13 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 | r13
            int r13 = r14 << 12
            r13 = r13 & r36
            r1 = r1 | r13
            int r13 = r14 << 12
            r13 = r13 & r46
            r1 = r1 | r13
            int r13 = r38 << 24
            r13 = r13 & r40
            r1 = r1 | r13
            int r13 = r38 << 18
            r13 = r13 & r39
            r32 = r1 | r13
            int r1 = r14 >> 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r33 = r1
            r34 = 0
            r1 = r20
            r13 = r19
            r0 = r56
            r14 = r41
            r17 = r42
            r19 = r44
            r21 = r49
            r22 = r54
            r30 = r56
            androidx.compose.material.OutlinedTextFieldKt.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r25, r27, r29, r30, r31, r32, r33, r34)
            r56.P()
            bp0.k r0 = bp0.k.f22762a
            r0 = r48
            goto L_0x0445
        L_0x0337:
            r0 = r14
            r47 = 6
            r1 = -1061045122(0xffffffffc0c1bc7e, float:-6.0542593)
            r0.E(r1)
            r7 = r0
            r0 = r48
            androidx.compose.ui.text.input.TextFieldValue r8 = r0.f5571l
            lp0.l<androidx.compose.ui.text.input.TextFieldValue, bp0.k> r9 = r0.f5572m
            boolean r2 = r0.f5569h
            r10 = r2
            boolean r11 = r0.n
            a0.i r12 = r0.f5573o
            a0.g r13 = r0.f5574p
            p1.c0 r14 = r0.q
            boolean r15 = r0.f5575r
            int r1 = r0.f5576s
            r16 = r1
            v1.f0 r1 = r0.t
            r17 = r1
            u.k r4 = r0.f5570i
            r18 = r4
            lp0.p<e0.g, java.lang.Integer, bp0.k> r1 = r0.f5577u
            r21 = r1
            lp0.p<e0.g, java.lang.Integer, bp0.k> r1 = r0.v
            r22 = r1
            c0.c0 r1 = r0.f5568g
            boolean r3 = r0.f5566e
            int r5 = r0.j
            int r5 = r5 >> 3
            r5 = r5 & 14
            int r6 = r0.f5567f
            int r23 = r6 >> 3
            r23 = r23 & 112(0x70, float:1.57E-43)
            r5 = r5 | r23
            r50 = r8
            int r8 = r6 >> 15
            r8 = r8 & 896(0x380, float:1.256E-42)
            r5 = r5 | r8
            int r6 = r6 >> 18
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r56
            e0.d1 r1 = r1.h(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r29 = r1.v()
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5569h
            int r3 = r0.j
            int r3 = r3 >> 3
            r3 = r3 & 14
            int r4 = r0.f5567f
            int r4 = r4 >> 24
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            e0.d1 r1 = r1.a(r2, r7, r3)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r31 = r1.v()
            c0.c0 r1 = r0.f5568g
            boolean r2 = r0.f5566e
            int r3 = r0.f5567f
            int r4 = r3 >> 6
            r4 = r4 & 14
            int r3 = r3 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            e0.d1 r1 = r1.d(r2, r7, r3)
            java.lang.Object r1 = r1.getValue()
            u0.d0 r1 = (u0.d0) r1
            long r33 = r1.v()
            u0.j1 r1 = r0.f5578w
            r35 = r1
            int r1 = r0.j
            int r2 = r1 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r3 = r1 >> 6
            r3 = r3 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r1 << 6
            r3 = r3 & r36
            r2 = r2 | r3
            int r3 = r0.f5567f
            int r4 = r3 << 3
            r4 = r4 & r46
            r2 = r2 | r4
            int r4 = a0.g.f824h
            int r4 = r4 << 18
            r2 = r2 | r4
            int r4 = r3 << 3
            r4 = r4 & r37
            r2 = r2 | r4
            int r1 = r1 << 6
            r1 = r1 & r40
            r1 = r1 | r2
            int r2 = r3 << 9
            r2 = r2 & r39
            r37 = r1 | r2
            int r1 = r3 >> 9
            r1 = r1 & 14
            int r2 = r3 >> 18
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r3 << 12
            r2 = r2 & r36
            r1 = r1 | r2
            int r2 = r3 << 12
            r2 = r2 & r46
            r1 = r1 | r2
            int r2 = r38 << 24
            r2 = r2 & r40
            r1 = r1 | r2
            int r2 = r38 << 18
            r2 = r2 & r39
            r38 = r1 | r2
            int r1 = r3 >> 15
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r39 = r1
            r40 = 0
            r7 = r20
            r20 = r41
            r23 = r42
            r25 = r44
            r27 = r49
            r28 = r54
            r36 = r56
            r8 = r50
            androidx.compose.material.TextFieldKt.f(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28, r29, r31, r33, r35, r36, r37, r38, r39, r40)
            r56.P()
            bp0.k r1 = bp0.k.f22762a
        L_0x0445:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$TextFieldImpl$3.a(float, long, long, float, float, e0.g, int):void");
    }

    public /* bridge */ /* synthetic */ Object l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        a(((Number) obj).floatValue(), ((d0) obj2).v(), ((d0) obj3).v(), ((h) obj4).s(), ((Number) obj5).floatValue(), (g) obj6, ((Number) obj7).intValue());
        return k.f22762a;
    }
}

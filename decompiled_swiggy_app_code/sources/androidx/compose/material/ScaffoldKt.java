package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import c0.k;
import c0.l;
import c0.t;
import d2.h;
import defpackage.a2;
import e0.g;
import e0.m0;
import e0.s0;
import lp0.p;
import lp0.q;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p0.d;

/* compiled from: Scaffold.kt */
public final class ScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<k> f5225a = CompositionLocalKt.d(ScaffoldKt$LocalFabPlacement$1.f5227a);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f5226b = h.n((float) 16);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: lp0.q<? super androidx.compose.material.SnackbarHostState, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v1, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v0, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: lp0.q<? super androidx.compose.material.SnackbarHostState, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: lp0.q<? super androidx.compose.material.SnackbarHostState, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: lp0.q<? super androidx.compose.material.SnackbarHostState, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b8, code lost:
        if (r0.q(r54) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01d2, code lost:
        if (r0.q(r56) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p0.d r40, c0.t r41, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r42, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r43, lp0.q<? super androidx.compose.material.SnackbarHostState, ? super e0.g, ? super java.lang.Integer, bp0.k> r44, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r45, int r46, boolean r47, lp0.q<? super defpackage.a2.h, ? super e0.g, ? super java.lang.Integer, bp0.k> r48, boolean r49, u0.j1 r50, float r51, long r52, long r54, long r56, long r58, long r60, lp0.q<? super defpackage.a2.p, ? super e0.g, ? super java.lang.Integer, bp0.k> r62, e0.g r63, int r64, int r65, int r66) {
        /*
            r15 = r62
            r13 = r64
            r14 = r65
            r12 = r66
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r15, r0)
            r0 = -1013849884(0xffffffffc391e0e4, float:-291.75696)
            r1 = r63
            e0.g r0 = r1.t(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0020
            r4 = r13 | 6
            r5 = r4
            r4 = r40
            goto L_0x0034
        L_0x0020:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x0031
            r4 = r40
            boolean r5 = r0.k(r4)
            if (r5 == 0) goto L_0x002e
            r5 = 4
            goto L_0x002f
        L_0x002e:
            r5 = 2
        L_0x002f:
            r5 = r5 | r13
            goto L_0x0034
        L_0x0031:
            r4 = r40
            r5 = r13
        L_0x0034:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004d
            r6 = r12 & 2
            if (r6 != 0) goto L_0x0047
            r6 = r41
            boolean r9 = r0.k(r6)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0047:
            r6 = r41
        L_0x0049:
            r9 = 16
        L_0x004b:
            r5 = r5 | r9
            goto L_0x004f
        L_0x004d:
            r6 = r41
        L_0x004f:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0056
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0056:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r42
            boolean r16 = r0.k(r2)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r5 = r5 | r16
            goto L_0x006c
        L_0x006a:
            r2 = r42
        L_0x006c:
            r16 = r12 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0077
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0077:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008b
            r3 = r43
            boolean r20 = r0.k(r3)
            if (r20 == 0) goto L_0x0086
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r5 = r5 | r20
            goto L_0x008d
        L_0x008b:
            r3 = r43
        L_0x008d:
            r20 = r12 & 16
            r21 = 57344(0xe000, float:8.0356E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            r23 = 8192(0x2000, float:1.14794E-41)
            if (r20 == 0) goto L_0x009d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r7 = r44
            goto L_0x00b0
        L_0x009d:
            r24 = r13 & r21
            r7 = r44
            if (r24 != 0) goto L_0x00b0
            boolean r25 = r0.k(r7)
            if (r25 == 0) goto L_0x00ac
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ae
        L_0x00ac:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00ae:
            r5 = r5 | r25
        L_0x00b0:
            r25 = r12 & 32
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 458752(0x70000, float:6.42848E-40)
            r28 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00c1
            r29 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r29
            r8 = r45
            goto L_0x00d4
        L_0x00c1:
            r29 = r13 & r27
            r8 = r45
            if (r29 != 0) goto L_0x00d4
            boolean r30 = r0.k(r8)
            if (r30 == 0) goto L_0x00d0
            r30 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d2
        L_0x00d0:
            r30 = 65536(0x10000, float:9.18355E-41)
        L_0x00d2:
            r5 = r5 | r30
        L_0x00d4:
            r30 = r12 & 64
            r31 = 3670016(0x380000, float:5.142788E-39)
            if (r30 == 0) goto L_0x00e1
            r32 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r32
            r10 = r46
            goto L_0x00f4
        L_0x00e1:
            r32 = r13 & r31
            r10 = r46
            if (r32 != 0) goto L_0x00f4
            boolean r33 = r0.p(r10)
            if (r33 == 0) goto L_0x00f0
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f2
        L_0x00f0:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00f2:
            r5 = r5 | r33
        L_0x00f4:
            r11 = r12 & 128(0x80, float:1.794E-43)
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            if (r11 == 0) goto L_0x0101
            r35 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r35
            r2 = r47
            goto L_0x0114
        L_0x0101:
            r35 = r13 & r34
            r2 = r47
            if (r35 != 0) goto L_0x0114
            boolean r35 = r0.m(r2)
            if (r35 == 0) goto L_0x0110
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0112
        L_0x0110:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x0112:
            r5 = r5 | r35
        L_0x0114:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x011f
            r35 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r35
            r3 = r48
            goto L_0x0134
        L_0x011f:
            r35 = 234881024(0xe000000, float:1.5777218E-30)
            r35 = r13 & r35
            r3 = r48
            if (r35 != 0) goto L_0x0134
            boolean r35 = r0.k(r3)
            if (r35 == 0) goto L_0x0130
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0132
        L_0x0130:
            r35 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0132:
            r5 = r5 | r35
        L_0x0134:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x013f
            r35 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r35
            r4 = r49
            goto L_0x0154
        L_0x013f:
            r35 = 1879048192(0x70000000, float:1.58456325E29)
            r35 = r13 & r35
            r4 = r49
            if (r35 != 0) goto L_0x0154
            boolean r35 = r0.m(r4)
            if (r35 == 0) goto L_0x0150
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0152
        L_0x0150:
            r35 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0152:
            r5 = r5 | r35
        L_0x0154:
            r35 = r14 & 14
            if (r35 != 0) goto L_0x016e
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x0167
            r4 = r50
            boolean r35 = r0.k(r4)
            if (r35 == 0) goto L_0x0169
            r19 = 4
            goto L_0x016b
        L_0x0167:
            r4 = r50
        L_0x0169:
            r19 = 2
        L_0x016b:
            r19 = r14 | r19
            goto L_0x0172
        L_0x016e:
            r4 = r50
            r19 = r14
        L_0x0172:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x017b
            r19 = r19 | 48
            r6 = r51
            goto L_0x018e
        L_0x017b:
            r35 = r14 & 112(0x70, float:1.57E-43)
            r6 = r51
            if (r35 != 0) goto L_0x018e
            boolean r35 = r0.n(r6)
            if (r35 == 0) goto L_0x018a
            r24 = 32
            goto L_0x018c
        L_0x018a:
            r24 = 16
        L_0x018c:
            r19 = r19 | r24
        L_0x018e:
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x01a8
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01a1
            r6 = r52
            boolean r24 = r0.q(r6)
            if (r24 == 0) goto L_0x01a3
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x01a5
        L_0x01a1:
            r6 = r52
        L_0x01a3:
            r32 = 128(0x80, float:1.794E-43)
        L_0x01a5:
            r19 = r19 | r32
            goto L_0x01aa
        L_0x01a8:
            r6 = r52
        L_0x01aa:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x01c2
            r6 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01bb
            r6 = r54
            boolean r24 = r0.q(r6)
            if (r24 == 0) goto L_0x01bd
            goto L_0x01bf
        L_0x01bb:
            r6 = r54
        L_0x01bd:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01bf:
            r19 = r19 | r17
            goto L_0x01c4
        L_0x01c2:
            r6 = r54
        L_0x01c4:
            r17 = r14 & r21
            if (r17 != 0) goto L_0x01dc
            r6 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01d5
            r6 = r56
            boolean r17 = r0.q(r6)
            if (r17 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d5:
            r6 = r56
        L_0x01d7:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x01d9:
            r19 = r19 | r22
            goto L_0x01de
        L_0x01dc:
            r6 = r56
        L_0x01de:
            r17 = r14 & r27
            if (r17 != 0) goto L_0x01f9
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            r6 = r58
            if (r17 != 0) goto L_0x01f4
            boolean r17 = r0.q(r6)
            if (r17 == 0) goto L_0x01f4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f6
        L_0x01f4:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x01f6:
            r19 = r19 | r17
            goto L_0x01fb
        L_0x01f9:
            r6 = r58
        L_0x01fb:
            r17 = r14 & r31
            if (r17 != 0) goto L_0x0213
            r17 = r12 & r28
            r6 = r60
            if (r17 != 0) goto L_0x020e
            boolean r17 = r0.q(r6)
            if (r17 == 0) goto L_0x020e
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0210
        L_0x020e:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0210:
            r19 = r19 | r17
            goto L_0x0215
        L_0x0213:
            r6 = r60
        L_0x0215:
            r17 = r12 & r26
            if (r17 == 0) goto L_0x021e
            r17 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x021b:
            r19 = r19 | r17
            goto L_0x022e
        L_0x021e:
            r17 = r14 & r34
            if (r17 != 0) goto L_0x022e
            boolean r17 = r0.k(r15)
            if (r17 == 0) goto L_0x022b
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021b
        L_0x022b:
            r17 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x021b
        L_0x022e:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r17 = r5 & r17
            r18 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r17 ^ r18
            if (r17 != 0) goto L_0x0272
            r17 = 23967451(0x16db6db, float:4.3661218E-38)
            r17 = r19 & r17
            r18 = 4793490(0x492492, float:6.71711E-39)
            r17 = r17 ^ r18
            if (r17 != 0) goto L_0x0272
            boolean r17 = r0.b()
            if (r17 != 0) goto L_0x024d
            goto L_0x0272
        L_0x024d:
            r0.h()
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r9 = r48
            r11 = r50
            r12 = r51
            r18 = r52
            r22 = r54
            r24 = r56
            r28 = r58
            r32 = r6
            r6 = r8
            r7 = r10
            r8 = r47
            r10 = r49
            goto L_0x04c0
        L_0x0272:
            r0.H()
            r17 = r13 & 1
            if (r17 == 0) goto L_0x02dc
            boolean r7 = r0.i()
            if (r7 == 0) goto L_0x0280
            goto L_0x02dc
        L_0x0280:
            r0.h()
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0289
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0289:
            r1 = r12 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x028f
            r19 = r19 & -15
        L_0x028f:
            r1 = r19
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0297
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0297:
            r2 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x029d
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x029d:
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02a5
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r2
        L_0x02a5:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x02af
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x02af:
            r2 = r12 & r28
            if (r2 == 0) goto L_0x02b7
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x02b7:
            r2 = r41
            r6 = r42
            r7 = r43
            r11 = r47
            r3 = r48
            r4 = r49
            r16 = r51
            r18 = r52
            r22 = r54
            r24 = r56
            r28 = r58
            r32 = r60
            r17 = r1
            r20 = r5
            r9 = r8
            r1 = r40
            r8 = r44
            r5 = r50
            goto L_0x0405
        L_0x02dc:
            if (r1 == 0) goto L_0x02e1
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x02e3
        L_0x02e1:
            r1 = r40
        L_0x02e3:
            r7 = r12 & 2
            if (r7 == 0) goto L_0x02f4
            r7 = 0
            r6 = 0
            r40 = r1
            r1 = 0
            r8 = 3
            c0.t r1 = f(r7, r6, r0, r1, r8)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02f8
        L_0x02f4:
            r40 = r1
            r1 = r41
        L_0x02f8:
            if (r9 == 0) goto L_0x0301
            androidx.compose.material.ComposableSingletons$ScaffoldKt r6 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f4926a
            lp0.p r6 = r6.a()
            goto L_0x0303
        L_0x0301:
            r6 = r42
        L_0x0303:
            if (r16 == 0) goto L_0x030c
            androidx.compose.material.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f4926a
            lp0.p r7 = r7.b()
            goto L_0x030e
        L_0x030c:
            r7 = r43
        L_0x030e:
            if (r20 == 0) goto L_0x0317
            androidx.compose.material.ComposableSingletons$ScaffoldKt r8 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f4926a
            lp0.q r8 = r8.c()
            goto L_0x0319
        L_0x0317:
            r8 = r44
        L_0x0319:
            if (r25 == 0) goto L_0x0322
            androidx.compose.material.ComposableSingletons$ScaffoldKt r9 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f4926a
            lp0.p r9 = r9.d()
            goto L_0x0324
        L_0x0322:
            r9 = r45
        L_0x0324:
            if (r30 == 0) goto L_0x032c
            c0.l$a r10 = c0.l.f12731b
            int r10 = r10.a()
        L_0x032c:
            if (r11 == 0) goto L_0x0330
            r11 = 0
            goto L_0x0332
        L_0x0330:
            r11 = r47
        L_0x0332:
            if (r2 == 0) goto L_0x0336
            r2 = 0
            goto L_0x0338
        L_0x0336:
            r2 = r48
        L_0x0338:
            if (r3 == 0) goto L_0x033c
            r3 = 1
            goto L_0x033e
        L_0x033c:
            r3 = r49
        L_0x033e:
            r41 = r1
            r1 = r12 & 1024(0x400, float:1.435E-42)
            r42 = r2
            r2 = 6
            if (r1 == 0) goto L_0x0354
            c0.q r1 = c0.q.f12737a
            c0.u r1 = r1.b(r0, r2)
            z.a r1 = r1.a()
            r19 = r19 & -15
            goto L_0x0356
        L_0x0354:
            r1 = r50
        L_0x0356:
            r36 = r19
            if (r4 == 0) goto L_0x0361
            c0.g r4 = c0.g.f12710a
            float r4 = r4.a()
            goto L_0x0363
        L_0x0361:
            r4 = r51
        L_0x0363:
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0382
            c0.q r2 = c0.q.f12737a
            r44 = r1
            r1 = 6
            c0.c r2 = r2.a(r0, r1)
            long r1 = r2.n()
            r45 = r1
            r1 = r36
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r39 = r3
            r3 = r1
            r1 = r45
            r45 = r39
            goto L_0x038b
        L_0x0382:
            r44 = r1
            r1 = r36
            r45 = r3
            r3 = r1
            r1 = r52
        L_0x038b:
            r46 = r4
            r4 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x039c
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r16 = androidx.compose.material.ColorsKt.b(r1, r0, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x039e
        L_0x039c:
            r16 = r54
        L_0x039e:
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x03b0
            c0.g r4 = c0.g.f12710a
            r18 = r1
            r1 = 6
            long r22 = r4.b(r0, r1)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r2
            goto L_0x03b5
        L_0x03b0:
            r18 = r1
            r1 = 6
            r22 = r56
        L_0x03b5:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r12
            if (r2 == 0) goto L_0x03ca
            c0.q r2 = c0.q.f12737a
            c0.c r1 = r2.a(r0, r1)
            long r1 = r1.c()
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            goto L_0x03cc
        L_0x03ca:
            r1 = r58
        L_0x03cc:
            r4 = r12 & r28
            if (r4 == 0) goto L_0x03ed
            int r4 = r3 >> 15
            r4 = r4 & 14
            long r24 = androidx.compose.material.ColorsKt.b(r1, r0, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r4 = r45
            r28 = r1
            r20 = r5
            r32 = r24
            r1 = r40
            r2 = r41
            r5 = r44
            r24 = r22
            goto L_0x03fd
        L_0x03ed:
            r4 = r45
            r32 = r60
            r28 = r1
            r20 = r5
            r24 = r22
            r1 = r40
            r2 = r41
            r5 = r44
        L_0x03fd:
            r22 = r16
            r16 = r46
            r17 = r3
            r3 = r42
        L_0x0405:
            r0.A()
            androidx.compose.material.ScaffoldKt$Scaffold$child$1 r12 = new androidx.compose.material.ScaffoldKt$Scaffold$child$1
            r40 = r12
            r41 = r28
            r43 = r32
            r45 = r17
            r46 = r11
            r47 = r10
            r48 = r6
            r49 = r62
            r50 = r9
            r51 = r7
            r52 = r20
            r53 = r8
            r54 = r2
            r40.<init>(r41, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r56 = r6
            r57 = r7
            r6 = -819889681(0xffffffffcf2179ef, float:-2.70912282E9)
            r7 = 1
            l0.a r6 = l0.b.b(r0, r6, r7, r12)
            if (r3 == 0) goto L_0x0498
            r12 = -1013848226(0xffffffffc391e75e, float:-291.80756)
            r0.E(r12)
            androidx.compose.material.DrawerState r12 = r2.a()
            r7 = -819903232(0xffffffffcf214500, float:-2.70565376E9)
            r58 = r2
            androidx.compose.material.ScaffoldKt$Scaffold$1 r2 = new androidx.compose.material.ScaffoldKt$Scaffold$1
            r2.<init>(r6)
            r6 = 1
            l0.a r2 = l0.b.b(r0, r7, r6, r2)
            r6 = 805306368(0x30000000, float:4.656613E-10)
            int r7 = r20 >> 24
            r7 = r7 & 14
            r6 = r6 | r7
            int r7 = r20 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            int r7 = r20 >> 18
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            int r7 = r17 << 12
            r17 = r7 & r21
            r6 = r6 | r17
            r17 = r7 & r27
            r6 = r6 | r17
            r17 = r7 & r31
            r6 = r6 | r17
            r17 = r7 & r34
            r6 = r6 | r17
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r17
            r6 = r6 | r7
            r7 = 0
            r40 = r3
            r41 = r1
            r42 = r12
            r43 = r4
            r44 = r5
            r45 = r16
            r46 = r18
            r48 = r22
            r50 = r24
            r52 = r2
            r53 = r0
            r54 = r6
            r55 = r7
            androidx.compose.material.DrawerKt.a(r40, r41, r42, r43, r44, r45, r46, r48, r50, r52, r53, r54, r55)
            r0.P()
            goto L_0x04ae
        L_0x0498:
            r58 = r2
            r2 = -1013847717(0xffffffffc391e95b, float:-291.8231)
            r0.E(r2)
            r2 = r20 & 14
            r2 = r2 | 48
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.invoke(r1, r0, r2)
            r0.P()
        L_0x04ae:
            r2 = r58
            r6 = r9
            r7 = r10
            r12 = r16
            r9 = r3
            r10 = r4
            r3 = r56
            r4 = r57
            r39 = r11
            r11 = r5
            r5 = r8
            r8 = r39
        L_0x04c0:
            e0.s0 r0 = r0.v()
            if (r0 != 0) goto L_0x04c7
            goto L_0x04ea
        L_0x04c7:
            androidx.compose.material.ScaffoldKt$Scaffold$2 r15 = new androidx.compose.material.ScaffoldKt$Scaffold$2
            r37 = r0
            r0 = r15
            r13 = r18
            r38 = r15
            r15 = r22
            r17 = r24
            r19 = r28
            r21 = r32
            r23 = r62
            r24 = r64
            r25 = r65
            r26 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)
            r0 = r37
            r1 = r38
            r0.a(r1)
        L_0x04ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.a(p0.d, c0.t, lp0.p, lp0.p, lp0.q, lp0.p, int, boolean, lp0.q, boolean, u0.j1, float, long, long, long, long, long, lp0.q, e0.g, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(boolean z11, int i11, p<? super g, ? super Integer, bp0.k> pVar, q<? super a2.p, ? super g, ? super Integer, bp0.k> qVar, p<? super g, ? super Integer, bp0.k> pVar2, p<? super g, ? super Integer, bp0.k> pVar3, p<? super g, ? super Integer, bp0.k> pVar4, g gVar, int i12) {
        int i13;
        d dVar;
        int i14;
        int i15;
        p<? super g, ? super Integer, bp0.k> pVar5 = pVar;
        q<? super a2.p, ? super g, ? super Integer, bp0.k> qVar2 = qVar;
        p<? super g, ? super Integer, bp0.k> pVar6 = pVar2;
        p<? super g, ? super Integer, bp0.k> pVar7 = pVar3;
        p<? super g, ? super Integer, bp0.k> pVar8 = pVar4;
        int i16 = i12;
        g t = gVar.t(-2103106784);
        boolean z12 = z11;
        if ((i16 & 14) == 0) {
            i13 = (t.m(z12) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        int i17 = i11;
        if ((i16 & 112) == 0) {
            i13 |= t.p(i17) ? 32 : 16;
        }
        if ((i16 & 896) == 0) {
            i13 |= t.k(pVar5) ? 256 : 128;
        }
        if ((i16 & 7168) == 0) {
            i13 |= t.k(qVar2) ? 2048 : 1024;
        }
        if ((57344 & i16) == 0) {
            i13 |= t.k(pVar6) ? 16384 : 8192;
        }
        if ((458752 & i16) == 0) {
            i13 |= t.k(pVar7) ? PDChoice.FLAG_COMBO : PDButton.FLAG_PUSHBUTTON;
        }
        if ((3670016 & i16) == 0) {
            i13 |= t.k(pVar8) ? 1048576 : 524288;
        }
        int i18 = i13;
        if (((i18 & 2995931) ^ 599186) != 0 || !t.b()) {
            Object[] objArr = {pVar5, pVar6, pVar7, l.b(i11), Boolean.valueOf(z11), pVar8, qVar2};
            t.E(-3685570);
            int i19 = 0;
            boolean z13 = false;
            for (int i21 = 7; i19 < i21; i21 = 7) {
                Object obj = objArr[i19];
                i19++;
                z13 |= t.k(obj);
            }
            Object F = t.F();
            if (z13 || F == g.f14172a.a()) {
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = r0;
                i15 = 1;
                i14 = 0;
                dVar = null;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$12 = new ScaffoldKt$ScaffoldLayout$1$1(pVar, pVar2, pVar3, i11, z11, pVar4, i18, qVar);
                t.y(scaffoldKt$ScaffoldLayout$1$1);
                F = scaffoldKt$ScaffoldLayout$1$1;
            } else {
                dVar = null;
                i15 = 1;
                i14 = 0;
            }
            t.P();
            SubcomposeLayoutKt.b(dVar, (p) F, t, i14, i15);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new ScaffoldKt$ScaffoldLayout$2(z11, i11, pVar, qVar, pVar2, pVar3, pVar4, i12));
        }
    }

    public static final m0<k> e() {
        return f5225a;
    }

    public static final t f(DrawerState drawerState, SnackbarHostState snackbarHostState, g gVar, int i11, int i12) {
        gVar.E(-1962071859);
        if ((i12 & 1) != 0) {
            drawerState = DrawerKt.i(DrawerValue.Closed, (lp0.l<? super DrawerValue, Boolean>) null, gVar, 6, 2);
        }
        if ((i12 & 2) != 0) {
            gVar.E(-3687241);
            Object F = gVar.F();
            if (F == g.f14172a.a()) {
                F = new SnackbarHostState();
                gVar.y(F);
            }
            gVar.P();
            snackbarHostState = (SnackbarHostState) F;
        }
        gVar.E(-3687241);
        Object F2 = gVar.F();
        if (F2 == g.f14172a.a()) {
            F2 = new t(drawerState, snackbarHostState);
            gVar.y(F2);
        }
        gVar.P();
        t tVar = (t) F2;
        gVar.P();
        return tVar;
    }
}

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.k;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import b0.i;
import d2.e;
import e0.g;
import e0.s0;
import kotlin.jvm.internal.p;
import l0.b;
import lp0.l;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p0.d;
import r0.c;
import t0.f;
import t0.m;
import u0.d0;
import u0.e0;
import u0.f0;
import u0.l0;
import u0.m0;
import u0.n0;
import u0.s;
import u0.x;
import u0.z;
import w0.a;

/* compiled from: AndroidSelectionHandles.android.kt */
public final class AndroidSelectionHandles_androidKt {
    public static final void a(d dVar, boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12, g gVar, int i11) {
        int i12;
        p.j(dVar, "modifier");
        p.j(resolvedTextDirection, "direction");
        g t = gVar.t(47957398);
        if ((i11 & 14) == 0) {
            i12 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.m(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= t.k(resolvedTextDirection) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= t.m(z12) ? 2048 : 1024;
        }
        if ((i12 & 5851) != 1170 || !t.b()) {
            k.a(f(SizeKt.u(dVar, i.c(), i.b()), z11, resolvedTextDirection, z12), t, 0);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(dVar, z11, resolvedTextDirection, z12, i11));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: b0.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(long r22, androidx.compose.foundation.text.selection.HandleReferencePoint r24, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r25, e0.g r26, int r27) {
        /*
            r3 = r24
            r11 = r25
            r12 = r27
            java.lang.String r0 = "handleReferencePoint"
            kotlin.jvm.internal.p.j(r3, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r11, r0)
            r0 = -1409050158(0xffffffffac0399d2, float:-1.8701607E-12)
            r1 = r26
            e0.g r0 = r1.t(r0)
            r1 = r12 & 14
            if (r1 != 0) goto L_0x002a
            r1 = r22
            boolean r4 = r0.q(r1)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r12
            goto L_0x002d
        L_0x002a:
            r1 = r22
            r4 = r12
        L_0x002d:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x003d
            boolean r5 = r0.k(r3)
            if (r5 == 0) goto L_0x003a
            r5 = 32
            goto L_0x003c
        L_0x003a:
            r5 = 16
        L_0x003c:
            r4 = r4 | r5
        L_0x003d:
            r5 = r12 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x004d
            boolean r5 = r0.k(r11)
            if (r5 == 0) goto L_0x004a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x004c
        L_0x004a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r4 = r4 | r5
        L_0x004d:
            r5 = r4 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x005e
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x005a
            goto L_0x005e
        L_0x005a:
            r0.h()
            goto L_0x00c5
        L_0x005e:
            float r5 = t0.f.m(r22)
            int r5 = np0.c.c(r5)
            float r6 = t0.f.n(r22)
            int r6 = np0.c.c(r6)
            long r5 = d2.m.a(r5, r6)
            d2.l r7 = d2.l.b(r5)
            r8 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.E(r8)
            boolean r8 = r0.k(r3)
            boolean r7 = r0.k(r7)
            r7 = r7 | r8
            java.lang.Object r8 = r0.F()
            if (r7 != 0) goto L_0x0093
            e0.g$a r7 = e0.g.f14172a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x009c
        L_0x0093:
            b0.b r8 = new b0.b
            r7 = 0
            r8.<init>(r3, r5, r7)
            r0.y(r8)
        L_0x009c:
            r0.P()
            r5 = r8
            b0.b r5 = (b0.b) r5
            r6 = 0
            androidx.compose.ui.window.h r7 = new androidx.compose.ui.window.h
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 15
            r21 = 0
            r13 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            int r4 = r4 << 3
            r9 = r4 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r25
            r8 = r0
            androidx.compose.ui.window.AndroidPopup_androidKt.a(r4, r5, r6, r7, r8, r9, r10)
        L_0x00c5:
            e0.s0 r6 = r0.v()
            if (r6 != 0) goto L_0x00cc
            goto L_0x00dd
        L_0x00cc:
            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1 r7 = new androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
            r0 = r7
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r27
            r0.<init>(r1, r3, r4, r5)
            r6.a(r7)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(long, androidx.compose.foundation.text.selection.HandleReferencePoint, lp0.p, e0.g, int):void");
    }

    public static final void c(long j, boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12, d dVar, lp0.p<? super g, ? super Integer, bp0.k> pVar, g gVar, int i11) {
        int i12;
        HandleReferencePoint handleReferencePoint;
        ResolvedTextDirection resolvedTextDirection2 = resolvedTextDirection;
        d dVar2 = dVar;
        int i13 = i11;
        p.j(resolvedTextDirection2, "direction");
        p.j(dVar2, "modifier");
        g t = gVar.t(-616295642);
        long j11 = j;
        if ((i13 & 14) == 0) {
            i12 = (t.q(j11) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        boolean z13 = z11;
        if ((i13 & 112) == 0) {
            i12 |= t.m(z13) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i12 |= t.k(resolvedTextDirection2) ? 256 : 128;
        }
        boolean z14 = z12;
        if ((i13 & 7168) == 0) {
            i12 |= t.m(z14) ? 2048 : 1024;
        }
        if ((57344 & i13) == 0) {
            i12 |= t.k(dVar2) ? 16384 : 8192;
        }
        lp0.p<? super g, ? super Integer, bp0.k> pVar2 = pVar;
        if ((458752 & i13) == 0) {
            i12 |= t.k(pVar2) ? PDChoice.FLAG_COMBO : PDButton.FLAG_PUSHBUTTON;
        }
        int i14 = i12;
        if ((i14 & 374491) != 74898 || !t.b()) {
            if (h(z11, resolvedTextDirection, z12)) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            HandleReferencePoint handleReferencePoint2 = handleReferencePoint;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$1 = r0;
            AndroidSelectionHandles_androidKt$SelectionHandle$1 androidSelectionHandles_androidKt$SelectionHandle$12 = new AndroidSelectionHandles_androidKt$SelectionHandle$1(pVar, dVar, z11, j, i14, resolvedTextDirection, z12);
            b(j, handleReferencePoint2, b.b(t, 732099485, true, androidSelectionHandles_androidKt$SelectionHandle$1), t, (i14 & 14) | 384);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AndroidSelectionHandles_androidKt$SelectionHandle$2(j, z11, resolvedTextDirection, z12, dVar, pVar, i11));
        }
    }

    public static final l0 e(c cVar, float f11) {
        c cVar2 = cVar;
        float f12 = f11;
        p.j(cVar2, "<this>");
        int ceil = ((int) ((float) Math.ceil((double) f12))) * 2;
        b bVar = b.f4798a;
        l0 c11 = bVar.c();
        x a11 = bVar.a();
        a b11 = bVar.b();
        if (c11 == null || a11 == null || ceil > c11.getWidth() || ceil > c11.getHeight()) {
            c11 = n0.b(ceil, ceil, m0.f16830b.a(), false, (androidx.compose.ui.graphics.colorspace.a) null, 24, (Object) null);
            bVar.f(c11);
            a11 = z.a(c11);
            bVar.d(a11);
        }
        l0 l0Var = c11;
        x xVar = a11;
        if (b11 == null) {
            b11 = new a();
            bVar.e(b11);
        }
        a aVar = b11;
        LayoutDirection layoutDirection = cVar.getLayoutDirection();
        long a12 = m.a((float) l0Var.getWidth(), (float) l0Var.getHeight());
        a.C0202a D = aVar.D();
        e a13 = D.a();
        LayoutDirection b12 = D.b();
        x c12 = D.c();
        long d11 = D.d();
        a.C0202a D2 = aVar.D();
        D2.j(cVar2);
        D2.k(layoutDirection);
        D2.i(xVar);
        D2.l(a12);
        xVar.a();
        a aVar2 = aVar;
        w0.e.n(aVar2, d0.f16756b.a(), 0, aVar.d(), 0.0f, (w0.g) null, (e0) null, s.f16866b.a(), 58, (Object) null);
        w0.e.n(aVar2, f0.c(4278190080L), f.f16662b.c(), m.a(f12, f12), 0.0f, (w0.g) null, (e0) null, 0, 120, (Object) null);
        l0 l0Var2 = l0Var;
        w0.e.f(aVar, f0.c(4278190080L), f11, t0.g.a(f12, f12), 0.0f, (w0.g) null, (e0) null, 0, 120, (Object) null);
        xVar.o();
        a.C0202a D3 = aVar.D();
        D3.j(a13);
        D3.k(b12);
        D3.i(c12);
        D3.l(d11);
        return l0Var2;
    }

    public static final d f(d dVar, boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12) {
        p.j(dVar, "<this>");
        p.j(resolvedTextDirection, "direction");
        return ComposedModifierKt.d(dVar, (l) null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(z11, resolvedTextDirection, z12), 1, (Object) null);
    }

    public static final boolean g(ResolvedTextDirection resolvedTextDirection, boolean z11) {
        p.j(resolvedTextDirection, "direction");
        return (resolvedTextDirection == ResolvedTextDirection.Ltr && !z11) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z11);
    }

    /* access modifiers changed from: private */
    public static final boolean h(boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12) {
        if (z11) {
            return g(resolvedTextDirection, z12);
        }
        return !g(resolvedTextDirection, z12);
    }
}

package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.compose.runtime.g;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import d2.p;
import d2.u;
import e0.a1;
import e0.h0;
import e1.c;
import in.juspay.hyper.constants.LogCategory;
import java.util.List;
import p0.d;
import s.f;
import s.k;
import s.l;
import t0.m;
import u0.f0;
import u0.x;

/* compiled from: AndroidOverscroll.kt */
public final class AndroidEdgeEffectOverscrollEffect implements l {

    /* renamed from: a  reason: collision with root package name */
    private final k f2821a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final EdgeEffect f2822b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final EdgeEffect f2823c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final EdgeEffect f2824d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final EdgeEffect f2825e;

    /* renamed from: f  reason: collision with root package name */
    private final List<EdgeEffect> f2826f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final EdgeEffect f2827g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final EdgeEffect f2828h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final EdgeEffect f2829i;
    /* access modifiers changed from: private */
    public final EdgeEffect j;
    private final h0<bp0.k> k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2830l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2831m;
    /* access modifiers changed from: private */
    public long n;

    /* renamed from: o  reason: collision with root package name */
    private final h0<Boolean> f2832o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2833p;
    private final lp0.l<p, bp0.k> q;

    /* renamed from: r  reason: collision with root package name */
    private final d f2834r;

    public AndroidEdgeEffectOverscrollEffect(Context context, k kVar) {
        kotlin.jvm.internal.p.j(context, LogCategory.CONTEXT);
        kotlin.jvm.internal.p.j(kVar, "overscrollConfig");
        this.f2821a = kVar;
        f fVar = f.f16536a;
        EdgeEffect a11 = fVar.a(context, (AttributeSet) null);
        this.f2822b = a11;
        EdgeEffect a12 = fVar.a(context, (AttributeSet) null);
        this.f2823c = a12;
        EdgeEffect a13 = fVar.a(context, (AttributeSet) null);
        this.f2824d = a13;
        EdgeEffect a14 = fVar.a(context, (AttributeSet) null);
        this.f2825e = a14;
        List<EdgeEffect> m11 = k.m(a13, a11, a14, a12);
        this.f2826f = m11;
        this.f2827g = fVar.a(context, (AttributeSet) null);
        this.f2828h = fVar.a(context, (AttributeSet) null);
        this.f2829i = fVar.a(context, (AttributeSet) null);
        this.j = fVar.a(context, (AttributeSet) null);
        int size = m11.size();
        for (int i11 = 0; i11 < size; i11++) {
            m11.get(i11).setColor(f0.j(this.f2821a.b()));
        }
        this.k = g.g(bp0.k.f22762a, g.i());
        this.f2830l = true;
        this.n = t0.l.f16682b.b();
        this.f2832o = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
        AndroidEdgeEffectOverscrollEffect$onNewSize$1 androidEdgeEffectOverscrollEffect$onNewSize$1 = new AndroidEdgeEffectOverscrollEffect$onNewSize$1(this);
        this.q = androidEdgeEffectOverscrollEffect$onNewSize$1;
        this.f2834r = OnRemeasuredModifierKt.a(d.f16037h0.N(AndroidOverscrollKt.f2838b), androidEdgeEffectOverscrollEffect$onNewSize$1).N(new d(this, InspectableValueKt.c() ? new AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1(this) : InspectableValueKt.a()));
    }

    private final float A(long j11, long j12) {
        float n11 = t0.f.n(j12) / t0.l.g(this.n);
        return f.f16536a.d(this.f2824d, t0.f.m(j11) / t0.l.i(this.n), ((float) 1) - n11) * t0.l.i(this.n);
    }

    private final float B(long j11, long j12) {
        return (-f.f16536a.d(this.f2825e, -(t0.f.m(j11) / t0.l.i(this.n)), t0.f.n(j12) / t0.l.g(this.n))) * t0.l.i(this.n);
    }

    private final float C(long j11, long j12) {
        float m11 = t0.f.m(j12) / t0.l.i(this.n);
        return f.f16536a.d(this.f2822b, t0.f.n(j11) / t0.l.g(this.n), m11) * t0.l.g(this.n);
    }

    private final boolean D(long j11) {
        boolean z11;
        boolean z12 = false;
        if (this.f2824d.isFinished() || t0.f.m(j11) >= 0.0f) {
            z11 = false;
        } else {
            this.f2824d.onRelease();
            z11 = this.f2824d.isFinished();
        }
        if (!this.f2825e.isFinished() && t0.f.m(j11) > 0.0f) {
            this.f2825e.onRelease();
            z11 = z11 || this.f2825e.isFinished();
        }
        if (!this.f2822b.isFinished() && t0.f.n(j11) < 0.0f) {
            this.f2822b.onRelease();
            z11 = z11 || this.f2822b.isFinished();
        }
        if (this.f2823c.isFinished() || t0.f.n(j11) <= 0.0f) {
            return z11;
        }
        this.f2823c.onRelease();
        if (z11 || this.f2823c.isFinished()) {
            z12 = true;
        }
        return z12;
    }

    private final boolean E() {
        boolean z11;
        long b11 = m.b(this.n);
        f fVar = f.f16536a;
        boolean z12 = false;
        if (!(fVar.b(this.f2824d) == 0.0f)) {
            A(t0.f.f16662b.c(), b11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(fVar.b(this.f2825e) == 0.0f)) {
            B(t0.f.f16662b.c(), b11);
            z11 = true;
        }
        if (!(fVar.b(this.f2822b) == 0.0f)) {
            C(t0.f.f16662b.c(), b11);
            z11 = true;
        }
        if (fVar.b(this.f2823c) == 0.0f) {
            z12 = true;
        }
        if (z12) {
            return z11;
        }
        z(t0.f.f16662b.c(), b11);
        return true;
    }

    /* access modifiers changed from: private */
    public final void s() {
        List<EdgeEffect> list = this.f2826f;
        int size = list.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            EdgeEffect edgeEffect = list.get(i11);
            edgeEffect.onRelease();
            z11 = edgeEffect.isFinished() || z11;
        }
        if (z11) {
            y();
        }
    }

    private final boolean t(w0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-t0.l.i(this.n), (-t0.l.g(this.n)) + fVar.v0(this.f2821a.a().a()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean u(w0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-t0.l.g(this.n), fVar.v0(this.f2821a.a().b(fVar.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean w(w0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int c11 = c.c(t0.l.i(this.n));
        float c12 = this.f2821a.a().c(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-((float) c11)) + fVar.v0(c12));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final boolean x(w0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, fVar.v0(this.f2821a.a().d()));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* access modifiers changed from: private */
    public final void y() {
        if (this.f2830l) {
            this.k.setValue(bp0.k.f22762a);
        }
    }

    private final float z(long j11, long j12) {
        float m11 = t0.f.m(j12) / t0.l.i(this.n);
        return (-f.f16536a.d(this.f2823c, -(t0.f.n(j11) / t0.l.g(this.n)), ((float) 1) - m11)) * t0.l.g(this.n);
    }

    public void a(long j11, long j12, t0.f fVar, int i11) {
        boolean z11;
        boolean z12 = true;
        if (c.d(i11, c.f14279a.a())) {
            long u11 = fVar != null ? fVar.u() : m.b(this.n);
            if (t0.f.m(j12) > 0.0f) {
                A(j12, u11);
            } else if (t0.f.m(j12) < 0.0f) {
                B(j12, u11);
            }
            if (t0.f.n(j12) > 0.0f) {
                C(j12, u11);
            } else if (t0.f.n(j12) < 0.0f) {
                z(j12, u11);
            }
            z11 = !t0.f.j(j12, t0.f.f16662b.c());
        } else {
            z11 = false;
        }
        if (!D(j11) && !z11) {
            z12 = false;
        }
        if (z12) {
            y();
        }
    }

    public boolean b() {
        List<EdgeEffect> list = this.f2826f;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!(f.f16536a.b(list.get(i11)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long c(long r7, t0.f r9, int r10) {
        /*
            r6 = this;
            boolean r10 = r6.f2831m
            r0 = 1
            if (r10 != 0) goto L_0x000a
            r6.E()
            r6.f2831m = r0
        L_0x000a:
            if (r9 == 0) goto L_0x0011
            long r9 = r9.u()
            goto L_0x0017
        L_0x0011:
            long r9 = r6.n
            long r9 = t0.m.b(r9)
        L_0x0017:
            float r1 = t0.f.n(r7)
            r2 = 0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x0079
        L_0x0028:
            s.f r1 = s.f.f16536a
            android.widget.EdgeEffect r4 = r6.f2822b
            float r4 = r1.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r4 != 0) goto L_0x0052
            float r4 = r6.C(r7, r9)
            android.widget.EdgeEffect r5 = r6.f2822b
            float r1 = r1.b(r5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            if (r1 == 0) goto L_0x0079
            android.widget.EdgeEffect r1 = r6.f2822b
            r1.onRelease()
            goto L_0x0079
        L_0x0052:
            android.widget.EdgeEffect r4 = r6.f2823c
            float r4 = r1.b(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x005e
            r4 = 1
            goto L_0x005f
        L_0x005e:
            r4 = 0
        L_0x005f:
            if (r4 != 0) goto L_0x0026
            float r4 = r6.z(r7, r9)
            android.widget.EdgeEffect r5 = r6.f2823c
            float r1 = r1.b(r5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 == 0) goto L_0x0079
            android.widget.EdgeEffect r1 = r6.f2823c
            r1.onRelease()
        L_0x0079:
            float r1 = t0.f.m(r7)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0083
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            if (r1 == 0) goto L_0x0087
            goto L_0x00d8
        L_0x0087:
            s.f r1 = s.f.f16536a
            android.widget.EdgeEffect r5 = r6.f2824d
            float r5 = r1.b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            r5 = 1
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 != 0) goto L_0x00b1
            float r7 = r6.A(r7, r9)
            android.widget.EdgeEffect r8 = r6.f2824d
            float r8 = r1.b(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00af
            android.widget.EdgeEffect r8 = r6.f2824d
            r8.onRelease()
        L_0x00af:
            r3 = r7
            goto L_0x00d8
        L_0x00b1:
            android.widget.EdgeEffect r5 = r6.f2825e
            float r5 = r1.b(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00bd
            r5 = 1
            goto L_0x00be
        L_0x00bd:
            r5 = 0
        L_0x00be:
            if (r5 != 0) goto L_0x00d8
            float r7 = r6.B(r7, r9)
            android.widget.EdgeEffect r8 = r6.f2825e
            float r8 = r1.b(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 == 0) goto L_0x00af
            android.widget.EdgeEffect r8 = r6.f2825e
            r8.onRelease()
            goto L_0x00af
        L_0x00d8:
            long r7 = t0.g.a(r3, r4)
            t0.f$a r9 = t0.f.f16662b
            long r9 = r9.c()
            boolean r9 = t0.f.j(r7, r9)
            if (r9 != 0) goto L_0x00eb
            r6.y()
        L_0x00eb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.c(long, t0.f, int):long");
    }

    public d d() {
        return this.f2834r;
    }

    public Object e(long j11, fp0.c<? super bp0.k> cVar) {
        this.f2831m = false;
        if (u.h(j11) > 0.0f) {
            f.f16536a.c(this.f2824d, c.c(u.h(j11)));
        } else if (u.h(j11) < 0.0f) {
            f.f16536a.c(this.f2825e, -c.c(u.h(j11)));
        }
        if (u.i(j11) > 0.0f) {
            f.f16536a.c(this.f2822b, c.c(u.i(j11)));
        } else if (u.i(j11) < 0.0f) {
            f.f16536a.c(this.f2823c, -c.c(u.i(j11)));
        }
        if (!u.g(j11, u.f14031b.a())) {
            y();
        }
        s();
        return bp0.k.f22762a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(long r6, fp0.c<? super d2.u> r8) {
        /*
            r5 = this;
            float r8 = d2.u.h(r6)
            r0 = 1
            r1 = 0
            r2 = 0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x002e
            s.f r8 = s.f.f16536a
            android.widget.EdgeEffect r3 = r5.f2824d
            float r3 = r8.b(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 != 0) goto L_0x002e
            android.widget.EdgeEffect r3 = r5.f2824d
            float r4 = d2.u.h(r6)
            int r4 = np0.c.c(r4)
            r8.c(r3, r4)
            float r8 = d2.u.h(r6)
            goto L_0x005b
        L_0x002e:
            float r8 = d2.u.h(r6)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x005a
            s.f r8 = s.f.f16536a
            android.widget.EdgeEffect r3 = r5.f2825e
            float r3 = r8.b(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0044
            r3 = 1
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 != 0) goto L_0x005a
            android.widget.EdgeEffect r3 = r5.f2825e
            float r4 = d2.u.h(r6)
            int r4 = np0.c.c(r4)
            int r4 = -r4
            r8.c(r3, r4)
            float r8 = d2.u.h(r6)
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            float r3 = d2.u.i(r6)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0086
            s.f r3 = s.f.f16536a
            android.widget.EdgeEffect r4 = r5.f2822b
            float r4 = r3.b(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0071
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r4 != 0) goto L_0x0086
            android.widget.EdgeEffect r0 = r5.f2822b
            float r1 = d2.u.i(r6)
            int r1 = np0.c.c(r1)
            r3.c(r0, r1)
            float r2 = d2.u.i(r6)
            goto L_0x00b0
        L_0x0086:
            float r3 = d2.u.i(r6)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b0
            s.f r3 = s.f.f16536a
            android.widget.EdgeEffect r4 = r5.f2823c
            float r4 = r3.b(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 != 0) goto L_0x00b0
            android.widget.EdgeEffect r0 = r5.f2823c
            float r1 = d2.u.i(r6)
            int r1 = np0.c.c(r1)
            int r1 = -r1
            r3.c(r0, r1)
            float r2 = d2.u.i(r6)
        L_0x00b0:
            long r6 = d2.v.a(r8, r2)
            d2.u$a r8 = d2.u.f14031b
            long r0 = r8.a()
            boolean r8 = d2.u.g(r6, r0)
            if (r8 != 0) goto L_0x00c3
            r5.y()
        L_0x00c3:
            d2.u r6 = d2.u.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.f(long, fp0.c):java.lang.Object");
    }

    public boolean isEnabled() {
        return this.f2832o.getValue().booleanValue();
    }

    public void setEnabled(boolean z11) {
        boolean z12 = this.f2833p != z11;
        this.f2832o.setValue(Boolean.valueOf(z11));
        this.f2833p = z11;
        if (z12) {
            this.f2831m = false;
            s();
        }
    }

    public final void v(w0.f fVar) {
        boolean z11;
        kotlin.jvm.internal.p.j(fVar, "<this>");
        x a11 = fVar.O().a();
        this.k.getValue();
        Canvas c11 = u0.c.c(a11);
        f fVar2 = f.f16536a;
        boolean z12 = true;
        if (!(fVar2.b(this.f2829i) == 0.0f)) {
            w(fVar, this.f2829i, c11);
            this.f2829i.finish();
        }
        if (!this.f2824d.isFinished()) {
            z11 = u(fVar, this.f2824d, c11);
            fVar2.d(this.f2829i, fVar2.b(this.f2824d), 0.0f);
        } else {
            z11 = false;
        }
        if (!(fVar2.b(this.f2827g) == 0.0f)) {
            t(fVar, this.f2827g, c11);
            this.f2827g.finish();
        }
        if (!this.f2822b.isFinished()) {
            z11 = x(fVar, this.f2822b, c11) || z11;
            fVar2.d(this.f2827g, fVar2.b(this.f2822b), 0.0f);
        }
        if (!(fVar2.b(this.j) == 0.0f)) {
            u(fVar, this.j, c11);
            this.j.finish();
        }
        if (!this.f2825e.isFinished()) {
            z11 = w(fVar, this.f2825e, c11) || z11;
            fVar2.d(this.j, fVar2.b(this.f2825e), 0.0f);
        }
        if (!(fVar2.b(this.f2828h) == 0.0f)) {
            x(fVar, this.f2828h, c11);
            this.f2828h.finish();
        }
        if (!this.f2823c.isFinished()) {
            if (!t(fVar, this.f2823c, c11) && !z11) {
                z12 = false;
            }
            fVar2.d(this.f2828h, fVar2.b(this.f2823c), 0.0f);
            z11 = z12;
        }
        if (z11) {
            y();
        }
    }
}

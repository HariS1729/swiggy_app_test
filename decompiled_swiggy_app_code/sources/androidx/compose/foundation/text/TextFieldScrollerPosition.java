package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.g;
import androidx.compose.runtime.saveable.ListSaverKt;
import e0.a1;
import e0.h0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import m0.c;
import p1.a0;
import t0.h;

/* compiled from: TextFieldScroll.kt */
public final class TextFieldScrollerPosition {

    /* renamed from: f  reason: collision with root package name */
    public static final a f4614f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final c<TextFieldScrollerPosition, Object> f4615g = ListSaverKt.a(TextFieldScrollerPosition$Companion$Saver$1.f4621a, TextFieldScrollerPosition$Companion$Saver$2.f4622a);

    /* renamed from: a  reason: collision with root package name */
    private final h0 f4616a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f4617b;

    /* renamed from: c  reason: collision with root package name */
    private h f4618c;

    /* renamed from: d  reason: collision with root package name */
    private long f4619d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f4620e;

    /* compiled from: TextFieldScroll.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c<TextFieldScrollerPosition, Object> a() {
            return TextFieldScrollerPosition.f4615g;
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f11) {
        p.j(orientation, "initialOrientation");
        this.f4616a = j.e(Float.valueOf(f11), (a1) null, 2, (Object) null);
        this.f4617b = j.e(Float.valueOf(0.0f), (a1) null, 2, (Object) null);
        this.f4618c = h.f16667e.a();
        this.f4619d = a0.f16041b.a();
        this.f4620e = g.g(orientation, g.o());
    }

    private final void g(float f11) {
        this.f4617b.setValue(Float.valueOf(f11));
    }

    public final void b(float f11, float f12, int i11) {
        int i12;
        float d11 = d();
        float f13 = (float) i11;
        float f14 = d11 + f13;
        h(d() + ((f12 <= f14 && (f11 >= d11 || f12 - f11 <= f13)) ? (i12 >= 0 || f12 - f11 > f13) ? 0.0f : f11 - d11 : f12 - f14));
    }

    public final float c() {
        return ((Number) this.f4617b.getValue()).floatValue();
    }

    public final float d() {
        return ((Number) this.f4616a.getValue()).floatValue();
    }

    public final int e(long j) {
        if (a0.n(j) != a0.n(this.f4619d)) {
            return a0.n(j);
        }
        if (a0.i(j) != a0.i(this.f4619d)) {
            return a0.i(j);
        }
        return a0.l(j);
    }

    public final Orientation f() {
        return (Orientation) this.f4620e.getValue();
    }

    public final void h(float f11) {
        this.f4616a.setValue(Float.valueOf(f11));
    }

    public final void i(long j) {
        this.f4619d = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if ((r6.l() == r4.f4618c.l()) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(androidx.compose.foundation.gestures.Orientation r5, t0.h r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.p.j(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.p.j(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.g(r8)
            float r0 = r6.i()
            t0.h r1 = r4.f4618c
            float r1 = r1.i()
            r2 = 1
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0037
            float r0 = r6.l()
            t0.h r1 = r4.f4618c
            float r1 = r1.l()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x0058
        L_0x0037:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0044
            float r5 = r6.l()
            goto L_0x0048
        L_0x0044:
            float r5 = r6.i()
        L_0x0048:
            if (r2 == 0) goto L_0x004f
            float r0 = r6.e()
            goto L_0x0053
        L_0x004f:
            float r0 = r6.j()
        L_0x0053:
            r4.b(r5, r0, r7)
            r4.f4618c = r6
        L_0x0058:
            float r5 = r4.d()
            r6 = 0
            float r5 = rp0.l.l(r5, r6, r8)
            r4.h(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.j(androidx.compose.foundation.gestures.Orientation, t0.h, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f11, int i11, i iVar) {
        this(orientation, (i11 & 2) != 0 ? 0.0f : f11);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, (i) null);
    }
}

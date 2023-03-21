package p1;

import a2.e;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import d2.b;
import d2.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.h;
import u0.h1;
import u0.o;
import u0.u;
import u0.v0;
import u0.w0;
import u0.x;

/* compiled from: MultiParagraph.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final MultiParagraphIntrinsics f16070a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16071b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16072c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16073d;

    /* renamed from: e  reason: collision with root package name */
    private final float f16074e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16075f;

    /* renamed from: g  reason: collision with root package name */
    private final List<h> f16076g;

    /* renamed from: h  reason: collision with root package name */
    private final List<h> f16077h;

    private d(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i11, boolean z11) {
        boolean z12;
        int i12;
        float height;
        int i13;
        this.f16070a = multiParagraphIntrinsics;
        this.f16071b = i11;
        int i14 = 0;
        if (b.p(j) == 0 && b.o(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<i> f11 = multiParagraphIntrinsics.f();
            int size = f11.size();
            int i15 = 0;
            int i16 = 0;
            float f12 = 0.0f;
            while (true) {
                if (i15 >= size) {
                    z12 = false;
                    break;
                }
                i iVar = f11.get(i15);
                j b11 = iVar.b();
                int n = b.n(j);
                if (b.i(j)) {
                    i12 = l.d(b.m(j) - l.d(f12), i14);
                } else {
                    i12 = b.m(j);
                }
                g c11 = l.c(b11, c.b(0, n, 0, i12, 5, (Object) null), this.f16071b - i16, z11);
                height = f12 + c11.getHeight();
                int o11 = i16 + c11.o();
                h hVar = r7;
                i13 = o11;
                h hVar2 = new h(c11, iVar.c(), iVar.a(), i16, o11, f12, height);
                arrayList.add(hVar);
                if (c11.q() || (i13 == this.f16071b && i15 != k.l(this.f16070a.f()))) {
                    i16 = i13;
                    f12 = height;
                    z12 = true;
                } else {
                    i15++;
                    i16 = i13;
                    f12 = height;
                    i14 = 0;
                }
            }
            i16 = i13;
            f12 = height;
            z12 = true;
            this.f16074e = f12;
            this.f16075f = i16;
            this.f16072c = z12;
            this.f16077h = arrayList;
            this.f16073d = (float) b.n(j);
            List<h> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i17 = 0; i17 < size2; i17++) {
                h hVar3 = (h) arrayList.get(i17);
                List<h> x11 = hVar3.e().x();
                ArrayList arrayList3 = new ArrayList(x11.size());
                int size3 = x11.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    h hVar4 = x11.get(i18);
                    arrayList3.add(hVar4 != null ? hVar3.i(hVar4) : null);
                }
                boolean unused = p.z(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f16070a.g().size()) {
                int size4 = this.f16070a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i19 = 0; i19 < size4; i19++) {
                    arrayList4.add((Object) null);
                }
                arrayList2 = s.m0(arrayList2, arrayList4);
            }
            this.f16076g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ d(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i11, boolean z11, i iVar) {
        this(multiParagraphIntrinsics, j, i11, z11);
    }

    private final void C(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < a().g().length()) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(("offset(" + i11 + ") is out of bounds [0, " + a().length() + ')').toString());
        }
    }

    private final void D(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= a().g().length()) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(("offset(" + i11 + ") is out of bounds [0, " + a().length() + ']').toString());
        }
    }

    private final void E(int i11) {
        boolean z11 = false;
        if (i11 >= 0 && i11 < this.f16075f) {
            z11 = true;
        }
        if (!z11) {
            throw new IllegalArgumentException(("lineIndex(" + i11 + ") is out of bounds [0, " + i11 + ')').toString());
        }
    }

    private final b a() {
        return this.f16070a.e();
    }

    public final void A(x xVar, u uVar, h1 h1Var, e eVar) {
        p.j(xVar, "canvas");
        p.j(uVar, "brush");
        x1.b.a(this, xVar, uVar, h1Var, eVar);
    }

    public final void B(x xVar, long j, h1 h1Var, e eVar) {
        p.j(xVar, "canvas");
        xVar.a();
        List<h> list = this.f16077h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = list.get(i11);
            hVar.e().d(xVar, j, h1Var, eVar);
            xVar.c(0.0f, hVar.e().getHeight());
        }
        xVar.o();
    }

    public final ResolvedTextDirection b(int i11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.e().v(hVar.p(i11));
    }

    public final h c(int i11) {
        C(i11);
        h hVar = this.f16077h.get(f.a(this.f16077h, i11));
        return hVar.i(hVar.e().w(hVar.p(i11)));
    }

    public final h d(int i11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.i(hVar.e().n(hVar.p(i11)));
    }

    public final boolean e() {
        return this.f16072c;
    }

    public final float f() {
        if (this.f16077h.isEmpty()) {
            return 0.0f;
        }
        return this.f16077h.get(0).e().f();
    }

    public final float g() {
        return this.f16074e;
    }

    public final float h(int i11, boolean z11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.e().s(hVar.p(i11), z11);
    }

    public final MultiParagraphIntrinsics i() {
        return this.f16070a;
    }

    public final float j() {
        if (this.f16077h.isEmpty()) {
            return 0.0f;
        }
        h hVar = (h) s.h0(this.f16077h);
        return hVar.n(hVar.e().t());
    }

    public final float k(int i11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.n(hVar.e().m(hVar.q(i11)));
    }

    public final int l() {
        return this.f16075f;
    }

    public final int m(int i11, boolean z11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.l(hVar.e().i(hVar.q(i11), z11));
    }

    public final int n(int i11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.m(hVar.e().u(hVar.p(i11)));
    }

    public final int o(float f11) {
        h hVar = this.f16077h.get(f11 <= 0.0f ? 0 : f11 >= this.f16074e ? k.l(this.f16077h) : f.c(this.f16077h, f11));
        if (hVar.d() == 0) {
            return Math.max(0, hVar.f() - 1);
        }
        return hVar.m(hVar.e().k(hVar.r(f11)));
    }

    public final float p(int i11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.e().l(hVar.q(i11));
    }

    public final float q(int i11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.e().p(hVar.q(i11));
    }

    public final int r(int i11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.l(hVar.e().h(hVar.q(i11)));
    }

    public final float s(int i11) {
        E(i11);
        h hVar = this.f16077h.get(f.b(this.f16077h, i11));
        return hVar.n(hVar.e().c(hVar.q(i11)));
    }

    public final int t(long j) {
        int i11;
        if (f.n(j) <= 0.0f) {
            i11 = 0;
        } else if (f.n(j) >= this.f16074e) {
            i11 = k.l(this.f16077h);
        } else {
            i11 = f.c(this.f16077h, f.n(j));
        }
        h hVar = this.f16077h.get(i11);
        if (hVar.d() == 0) {
            return Math.max(0, hVar.f() - 1);
        }
        return hVar.l(hVar.e().g(hVar.o(j)));
    }

    public final ResolvedTextDirection u(int i11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.e().b(hVar.p(i11));
    }

    public final List<h> v() {
        return this.f16077h;
    }

    public final w0 w(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > a().g().length()) {
            z11 = false;
        }
        if (!z11) {
            throw new IllegalArgumentException(("Start(" + i11 + ") or End(" + i12 + ") is out of range [0.." + a().g().length() + "), or start > end!").toString());
        } else if (i11 == i12) {
            return o.a();
        } else {
            w0 a11 = o.a();
            int size = this.f16077h.size();
            for (int a12 = f.a(this.f16077h, i11); a12 < size; a12++) {
                h hVar = this.f16077h.get(a12);
                if (hVar.f() >= i12) {
                    break;
                }
                if (hVar.f() != hVar.b()) {
                    v0.a(a11, hVar.j(hVar.e().r(hVar.p(i11), hVar.p(i12))), 0, 2, (Object) null);
                }
            }
            return a11;
        }
    }

    public final List<h> x() {
        return this.f16076g;
    }

    public final float y() {
        return this.f16073d;
    }

    public final long z(int i11) {
        int i12;
        D(i11);
        if (i11 == a().length()) {
            i12 = k.l(this.f16077h);
        } else {
            i12 = f.a(this.f16077h, i11);
        }
        h hVar = this.f16077h.get(i12);
        return hVar.k(hVar.e().e(hVar.p(i11)));
    }
}

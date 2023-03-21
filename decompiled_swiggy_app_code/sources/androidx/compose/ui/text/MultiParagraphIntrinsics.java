package androidx.compose.ui.text;

import a2.d;
import bp0.f;
import d2.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c;
import p1.c0;
import p1.i;
import p1.j;
import p1.k;
import p1.m;
import p1.o;
import u1.i;

/* compiled from: MultiParagraphIntrinsics.kt */
public final class MultiParagraphIntrinsics implements j {

    /* renamed from: a  reason: collision with root package name */
    private final b f7463a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b.C0163b<o>> f7464b;

    /* renamed from: c  reason: collision with root package name */
    private final f f7465c;

    /* renamed from: d  reason: collision with root package name */
    private final f f7466d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f7467e;

    public MultiParagraphIntrinsics(b bVar, c0 c0Var, List<b.C0163b<o>> list, e eVar, i.b bVar2) {
        b bVar3 = bVar;
        c0 c0Var2 = c0Var;
        List<b.C0163b<o>> list2 = list;
        p.j(bVar3, "annotatedString");
        p.j(c0Var2, "style");
        p.j(list2, "placeholders");
        p.j(eVar, "density");
        p.j(bVar2, "fontFamilyResolver");
        this.f7463a = bVar3;
        this.f7464b = list2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f7465c = b.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.f7466d = b.a(lazyThreadSafetyMode, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        m D = c0Var.D();
        List<b.C0163b<m>> j = c.j(bVar3, D);
        ArrayList arrayList = new ArrayList(j.size());
        int size = j.size();
        int i11 = 0;
        while (i11 < size) {
            b.C0163b bVar4 = j.get(i11);
            b d11 = c.k(bVar3, bVar4.f(), bVar4.d());
            m d12 = h((m) bVar4.e(), D);
            arrayList.add(new p1.i(k.a(d11.g(), c0Var2.B(d12), d11.e(), p1.e.b(g(), bVar4.f(), bVar4.d()), eVar, bVar2), bVar4.f(), bVar4.d()));
            i11++;
            bVar3 = bVar;
        }
        this.f7467e = arrayList;
    }

    /* access modifiers changed from: private */
    public final m h(m mVar, m mVar2) {
        a2.f g11 = mVar.g();
        if (g11 != null) {
            g11.l();
            return mVar;
        }
        return m.b(mVar, (d) null, mVar2.g(), 0, (a2.j) null, 13, (Object) null);
    }

    public float a() {
        return ((Number) this.f7465c.getValue()).floatValue();
    }

    public boolean b() {
        List<p1.i> list = this.f7467e;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).b().b()) {
                return true;
            }
        }
        return false;
    }

    public float c() {
        return ((Number) this.f7466d.getValue()).floatValue();
    }

    public final b e() {
        return this.f7463a;
    }

    public final List<p1.i> f() {
        return this.f7467e;
    }

    public final List<b.C0163b<o>> g() {
        return this.f7464b;
    }
}

package k1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierLocalConsumerEntity;
import bp0.k;
import com.google.android.gms.common.internal.ImagesContract;
import f0.e;
import j1.d;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: ModifierLocalProviderEntity.kt */
public final class m implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f15373a;

    /* renamed from: b  reason: collision with root package name */
    private final d<?> f15374b;

    /* renamed from: c  reason: collision with root package name */
    private m f15375c;

    /* renamed from: d  reason: collision with root package name */
    private m f15376d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15377e;

    /* renamed from: f  reason: collision with root package name */
    private final e<ModifierLocalConsumerEntity> f15378f = new e<>(new ModifierLocalConsumerEntity[16], 0);

    public m(LayoutNode layoutNode, d<?> dVar) {
        p.j(layoutNode, "layoutNode");
        p.j(dVar, "modifier");
        this.f15373a = layoutNode;
        this.f15374b = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r7 = r5.f15373a.A0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j(j1.a<?> r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x000f
            j1.d<?> r7 = r5.f15374b
            j1.f r7 = r7.getKey()
            boolean r7 = kotlin.jvm.internal.p.e(r7, r6)
            if (r7 == 0) goto L_0x000f
            return
        L_0x000f:
            f0.e<androidx.compose.ui.node.ModifierLocalConsumerEntity> r7 = r5.f15378f
            int r0 = r7.m()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0028
            java.lang.Object[] r7 = r7.l()
            r3 = 0
        L_0x001e:
            r4 = r7[r3]
            androidx.compose.ui.node.ModifierLocalConsumerEntity r4 = (androidx.compose.ui.node.ModifierLocalConsumerEntity) r4
            r4.g(r6)
            int r3 = r3 + r2
            if (r3 < r0) goto L_0x001e
        L_0x0028:
            k1.m r7 = r5.f15375c
            if (r7 == 0) goto L_0x0032
            r7.j(r6, r2)
            bp0.k r7 = bp0.k.f22762a
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            if (r7 != 0) goto L_0x0053
            androidx.compose.ui.node.LayoutNode r7 = r5.f15373a
            f0.e r7 = r7.A0()
            int r0 = r7.m()
            if (r0 <= 0) goto L_0x0053
            java.lang.Object[] r7 = r7.l()
        L_0x0045:
            r3 = r7[r1]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.ui.node.LayoutNode) r3
            k1.m r3 = r3.n0()
            r3.j(r6, r2)
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x0045
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.m.j(j1.a, boolean):void");
    }

    public final void a() {
        this.f15377e = true;
        int i11 = 0;
        j(this.f15374b.getKey(), false);
        e<ModifierLocalConsumerEntity> eVar = this.f15378f;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            do {
                ((ModifierLocalConsumerEntity) l11[i11]).b();
                i11++;
            } while (i11 < m11);
        }
    }

    public final void b() {
        this.f15377e = true;
        q t02 = this.f15373a.t0();
        if (t02 != null) {
            t02.r(this);
        }
        e<ModifierLocalConsumerEntity> eVar = this.f15378f;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = eVar.l();
            do {
                ((ModifierLocalConsumerEntity) l11[i11]).c();
                i11++;
            } while (i11 < m11);
        }
    }

    public final void c() {
        this.f15377e = false;
        e<ModifierLocalConsumerEntity> eVar = this.f15378f;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            do {
                ((ModifierLocalConsumerEntity) l11[i11]).d();
                i11++;
            } while (i11 < m11);
        }
        j(this.f15374b.getKey(), false);
    }

    public final d<?> d(j1.a<?> aVar) {
        m p02;
        d<?> d11;
        p.j(aVar, ImagesContract.LOCAL);
        if (p.e(this.f15374b.getKey(), aVar)) {
            return this.f15374b;
        }
        m mVar = this.f15376d;
        if (mVar != null && (d11 = mVar.d(aVar)) != null) {
            return d11;
        }
        LayoutNode u02 = this.f15373a.u0();
        if (u02 == null || (p02 = u02.p0()) == null) {
            return null;
        }
        return p02.d(aVar);
    }

    public final e<ModifierLocalConsumerEntity> e() {
        return this.f15378f;
    }

    public final LayoutNode f() {
        return this.f15373a;
    }

    public final d<?> g() {
        return this.f15374b;
    }

    public final m h() {
        return this.f15375c;
    }

    public final m i() {
        return this.f15376d;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        k();
        return k.f22762a;
    }

    public void k() {
        if (this.f15377e) {
            j(this.f15374b.getKey(), false);
        }
    }

    public final void l(m mVar) {
        this.f15375c = mVar;
    }

    public final void m(m mVar) {
        this.f15376d = mVar;
    }
}

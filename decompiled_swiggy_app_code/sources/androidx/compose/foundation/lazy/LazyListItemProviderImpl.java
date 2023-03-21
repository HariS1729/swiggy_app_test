package androidx.compose.foundation.lazy;

import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.d1;
import e0.g;
import e0.s0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import w.d;
import w.k;

/* compiled from: LazyListItemProviderImpl.kt */
public final class LazyListItemProviderImpl implements k {

    /* renamed from: a  reason: collision with root package name */
    private final d1<LazyListItemsSnapshot> f3966a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3967b = new d();

    public LazyListItemProviderImpl(d1<LazyListItemsSnapshot> d1Var) {
        p.j(d1Var, "itemsSnapshot");
        this.f3966a = d1Var;
    }

    public Object a(int i11) {
        return this.f3966a.getValue().b(i11);
    }

    public Map<Object, Integer> b() {
        return this.f3966a.getValue().f();
    }

    public Object c(int i11) {
        return this.f3966a.getValue().e(i11);
    }

    public d d() {
        return this.f3967b;
    }

    public void e(int i11, g gVar, int i12) {
        int i13;
        g t = gVar.t(1704733014);
        if ((i12 & 14) == 0) {
            i13 = (t.p(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= t.k(this) ? 32 : 16;
        }
        if ((i13 & 91) != 18 || !t.b()) {
            this.f3966a.getValue().a(d(), i11, t, ((i13 << 3) & 112) | TruecallerSdkScope.FOOTER_TYPE_MANUALLY);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new LazyListItemProviderImpl$Item$1(this, i11, i12));
        }
    }

    public List<Integer> f() {
        return this.f3966a.getValue().c();
    }

    public int getItemCount() {
        return this.f3966a.getValue().d();
    }
}

package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.r0;
import f2.e;
import f2.v;
import i1.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class ConstraintSetForInlineDsl implements e, r0 {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayoutScope f7959a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Handler f7960b;

    /* renamed from: c  reason: collision with root package name */
    private final SnapshotStateObserver f7961c = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));

    /* renamed from: d  reason: collision with root package name */
    private boolean f7962d = true;

    /* renamed from: e  reason: collision with root package name */
    private final l<k, k> f7963e = new ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1(this);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f7964f = new ArrayList();

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        p.j(constraintLayoutScope, "scope");
        this.f7959a = constraintLayoutScope;
    }

    public void a(v vVar, List<? extends r> list) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(list, "measurables");
        this.f7959a.a(vVar);
        this.f7964f.clear();
        this.f7961c.j(k.f22762a, this.f7963e, new ConstraintSetForInlineDsl$applyTo$1(list, vVar, this));
        this.f7962d = false;
    }

    public void b() {
        this.f7961c.k();
    }

    public boolean d(List<? extends r> list) {
        p.j(list, "measurables");
        if (this.f7962d || list.size() != this.f7964f.size()) {
            return true;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object p11 = ((r) list.get(i11)).p();
                if (!p.e(p11 instanceof c ? (c) p11 : null, this.f7964f.get(i11))) {
                    return true;
                }
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    public void f() {
    }

    public void g() {
        this.f7961c.l();
        this.f7961c.g();
    }

    public final void k(boolean z11) {
        this.f7962d = z11;
    }
}

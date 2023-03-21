package w;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.PinnableParentKt;
import com.newrelic.agent.android.agentdata.HexAttribute;
import i1.f0;
import j1.d;
import j1.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import w.e;
import x.j;

/* compiled from: LazyListPinningModifier.kt */
final class n implements d<j>, j1.b, j {

    /* renamed from: d  reason: collision with root package name */
    public static final b f17376d = new b((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final a f17377e = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final LazyListState f17378a;

    /* renamed from: b  reason: collision with root package name */
    private final e f17379b;

    /* renamed from: c  reason: collision with root package name */
    private j f17380c;

    /* compiled from: LazyListPinningModifier.kt */
    public static final class a implements j.a {
        a() {
        }

        public void a() {
        }
    }

    /* compiled from: LazyListPinningModifier.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* compiled from: LazyListPinningModifier.kt */
    public static final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private final j.a f17381a;

        /* renamed from: b  reason: collision with root package name */
        private final e.a f17382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ n f17383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f17384d;

        c(n nVar, e eVar) {
            this.f17383c = nVar;
            this.f17384d = eVar;
            j d11 = nVar.d();
            this.f17381a = d11 != null ? d11.a() : null;
            this.f17382b = eVar.a(eVar.c(), eVar.b());
        }

        public void a() {
            this.f17384d.e(this.f17382b);
            j.a aVar = this.f17381a;
            if (aVar != null) {
                aVar.a();
            }
            f0 p11 = this.f17383c.f17378a.p();
            if (p11 != null) {
                p11.b();
            }
        }
    }

    public n(LazyListState lazyListState, e eVar) {
        p.j(lazyListState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(eVar, "beyondBoundsInfo");
        this.f17378a = lazyListState;
        this.f17379b = eVar;
    }

    public void D(j1.e eVar) {
        p.j(eVar, "scope");
        this.f17380c = (j) eVar.a(PinnableParentKt.a());
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r1 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x.j.a a() {
        /*
            r2 = this;
            w.e r0 = r2.f17379b
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x000e
            w.n$c r1 = new w.n$c
            r1.<init>(r2, r0)
            goto L_0x001a
        L_0x000e:
            x.j r0 = r2.f17380c
            if (r0 == 0) goto L_0x0018
            x.j$a r1 = r0.a()
            if (r1 != 0) goto L_0x001a
        L_0x0018:
            w.n$a r1 = f17377e
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.a():x.j$a");
    }

    public final j d() {
        return this.f17380c;
    }

    /* renamed from: e */
    public j getValue() {
        return this;
    }

    public f<j> getKey() {
        return PinnableParentKt.a();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}

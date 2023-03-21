package androidx.compose.ui.text.font;

import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import lp0.l;
import u1.a0;
import u1.l0;
import u1.m0;
import u1.o;
import u1.r;
import wp0.e2;
import wp0.g0;
import wp0.j0;
import wp0.k0;
import wp0.k1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class FontListFontFamilyTypefaceAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static final a f7598c = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private static final r f7599d = new r();

    /* renamed from: e  reason: collision with root package name */
    private static final g0 f7600e = new b(g0.f29464k0);

    /* renamed from: a  reason: collision with root package name */
    private final AsyncTypefaceCache f7601a;

    /* renamed from: b  reason: collision with root package name */
    private j0 f7602b;

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class b extends fp0.a implements g0 {
        public b(g0.a aVar) {
            super(aVar);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext) {
        p.j(asyncTypefaceCache, "asyncTypefaceCache");
        p.j(coroutineContext, "injectedContext");
        this.f7601a = asyncTypefaceCache;
        this.f7602b = k0.a(f7600e.plus(coroutineContext).plus(e2.a((k1) coroutineContext.get(k1.f29476l0))));
    }

    public m0 a(l0 l0Var, a0 a0Var, l<? super m0.b, k> lVar, l<? super l0, ? extends Object> lVar2) {
        l0 l0Var2 = l0Var;
        a0 a0Var2 = a0Var;
        l<? super l0, ? extends Object> lVar3 = lVar2;
        p.j(l0Var2, "typefaceRequest");
        p.j(a0Var2, "platformFontLoader");
        p.j(lVar, "onAsyncCompletion");
        p.j(lVar3, "createDefaultTypeface");
        if (!(l0Var.c() instanceof o)) {
            return null;
        }
        Pair a11 = u1.p.b(f7599d.a(((o) l0Var.c()).g(), l0Var.f(), l0Var.d()), l0Var2, this.f7601a, a0Var2, lVar3);
        List list = (List) a11.a();
        Object b11 = a11.b();
        if (list == null) {
            return new m0.b(b11, false, 2, (i) null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b11, l0Var, this.f7601a, lVar, a0Var);
        k1 unused = j.d(this.f7602b, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, (c<? super FontListFontFamilyTypefaceAdapter$resolve$1>) null), 1, (Object) null);
        return new m0.a(asyncFontListLoader);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i11, i iVar) {
        this((i11 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i11 & 2) != 0 ? EmptyCoroutineContext.f25631a : coroutineContext);
    }
}

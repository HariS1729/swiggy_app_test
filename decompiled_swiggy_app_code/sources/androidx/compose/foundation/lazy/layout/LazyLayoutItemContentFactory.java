package androidx.compose.foundation.lazy.layout;

import bp0.k;
import d2.c;
import d2.e;
import d2.g;
import e0.a1;
import e0.h0;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.b;
import lp0.p;
import m0.a;
import x.d;

/* compiled from: LazyLayoutItemContentFactory.kt */
public final class LazyLayoutItemContentFactory {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f4105a;

    /* renamed from: b  reason: collision with root package name */
    private final lp0.a<d> f4106b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, CachedItemContent> f4107c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private e f4108d = g.a(0.0f, 0.0f);

    /* renamed from: e  reason: collision with root package name */
    private long f4109e = c.b(0, 0, 0, 0, 15, (Object) null);

    /* compiled from: LazyLayoutItemContentFactory.kt */
    private final class CachedItemContent {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4110a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f4111b;

        /* renamed from: c  reason: collision with root package name */
        private final h0 f4112c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public p<? super e0.g, ? super Integer, k> f4113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LazyLayoutItemContentFactory f4114e;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i11, Object obj, Object obj2) {
            kotlin.jvm.internal.p.j(obj, HttpRequest.HEADER_KEY);
            this.f4114e = lazyLayoutItemContentFactory;
            this.f4110a = obj;
            this.f4111b = obj2;
            this.f4112c = j.e(Integer.valueOf(i11), (a1) null, 2, (Object) null);
        }

        private final p<e0.g, Integer, k> c() {
            return b.c(1403994769, true, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(this.f4114e, this));
        }

        /* access modifiers changed from: private */
        public final void h(int i11) {
            this.f4112c.setValue(Integer.valueOf(i11));
        }

        public final p<e0.g, Integer, k> d() {
            p<? super e0.g, ? super Integer, k> pVar = this.f4113d;
            if (pVar != null) {
                return pVar;
            }
            p<e0.g, Integer, k> c11 = c();
            this.f4113d = c11;
            return c11;
        }

        public final Object e() {
            return this.f4110a;
        }

        public final int f() {
            return ((Number) this.f4112c.getValue()).intValue();
        }

        public final Object g() {
            return this.f4111b;
        }
    }

    public LazyLayoutItemContentFactory(a aVar, lp0.a<? extends d> aVar2) {
        kotlin.jvm.internal.p.j(aVar, "saveableStateHolder");
        kotlin.jvm.internal.p.j(aVar2, "itemProvider");
        this.f4105a = aVar;
        this.f4106b = aVar2;
    }

    public final p<e0.g, Integer, k> b(int i11, Object obj) {
        kotlin.jvm.internal.p.j(obj, HttpRequest.HEADER_KEY);
        CachedItemContent cachedItemContent = this.f4107c.get(obj);
        Object a11 = this.f4106b.invoke().a(i11);
        if (cachedItemContent != null && cachedItemContent.f() == i11 && kotlin.jvm.internal.p.e(cachedItemContent.g(), a11)) {
            return cachedItemContent.d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i11, obj, a11);
        this.f4107c.put(obj, cachedItemContent2);
        return cachedItemContent2.d();
    }

    public final Object c(Object obj) {
        CachedItemContent cachedItemContent = this.f4107c.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.g();
        }
        d invoke = this.f4106b.invoke();
        Integer num = invoke.b().get(obj);
        if (num != null) {
            return invoke.a(num.intValue());
        }
        return null;
    }

    public final lp0.a<d> d() {
        return this.f4106b;
    }

    public final void e(e eVar, long j) {
        kotlin.jvm.internal.p.j(eVar, "density");
        if (!kotlin.jvm.internal.p.e(eVar, this.f4108d) || !d2.b.g(j, this.f4109e)) {
            this.f4108d = eVar;
            this.f4109e = j;
            this.f4107c.clear();
        }
    }
}

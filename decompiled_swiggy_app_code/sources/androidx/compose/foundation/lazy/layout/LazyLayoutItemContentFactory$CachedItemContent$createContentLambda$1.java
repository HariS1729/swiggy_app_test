package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import bp0.k;
import e0.g;
import e0.r;
import e0.s;
import e0.u;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.l;
import lp0.p;
import x.d;

/* compiled from: LazyLayoutItemContentFactory.kt */
final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemContentFactory f4115a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f4116b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.f4115a = lazyLayoutItemContentFactory;
        this.f4116b = cachedItemContent;
    }

    public final void a(g gVar, int i11) {
        final int i12;
        if ((i11 & 11) != 2 || !gVar.b()) {
            final d invoke = this.f4115a.d().invoke();
            Integer num = invoke.b().get(this.f4116b.e());
            if (num != null) {
                this.f4116b.h(num.intValue());
                i12 = num.intValue();
            } else {
                i12 = this.f4116b.f();
            }
            gVar.E(-715769699);
            if (i12 < invoke.getItemCount()) {
                Object c11 = invoke.c(i12);
                if (kotlin.jvm.internal.p.e(c11, this.f4116b.e())) {
                    this.f4115a.f4105a.a(c11, b.b(gVar, -1238863364, true, new p<g, Integer, k>() {
                        public final void a(g gVar, int i11) {
                            if ((i11 & 11) != 2 || !gVar.b()) {
                                invoke.e(i12, gVar, 0);
                            } else {
                                gVar.h();
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            a((g) obj, ((Number) obj2).intValue());
                            return k.f22762a;
                        }
                    }), gVar, 568);
                }
            }
            gVar.P();
            Object e11 = this.f4116b.e();
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.f4116b;
            u.b(e11, new l<s, r>() {

                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a */
                /* compiled from: Effects.kt */
                public static final class a implements r {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f4120a;

                    public a(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
                        this.f4120a = cachedItemContent;
                    }

                    public void dispose() {
                        this.f4120a.f4113d = null;
                    }
                }

                /* renamed from: a */
                public final r invoke(s sVar) {
                    kotlin.jvm.internal.p.j(sVar, "$this$DisposableEffect");
                    return new a(cachedItemContent);
                }
            }, gVar, 8);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

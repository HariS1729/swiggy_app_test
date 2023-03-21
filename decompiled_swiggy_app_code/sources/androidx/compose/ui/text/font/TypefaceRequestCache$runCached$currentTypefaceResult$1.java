package androidx.compose.ui.text.font;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.l0;
import u1.m0;

/* compiled from: FontFamilyResolver.kt */
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements l<m0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TypefaceRequestCache f7607a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l0 f7608b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, l0 l0Var) {
        super(1);
        this.f7607a = typefaceRequestCache;
        this.f7608b = l0Var;
    }

    public final void a(m0 m0Var) {
        p.j(m0Var, "finalResult");
        x1.l b11 = this.f7607a.b();
        TypefaceRequestCache typefaceRequestCache = this.f7607a;
        l0 l0Var = this.f7608b;
        synchronized (b11) {
            if (m0Var.a()) {
                typefaceRequestCache.f7606b.e(l0Var, m0Var);
            } else {
                typefaceRequestCache.f7606b.f(l0Var);
            }
            k kVar = k.f22762a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m0) obj);
        return k.f22762a;
    }
}

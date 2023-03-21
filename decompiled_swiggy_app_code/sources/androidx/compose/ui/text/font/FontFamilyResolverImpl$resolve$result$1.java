package androidx.compose.ui.text.font;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.l0;
import u1.m0;

/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements l<l<? super m0, ? extends k>, m0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FontFamilyResolverImpl f7596a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l0 f7597b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, l0 l0Var) {
        super(1);
        this.f7596a = fontFamilyResolverImpl;
        this.f7597b = l0Var;
    }

    /* renamed from: a */
    public final m0 invoke(l<? super m0, k> lVar) {
        p.j(lVar, "onAsyncCompletion");
        m0 a11 = this.f7596a.f7592d.a(this.f7597b, this.f7596a.f(), lVar, this.f7596a.f7594f);
        if (a11 != null || (a11 = this.f7596a.f7593e.a(this.f7597b, this.f7596a.f(), lVar, this.f7596a.f7594f)) != null) {
            return a11;
        }
        throw new IllegalStateException("Could not load font");
    }
}

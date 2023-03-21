package androidx.compose.ui.text.font;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.i;
import u1.l0;
import u1.v;

/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements l<l0, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FontFamilyResolverImpl f7595a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.f7595a = fontFamilyResolverImpl;
    }

    /* renamed from: a */
    public final Object invoke(l0 l0Var) {
        p.j(l0Var, "it");
        return this.f7595a.g(l0.b(l0Var, (i) null, (v) null, 0, 0, (Object) null, 30, (Object) null)).getValue();
    }
}

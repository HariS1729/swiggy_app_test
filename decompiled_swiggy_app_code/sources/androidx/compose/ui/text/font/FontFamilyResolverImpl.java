package androidx.compose.ui.text.font;

import e0.d1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.p;
import lp0.l;
import u1.a0;
import u1.c0;
import u1.i;
import u1.l0;
import u1.v;
import u1.z;

/* compiled from: FontFamilyResolver.kt */
public final class FontFamilyResolverImpl implements i.b {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f7589a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f7590b;

    /* renamed from: c  reason: collision with root package name */
    private final TypefaceRequestCache f7591c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final FontListFontFamilyTypefaceAdapter f7592d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final z f7593e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final l<l0, Object> f7594f;

    public FontFamilyResolverImpl(a0 a0Var, c0 c0Var, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, z zVar) {
        p.j(a0Var, "platformFontLoader");
        p.j(c0Var, "platformResolveInterceptor");
        p.j(typefaceRequestCache, "typefaceRequestCache");
        p.j(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        p.j(zVar, "platformFamilyTypefaceAdapter");
        this.f7589a = a0Var;
        this.f7590b = c0Var;
        this.f7591c = typefaceRequestCache;
        this.f7592d = fontListFontFamilyTypefaceAdapter;
        this.f7593e = zVar;
        this.f7594f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    /* access modifiers changed from: private */
    public final d1<Object> g(l0 l0Var) {
        return this.f7591c.c(l0Var, new FontFamilyResolverImpl$resolve$result$1(this, l0Var));
    }

    public d1<Object> a(i iVar, v vVar, int i11, int i12) {
        p.j(vVar, "fontWeight");
        return g(new l0(this.f7590b.d(iVar), this.f7590b.b(vVar), this.f7590b.a(i11), this.f7590b.c(i12), this.f7589a.a(), (kotlin.jvm.internal.i) null));
    }

    public final a0 f() {
        return this.f7589a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFamilyResolverImpl(a0 a0Var, c0 c0Var, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, z zVar, int i11, kotlin.jvm.internal.i iVar) {
        this(a0Var, (i11 & 2) != 0 ? c0.f16908a.a() : c0Var, (i11 & 4) != 0 ? u1.l.b() : typefaceRequestCache, (i11 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(u1.l.a(), (CoroutineContext) null, 2, (kotlin.jvm.internal.i) null) : fontListFontFamilyTypefaceAdapter, (i11 & 16) != 0 ? new z() : zVar);
    }
}

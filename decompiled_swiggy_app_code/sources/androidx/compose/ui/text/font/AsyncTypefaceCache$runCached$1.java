package androidx.compose.ui.text.font;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import u1.a0;
import u1.h;

@d(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {399}, m = "runCached")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7583a;

    /* renamed from: b  reason: collision with root package name */
    Object f7584b;

    /* renamed from: c  reason: collision with root package name */
    boolean f7585c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f7586d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AsyncTypefaceCache f7587e;

    /* renamed from: f  reason: collision with root package name */
    int f7588f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, c<? super AsyncTypefaceCache$runCached$1> cVar) {
        super(cVar);
        this.f7587e = asyncTypefaceCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7586d = obj;
        this.f7588f |= Integer.MIN_VALUE;
        return this.f7587e.g((h) null, (a0) null, false, (l<? super c<Object>, ? extends Object>) null, this);
    }
}

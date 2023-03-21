package androidx.compose.ui.text.font;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7558a;

    /* renamed from: b  reason: collision with root package name */
    Object f7559b;

    /* renamed from: c  reason: collision with root package name */
    Object f7560c;

    /* renamed from: d  reason: collision with root package name */
    int f7561d;

    /* renamed from: e  reason: collision with root package name */
    int f7562e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f7563f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f7564g;

    /* renamed from: h  reason: collision with root package name */
    int f7565h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, c<? super AsyncFontListLoader$load$1> cVar) {
        super(cVar);
        this.f7564g = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7563f = obj;
        this.f7565h |= Integer.MIN_VALUE;
        return this.f7564g.k(this);
    }
}

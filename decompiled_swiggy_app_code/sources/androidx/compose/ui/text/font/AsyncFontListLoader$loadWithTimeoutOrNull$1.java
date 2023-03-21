package androidx.compose.ui.text.font;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import u1.h;

@d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {304}, m = "loadWithTimeoutOrNull$ui_text_release")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7569a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f7570b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f7571c;

    /* renamed from: d  reason: collision with root package name */
    int f7572d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> cVar) {
        super(cVar);
        this.f7571c = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7570b = obj;
        this.f7572d |= Integer.MIN_VALUE;
        return this.f7571c.n((h) null, this);
    }
}

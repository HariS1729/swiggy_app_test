package androidx.compose.ui.text.font;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import u1.h;

@d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements l<c<? super Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7566a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f7567b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f7568c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, h hVar, c<? super AsyncFontListLoader$load$2$typeface$1> cVar) {
        super(1, cVar);
        this.f7567b = asyncFontListLoader;
        this.f7568c = hVar;
    }

    public final c<k> create(c<?> cVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.f7567b, this.f7568c, cVar);
    }

    public final Object invoke(c<Object> cVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7566a;
        if (i11 == 0) {
            g.b(obj);
            AsyncFontListLoader asyncFontListLoader = this.f7567b;
            h hVar = this.f7568c;
            this.f7566a = 1;
            obj = asyncFontListLoader.n(hVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}

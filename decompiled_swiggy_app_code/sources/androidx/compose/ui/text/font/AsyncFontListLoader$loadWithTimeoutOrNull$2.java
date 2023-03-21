package androidx.compose.ui.text.font;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import u1.a0;
import u1.h;
import wp0.j0;

@d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements p<j0, c<? super Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7573a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f7574b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f7575c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, h hVar, c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> cVar) {
        super(2, cVar);
        this.f7574b = asyncFontListLoader;
        this.f7575c = hVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.f7574b, this.f7575c, cVar);
    }

    public final Object invoke(j0 j0Var, c<Object> cVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7573a;
        if (i11 == 0) {
            g.b(obj);
            a0 d12 = this.f7574b.f7555e;
            h hVar = this.f7575c;
            this.f7573a = 1;
            obj = d12.b(hVar, this);
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

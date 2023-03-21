package androidx.compose.ui.text.font;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {151}, m = "invokeSuspend")
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7603a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AsyncFontListLoader f7604b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader asyncFontListLoader, c<? super FontListFontFamilyTypefaceAdapter$resolve$1> cVar) {
        super(2, cVar);
        this.f7604b = asyncFontListLoader;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$resolve$1(this.f7604b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$resolve$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7603a;
        if (i11 == 0) {
            g.b(obj);
            AsyncFontListLoader asyncFontListLoader = this.f7604b;
            this.f7603a = 1;
            if (asyncFontListLoader.k(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}

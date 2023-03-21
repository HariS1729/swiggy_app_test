package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import u1.h0;
import wp0.j0;

@d(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidFontLoader.android.kt */
final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements p<j0, c<? super Typeface>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0 f7549b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f7550c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFontLoader_androidKt$loadAsync$2(h0 h0Var, Context context, c<? super AndroidFontLoader_androidKt$loadAsync$2> cVar) {
        super(2, cVar);
        this.f7549b = h0Var;
        this.f7550c = context;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.f7549b, this.f7550c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super Typeface> cVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f7548a == 0) {
            g.b(obj);
            return AndroidFontLoader_androidKt.c(this.f7549b, this.f7550c);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

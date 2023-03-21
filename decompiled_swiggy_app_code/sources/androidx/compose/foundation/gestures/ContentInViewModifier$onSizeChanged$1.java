package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import t0.h;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "Scrollable.kt", l = {578}, m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ContentInViewModifier$onSizeChanged$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ContentInViewModifier f3204b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f3205c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f3206d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$onSizeChanged$1(ContentInViewModifier contentInViewModifier, h hVar, h hVar2, c<? super ContentInViewModifier$onSizeChanged$1> cVar) {
        super(2, cVar);
        this.f3204b = contentInViewModifier;
        this.f3205c = hVar;
        this.f3206d = hVar2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new ContentInViewModifier$onSizeChanged$1(this.f3204b, this.f3205c, this.f3206d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((ContentInViewModifier$onSizeChanged$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3203a;
        if (i11 == 0) {
            g.b(obj);
            ContentInViewModifier contentInViewModifier = this.f3204b;
            h hVar = this.f3205c;
            h hVar2 = this.f3206d;
            this.f3203a = 1;
            if (contentInViewModifier.i(hVar, hVar2, this) == d11) {
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

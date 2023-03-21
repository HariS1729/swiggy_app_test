package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.o0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f5308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e<v> f5309b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(v vVar, e<v> eVar) {
        super(0);
        this.f5308a = vVar;
        this.f5309b = eVar;
    }

    public final void invoke() {
        if (!p.e(this.f5308a, this.f5309b.a())) {
            List<d<v>> b11 = this.f5309b.b();
            final v vVar = this.f5308a;
            boolean unused = p.E(b11, new l<d<v>, Boolean>() {
                /* renamed from: a */
                public final Boolean invoke(d<v> dVar) {
                    p.j(dVar, "it");
                    return Boolean.valueOf(p.e(dVar.c(), vVar));
                }
            });
            o0 c11 = this.f5309b.c();
            if (c11 != null) {
                c11.invalidate();
            }
        }
    }
}

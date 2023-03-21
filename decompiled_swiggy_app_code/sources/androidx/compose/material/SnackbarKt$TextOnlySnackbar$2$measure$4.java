package androidx.compose.material;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snackbar.kt */
final class SnackbarKt$TextOnlySnackbar$2$measure$4 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5413a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f5414b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$TextOnlySnackbar$2$measure$4(int i11, e0 e0Var) {
        super(1);
        this.f5413a = i11;
        this.f5414b = e0Var;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a aVar2 = aVar;
        e0.a.n(aVar2, this.f5414b, 0, (this.f5413a - this.f5414b.e0()) / 2, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}

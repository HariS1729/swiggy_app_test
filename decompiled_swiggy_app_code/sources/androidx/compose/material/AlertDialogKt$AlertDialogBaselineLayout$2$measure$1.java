package androidx.compose.material;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f4808a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4809b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f4810c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4811d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(e0 e0Var, int i11, e0 e0Var2, int i12) {
        super(1);
        this.f4808a = e0Var;
        this.f4809b = i11;
        this.f4810c = e0Var2;
        this.f4811d = i12;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0 e0Var = this.f4808a;
        if (e0Var != null) {
            e0.a.j(aVar, e0Var, 0, this.f4809b, 0.0f, 4, (Object) null);
        }
        e0 e0Var2 = this.f4810c;
        if (e0Var2 != null) {
            e0.a.j(aVar, e0Var2, 0, this.f4811d, 0.0f, 4, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}

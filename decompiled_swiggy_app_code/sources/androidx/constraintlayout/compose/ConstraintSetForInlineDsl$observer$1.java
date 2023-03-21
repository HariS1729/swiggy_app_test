package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements l<a<? extends k>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ConstraintSetForInlineDsl f7968a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.f7968a = constraintSetForInlineDsl;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void b(a<k> aVar) {
        p.j(aVar, "it");
        if (p.e(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
            return;
        }
        Handler h11 = this.f7968a.f7960b;
        if (h11 == null) {
            h11 = new Handler(Looper.getMainLooper());
            this.f7968a.f7960b = h11;
        }
        h11.post(new d(aVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((a) obj);
        return k.f22762a;
    }
}

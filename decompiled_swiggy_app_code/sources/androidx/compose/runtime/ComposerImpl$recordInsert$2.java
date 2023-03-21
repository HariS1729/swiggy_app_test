package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.e;
import e0.q0;
import e0.v0;
import e0.x0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$recordInsert$2 extends Lambda implements q<e<?>, x0, q0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v0 f5960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5961b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<q<e<?>, x0, q0, k>> f5962c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$recordInsert$2(v0 v0Var, c cVar, List<q<e<?>, x0, q0, k>> list) {
        super(3);
        this.f5960a = v0Var;
        this.f5961b = cVar;
        this.f5962c = list;
    }

    /* JADX INFO: finally extract failed */
    public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
        p.j(eVar, "applier");
        p.j(x0Var, "slots");
        p.j(q0Var, "rememberManager");
        v0 v0Var = this.f5960a;
        List<q<e<?>, x0, q0, k>> list = this.f5962c;
        x0 p11 = v0Var.p();
        try {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(eVar, p11, q0Var);
            }
            k kVar = k.f22762a;
            p11.F();
            x0Var.D();
            v0 v0Var2 = this.f5960a;
            x0Var.o0(v0Var2, this.f5961b.d(v0Var2));
            x0Var.O();
        } catch (Throwable th2) {
            p11.F();
            throw th2;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((e) obj, (x0) obj2, (q0) obj3);
        return k.f22762a;
    }
}

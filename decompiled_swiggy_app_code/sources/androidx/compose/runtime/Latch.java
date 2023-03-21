package androidx.compose.runtime;

import bp0.k;
import fp0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.f;
import wp0.o;

/* compiled from: Latch.kt */
public final class Latch {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f6008a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<c<k>> f6009b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<c<k>> f6010c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f6011d = true;

    public final Object c(c<? super k> cVar) {
        if (e()) {
            return k.f22762a;
        }
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        synchronized (this.f6008a) {
            this.f6009b.add(oVar);
        }
        oVar.N(new Latch$await$2$2(this, oVar));
        Object t = oVar.t();
        if (t == b.d()) {
            f.c(cVar);
        }
        return t == b.d() ? t : k.f22762a;
    }

    public final void d() {
        synchronized (this.f6008a) {
            this.f6011d = false;
            k kVar = k.f22762a;
        }
    }

    public final boolean e() {
        boolean z11;
        synchronized (this.f6008a) {
            z11 = this.f6011d;
        }
        return z11;
    }

    public final void f() {
        synchronized (this.f6008a) {
            if (!e()) {
                List<c<k>> list = this.f6009b;
                this.f6009b = this.f6010c;
                this.f6010c = list;
                this.f6011d = true;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Result.a aVar = Result.f25582b;
                    list.get(i11).resumeWith(Result.b(k.f22762a));
                }
                list.clear();
                k kVar = k.f22762a;
            }
        }
    }
}

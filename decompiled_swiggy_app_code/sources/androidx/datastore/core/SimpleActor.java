package androidx.datastore.core;

import bp0.k;
import fp0.c;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import lp0.l;
import lp0.p;
import wp0.j0;
import wp0.k1;
import yp0.f;
import yp0.i;
import yp0.j;

/* compiled from: SimpleActor.kt */
public final class SimpleActor<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final j0 f9764a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<T, c<? super k>, Object> f9765b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final f<T> f9766c = i.b(Integer.MAX_VALUE, (BufferOverflow) null, (l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f9767d = new AtomicInteger(0);

    public SimpleActor(j0 j0Var, final l<? super Throwable, k> lVar, final p<? super T, ? super Throwable, k> pVar, p<? super T, ? super c<? super k>, ? extends Object> pVar2) {
        kotlin.jvm.internal.p.j(j0Var, "scope");
        kotlin.jvm.internal.p.j(lVar, "onComplete");
        kotlin.jvm.internal.p.j(pVar, "onUndeliveredElement");
        kotlin.jvm.internal.p.j(pVar2, "consumeMessage");
        this.f9764a = j0Var;
        this.f9765b = pVar2;
        k1 k1Var = (k1) j0Var.X0().get(k1.f29476l0);
        if (k1Var != null) {
            k1Var.C(new l<Throwable, k>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return k.f22762a;
                }

                public final void invoke(Throwable th2) {
                    k kVar;
                    lVar.invoke(th2);
                    this.f9766c.n(th2);
                    do {
                        Object f11 = j.f(this.f9766c.h());
                        if (f11 == null) {
                            kVar = null;
                            continue;
                        } else {
                            pVar.invoke(f11, th2);
                            kVar = k.f22762a;
                            continue;
                        }
                    } while (kVar != null);
                }
            });
        }
    }

    public final void e(T t) {
        Object e11 = this.f9766c.e(t);
        if (e11 instanceof j.a) {
            Throwable e12 = j.e(e11);
            if (e12 == null) {
                e12 = new ClosedSendChannelException("Channel was closed normally");
            }
            throw e12;
        } else if (!j.j(e11)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f9767d.getAndIncrement() == 0) {
            k1 unused = j.d(this.f9764a, (CoroutineContext) null, (CoroutineStart) null, new SimpleActor$offer$2(this, (c<? super SimpleActor$offer$2>) null), 3, (Object) null);
        }
    }
}

package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.OverlaysEventWorker", f = "OverlaysEventWorker.kt", l = {68}, m = "doWork")
/* compiled from: OverlaysEventWorker.kt */
final class OverlaysEventWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f18649a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OverlaysEventWorker f18650b;

    /* renamed from: c  reason: collision with root package name */
    int f18651c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OverlaysEventWorker$doWork$1(OverlaysEventWorker overlaysEventWorker, c<? super OverlaysEventWorker$doWork$1> cVar) {
        super(cVar);
        this.f18650b = overlaysEventWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18649a = obj;
        this.f18651c |= Integer.MIN_VALUE;
        return this.f18650b.w(this);
    }
}

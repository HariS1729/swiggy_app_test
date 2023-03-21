package androidx.compose.runtime;

import bp0.g;
import bp0.k;
import e0.h0;
import e0.l0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {153}, m = "invokeSuspend")
/* compiled from: ProduceState.kt */
final class SnapshotStateKt__ProduceStateKt$produceState$3 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6095a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f6096b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<l0<T>, c<? super k>, Object> f6097c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h0<T> f6098d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__ProduceStateKt$produceState$3(p<? super l0<T>, ? super c<? super k>, ? extends Object> pVar, h0<T> h0Var, c<? super SnapshotStateKt__ProduceStateKt$produceState$3> cVar) {
        super(2, cVar);
        this.f6097c = pVar;
        this.f6098d = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SnapshotStateKt__ProduceStateKt$produceState$3 snapshotStateKt__ProduceStateKt$produceState$3 = new SnapshotStateKt__ProduceStateKt$produceState$3(this.f6097c, this.f6098d, cVar);
        snapshotStateKt__ProduceStateKt$produceState$3.f6096b = obj;
        return snapshotStateKt__ProduceStateKt$produceState$3;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$3) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f6095a;
        if (i11 == 0) {
            g.b(obj);
            p<l0<T>, c<? super k>, Object> pVar = this.f6097c;
            e eVar = new e(this.f6098d, ((j0) this.f6096b).X0());
            this.f6095a = 1;
            if (pVar.invoke(eVar, this) == d11) {
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

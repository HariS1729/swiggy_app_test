package androidx.compose.runtime;

import bp0.g;
import bp0.k;
import e0.l0;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import wp0.h;
import wp0.j0;

@d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements p<l0<R>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6099a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f6100b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CoroutineContext f6101c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.d<T> f6102d;

    @d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2  reason: invalid class name */
    /* compiled from: SnapshotFlow.kt */
    static final class AnonymousClass2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f6103a;

        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        /* compiled from: SnapshotFlow.kt */
        static final class a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l0<R> f6106a;

            a(l0<R> l0Var) {
                this.f6106a = l0Var;
            }

            public final Object emit(T t, c<? super k> cVar) {
                this.f6106a.setValue(t);
                return k.f22762a;
            }
        }

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(dVar2, l0Var, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f6103a;
            if (i11 == 0) {
                g.b(obj);
                kotlinx.coroutines.flow.d<T> dVar = dVar2;
                a aVar = new a(l0Var);
                this.f6103a = 1;
                if (dVar.collect(aVar, this) == d11) {
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

    /* compiled from: SnapshotFlow.kt */
    static final class a implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l0<R> f6107a;

        a(l0<R> l0Var) {
            this.f6107a = l0Var;
        }

        public final Object emit(T t, c<? super k> cVar) {
            this.f6107a.setValue(t);
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, kotlinx.coroutines.flow.d<? extends T> dVar, c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> cVar) {
        super(2, cVar);
        this.f6101c = coroutineContext;
        this.f6102d = dVar;
    }

    /* renamed from: a */
    public final Object invoke(l0<R> l0Var, c<? super k> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(l0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.f6101c, this.f6102d, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.f6100b = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f6099a;
        if (i11 == 0) {
            g.b(obj);
            final l0 l0Var = (l0) this.f6100b;
            if (kotlin.jvm.internal.p.e(this.f6101c, EmptyCoroutineContext.f25631a)) {
                kotlinx.coroutines.flow.d<T> dVar = this.f6102d;
                a aVar = new a(l0Var);
                this.f6099a = 1;
                if (dVar.collect(aVar, this) == d11) {
                    return d11;
                }
            } else {
                CoroutineContext coroutineContext = this.f6101c;
                final kotlinx.coroutines.flow.d<T> dVar2 = this.f6102d;
                AnonymousClass2 r32 = new AnonymousClass2((c<? super AnonymousClass2>) null);
                this.f6099a = 2;
                if (h.g(coroutineContext, r32, this) == d11) {
                    return d11;
                }
            }
        } else if (i11 == 1 || i11 == 2) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}

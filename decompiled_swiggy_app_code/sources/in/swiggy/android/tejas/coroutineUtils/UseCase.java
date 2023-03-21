package in.swiggy.android.tejas.coroutineUtils;

import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.Response;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: UseCase.kt */
public abstract class UseCase<P, R> implements IFlowUseCase<P, R> {
    private final CoroutineDispatcher coroutineDispatcher;

    public UseCase() {
        this((CoroutineDispatcher) null, 1, (i) null);
    }

    public UseCase(CoroutineDispatcher coroutineDispatcher2) {
        p.j(coroutineDispatcher2, "coroutineDispatcher");
        this.coroutineDispatcher = coroutineDispatcher2;
    }

    public d<R> asFlow(P p11) {
        return f.f(f.x(new UseCase$asFlow$$inlined$suspendFlow$1((c) null, this, p11)), new UseCase$asFlow$$inlined$suspendFlow$2((c) null));
    }

    public d<Response<R>> asResponseFlow(P p11) {
        return f.f(f.x(new UseCase$asResponseFlow$$inlined$suspendFlow$1((c) null, this, p11)), new UseCase$asResponseFlow$$inlined$suspendFlow$2((c) null));
    }

    /* access modifiers changed from: protected */
    public abstract Object execute(P p11, c<? super R> cVar);

    public CoroutineDispatcher getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(P r9, fp0.c<? super in.swiggy.android.tejas.Response<? extends R>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$1 r0 = (in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$1 r0 = new in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            bp0.g.b(r10)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0049
        L_0x0029:
            r9 = move-exception
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            bp0.g.b(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = r8.getCoroutineDispatcher()     // Catch:{ Exception -> 0x0029 }
            in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$2 r2 = new in.swiggy.android.tejas.coroutineUtils.UseCase$invoke$2     // Catch:{ Exception -> 0x0029 }
            r4 = 0
            r2.<init>(r8, r9, r4)     // Catch:{ Exception -> 0x0029 }
            r0.label = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r10 = wp0.h.g(r10, r2, r0)     // Catch:{ Exception -> 0x0029 }
            if (r10 != r1) goto L_0x0049
            return r1
        L_0x0049:
            in.swiggy.android.tejas.Response r10 = (in.swiggy.android.tejas.Response) r10     // Catch:{ Exception -> 0x0029 }
            goto L_0x0062
        L_0x004c:
            in.swiggy.android.tejas.Response$Failure r10 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.error.Error$UnhandledExceptionError r1 = new in.swiggy.android.tejas.error.Error$UnhandledExceptionError
            java.lang.String r0 = r9.getMessage()
            r1.<init>(r9, r0)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0062:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.coroutineUtils.UseCase.invoke(java.lang.Object, fp0.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UseCase(CoroutineDispatcher coroutineDispatcher2, int i11, i iVar) {
        this((i11 & 1) != 0 ? DispatchProviderKt.a().D() : coroutineDispatcher2);
    }
}

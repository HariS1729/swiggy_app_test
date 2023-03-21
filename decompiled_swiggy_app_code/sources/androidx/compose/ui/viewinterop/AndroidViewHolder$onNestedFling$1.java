package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import bp0.g;
import bp0.k;
import d2.u;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {470, 475}, m = "invokeSuspend")
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$onNestedFling$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7723a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f7724b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7725c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f7726d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedFling$1(boolean z11, AndroidViewHolder androidViewHolder, long j, c<? super AndroidViewHolder$onNestedFling$1> cVar) {
        super(2, cVar);
        this.f7724b = z11;
        this.f7725c = androidViewHolder;
        this.f7726d = j;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AndroidViewHolder$onNestedFling$1(this.f7724b, this.f7725c, this.f7726d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7723a;
        if (i11 == 0) {
            g.b(obj);
            if (!this.f7724b) {
                NestedScrollDispatcher a11 = this.f7725c.f7691a;
                long a12 = u.f14031b.a();
                long j = this.f7726d;
                this.f7723a = 1;
                if (a11.a(a12, j, this) == d11) {
                    return d11;
                }
            } else {
                NestedScrollDispatcher a13 = this.f7725c.f7691a;
                long j11 = this.f7726d;
                long a14 = u.f14031b.a();
                this.f7723a = 2;
                if (a13.a(j11, a14, this) == d11) {
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

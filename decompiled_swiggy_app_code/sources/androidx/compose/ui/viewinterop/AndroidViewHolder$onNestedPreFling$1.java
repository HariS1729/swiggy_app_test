package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {488}, m = "invokeSuspend")
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7727a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7728b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f7729c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, c<? super AndroidViewHolder$onNestedPreFling$1> cVar) {
        super(2, cVar);
        this.f7728b = androidViewHolder;
        this.f7729c = j;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.f7728b, this.f7729c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7727a;
        if (i11 == 0) {
            g.b(obj);
            NestedScrollDispatcher a11 = this.f7728b.f7691a;
            long j = this.f7729c;
            this.f7727a = 1;
            if (a11.c(j, this) == d11) {
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

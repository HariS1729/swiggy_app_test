package androidx.compose.foundation.gestures;

import e0.d1;
import e1.a;
import e1.b;
import fp0.c;
import t0.f;

/* compiled from: Scrollable.kt */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f3509a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d1<ScrollingLogic> f3510b;

    ScrollableKt$scrollableNestedScrollConnection$1(boolean z11, d1<ScrollingLogic> d1Var) {
        this.f3509a = z11;
        this.f3510b = d1Var;
    }

    public long a(long j, long j11, int i11) {
        if (this.f3509a) {
            return this.f3510b.getValue().f(j11);
        }
        return f.f16662b.c();
    }

    public /* synthetic */ Object c(long j, c cVar) {
        return a.c(this, j, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(long r3, long r5, fp0.c<? super d2.u> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            if (r3 == 0) goto L_0x0013
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) r3
            int r4 = r3.f3514d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L_0x0013
            int r4 = r4 - r0
            r3.f3514d = r4
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1
            r3.<init>(r2, r7)
        L_0x0018:
            java.lang.Object r4 = r3.f3512b
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.d()
            int r0 = r3.f3514d
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            long r5 = r3.f3511a
            bp0.g.b(r4)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0033:
            bp0.g.b(r4)
            boolean r4 = r2.f3509a
            if (r4 == 0) goto L_0x0058
            e0.d1<androidx.compose.foundation.gestures.ScrollingLogic> r4 = r2.f3510b
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
            r3.f3511a = r5
            r3.f3514d = r1
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L_0x004d
            return r7
        L_0x004d:
            d2.u r4 = (d2.u) r4
            long r3 = r4.n()
            long r3 = d2.u.k(r5, r3)
            goto L_0x005e
        L_0x0058:
            d2.u$a r3 = d2.u.f14031b
            long r3 = r3.a()
        L_0x005e:
            d2.u r3 = d2.u.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1.d(long, long, fp0.c):java.lang.Object");
    }

    public /* synthetic */ long e(long j, int i11) {
        return a.d(this, j, i11);
    }
}

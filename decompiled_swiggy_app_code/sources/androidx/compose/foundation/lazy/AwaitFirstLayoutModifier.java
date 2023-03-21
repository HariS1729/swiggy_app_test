package androidx.compose.foundation.lazy;

import bp0.k;
import fp0.c;
import i1.m;
import i1.z;
import kotlin.Result;
import lp0.l;
import lp0.p;
import p0.d;
import p0.e;

/* compiled from: LazyListState.kt */
public final class AwaitFirstLayoutModifier implements z {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3909a;

    /* renamed from: b  reason: collision with root package name */
    private c<? super k> f3910b;

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, p pVar) {
        return e.c(this, obj, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(fp0.c<? super bp0.k> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.f3915e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3915e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f3913c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3915e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f3912b
            fp0.c r1 = (fp0.c) r1
            java.lang.Object r0 = r0.f3911a
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier) r0
            bp0.g.b(r5)
            goto L_0x0064
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            bp0.g.b(r5)
            boolean r5 = r4.f3909a
            if (r5 != 0) goto L_0x0071
            fp0.c<? super bp0.k> r5 = r4.f3910b
            r0.f3911a = r4
            r0.f3912b = r5
            r0.f3915e = r3
            fp0.f r2 = new fp0.f
            fp0.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)
            r2.<init>(r3)
            r4.f3910b = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.d()
            if (r2 != r3) goto L_0x0060
            kotlin.coroutines.jvm.internal.f.c(r0)
        L_0x0060:
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r1 = r5
        L_0x0064:
            if (r1 == 0) goto L_0x0071
            kotlin.Result$a r5 = kotlin.Result.f25582b
            bp0.k r5 = bp0.k.f22762a
            java.lang.Object r5 = kotlin.Result.b(r5)
            r1.resumeWith(r5)
        L_0x0071:
            bp0.k r5 = bp0.k.f22762a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.a(fp0.c):java.lang.Object");
    }

    public void e0(m mVar) {
        kotlin.jvm.internal.p.j(mVar, "coordinates");
        if (!this.f3909a) {
            this.f3909a = true;
            c<? super k> cVar = this.f3910b;
            if (cVar != null) {
                Result.a aVar = Result.f25582b;
                cVar.resumeWith(Result.b(k.f22762a));
            }
            this.f3910b = null;
        }
    }

    public /* synthetic */ Object s(Object obj, p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}

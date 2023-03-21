package coil.intercept;

import a7.a;
import coil.intercept.EngineInterceptor;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import x6.g;
import x6.k;

@d(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
/* compiled from: EngineInterceptor.kt */
final class EngineInterceptor$transform$3 extends SuspendLambda implements p<j0, c<? super EngineInterceptor.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f13623a;

    /* renamed from: b  reason: collision with root package name */
    Object f13624b;

    /* renamed from: c  reason: collision with root package name */
    int f13625c;

    /* renamed from: d  reason: collision with root package name */
    int f13626d;

    /* renamed from: e  reason: collision with root package name */
    int f13627e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f13628f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ EngineInterceptor f13629g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ EngineInterceptor.b f13630h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k f13631i;
    final /* synthetic */ List<a> j;
    final /* synthetic */ m6.c k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ g f13632l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EngineInterceptor$transform$3(EngineInterceptor engineInterceptor, EngineInterceptor.b bVar, k kVar, List<? extends a> list, m6.c cVar, g gVar, c<? super EngineInterceptor$transform$3> cVar2) {
        super(2, cVar2);
        this.f13629g = engineInterceptor;
        this.f13630h = bVar;
        this.f13631i = kVar;
        this.j = list;
        this.k = cVar;
        this.f13632l = gVar;
    }

    public final c<bp0.k> create(Object obj, c<?> cVar) {
        EngineInterceptor$transform$3 engineInterceptor$transform$3 = new EngineInterceptor$transform$3(this.f13629g, this.f13630h, this.f13631i, this.j, this.k, this.f13632l, cVar);
        engineInterceptor$transform$3.f13628f = obj;
        return engineInterceptor$transform$3;
    }

    public final Object invoke(j0 j0Var, c<? super EngineInterceptor.b> cVar) {
        return ((EngineInterceptor$transform$3) create(j0Var, cVar)).invokeSuspend(bp0.k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13627e
            r3 = 1
            if (r2 == 0) goto L_0x002e
            if (r2 != r3) goto L_0x0026
            int r2 = r0.f13626d
            int r4 = r0.f13625c
            java.lang.Object r5 = r0.f13624b
            x6.k r5 = (x6.k) r5
            java.lang.Object r6 = r0.f13623a
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.f13628f
            wp0.j0 r7 = (wp0.j0) r7
            bp0.g.b(r20)
            r9 = r0
            r8 = r7
            r7 = r4
            r4 = r20
            goto L_0x0082
        L_0x0026:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002e:
            bp0.g.b(r20)
            java.lang.Object r2 = r0.f13628f
            wp0.j0 r2 = (wp0.j0) r2
            coil.intercept.EngineInterceptor r4 = r0.f13629g
            coil.intercept.EngineInterceptor$b r5 = r0.f13630h
            android.graphics.drawable.Drawable r5 = r5.e()
            x6.k r6 = r0.f13631i
            java.util.List<a7.a> r7 = r0.j
            android.graphics.Bitmap r4 = r4.g(r5, r6, r7)
            m6.c r5 = r0.k
            x6.g r6 = r0.f13632l
            r5.e(r6, r4)
            java.util.List<a7.a> r5 = r0.j
            x6.k r6 = r0.f13631i
            r7 = 0
            int r8 = r5.size()
            r9 = r0
            r17 = r8
            r8 = r2
            r2 = r17
            r18 = r6
            r6 = r5
            r5 = r18
        L_0x0060:
            if (r7 >= r2) goto L_0x0088
            int r10 = r7 + 1
            java.lang.Object r7 = r6.get(r7)
            a7.a r7 = (a7.a) r7
            y6.g r11 = r5.n()
            r9.f13628f = r8
            r9.f13623a = r6
            r9.f13624b = r5
            r9.f13625c = r10
            r9.f13626d = r2
            r9.f13627e = r3
            java.lang.Object r4 = r7.b(r4, r11, r9)
            if (r4 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r7 = r10
        L_0x0082:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            wp0.k0.f(r8)
            goto L_0x0060
        L_0x0088:
            m6.c r1 = r9.k
            x6.g r2 = r9.f13632l
            r1.n(r2, r4)
            coil.intercept.EngineInterceptor$b r10 = r9.f13630h
            x6.g r1 = r9.f13632l
            android.content.Context r1 = r1.l()
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
            r11.<init>(r1, r4)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            coil.intercept.EngineInterceptor$b r1 = coil.intercept.EngineInterceptor.b.b(r10, r11, r12, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.EngineInterceptor$transform$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package androidx.compose.foundation;

import android.view.View;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import d2.e;
import d2.k;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.u;
import fp0.c;
import i1.n;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.m;
import lp0.a;
import lp0.l;
import lp0.q;
import p0.d;
import s.j;
import s.o;
import t0.f;
import wp0.j0;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<e, f> f3068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<e, f> f3069b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3070c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<k, bp0.k> f3071d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o f3072e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ j f3073f;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1  reason: invalid class name */
    /* compiled from: Magnifier.kt */
    static final class AnonymousClass1 extends SuspendLambda implements lp0.p<j0, c<? super bp0.k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3074a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3075b;

        public final c<bp0.k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r12 = new AnonymousClass1(oVar, jVar3, view, eVar, f13, hVar2, m14, d1Var4, d1Var5, d1Var6, h0Var3, d1Var7, cVar);
            r12.f3075b = obj;
            return r12;
        }

        public final Object invoke(j0 j0Var, c<? super bp0.k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(bp0.k.f22762a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: s.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r1.f3074a
                r3 = 1
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r0 = r1.f3075b
                r2 = r0
                s.n r2 = (s.n) r2
                bp0.g.b(r20)     // Catch:{ all -> 0x0017 }
                goto L_0x0095
            L_0x0017:
                r0 = move-exception
                goto L_0x009d
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0022:
                bp0.g.b(r20)
                java.lang.Object r2 = r1.f3075b
                wp0.j0 r2 = (wp0.j0) r2
                s.o r4 = r5
                s.j r5 = r6
                android.view.View r6 = r7
                d2.e r7 = r8
                float r8 = r9
                s.n r4 = r4.a(r5, r6, r7, r8)
                kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
                r5.<init>()
                long r6 = r4.a()
                d2.e r8 = r8
                e0.d1<lp0.l<d2.k, bp0.k>> r9 = r11
                lp0.l r9 = androidx.compose.foundation.MagnifierKt$magnifier$4.q(r9)
                if (r9 == 0) goto L_0x0059
                long r10 = d2.q.b(r6)
                long r10 = r8.o(r10)
                d2.k r8 = d2.k.c(r10)
                r9.invoke(r8)
            L_0x0059:
                r5.f25665a = r6
                kotlinx.coroutines.flow.h<bp0.k> r6 = r10
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$1 r7 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$1
                r8 = 0
                r7.<init>(r4, r8)
                kotlinx.coroutines.flow.d r6 = kotlinx.coroutines.flow.f.E(r6, r7)
                kotlinx.coroutines.flow.f.B(r6, r2)
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$2 r2 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$2     // Catch:{ all -> 0x009b }
                d2.e r11 = r8     // Catch:{ all -> 0x009b }
                e0.d1<java.lang.Boolean> r12 = r12     // Catch:{ all -> 0x009b }
                e0.d1<t0.f> r13 = r13     // Catch:{ all -> 0x009b }
                e0.d1<lp0.l<d2.e, t0.f>> r14 = r14     // Catch:{ all -> 0x009b }
                e0.h0<t0.f> r15 = r15     // Catch:{ all -> 0x009b }
                e0.d1<java.lang.Float> r6 = r16     // Catch:{ all -> 0x009b }
                e0.d1<lp0.l<d2.k, bp0.k>> r7 = r11     // Catch:{ all -> 0x009b }
                r9 = r2
                r10 = r4
                r16 = r6
                r17 = r5
                r18 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x009b }
                kotlinx.coroutines.flow.d r2 = androidx.compose.runtime.g.n(r2)     // Catch:{ all -> 0x009b }
                r1.f3075b = r4     // Catch:{ all -> 0x009b }
                r1.f3074a = r3     // Catch:{ all -> 0x009b }
                java.lang.Object r2 = kotlinx.coroutines.flow.f.i(r2, r1)     // Catch:{ all -> 0x009b }
                if (r2 != r0) goto L_0x0094
                return r0
            L_0x0094:
                r2 = r4
            L_0x0095:
                r2.dismiss()
                bp0.k r0 = bp0.k.f22762a
                return r0
            L_0x009b:
                r0 = move-exception
                r2 = r4
            L_0x009d:
                r2.dismiss()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierKt$magnifier$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4(l<? super e, f> lVar, l<? super e, f> lVar2, float f11, l<? super k, bp0.k> lVar3, o oVar, j jVar) {
        super(3);
        this.f3068a = lVar;
        this.f3069b = lVar2;
        this.f3070c = f11;
        this.f3071d = lVar3;
        this.f3072e = oVar;
        this.f3073f = jVar;
    }

    /* access modifiers changed from: private */
    public static final long k(h0<f> h0Var) {
        return h0Var.getValue().u();
    }

    /* access modifiers changed from: private */
    public static final boolean l(d1<Boolean> d1Var) {
        return d1Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void m(h0<f> h0Var, long j) {
        h0Var.setValue(f.d(j));
    }

    /* access modifiers changed from: private */
    public static final l<e, f> n(d1<? extends l<? super e, f>> d1Var) {
        return (l) d1Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final l<e, f> o(d1<? extends l<? super e, f>> d1Var) {
        return (l) d1Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final float p(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final l<k, bp0.k> q(d1<? extends l<? super k, bp0.k>> d1Var) {
        return (l) d1Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final long r(d1<f> d1Var) {
        return d1Var.getValue().u();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return j((d) obj, (g) obj2, ((Number) obj3).intValue());
    }

    public final d j(d dVar, g gVar, int i11) {
        g gVar2 = gVar;
        p.j(dVar, "$this$composed");
        gVar2.E(-454877003);
        final View view = (View) gVar2.z(AndroidCompositionLocals_androidKt.k());
        final e eVar = (e) gVar2.z(CompositionLocalsKt.e());
        gVar2.E(-492369756);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            F = j.e(f.d(f.f16662b.b()), (a1) null, 2, (Object) null);
            gVar2.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        d1<T> m11 = androidx.compose.runtime.g.m(this.f3068a, gVar2, 0);
        d1<T> m12 = androidx.compose.runtime.g.m(this.f3069b, gVar2, 0);
        d1 m13 = androidx.compose.runtime.g.m(Float.valueOf(this.f3070c), gVar2, 0);
        final d1<T> m14 = androidx.compose.runtime.g.m(this.f3071d, gVar2, 0);
        gVar2.E(-492369756);
        Object F2 = gVar.F();
        if (F2 == aVar.a()) {
            F2 = androidx.compose.runtime.g.c(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(eVar, m11, h0Var));
            gVar2.y(F2);
        }
        gVar.P();
        d1 d1Var = (d1) F2;
        gVar2.E(-492369756);
        Object F3 = gVar.F();
        if (F3 == aVar.a()) {
            F3 = androidx.compose.runtime.g.c(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(d1Var));
            gVar2.y(F3);
        }
        gVar.P();
        d1 d1Var2 = (d1) F3;
        gVar2.E(-492369756);
        Object F4 = gVar.F();
        if (F4 == aVar.a()) {
            F4 = m.b(1, 0, BufferOverflow.DROP_OLDEST, 2, (Object) null);
            gVar2.y(F4);
        }
        gVar.P();
        final h hVar = (h) F4;
        float f11 = this.f3072e.b() ? 0.0f : this.f3070c;
        j jVar = this.f3073f;
        Object[] objArr = {view, eVar, Float.valueOf(f11), jVar, Boolean.valueOf(p.e(jVar, j.f16539g.b()))};
        final o oVar = this.f3072e;
        j jVar2 = this.f3073f;
        float f12 = this.f3070c;
        Object[] objArr2 = objArr;
        final j jVar3 = jVar2;
        AnonymousClass1 r12 = r42;
        final float f13 = f12;
        final h hVar2 = hVar;
        d1 d1Var3 = d1Var;
        final d1 d1Var4 = d1Var2;
        final d1 d1Var5 = d1Var3;
        h0 h0Var2 = h0Var;
        final d1<T> d1Var6 = m12;
        final h0 h0Var3 = h0Var2;
        final d1 d1Var7 = m13;
        AnonymousClass1 r42 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        u.f(objArr2, r12, gVar2, 8);
        final h0 h0Var4 = h0Var2;
        final d1 d1Var8 = d1Var3;
        d c11 = SemanticsModifierKt.c(DrawModifierKt.a(OnGloballyPositionedModifierKt.a(dVar, new l<i1.m, bp0.k>() {
            public final void a(i1.m mVar) {
                p.j(mVar, "it");
                MagnifierKt$magnifier$4.m(h0Var4, n.e(mVar));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((i1.m) obj);
                return bp0.k.f22762a;
            }
        }), new l<w0.f, bp0.k>() {
            public final void a(w0.f fVar) {
                p.j(fVar, "$this$drawBehind");
                hVar.e(bp0.k.f22762a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((w0.f) obj);
                return bp0.k.f22762a;
            }
        }), false, new l<n1.q, bp0.k>() {
            public final void a(n1.q qVar) {
                p.j(qVar, "$this$semantics");
                SemanticsPropertyKey<a<f>> a11 = MagnifierKt.a();
                final d1<f> d1Var = d1Var8;
                qVar.a(a11, new a<f>() {
                    public final long a() {
                        return MagnifierKt$magnifier$4.r(d1Var);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        return f.d(a());
                    }
                });
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((n1.q) obj);
                return bp0.k.f22762a;
            }
        }, 1, (Object) null);
        gVar.P();
        return c11;
    }
}

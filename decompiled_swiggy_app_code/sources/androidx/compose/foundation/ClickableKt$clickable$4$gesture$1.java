package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import bp0.g;
import bp0.k;
import defpackage.y1;
import e0.d1;
import e0.h0;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.l;
import lp0.p;
import lp0.q;
import t0.f;
import u.n;

@d(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", f = "Clickable.kt", l = {142}, m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4$gesture$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2915a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f2916b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f2917c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ u.k f2918d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h0<n> f2919e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d1<a<Boolean>> f2920f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d1<a<k>> f2921g;

    @d(c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", f = "Clickable.kt", l = {145}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1  reason: invalid class name */
    /* compiled from: Clickable.kt */
    static final class AnonymousClass1 extends SuspendLambda implements q<y1.n, f, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f2922a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f2923b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ long f2924c;

        public final Object a(y1.n nVar, long j, c<? super k> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(z11, kVar, h0Var, d1Var, cVar);
            r02.f2923b = nVar;
            r02.f2924c = j;
            return r02.invokeSuspend(k.f22762a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((y1.n) obj, ((f) obj2).u(), (c) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f2922a;
            if (i11 == 0) {
                g.b(obj);
                y1.n nVar = (y1.n) this.f2923b;
                long j = this.f2924c;
                if (z11) {
                    u.k kVar = kVar;
                    h0<n> h0Var = h0Var;
                    d1<a<Boolean>> d1Var = d1Var;
                    this.f2922a = 1;
                    if (ClickableKt.i(nVar, j, kVar, h0Var, d1Var, this) == d11) {
                        return d11;
                    }
                }
            } else if (i11 == 1) {
                g.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$4$gesture$1(boolean z11, u.k kVar, h0<n> h0Var, d1<? extends a<Boolean>> d1Var, d1<? extends a<k>> d1Var2, c<? super ClickableKt$clickable$4$gesture$1> cVar) {
        super(2, cVar);
        this.f2917c = z11;
        this.f2918d = kVar;
        this.f2919e = h0Var;
        this.f2920f = d1Var;
        this.f2921g = d1Var2;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((ClickableKt$clickable$4$gesture$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ClickableKt$clickable$4$gesture$1 clickableKt$clickable$4$gesture$1 = new ClickableKt$clickable$4$gesture$1(this.f2917c, this.f2918d, this.f2919e, this.f2920f, this.f2921g, cVar);
        clickableKt$clickable$4$gesture$1.f2916b = obj;
        return clickableKt$clickable$4$gesture$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f2915a;
        if (i11 == 0) {
            g.b(obj);
            final boolean z11 = this.f2917c;
            final u.k kVar = this.f2918d;
            final h0<n> h0Var = this.f2919e;
            final d1<a<Boolean>> d1Var = this.f2920f;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final boolean z12 = this.f2917c;
            final d1<a<k>> d1Var2 = this.f2921g;
            AnonymousClass2 r33 = new l<f, k>() {
                public final void a(long j) {
                    if (z12) {
                        d1Var2.getValue().invoke();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((f) obj).u());
                    return k.f22762a;
                }
            };
            this.f2915a = 1;
            if (TapGestureDetectorKt.i((d0) this.f2916b, r32, r33, this) == d11) {
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

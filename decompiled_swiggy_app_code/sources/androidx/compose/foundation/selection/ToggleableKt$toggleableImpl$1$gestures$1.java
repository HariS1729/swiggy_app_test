package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
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

@d(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1", f = "Toggleable.kt", l = {270}, m = "invokeSuspend")
/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleableImpl$1$gestures$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4195a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4196b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4197c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ u.k f4198d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ h0<n> f4199e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d1<a<Boolean>> f4200f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ d1<a<k>> f4201g;

    @d(c = "androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1", f = "Toggleable.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$gestures$1$1  reason: invalid class name */
    /* compiled from: Toggleable.kt */
    static final class AnonymousClass1 extends SuspendLambda implements q<y1.n, f, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4202a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4203b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ long f4204c;

        public final Object a(y1.n nVar, long j, c<? super k> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(z11, kVar, h0Var, d1Var, cVar);
            r02.f4203b = nVar;
            r02.f4204c = j;
            return r02.invokeSuspend(k.f22762a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((y1.n) obj, ((f) obj2).u(), (c) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4202a;
            if (i11 == 0) {
                g.b(obj);
                y1.n nVar = (y1.n) this.f4203b;
                long j = this.f4204c;
                if (z11) {
                    u.k kVar = kVar;
                    h0<n> h0Var = h0Var;
                    d1<a<Boolean>> d1Var = d1Var;
                    this.f4202a = 1;
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
    ToggleableKt$toggleableImpl$1$gestures$1(boolean z11, u.k kVar, h0<n> h0Var, d1<? extends a<Boolean>> d1Var, d1<? extends a<k>> d1Var2, c<? super ToggleableKt$toggleableImpl$1$gestures$1> cVar) {
        super(2, cVar);
        this.f4197c = z11;
        this.f4198d = kVar;
        this.f4199e = h0Var;
        this.f4200f = d1Var;
        this.f4201g = d1Var2;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((ToggleableKt$toggleableImpl$1$gestures$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$1 = new ToggleableKt$toggleableImpl$1$gestures$1(this.f4197c, this.f4198d, this.f4199e, this.f4200f, this.f4201g, cVar);
        toggleableKt$toggleableImpl$1$gestures$1.f4196b = obj;
        return toggleableKt$toggleableImpl$1$gestures$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4195a;
        if (i11 == 0) {
            g.b(obj);
            final boolean z11 = this.f4197c;
            final u.k kVar = this.f4198d;
            final h0<n> h0Var = this.f4199e;
            final d1<a<Boolean>> d1Var = this.f4200f;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final boolean z12 = this.f4197c;
            final d1<a<k>> d1Var2 = this.f4201g;
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
            this.f4195a = 1;
            if (TapGestureDetectorKt.i((d0) this.f4196b, r32, r33, this) == d11) {
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

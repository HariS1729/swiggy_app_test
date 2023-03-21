package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import lp0.q;
import t0.f;
import wp0.j0;
import wp0.k0;

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {206}, m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3559a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3560b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f3561c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<y1.n, f, c<? super k>, Object> f3562d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3563e;

    @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1  reason: invalid class name */
    /* compiled from: TapGestureDetector.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3564a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3565b;

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(pressGestureScopeImpl, d0Var, qVar, lVar, cVar);
            r02.f3565b = obj;
            return r02;
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f3564a;
            if (i11 == 0) {
                g.b(obj);
                final j0 j0Var = (j0) this.f3565b;
                pressGestureScopeImpl.r();
                d0 d0Var = d0Var;
                final q<y1.n, f, c<? super k>, Object> qVar = qVar;
                final PressGestureScopeImpl pressGestureScopeImpl = pressGestureScopeImpl;
                final l<f, k> lVar = lVar;
                AnonymousClass1 r32 = new p<f1.d, c<? super k>, Object>((c<? super AnonymousClass1>) null) {

                    /* renamed from: b  reason: collision with root package name */
                    int f3570b;

                    /* renamed from: c  reason: collision with root package name */
                    private /* synthetic */ Object f3571c;

                    /* renamed from: a */
                    public final Object invoke(f1.d dVar, c<? super k> cVar) {
                        return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
                    }

                    public final c<k> create(Object obj, c<?> cVar) {
                        AnonymousClass1 r02 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TapGestureDetectorKt$detectTapAndPress$2(PressGestureScopeImpl pressGestureScopeImpl, q<? super y1.n, ? super f, ? super c<? super k>, ? extends Object> qVar, l<? super f, k> lVar, c<? super TapGestureDetectorKt$detectTapAndPress$2> cVar) {
                            super(2, cVar);
                            this.f3561c = pressGestureScopeImpl;
                            this.f3562d = qVar;
                            this.f3563e = lVar;
                        }

                        /* renamed from: a */
                        public final Object invoke(d0 d0Var, c<? super k> cVar) {
                            return ((TapGestureDetectorKt$detectTapAndPress$2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
                        }

                        public final c<k> create(Object obj, c<?> cVar) {
                            TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.f3561c, this.f3562d, this.f3563e, cVar);
                            tapGestureDetectorKt$detectTapAndPress$2.f3560b = obj;
                            return tapGestureDetectorKt$detectTapAndPress$2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d11 = b.d();
                            int i11 = this.f3559a;
                            if (i11 == 0) {
                                g.b(obj);
                                final d0 d0Var = (d0) this.f3560b;
                                final PressGestureScopeImpl pressGestureScopeImpl = this.f3561c;
                                final q<y1.n, f, c<? super k>, Object> qVar = this.f3562d;
                                final l<f, k> lVar = this.f3563e;
                                AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
                                this.f3559a = 1;
                                if (k0.e(r32, this) == d11) {
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

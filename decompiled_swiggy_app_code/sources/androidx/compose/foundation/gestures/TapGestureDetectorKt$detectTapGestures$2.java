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

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {92}, m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3580a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3581b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d0 f3582c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<y1.n, f, c<? super k>, Object> f3583d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3584e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3585f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3586g;

    @d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {93}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1  reason: invalid class name */
    /* compiled from: TapGestureDetector.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f3587a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f3588b;

        /* renamed from: a */
        public final Object invoke(d0 d0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(pressGestureScopeImpl, qVar, j0Var, lVar, lVar2, lVar3, cVar);
            r02.f3588b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f3587a;
            if (i11 == 0) {
                g.b(obj);
                final PressGestureScopeImpl pressGestureScopeImpl = pressGestureScopeImpl;
                final q<y1.n, f, c<? super k>, Object> qVar = qVar;
                final j0 j0Var = j0Var;
                final l<f, k> lVar = lVar;
                final l<f, k> lVar2 = lVar2;
                final l<f, k> lVar3 = lVar3;
                AnonymousClass1 r32 = new p<f1.d, c<? super k>, Object>((c<? super AnonymousClass1>) null) {

                    /* renamed from: b  reason: collision with root package name */
                    Object f3595b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f3596c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f3597d;

                    /* renamed from: e  reason: collision with root package name */
                    long f3598e;

                    /* renamed from: f  reason: collision with root package name */
                    int f3599f;

                    /* renamed from: g  reason: collision with root package name */
                    private /* synthetic */ Object f3600g;

                    /* renamed from: a */
                    public final Object invoke(f1.d dVar, c<? super k> cVar) {
                        return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
                    }

                    public final c<k> create(Object obj, c<?> cVar) {
                        AnonymousClass1 r02 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TapGestureDetectorKt$detectTapGestures$2(d0 d0Var, q<? super y1.n, ? super f, ? super c<? super k>, ? extends Object> qVar, l<? super f, k> lVar, l<? super f, k> lVar2, l<? super f, k> lVar3, c<? super TapGestureDetectorKt$detectTapGestures$2> cVar) {
                            super(2, cVar);
                            this.f3582c = d0Var;
                            this.f3583d = qVar;
                            this.f3584e = lVar;
                            this.f3585f = lVar2;
                            this.f3586g = lVar3;
                        }

                        public final c<k> create(Object obj, c<?> cVar) {
                            TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.f3582c, this.f3583d, this.f3584e, this.f3585f, this.f3586g, cVar);
                            tapGestureDetectorKt$detectTapGestures$2.f3581b = obj;
                            return tapGestureDetectorKt$detectTapGestures$2;
                        }

                        public final Object invoke(j0 j0Var, c<? super k> cVar) {
                            return ((TapGestureDetectorKt$detectTapGestures$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d11 = b.d();
                            int i11 = this.f3580a;
                            if (i11 == 0) {
                                g.b(obj);
                                final j0 j0Var = (j0) this.f3581b;
                                final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.f3582c);
                                d0 d0Var = this.f3582c;
                                final q<y1.n, f, c<? super k>, Object> qVar = this.f3583d;
                                final l<f, k> lVar = this.f3584e;
                                final l<f, k> lVar2 = this.f3585f;
                                final l<f, k> lVar3 = this.f3586g;
                                AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
                                this.f3580a = 1;
                                if (ForEachGestureKt.d(d0Var, r32, this) == d11) {
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

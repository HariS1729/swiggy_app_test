package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import bp0.k;
import defpackage.y1;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.m;
import e0.r;
import e0.s;
import e0.u;
import f1.d0;
import fp0.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import t0.f;
import u.n;
import wp0.j0;

/* compiled from: TextFieldPressGestureFilter.kt */
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<f, k> f4577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u.k f4578b;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2  reason: invalid class name */
    /* compiled from: TextFieldPressGestureFilter.kt */
    static final class AnonymousClass2 extends SuspendLambda implements lp0.p<d0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4583a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4584b;

        /* renamed from: a */
        public final Object invoke(d0 d0Var, c<? super k> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(a11, h0Var, kVar3, m11, cVar);
            r02.f4584b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4583a;
            if (i11 == 0) {
                bp0.g.b(obj);
                final j0 j0Var = a11;
                final h0<n> h0Var = h0Var;
                final u.k kVar = kVar3;
                AnonymousClass1 r12 = new q<y1.n, f, c<? super k>, Object>((c<? super AnonymousClass1>) null) {

                    /* renamed from: a  reason: collision with root package name */
                    int f4589a;

                    /* renamed from: b  reason: collision with root package name */
                    private /* synthetic */ Object f4590b;

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ long f4591c;

                    public final Object a(y1.n nVar, long j, c<? super k> cVar) {
                        AnonymousClass1 r02 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(l<? super f, k> lVar, u.k kVar) {
                            super(3);
                            this.f4577a = lVar;
                            this.f4578b = kVar;
                        }

                        public final d a(d dVar, g gVar, int i11) {
                            p.j(dVar, "$this$composed");
                            gVar.E(-102778667);
                            gVar.E(773894976);
                            gVar.E(-492369756);
                            Object F = gVar.F();
                            g.a aVar = g.f14172a;
                            if (F == aVar.a()) {
                                m mVar = new m(u.i(EmptyCoroutineContext.f25631a, gVar));
                                gVar.y(mVar);
                                F = mVar;
                            }
                            gVar.P();
                            final j0 a11 = ((m) F).a();
                            gVar.P();
                            gVar.E(-492369756);
                            Object F2 = gVar.F();
                            if (F2 == aVar.a()) {
                                F2 = j.e((Object) null, (a1) null, 2, (Object) null);
                                gVar.y(F2);
                            }
                            gVar.P();
                            final h0 h0Var = (h0) F2;
                            final d1<T> m11 = androidx.compose.runtime.g.m(this.f4577a, gVar, 0);
                            final u.k kVar = this.f4578b;
                            u.b(kVar, new l<s, r>() {

                                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$a */
                                /* compiled from: Effects.kt */
                                public static final class a implements r {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ h0 f4581a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ u.k f4582b;

                                    public a(h0 h0Var, u.k kVar) {
                                        this.f4581a = h0Var;
                                        this.f4582b = kVar;
                                    }

                                    public void dispose() {
                                        n nVar = (n) this.f4581a.getValue();
                                        if (nVar != null) {
                                            u.m mVar = new u.m(nVar);
                                            u.k kVar = this.f4582b;
                                            if (kVar != null) {
                                                kVar.a(mVar);
                                            }
                                            this.f4581a.setValue(null);
                                        }
                                    }
                                }

                                /* renamed from: a */
                                public final r invoke(s sVar) {
                                    p.j(sVar, "$this$DisposableEffect");
                                    return new a(h0Var, kVar);
                                }
                            }, gVar, 0);
                            d.a aVar2 = d.f16037h0;
                            u.k kVar2 = this.f4578b;
                            final u.k kVar3 = kVar2;
                            d c11 = SuspendingPointerInputFilterKt.c(aVar2, kVar2, new AnonymousClass2((c<? super AnonymousClass2>) null));
                            gVar.P();
                            return c11;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return a((d) obj, (g) obj2, ((Number) obj3).intValue());
                        }
                    }

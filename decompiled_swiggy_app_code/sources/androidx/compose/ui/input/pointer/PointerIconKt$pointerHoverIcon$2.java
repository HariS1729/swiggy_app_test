package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.CompositionLocalsKt;
import bp0.k;
import e0.g;
import f1.d0;
import f1.r;
import f1.s;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;

/* compiled from: PointerIcon.kt */
final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f6636a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6637b;

    @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", f = "PointerIcon.kt", l = {74}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1  reason: invalid class name */
    /* compiled from: PointerIcon.kt */
    static final class AnonymousClass1 extends SuspendLambda implements lp0.p<d0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f6638a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6639b;

        /* renamed from: a */
        public final Object invoke(d0 d0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(z11, sVar, rVar2, cVar);
            r02.f6639b = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f6638a;
            if (i11 == 0) {
                bp0.g.b(obj);
                final boolean z11 = z11;
                final s sVar = sVar;
                final r rVar = rVar2;
                AnonymousClass1 r12 = new lp0.p<f1.d, c<? super k>, Object>((c<? super AnonymousClass1>) null) {

                    /* renamed from: b  reason: collision with root package name */
                    int f6643b;

                    /* renamed from: c  reason: collision with root package name */
                    private /* synthetic */ Object f6644c;

                    /* renamed from: a */
                    public final Object invoke(f1.d dVar, c<? super k> cVar) {
                        return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
                    }

                    public final c<k> create(Object obj, c<?> cVar) {
                        AnonymousClass1 r02 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        PointerIconKt$pointerHoverIcon$2(r rVar, boolean z11) {
                            super(3);
                            this.f6636a = rVar;
                            this.f6637b = z11;
                        }

                        public final d a(d dVar, g gVar, int i11) {
                            d dVar2;
                            p.j(dVar, "$this$composed");
                            gVar.E(811087536);
                            final s sVar = (s) gVar.z(CompositionLocalsKt.k());
                            if (sVar == null) {
                                dVar2 = d.f16037h0;
                            } else {
                                r rVar = this.f6636a;
                                Boolean valueOf = Boolean.valueOf(this.f6637b);
                                final boolean z11 = this.f6637b;
                                final r rVar2 = this.f6636a;
                                dVar2 = SuspendingPointerInputFilterKt.b(dVar, rVar, valueOf, new AnonymousClass1((c<? super AnonymousClass1>) null));
                            }
                            gVar.P();
                            return dVar2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return a((d) obj, (g) obj2, ((Number) obj3).intValue());
                        }
                    }

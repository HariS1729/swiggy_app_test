package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import lp0.l;
import n1.h;
import n1.o;
import n1.q;
import wp0.j0;
import wp0.k1;

/* compiled from: Scroll.kt */
final class ScrollKt$scroll$2$semantics$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f3139a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f3141c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ScrollState f3142d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j0 f3143e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$scroll$2$semantics$1(boolean z11, boolean z12, boolean z13, ScrollState scrollState, j0 j0Var) {
        super(1);
        this.f3139a = z11;
        this.f3140b = z12;
        this.f3141c = z13;
        this.f3142d = scrollState;
        this.f3143e = j0Var;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        h hVar = new h(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.f3142d), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.f3142d), this.f3139a);
        if (this.f3140b) {
            o.T(qVar, hVar);
        } else {
            o.F(qVar, hVar);
        }
        if (this.f3141c) {
            final j0 j0Var = this.f3143e;
            final boolean z11 = this.f3140b;
            final ScrollState scrollState = this.f3142d;
            o.y(qVar, (String) null, new lp0.p<Float, Float, Boolean>() {

                @d(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {276, 278}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1  reason: invalid class name */
                /* compiled from: Scroll.kt */
                static final class AnonymousClass1 extends SuspendLambda implements lp0.p<j0, c<? super k>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f3147a;

                    public final c<k> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(z11, scrollState, f13, f14, cVar);
                    }

                    public final Object invoke(j0 j0Var, c<? super k> cVar) {
                        return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object d11 = b.d();
                        int i11 = this.f3147a;
                        if (i11 == 0) {
                            g.b(obj);
                            if (z11) {
                                ScrollState scrollState = scrollState;
                                float f11 = f13;
                                this.f3147a = 1;
                                if (ScrollExtensionsKt.b(scrollState, f11, (v1.g) null, this, 2, (Object) null) == d11) {
                                    return d11;
                                }
                            } else {
                                ScrollState scrollState2 = scrollState;
                                float f12 = f14;
                                this.f3147a = 2;
                                if (ScrollExtensionsKt.b(scrollState2, f12, (v1.g) null, this, 2, (Object) null) == d11) {
                                    return d11;
                                }
                            }
                        } else if (i11 == 1 || i11 == 2) {
                            g.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return k.f22762a;
                    }
                }

                public final Boolean a(float f11, float f12) {
                    j0 j0Var = j0Var;
                    final boolean z11 = z11;
                    final ScrollState scrollState = scrollState;
                    final float f13 = f12;
                    final float f14 = f11;
                    k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}

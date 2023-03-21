package androidx.compose.material;

import bp0.k;
import d2.h;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import lp0.u;
import u0.d0;

/* compiled from: TextFieldImpl.kt */
final class TextFieldTransitionScope$Transition$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldTransitionScope f5714a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InputPhase f5715b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f5716c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f5717d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<InputPhase, g, Integer, d0> f5718e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f5719f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ u<Float, d0, d0, h, Float, g, Integer, k> f5720g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f5721h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j, long j11, q<? super InputPhase, ? super g, ? super Integer, d0> qVar, boolean z11, u<? super Float, ? super d0, ? super d0, ? super h, ? super Float, ? super g, ? super Integer, k> uVar, int i11) {
        super(2);
        this.f5714a = textFieldTransitionScope;
        this.f5715b = inputPhase;
        this.f5716c = j;
        this.f5717d = j11;
        this.f5718e = qVar;
        this.f5719f = z11;
        this.f5720g = uVar;
        this.f5721h = i11;
    }

    public final void a(g gVar, int i11) {
        this.f5714a.a(this.f5715b, this.f5716c, this.f5717d, this.f5718e, this.f5719f, this.f5720g, gVar, this.f5721h | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

package androidx.compose.foundation.gestures;

import bp0.k;
import defpackage.v1;
import defpackage.y1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Scrollable.kt */
final class DefaultFlingBehavior$performFling$2 extends Lambda implements l<v1.f<Float, v1.k>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$FloatRef f3220a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y1.p f3221b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$FloatRef f3222c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$2(Ref$FloatRef ref$FloatRef, y1.p pVar, Ref$FloatRef ref$FloatRef2) {
        super(1);
        this.f3220a = ref$FloatRef;
        this.f3221b = pVar;
        this.f3222c = ref$FloatRef2;
    }

    public final void a(v1.f<Float, v1.k> fVar) {
        p.j(fVar, "$this$animateDecay");
        float floatValue = fVar.e().floatValue() - this.f3220a.f25663a;
        float a11 = this.f3221b.a(floatValue);
        this.f3220a.f25663a = fVar.e().floatValue();
        this.f3222c.f25663a = fVar.f().floatValue();
        if (Math.abs(floatValue - a11) > 0.5f) {
            fVar.a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v1.f) obj);
        return k.f22762a;
    }
}

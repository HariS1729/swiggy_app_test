package androidx.compose.foundation.layout;

import bp0.k;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<a2.f, g, Integer, k> f3703a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f3704b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3705c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(q<? super a2.f, ? super g, ? super Integer, k> qVar, c cVar, int i11) {
        super(2);
        this.f3703a = qVar;
        this.f3704b = cVar;
        this.f3705c = i11;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            this.f3703a.invoke(this.f3704b, gVar, Integer.valueOf((this.f3705c >> 6) & 112));
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

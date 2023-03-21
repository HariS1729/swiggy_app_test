package androidx.compose.foundation.layout;

import bp0.k;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsKt$BoxWithConstraints$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3706a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f3707b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f3708c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<a2.f, g, Integer, k> f3709d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f3710e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f3711f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxWithConstraintsKt$BoxWithConstraints$2(d dVar, a aVar, boolean z11, q<? super a2.f, ? super g, ? super Integer, k> qVar, int i11, int i12) {
        super(2);
        this.f3706a = dVar;
        this.f3707b = aVar;
        this.f3708c = z11;
        this.f3709d = qVar;
        this.f3710e = i11;
        this.f3711f = i12;
    }

    public final void a(g gVar, int i11) {
        BoxWithConstraintsKt.a(this.f3706a, this.f3707b, this.f3708c, this.f3709d, gVar, this.f3710e | 1, this.f3711f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}

package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import bp0.k;
import d2.p;
import d2.q;
import defpackage.v1;
import fp0.c;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import p.i;
import wp0.j0;
import wp0.k1;

/* compiled from: AnimationModifier.kt */
final class SizeAnimationModifier extends i {

    /* renamed from: a  reason: collision with root package name */
    private final v1.g<p> f2580a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f2581b;

    /* renamed from: c  reason: collision with root package name */
    private lp0.p<? super p, ? super p, k> f2582c;

    /* renamed from: d  reason: collision with root package name */
    private a f2583d;

    /* compiled from: AnimationModifier.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable<p, v1.l> f2584a;

        /* renamed from: b  reason: collision with root package name */
        private long f2585b;

        private a(Animatable<p, v1.l> animatable, long j) {
            this.f2584a = animatable;
            this.f2585b = j;
        }

        public /* synthetic */ a(Animatable animatable, long j, kotlin.jvm.internal.i iVar) {
            this(animatable, j);
        }

        public final Animatable<p, v1.l> a() {
            return this.f2584a;
        }

        public final long b() {
            return this.f2585b;
        }

        public final void c(long j) {
            this.f2585b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.p.e(this.f2584a, aVar.f2584a) && p.e(this.f2585b, aVar.f2585b);
        }

        public int hashCode() {
            return (this.f2584a.hashCode() * 31) + p.h(this.f2585b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f2584a + ", startSize=" + p.i(this.f2585b) + ')';
        }
    }

    public SizeAnimationModifier(v1.g<p> gVar, j0 j0Var) {
        kotlin.jvm.internal.p.j(gVar, "animSpec");
        kotlin.jvm.internal.p.j(j0Var, "scope");
        this.f2580a = gVar;
        this.f2581b = j0Var;
    }

    public u K(w wVar, r rVar, long j) {
        kotlin.jvm.internal.p.j(wVar, "$receiver");
        kotlin.jvm.internal.p.j(rVar, "measurable");
        e0 N = rVar.N(j);
        long a11 = a(q.a(N.A0(), N.e0()));
        return v.b(wVar, p.g(a11), p.f(a11), (Map) null, new SizeAnimationModifier$measure$1(N), 4, (Object) null);
    }

    public final long a(long j) {
        long j11 = j;
        a aVar = this.f2583d;
        if (aVar == null) {
            aVar = null;
        } else if (!p.e(j11, aVar.a().m().j())) {
            aVar.c(aVar.a().o().j());
            k1 unused = j.d(e(), (CoroutineContext) null, (CoroutineStart) null, new SizeAnimationModifier$animateTo$data$1$1(aVar, j, this, (c<? super SizeAnimationModifier$animateTo$data$1$1>) null), 3, (Object) null);
        }
        if (aVar == null) {
            aVar = new a(new Animatable(p.b(j), VectorConvertersKt.e(p.f14019b), p.b(q.a(1, 1))), j11, (kotlin.jvm.internal.i) null);
        }
        this.f2583d = aVar;
        return aVar.a().o().j();
    }

    public final v1.g<p> c() {
        return this.f2580a;
    }

    public final lp0.p<p, p, k> d() {
        return this.f2582c;
    }

    public final j0 e() {
        return this.f2581b;
    }

    public final void f(lp0.p<? super p, ? super p, k> pVar) {
        this.f2582c = pVar;
    }
}

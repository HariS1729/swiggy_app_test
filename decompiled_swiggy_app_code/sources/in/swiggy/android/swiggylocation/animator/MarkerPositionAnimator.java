package in.swiggy.android.swiggylocation.animator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Keep;
import bg0.f;
import bp0.k;
import cg0.t;
import com.google.android.gms.maps.model.LatLng;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import rj.g;

/* compiled from: MarkerPositionAnimator.kt */
public final class MarkerPositionAnimator {

    /* renamed from: f  reason: collision with root package name */
    public static final a f18773f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final String f18774g = MarkerPositionAnimator.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private g f18775a;

    /* renamed from: b  reason: collision with root package name */
    private int f18776b;

    /* renamed from: c  reason: collision with root package name */
    private rj.i f18777c;

    /* renamed from: d  reason: collision with root package name */
    private int f18778d;

    /* renamed from: e  reason: collision with root package name */
    private List<LatLng> f18779e;

    /* compiled from: MarkerPositionAnimator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final String a() {
            return MarkerPositionAnimator.f18774g;
        }
    }

    /* compiled from: MarkerPositionAnimator.kt */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18786a;

        b(lp0.a<k> aVar) {
            this.f18786a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "animation");
            lp0.a<k> aVar = this.f18786a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            p.j(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            p.j(animator, "animation");
        }
    }

    /* compiled from: MarkerPositionAnimator.kt */
    public static final class c extends gu.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18787a;

        c(lp0.a<k> aVar) {
            this.f18787a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "p0");
            lp0.a<k> aVar = this.f18787a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: MarkerPositionAnimator.kt */
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18788a;

        d(lp0.a<k> aVar) {
            this.f18788a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "animation");
            lp0.a<k> aVar = this.f18788a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            p.j(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            p.j(animator, "animation");
        }
    }

    public MarkerPositionAnimator(g gVar, rj.i iVar, int i11, int i12) {
        this.f18775a = gVar;
        this.f18776b = i12;
        this.f18777c = iVar;
        this.f18778d = i11;
    }

    /* access modifiers changed from: private */
    public final void h(boolean z11, long j, lp0.a<k> aVar) {
        List<LatLng> a11;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        if (!z11) {
            j += j / ((long) 2);
        }
        ofInt.setDuration(j);
        ofInt.setInterpolator(z11 ? new AccelerateDecelerateInterpolator() : new DecelerateInterpolator());
        if (this.f18778d != -1) {
            rj.i iVar = this.f18777c;
            List<LatLng> list = null;
            if (!(iVar == null || (a11 = iVar.a()) == null)) {
                list = a11.subList(0, this.f18778d);
            }
            this.f18779e = list;
        }
        ofInt.addUpdateListener(new bg0.a(this));
        ofInt.addListener(new b(aVar));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    public static final void i(MarkerPositionAnimator markerPositionAnimator, ValueAnimator valueAnimator) {
        p.j(markerPositionAnimator, "this$0");
        p.j(valueAnimator, "animator1");
        js.c.o(markerPositionAnimator.f18777c, markerPositionAnimator.f18779e, new MarkerPositionAnimator$animateRemovePolyLine1$1$1(valueAnimator));
    }

    public static /* synthetic */ void k(MarkerPositionAnimator markerPositionAnimator, lp0.a aVar, lp0.a aVar2, boolean z11, long j, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        if ((i11 & 2) != 0) {
            aVar2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            j = 0;
        }
        markerPositionAnimator.j(aVar, aVar2, z11, j);
    }

    /* access modifiers changed from: private */
    public final void l(Long l11, boolean z11, LatLng[] latLngArr, lp0.a<k> aVar, lp0.a<k> aVar2) {
        long j;
        if (z11) {
            j = (long) (latLngArr.length * 60);
            if (j < 1800) {
                j = 1800;
            } else if (j > 4000) {
                j = 4000;
            }
            if (l11 != null) {
                j = l11.longValue();
            }
        } else {
            j = 10;
        }
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this, "markerPosition", new f(), Arrays.copyOf(latLngArr, latLngArr.length));
        ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
        ofObject.setDuration(j);
        ofObject.addListener(new c(aVar));
        ofObject.start();
        h(l11 != null, j, aVar2);
    }

    private final float n(float f11, float f12, float f13) {
        return ((f13 - f12) * f11) + f12;
    }

    /* access modifiers changed from: private */
    public final void o(g gVar, LatLng latLng, boolean z11, lp0.a<k> aVar, lp0.a<k> aVar2) {
        LatLng a11 = gVar.a();
        t tVar = new t();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new bg0.b(gVar, tVar, a11, latLng));
        valueAnimator.addListener(new d(aVar));
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(z11 ? 1800 : 10);
        long j = 600;
        valueAnimator.setStartDelay(z11 ? 600 : 10);
        valueAnimator.start();
        float b11 = gVar.b();
        LatLng a12 = gVar.a();
        p.i(a12, "position");
        float j11 = ag0.d.j(a12, latLng);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.addUpdateListener(new bg0.c(gVar, this, b11, j11));
        valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
        if (!z11) {
            j = 10;
        }
        valueAnimator2.setDuration(j);
        valueAnimator2.start();
        h(false, 10, aVar2);
    }

    /* access modifiers changed from: private */
    public static final void p(g gVar, t tVar, LatLng latLng, LatLng latLng2, ValueAnimator valueAnimator) {
        p.j(gVar, "$this_apply");
        p.j(tVar, "$latLngInterpolator");
        p.j(latLng2, "$lastPoint");
        p.j(valueAnimator, "animation");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p.i(latLng, "firstPoint");
        gVar.n(tVar.a(animatedFraction, latLng, latLng2));
    }

    /* access modifiers changed from: private */
    public static final void q(g gVar, MarkerPositionAnimator markerPositionAnimator, float f11, float f12, ValueAnimator valueAnimator) {
        p.j(gVar, "$this_apply");
        p.j(markerPositionAnimator, "this$0");
        p.j(valueAnimator, "animation");
        gVar.o(markerPositionAnimator.n(valueAnimator.getAnimatedFraction(), f11, f12));
    }

    public final void j(lp0.a<k> aVar, lp0.a<k> aVar2, boolean z11, long j) {
        Long valueOf = j > 0 ? Long.valueOf(j) : null;
        if (this.f18778d != -1) {
            js.c.o(this.f18775a, this.f18777c, new MarkerPositionAnimator$animateRoute$1(this, z11, valueOf, aVar, aVar2));
        }
    }

    public final int m() {
        return this.f18778d;
    }

    @Keep
    public final void setMarkerPosition(LatLng latLng) {
        p.j(latLng, "endLatLng");
        g gVar = this.f18775a;
        if (gVar != null) {
            gVar.n(latLng);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MarkerPositionAnimator(g gVar, rj.i iVar, int i11, int i12, int i13, i iVar2) {
        this(gVar, iVar, i11, (i13 & 8) != 0 ? 3000 : i12);
    }
}

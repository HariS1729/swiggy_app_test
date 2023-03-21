package in.swiggy.android.swiggylocation.animator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.Keep;
import bg0.e;
import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PolyLineAnimator.kt */
public final class PolyLineAnimator {

    /* renamed from: d  reason: collision with root package name */
    public static final a f18795d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f18796e = PolyLineAnimator.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private List<LatLng> f18797a;

    /* renamed from: b  reason: collision with root package name */
    private int f18798b;

    /* renamed from: c  reason: collision with root package name */
    private rj.i f18799c;

    /* compiled from: PolyLineAnimator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: PolyLineAnimator.kt */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18801a;

        b(lp0.a<k> aVar) {
            this.f18801a = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            p.j(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "animation");
            lp0.a<k> aVar = this.f18801a;
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

    public PolyLineAnimator(rj.i iVar, List<LatLng> list, int i11) {
        this.f18797a = list;
        this.f18798b = i11;
        this.f18799c = iVar;
    }

    public static /* synthetic */ void c(PolyLineAnimator polyLineAnimator, lp0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        polyLineAnimator.b(aVar);
    }

    /* access modifiers changed from: private */
    public static final void d(PolyLineAnimator polyLineAnimator, ValueAnimator valueAnimator) {
        p.j(polyLineAnimator, "this$0");
        p.j(valueAnimator, "animator1");
        c.o(polyLineAnimator.f18799c, polyLineAnimator.f18797a, new PolyLineAnimator$animatePolyLine$1$1(valueAnimator));
    }

    public final void b(lp0.a<k> aVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 100});
        ofInt.setDuration((long) this.f18798b);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new e(this));
        ofInt.addListener(new b(aVar));
        ofInt.start();
    }

    @Keep
    public final void setAddPoints(LatLng latLng) {
        p.j(latLng, "endLatLng");
        rj.i iVar = this.f18799c;
        if (iVar != null) {
            List<LatLng> a11 = iVar.a();
            a11.add(latLng);
            iVar.h(a11);
        }
    }
}

package in.swiggy.android.swiggylocation.animator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Keep;
import bp0.k;
import gu.d;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import rj.g;

/* compiled from: MarkerRotationAnimator.kt */
public final class MarkerRotationAnimator {

    /* renamed from: d  reason: collision with root package name */
    public static final a f18789d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final String f18790e = MarkerRotationAnimator.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private g f18791a;

    /* renamed from: b  reason: collision with root package name */
    private List<Float> f18792b;

    /* renamed from: c  reason: collision with root package name */
    private int f18793c;

    /* compiled from: MarkerRotationAnimator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: MarkerRotationAnimator.kt */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18794a;

        b(lp0.a<k> aVar) {
            this.f18794a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "p0");
            lp0.a<k> aVar = this.f18794a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public MarkerRotationAnimator(g gVar, List<Float> list, int i11) {
        this.f18791a = gVar;
        this.f18792b = list;
        this.f18793c = i11;
    }

    public static /* synthetic */ void b(MarkerRotationAnimator markerRotationAnimator, boolean z11, lp0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        markerRotationAnimator.a(z11, aVar);
    }

    public final void a(boolean z11, lp0.a<k> aVar) {
        List<Float> list;
        if (this.f18791a != null && (list = this.f18792b) != null) {
            Object[] array = list.toArray(new Float[0]);
            p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Float[] fArr = (Float[]) array;
            if (fArr.length <= 1) {
                return;
            }
            if (fArr.length < 50 || z11) {
                ObjectAnimator ofObject = ObjectAnimator.ofObject(this, "markerRotation", new bg0.d(), Arrays.copyOf(fArr, fArr.length));
                ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
                ofObject.setDuration((long) this.f18793c);
                ofObject.addListener(new b(aVar));
                ofObject.start();
            }
        }
    }

    @Keep
    public final void setMarkerRotation(float f11) {
        g gVar = this.f18791a;
        if (gVar != null) {
            gVar.o(f11);
        }
    }
}

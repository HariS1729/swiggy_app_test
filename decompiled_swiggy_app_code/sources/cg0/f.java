package cg0;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.commonsui.extensions.AnimationExtensionsKt;
import java.util.Objects;
import kotlin.jvm.internal.p;
import rj.c;
import rj.g;

/* compiled from: AnimatingMapMarker.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f18148a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18149b;

    /* renamed from: c  reason: collision with root package name */
    private c f18150c;

    /* renamed from: d  reason: collision with root package name */
    private g f18151d;

    /* renamed from: e  reason: collision with root package name */
    private float f18152e = 16.0f;

    /* renamed from: f  reason: collision with root package name */
    private double f18153f = 1.0d;

    /* renamed from: g  reason: collision with root package name */
    private double f18154g = 1.0d;

    /* renamed from: h  reason: collision with root package name */
    private final ValueAnimator f18155h;

    public f(int i11, int i12, long j) {
        this.f18148a = i11;
        this.f18149b = i12;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i12});
        if (ofInt == null) {
            ofInt = null;
        } else {
            ofInt.setDuration(j);
            ofInt.setRepeatCount(-1);
            ofInt.setRepeatMode(1);
            ofInt.addUpdateListener(new e(this));
        }
        this.f18155h = ofInt;
    }

    /* access modifiers changed from: private */
    public static final void i(f fVar, ValueAnimator valueAnimator) {
        p.j(fVar, "this$0");
        p.j(valueAnimator, "animator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        double intValue = (((double) ((Integer) animatedValue).intValue()) / fVar.f18154g) * fVar.f18153f;
        c cVar = fVar.f18150c;
        if (cVar != null) {
            cVar.d(intValue);
        }
    }

    public final void b(pj.c cVar, LatLng latLng) {
        c cVar2;
        p.j(latLng, "location");
        if (cVar == null) {
            cVar2 = null;
        } else {
            cVar2 = cVar.a(new CircleOptions().a(latLng).X0((double) this.f18149b).M(this.f18148a).e1(0.0f));
        }
        ValueAnimator valueAnimator = this.f18155h;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        this.f18150c = cVar2;
    }

    public final c c() {
        return this.f18150c;
    }

    public final g d() {
        return this.f18151d;
    }

    public final void e(float f11, float f12) {
        if (!(f11 == this.f18152e)) {
            if (f11 > f12) {
                this.f18154g = Math.pow(2.0d, (double) (f11 - f12));
                this.f18153f = 1.0d;
            } else {
                this.f18154g = 1.0d;
                this.f18153f = Math.pow(2.0d, (double) (f12 - f11));
            }
            this.f18152e = f11;
        }
    }

    public final void f(float f11) {
        this.f18152e = f11;
    }

    public final void g(g gVar) {
        this.f18151d = gVar;
    }

    public final void h() {
        AnimationExtensionsKt.e(this.f18155h);
    }
}

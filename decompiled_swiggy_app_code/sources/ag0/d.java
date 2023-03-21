package ag0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.location.Location;
import bp0.k;
import cg0.l;
import cg0.t;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import in.swiggy.android.swiggylocation.location.GeoDistanceUnit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import os.u;
import rj.g;

/* compiled from: LocationExtensions.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18077a = "LocationExtensions";

    /* renamed from: b  reason: collision with root package name */
    private static final double f18078b = 6366198.0d;

    /* compiled from: LocationExtensions.kt */
    public static final class a extends gu.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ lp0.a<k> f18079a;

        a(lp0.a<k> aVar) {
            this.f18079a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            p.j(animator, "animation");
            lp0.a<k> aVar = this.f18079a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final void d(g gVar, LatLng latLng, long j, lp0.a<k> aVar) {
        p.j(gVar, "<this>");
        if (latLng != null) {
            LatLng a11 = gVar.a();
            p.i(a11, "position");
            float j11 = j(a11, latLng);
            float b11 = gVar.b();
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.addUpdateListener(new a(gVar, b11, j11));
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.setDuration(j);
            valueAnimator.start();
        }
    }

    public static /* synthetic */ void e(g gVar, LatLng latLng, long j, lp0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j = 600;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        d(gVar, latLng, j, aVar);
    }

    /* access modifiers changed from: private */
    public static final void f(g gVar, float f11, float f12, ValueAnimator valueAnimator) {
        p.j(gVar, "$this_animateBearing");
        p.j(valueAnimator, "animation");
        gVar.o(p(valueAnimator.getAnimatedFraction(), f11, f12));
    }

    public static final void g(g gVar, LatLng latLng, long j, lp0.a<k> aVar) {
        p.j(gVar, "<this>");
        if (latLng != null && !p.e(gVar.a(), latLng)) {
            try {
                LatLng a11 = gVar.a();
                t tVar = new t();
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.addUpdateListener(new c(gVar, tVar, a11, latLng));
                valueAnimator.addListener(new a(aVar));
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.setDuration(j);
                valueAnimator.start();
                float b11 = gVar.b();
                p.i(a11, "startPosition");
                float j11 = j(a11, latLng);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                valueAnimator2.addUpdateListener(new b(gVar, b11, j11));
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator2.setDuration(j);
                valueAnimator2.start();
            } catch (Throwable th2) {
                u.h(o(), th2);
                LatLng a12 = gVar.a();
                p.i(a12, "this.position");
                gVar.o(j(a12, latLng));
                gVar.n(latLng);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(g gVar, t tVar, LatLng latLng, LatLng latLng2, ValueAnimator valueAnimator) {
        p.j(gVar, "$this_animateToPosition");
        p.j(tVar, "$latLngInterpolator");
        p.j(valueAnimator, "animation");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p.i(latLng, "startPosition");
        gVar.n(tVar.a(animatedFraction, latLng, latLng2));
    }

    /* access modifiers changed from: private */
    public static final void i(g gVar, float f11, float f12, ValueAnimator valueAnimator) {
        p.j(gVar, "$this_animateToPosition");
        p.j(valueAnimator, "animation");
        gVar.o(p(valueAnimator.getAnimatedFraction(), f11, f12));
    }

    public static final float j(LatLng latLng, LatLng latLng2) {
        p.j(latLng, "<this>");
        float w11 = w(y(latLng), latLng2 == null ? null : y(latLng2));
        return w11 < 0.0f ? w11 + ((float) 360) : w11;
    }

    public static final LatLngBounds k(LatLng... latLngArr) {
        p.j(latLngArr, "latLngs");
        LatLngBounds.a aVar = new LatLngBounds.a();
        int length = latLngArr.length;
        int i11 = 0;
        while (i11 < length) {
            LatLng latLng = latLngArr[i11];
            i11++;
            aVar.b(latLng);
        }
        LatLng e02 = aVar.a().e0();
        p.i(e02, "center");
        LatLng v = v(e02, 60.0d, 60.0d);
        aVar.b(v(e02, -60.0d, -60.0d));
        aVar.b(v);
        LatLngBounds a11 = aVar.a();
        p.i(a11, "builder.build()");
        return a11;
    }

    public static final List<LatLng> l(String str) {
        int i11;
        int i12;
        p.j(str, "encodedPath");
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = 1;
            int i17 = 0;
            while (true) {
                i11 = i13 + 1;
                int charAt = (str.charAt(i13) - '?') - 1;
                i16 += charAt << i17;
                i17 += 5;
                if (charAt < 31) {
                    break;
                }
                i13 = i11;
            }
            int i18 = ((i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1) + i14;
            int i19 = 1;
            int i21 = 0;
            while (true) {
                i12 = i11 + 1;
                int charAt2 = (str.charAt(i11) - '?') - 1;
                i19 += charAt2 << i21;
                i21 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i11 = i12;
            }
            int i22 = i19 & 1;
            int i23 = i19 >> 1;
            if (i22 != 0) {
                i23 = ~i23;
            }
            i15 += i23;
            arrayList.add(new LatLng(((double) i18) * 1.0E-5d, ((double) i15) * 1.0E-5d));
            i14 = i18;
            i13 = i12;
        }
        return arrayList;
    }

    public static final float m(LatLng latLng, LatLng latLng2) {
        p.j(latLng, "<this>");
        if (latLng2 == null) {
            return 0.0f;
        }
        return y(latLng).distanceTo(y(latLng2));
    }

    public static final LatLng n(LatLng latLng, LatLng latLng2, double d11) {
        p.j(latLng, "<this>");
        p.j(latLng2, "endLatLng");
        LatLngBounds.a aVar = new LatLngBounds.a();
        aVar.b(latLng);
        aVar.b(latLng2);
        LatLng e02 = aVar.a().e0();
        float m11 = m(latLng, latLng2);
        l b11 = l.b(e02.f43937a, e02.f43938b);
        float j = j(latLng, latLng2);
        float j11 = j(latLng2, latLng);
        float f11 = (float) 90;
        l lVar = b11;
        double tan = (double) ((float) ((Math.tan(d11 * 0.017453292519943295d) * ((double) m11)) / ((double) 2)));
        GeoDistanceUnit geoDistanceUnit = GeoDistanceUnit.METERS;
        LatLng e11 = lVar.g(tan, (double) (j + f11), geoDistanceUnit).e();
        LatLng e12 = lVar.g(tan, (double) (j11 + f11), geoDistanceUnit).e();
        if (j <= 180.0f) {
            p.i(e12, "southWest");
            return e12;
        }
        p.i(e11, "northEast");
        return e11;
    }

    public static final String o() {
        return f18077a;
    }

    public static final float p(float f11, float f12, float f13) {
        return ((f13 - f12) * f11) + f12;
    }

    public static final boolean q(LatLng latLng, LatLng latLng2) {
        p.j(latLng, "<this>");
        if (latLng2 == null) {
            return false;
        }
        double doubleValue = BigDecimal.valueOf(latLng.f43937a).setScale(8, RoundingMode.HALF_UP).doubleValue();
        double doubleValue2 = BigDecimal.valueOf(latLng2.f43937a).setScale(8, RoundingMode.HALF_UP).doubleValue();
        double doubleValue3 = BigDecimal.valueOf(latLng.f43938b).setScale(8, RoundingMode.HALF_UP).doubleValue();
        double doubleValue4 = BigDecimal.valueOf(latLng2.f43938b).setScale(8, RoundingMode.HALF_UP).doubleValue();
        if (Double.compare(doubleValue, doubleValue2) == 0 && Double.compare(doubleValue3, doubleValue4) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean r(Location location) {
        p.j(location, "<this>");
        if (!(location.getLatitude() == 0.0d)) {
            if (!(location.getLongitude() == 0.0d)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean s(LatLng latLng) {
        p.j(latLng, "<this>");
        if (!(latLng.f43937a == 0.0d)) {
            if (!(latLng.f43938b == 0.0d)) {
                return true;
            }
        }
        return false;
    }

    private static final double t(double d11) {
        return Math.toDegrees(d11 / f18078b);
    }

    private static final double u(double d11, double d12) {
        return Math.toDegrees(d11 / (Math.cos(Math.toRadians(d12)) * f18078b));
    }

    private static final LatLng v(LatLng latLng, double d11, double d12) {
        double u11 = u(d12, latLng.f43937a);
        return new LatLng(latLng.f43937a + t(d11), latLng.f43938b + u11);
    }

    public static final float w(Location location, Location location2) {
        p.j(location, "<this>");
        if (location2 == null) {
            return 0.0f;
        }
        float bearingTo = location.bearingTo(location2);
        return bearingTo < 0.0f ? bearingTo + ((float) 360) : bearingTo;
    }

    public static final LatLng x(Location location) {
        p.j(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static final Location y(LatLng latLng) {
        p.j(latLng, "<this>");
        Location location = new Location("Darth");
        location.setLatitude(latLng.f43937a);
        location.setLongitude(latLng.f43938b);
        return location;
    }
}

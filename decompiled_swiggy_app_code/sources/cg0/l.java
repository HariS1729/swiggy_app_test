package cg0;

import com.google.android.gms.maps.model.LatLng;
import in.swiggy.android.swiggylocation.location.GeoDistanceUnit;

/* compiled from: GeoPoint */
public class l {

    /* renamed from: f  reason: collision with root package name */
    private static final double f18169f = Math.toRadians(-90.0d);

    /* renamed from: g  reason: collision with root package name */
    private static final double f18170g = Math.toRadians(90.0d);

    /* renamed from: h  reason: collision with root package name */
    private static final double f18171h = Math.toRadians(-180.0d);

    /* renamed from: i  reason: collision with root package name */
    private static final double f18172i = Math.toRadians(180.0d);

    /* renamed from: a  reason: collision with root package name */
    private double f18173a;

    /* renamed from: b  reason: collision with root package name */
    private double f18174b;

    /* renamed from: c  reason: collision with root package name */
    private double f18175c;

    /* renamed from: d  reason: collision with root package name */
    private double f18176d;

    /* renamed from: e  reason: collision with root package name */
    private Object f18177e = null;

    private l(double d11, double d12, boolean z11) {
        if (z11) {
            this.f18173a = d11;
            this.f18174b = d12;
            this.f18175c = Math.toDegrees(d11);
            this.f18176d = Math.toDegrees(d12);
        } else {
            this.f18173a = Math.toRadians(d11);
            this.f18174b = Math.toRadians(d12);
            this.f18175c = d11;
            this.f18176d = d12;
        }
        a();
    }

    private void a() {
        double d11 = this.f18173a;
        if (d11 >= f18169f && d11 <= f18170g) {
            double d12 = this.f18174b;
            if (d12 >= f18171h && d12 <= f18172i) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static l b(double d11, double d12) {
        return new l(d11, d12, false);
    }

    public static l c(double d11, double d12) {
        return new l(d11, d12, true);
    }

    public double d() {
        return this.f18175c;
    }

    public LatLng e() {
        return new LatLng(d(), f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Double.compare(lVar.f18175c, this.f18175c) == 0 && Double.compare(lVar.f18176d, this.f18176d) == 0) {
            return true;
        }
        return false;
    }

    public double f() {
        return this.f18176d;
    }

    public l g(double d11, double d12, GeoDistanceUnit geoDistanceUnit) {
        double km2 = geoDistanceUnit.toKm(d11) / 6371.01d;
        double radians = Math.toRadians(d12);
        double asin = Math.asin((Math.sin(this.f18173a) * Math.cos(km2)) + (Math.cos(this.f18173a) * Math.sin(km2) * Math.cos(radians)));
        return c(asin, (((this.f18174b + Math.atan2((Math.sin(radians) * Math.sin(km2)) * Math.cos(this.f18173a), Math.cos(km2) - (Math.sin(this.f18173a) * Math.sin(asin)))) + 9.42477796076938d) % 6.283185307179586d) - 3.141592653589793d);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18175c);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18176d);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "(" + this.f18175c + "°, " + this.f18176d + "°) = (" + this.f18173a + " rad, " + this.f18174b + " rad)";
    }

    private l() {
    }
}

package i2;

/* compiled from: Schlick */
public class i extends c {

    /* renamed from: d  reason: collision with root package name */
    double f14969d;

    /* renamed from: e  reason: collision with root package name */
    double f14970e;

    i(String str) {
        this.f14917a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f14969d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i11 = indexOf2 + 1;
        this.f14970e = Double.parseDouble(str.substring(i11, str.indexOf(44, i11)).trim());
    }

    private double d(double d11) {
        double d12 = this.f14970e;
        if (d11 < d12) {
            double d13 = this.f14969d;
            return ((d13 * d12) * d12) / ((((d12 - d11) * d13) + d11) * ((d13 * (d12 - d11)) + d11));
        }
        double d14 = this.f14969d;
        return (((d12 - 1.0d) * d14) * (d12 - 1.0d)) / (((((-d14) * (d12 - d11)) - d11) + 1.0d) * ((((-d14) * (d12 - d11)) - d11) + 1.0d));
    }

    private double e(double d11) {
        double d12 = this.f14970e;
        if (d11 < d12) {
            return (d12 * d11) / (d11 + (this.f14969d * (d12 - d11)));
        }
        return ((1.0d - d12) * (d11 - 1.0d)) / ((1.0d - d11) - (this.f14969d * (d12 - d11)));
    }

    public double a(double d11) {
        return e(d11);
    }

    public double b(double d11) {
        return d(d11);
    }
}

package in.swiggy.android.swiggylocation.location;

public enum GeoDistanceUnit {
    METERS(1000.0d),
    MILES(0.6213727366498067d),
    KILOMETERS(1.0d);
    
    private final double factor;

    private GeoDistanceUnit(double d11) {
        this.factor = d11;
    }

    public double fromKm(double d11) {
        return d11 * this.factor;
    }

    public double toKm(double d11) {
        return d11 / this.factor;
    }
}

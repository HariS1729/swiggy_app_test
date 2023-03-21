package co.hyperverge.hvcamera.magicfilter.utils;

public enum f {
    NORMAL,
    ROTATION_90,
    ROTATION_180,
    ROTATION_270;

    public static f a(int i11) {
        if (i11 == 0) {
            return NORMAL;
        }
        if (i11 == 90) {
            return ROTATION_90;
        }
        if (i11 == 180) {
            return ROTATION_180;
        }
        if (i11 == 270) {
            return ROTATION_270;
        }
        if (i11 == 360) {
            return NORMAL;
        }
        throw new IllegalStateException(i11 + " is an unknown rotation. Needs to be either 0, 90, 180 or 270!");
    }
}

package o5;

import co.hyperverge.hvcamera.magicfilter.utils.f;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f15947a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f15948b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f15949c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f15950d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f15951e = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15952a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                co.hyperverge.hvcamera.magicfilter.utils.f[] r0 = co.hyperverge.hvcamera.magicfilter.utils.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15952a = r0
                co.hyperverge.hvcamera.magicfilter.utils.f r1 = co.hyperverge.hvcamera.magicfilter.utils.f.ROTATION_90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15952a     // Catch:{ NoSuchFieldError -> 0x001d }
                co.hyperverge.hvcamera.magicfilter.utils.f r1 = co.hyperverge.hvcamera.magicfilter.utils.f.ROTATION_180     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15952a     // Catch:{ NoSuchFieldError -> 0x0028 }
                co.hyperverge.hvcamera.magicfilter.utils.f r1 = co.hyperverge.hvcamera.magicfilter.utils.f.ROTATION_270     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15952a     // Catch:{ NoSuchFieldError -> 0x0033 }
                co.hyperverge.hvcamera.magicfilter.utils.f r1 = co.hyperverge.hvcamera.magicfilter.utils.f.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.j.a.<clinit>():void");
        }
    }

    private static float a(float f11) {
        return f11 < 0.1f ? 1.0f : 0.0f;
    }

    public static float[] b(f fVar, boolean z11, boolean z12) {
        float[] fArr;
        int i11 = a.f15952a[fVar.ordinal()];
        if (i11 == 1) {
            fArr = f15948b;
        } else if (i11 == 2) {
            fArr = f15949c;
        } else if (i11 != 3) {
            fArr = f15947a;
        } else {
            fArr = f15950d;
        }
        if (z11) {
            fArr = new float[]{a(fArr[0]), fArr[1], a(fArr[2]), fArr[3], a(fArr[4]), fArr[5], a(fArr[6]), fArr[7]};
        }
        if (!z12) {
            return fArr;
        }
        return new float[]{fArr[0], a(fArr[1]), fArr[2], a(fArr[3]), fArr[4], a(fArr[5]), fArr[6], a(fArr[7])};
    }
}

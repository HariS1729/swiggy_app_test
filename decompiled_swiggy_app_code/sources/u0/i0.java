package u0;

import com.facebook.yoga.YogaStyleInputs;
import com.truecaller.android.sdk.TruecallerSdkScope;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: Float16.kt */
public final class i0 implements Comparable<i0> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16804a = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final short f16805b = c(5120);

    /* renamed from: c  reason: collision with root package name */
    private static final short f16806c = c(-1025);

    /* renamed from: d  reason: collision with root package name */
    private static final short f16807d = c(31743);

    /* renamed from: e  reason: collision with root package name */
    private static final short f16808e = c(1024);

    /* renamed from: f  reason: collision with root package name */
    private static final short f16809f = c(1);

    /* renamed from: g  reason: collision with root package name */
    private static final short f16810g = c(32256);

    /* renamed from: h  reason: collision with root package name */
    private static final short f16811h = c(-1024);

    /* renamed from: i  reason: collision with root package name */
    private static final short f16812i = c(Short.MIN_VALUE);
    private static final short j = c(31744);
    private static final short k = c(0);

    /* renamed from: l  reason: collision with root package name */
    private static final short f16813l = a(1.0f);

    /* renamed from: m  reason: collision with root package name */
    private static final short f16814m = a(-1.0f);
    private static final float n = Float.intBitsToFloat(1056964608);

    /* compiled from: Float16.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final short b(float f11) {
            int i11;
            int i12;
            int floatToRawIntBits = Float.floatToRawIntBits(f11);
            int i13 = floatToRawIntBits >>> 31;
            int i14 = (floatToRawIntBits >>> 23) & 255;
            int i15 = floatToRawIntBits & 8388607;
            int i16 = 0;
            if (i14 == 255) {
                if (i15 != 0) {
                    i16 = TruecallerSdkScope.FOOTER_TYPE_MANUALLY;
                }
                i11 = i16;
                i16 = 31;
                i12 = i11 | (i13 << 15) | (i16 << 10);
            } else {
                int i17 = (i14 - 127) + 15;
                if (i17 >= 31) {
                    i11 = 0;
                    i16 = 49;
                } else if (i17 > 0) {
                    int i18 = i15 >> 13;
                    if ((i15 & 4096) != 0) {
                        i12 = (((i17 << 10) | i18) + 1) | (i13 << 15);
                    } else {
                        i11 = i18;
                        i16 = i17;
                    }
                } else if (i17 >= -10) {
                    int i19 = (i15 | 8388608) >> (1 - i17);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i11 = i19 >> 13;
                } else {
                    i11 = 0;
                }
                i12 = i11 | (i13 << 15) | (i16 << 10);
            }
            return (short) i12;
        }
    }

    static {
        k kVar = k.f25688a;
    }

    public static short a(float f11) {
        return c(f16804a.b(f11));
    }

    public static short c(short s11) {
        return s11;
    }

    public static final float d(short s11) {
        int i11;
        short s12 = s11 & 65535;
        short s13 = 32768 & s12;
        int i12 = (s12 >>> 10) & 31;
        short s14 = s12 & 1023;
        int i13 = 0;
        if (i12 != 0) {
            int i14 = s14 << 13;
            if (i12 == 31) {
                if (i14 != 0) {
                    i14 |= 4194304;
                }
                i11 = i14;
                i13 = 255;
            } else {
                int i15 = i14;
                i13 = (i12 - 15) + 127;
                i11 = i15;
            }
        } else if (s14 != 0) {
            k kVar = k.f25688a;
            float intBitsToFloat = Float.intBitsToFloat(s14 + YogaStyleInputs.LAYOUT_DIRECTION) - n;
            return s13 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i11 = 0;
        }
        int i16 = i11 | (s13 << 16) | (i13 << 23);
        k kVar2 = k.f25688a;
        return Float.intBitsToFloat(i16);
    }
}

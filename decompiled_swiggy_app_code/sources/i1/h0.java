package i1;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;

/* compiled from: ScaleFactor.kt */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14884a = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final long f14885b = i0.a(Float.NaN, Float.NaN);

    /* compiled from: ScaleFactor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static long a(long j) {
        return j;
    }

    public static final float b(long j) {
        if (j != f14885b) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    public static final float c(long j) {
        if (j != f14885b) {
            k kVar = k.f25688a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }
}

package androidx.profileinstaller;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;

/* compiled from: ProfileVersion */
class m {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f11082a = {48, 49, 53, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f11083b = {48, 49, 48, 0};

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f11084c = {48, 48, 57, 0};

    /* renamed from: d  reason: collision with root package name */
    static final byte[] f11085d = {48, 48, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    static final byte[] f11086e = {48, 48, 49, 0};

    /* renamed from: f  reason: collision with root package name */
    static final byte[] f11087f = {48, 48, 49, 0};

    /* renamed from: g  reason: collision with root package name */
    static final byte[] f11088g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        if (!Arrays.equals(bArr, f11086e) && !Arrays.equals(bArr, f11085d)) {
            return "!";
        }
        return Constants.COLON_SEPARATOR;
    }
}

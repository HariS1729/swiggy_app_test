package m3;

import com.xiaomi.mipush.sdk.Constants;

/* compiled from: StringUtil */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f15603a = new String[0];

    public static void a(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("?");
            if (i12 < i11 - 1) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
    }

    public static StringBuilder b() {
        return new StringBuilder();
    }
}

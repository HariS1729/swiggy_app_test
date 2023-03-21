package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.w;

/* compiled from: JvmActuals.jvm.kt */
public final class q0 {
    public static final String a(Object obj, String str) {
        p.j(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        w wVar = w.f25697a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        p.i(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}

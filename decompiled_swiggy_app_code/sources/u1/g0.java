package u1;

import android.os.Build;
import kotlin.jvm.internal.p;

/* compiled from: PlatformTypefaces.kt */
public final class g0 {
    public static final d0 a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new e0();
        }
        return new f0();
    }

    public static final String b(String str, v vVar) {
        p.j(str, "name");
        p.j(vVar, "fontWeight");
        int s11 = vVar.s() / 100;
        boolean z11 = true;
        if (s11 >= 0 && s11 < 2) {
            return str + "-thin";
        }
        if (2 <= s11 && s11 < 4) {
            return str + "-light";
        } else if (s11 == 4) {
            return str;
        } else {
            if (s11 == 5) {
                return str + "-medium";
            }
            if (6 <= s11 && s11 < 8) {
                return str;
            }
            if (8 > s11 || s11 >= 11) {
                z11 = false;
            }
            if (!z11) {
                return str;
            }
            return str + "-black";
        }
    }
}

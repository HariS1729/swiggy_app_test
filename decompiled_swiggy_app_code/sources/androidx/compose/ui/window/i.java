package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: SecureFlagPolicy.android.kt */
public final class i {

    /* compiled from: SecureFlagPolicy.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7877a;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            f7877a = iArr;
        }
    }

    public static final boolean a(SecureFlagPolicy secureFlagPolicy, boolean z11) {
        p.j(secureFlagPolicy, "<this>");
        int i11 = a.f7877a[secureFlagPolicy.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return z11;
        }
        throw new NoWhenBranchMatchedException();
    }
}

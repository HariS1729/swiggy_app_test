package s0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusStateImpl;
import f0.e;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FocusManager.kt */
public final class g {

    /* compiled from: FocusManager.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16571a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f16571a = iArr;
        }
    }

    /* access modifiers changed from: private */
    public static final FocusModifier c(FocusModifier focusModifier) {
        FocusModifier c11;
        switch (a.f16571a[focusModifier.i().ordinal()]) {
            case 1:
            case 2:
                return focusModifier;
            case 3:
            case 4:
                FocusModifier j = focusModifier.j();
                if (j != null && (c11 = c(j)) != null) {
                    return c11;
                }
                throw new IllegalStateException("no child".toString());
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    public static final void d(FocusModifier focusModifier) {
        FocusPropertiesKt.d(focusModifier);
        e<FocusModifier> e11 = focusModifier.e();
        int m11 = e11.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = e11.l();
            do {
                d((FocusModifier) l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }
}

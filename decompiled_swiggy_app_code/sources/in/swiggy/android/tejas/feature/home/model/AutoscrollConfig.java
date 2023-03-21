package in.swiggy.android.tejas.feature.home.model;

import kotlin.jvm.internal.i;

/* compiled from: AutoscrollConfig.kt */
public final class AutoscrollConfig {
    private final int durationInSec;
    private final boolean isEnabled;
    private final int resetDurationInSec;

    public AutoscrollConfig() {
        this(false, 0, 0, 7, (i) null);
    }

    public AutoscrollConfig(boolean z11, int i11, int i12) {
        this.isEnabled = z11;
        this.durationInSec = i11;
        this.resetDurationInSec = i12;
    }

    public static /* synthetic */ AutoscrollConfig copy$default(AutoscrollConfig autoscrollConfig, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = autoscrollConfig.isEnabled;
        }
        if ((i13 & 2) != 0) {
            i11 = autoscrollConfig.durationInSec;
        }
        if ((i13 & 4) != 0) {
            i12 = autoscrollConfig.resetDurationInSec;
        }
        return autoscrollConfig.copy(z11, i11, i12);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final int component2() {
        return this.durationInSec;
    }

    public final int component3() {
        return this.resetDurationInSec;
    }

    public final AutoscrollConfig copy(boolean z11, int i11, int i12) {
        return new AutoscrollConfig(z11, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoscrollConfig)) {
            return false;
        }
        AutoscrollConfig autoscrollConfig = (AutoscrollConfig) obj;
        return this.isEnabled == autoscrollConfig.isEnabled && this.durationInSec == autoscrollConfig.durationInSec && this.resetDurationInSec == autoscrollConfig.resetDurationInSec;
    }

    public final int getDurationInSec() {
        return this.durationInSec;
    }

    public final int getResetDurationInSec() {
        return this.resetDurationInSec;
    }

    public int hashCode() {
        boolean z11 = this.isEnabled;
        if (z11) {
            z11 = true;
        }
        return ((((z11 ? 1 : 0) * true) + this.durationInSec) * 31) + this.resetDurationInSec;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "AutoscrollConfig(isEnabled=" + this.isEnabled + ", durationInSec=" + this.durationInSec + ", resetDurationInSec=" + this.resetDurationInSec + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoscrollConfig(boolean z11, int i11, int i12, int i13, i iVar) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}

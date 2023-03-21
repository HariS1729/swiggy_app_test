package in.swiggy.android.tejas.feature.home.model.pageconfig;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ThemeDrop.kt */
public final class ThemeDropUpdate {
    private boolean isEnabled;
    private ThemeDrop themeDrop;

    public ThemeDropUpdate() {
        this(false, (ThemeDrop) null, 3, (i) null);
    }

    public ThemeDropUpdate(boolean z11, ThemeDrop themeDrop2) {
        this.isEnabled = z11;
        this.themeDrop = themeDrop2;
    }

    public static /* synthetic */ ThemeDropUpdate copy$default(ThemeDropUpdate themeDropUpdate, boolean z11, ThemeDrop themeDrop2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = themeDropUpdate.isEnabled;
        }
        if ((i11 & 2) != 0) {
            themeDrop2 = themeDropUpdate.themeDrop;
        }
        return themeDropUpdate.copy(z11, themeDrop2);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final ThemeDrop component2() {
        return this.themeDrop;
    }

    public final ThemeDropUpdate copy(boolean z11, ThemeDrop themeDrop2) {
        return new ThemeDropUpdate(z11, themeDrop2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeDropUpdate)) {
            return false;
        }
        ThemeDropUpdate themeDropUpdate = (ThemeDropUpdate) obj;
        return this.isEnabled == themeDropUpdate.isEnabled && p.e(this.themeDrop, themeDropUpdate.themeDrop);
    }

    public final ThemeDrop getThemeDrop() {
        return this.themeDrop;
    }

    public int hashCode() {
        boolean z11 = this.isEnabled;
        if (z11) {
            z11 = true;
        }
        int i11 = (z11 ? 1 : 0) * true;
        ThemeDrop themeDrop2 = this.themeDrop;
        return i11 + (themeDrop2 == null ? 0 : themeDrop2.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z11) {
        this.isEnabled = z11;
    }

    public final void setThemeDrop(ThemeDrop themeDrop2) {
        this.themeDrop = themeDrop2;
    }

    public String toString() {
        return "ThemeDropUpdate(isEnabled=" + this.isEnabled + ", themeDrop=" + this.themeDrop + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThemeDropUpdate(boolean z11, ThemeDrop themeDrop2, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : themeDrop2);
    }
}

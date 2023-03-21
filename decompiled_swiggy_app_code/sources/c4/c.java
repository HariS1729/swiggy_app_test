package c4;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: WebSettingsAdapter */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private WebSettingsBoundaryInterface f12816a;

    public c(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f12816a = webSettingsBoundaryInterface;
    }

    public void a(int i11) {
        this.f12816a.setForceDark(i11);
    }

    public void b(int i11) {
        this.f12816a.setForceDarkBehavior(i11);
    }
}

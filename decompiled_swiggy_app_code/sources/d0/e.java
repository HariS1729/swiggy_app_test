package d0;

import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: RippleContainer.android.kt */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<AndroidRippleIndicationInstance, g> f13809a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<g, AndroidRippleIndicationInstance> f13810b = new LinkedHashMap();

    public final AndroidRippleIndicationInstance a(g gVar) {
        p.j(gVar, "rippleHostView");
        return this.f13810b.get(gVar);
    }

    public final g b(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        p.j(androidRippleIndicationInstance, "indicationInstance");
        return this.f13809a.get(androidRippleIndicationInstance);
    }

    public final void c(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        p.j(androidRippleIndicationInstance, "indicationInstance");
        g gVar = this.f13809a.get(androidRippleIndicationInstance);
        if (gVar != null) {
            AndroidRippleIndicationInstance remove = this.f13810b.remove(gVar);
        }
        this.f13809a.remove(androidRippleIndicationInstance);
    }

    public final void d(AndroidRippleIndicationInstance androidRippleIndicationInstance, g gVar) {
        p.j(androidRippleIndicationInstance, "indicationInstance");
        p.j(gVar, "rippleHostView");
        this.f13809a.put(androidRippleIndicationInstance, gVar);
        this.f13810b.put(gVar, androidRippleIndicationInstance);
    }
}

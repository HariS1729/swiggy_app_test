package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.p;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements o {

    /* renamed from: a  reason: collision with root package name */
    private final SavedStateHandlesProvider f10685a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        p.j(savedStateHandlesProvider, "provider");
        this.f10685a = savedStateHandlesProvider;
    }

    public void b(r rVar, Lifecycle.Event event) {
        p.j(rVar, "source");
        p.j(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            rVar.getLifecycle().c(this);
            this.f10685a.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}

package in.swiggy.android.swiggylocation.utils.eventmanager.interfaces;

import java.io.Serializable;
import kotlin.jvm.internal.p;

/* compiled from: LocationEventSource.kt */
public final class LocationEventSource implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f18930a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18931b;

    public LocationEventSource(String str, String str2) {
        p.j(str, "cartId");
        p.j(str2, "orderId");
        this.f18930a = str;
        this.f18931b = str2;
    }
}

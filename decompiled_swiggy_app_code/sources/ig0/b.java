package ig0;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DiscardLocationUtil.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18416a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static List<Location> f18417b;

    /* renamed from: c  reason: collision with root package name */
    private static List<Location> f18418c;

    private b() {
    }

    public static final void a(Location location) {
        List<Location> list;
        if (f18418c == null) {
            f18418c = new ArrayList();
        }
        if (location != null) {
            boolean z11 = true;
            if (!(location.getLatitude() == 0.0d)) {
                if (location.getLongitude() != 0.0d) {
                    z11 = false;
                }
                if (!z11 && (list = f18418c) != null) {
                    list.add(location);
                }
            }
        }
    }

    public static final void b(Location location) {
        List<Location> list;
        if (f18417b == null) {
            f18417b = new ArrayList();
        }
        if (location != null) {
            boolean z11 = true;
            if (!(location.getLatitude() == 0.0d)) {
                if (location.getLongitude() != 0.0d) {
                    z11 = false;
                }
                if (!z11 && (list = f18417b) != null) {
                    list.add(location);
                }
            }
        }
    }

    public static final void c() {
        List<Location> list = f18417b;
        if (list != null) {
            list.clear();
        }
        List<Location> list2 = f18418c;
        if (list2 != null) {
            list2.clear();
        }
    }

    public final List<Location> d() {
        return f18418c;
    }

    public final List<Location> e() {
        return f18417b;
    }
}

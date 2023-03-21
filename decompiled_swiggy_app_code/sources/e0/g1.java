package e0;

import android.os.Trace;
import kotlin.jvm.internal.p;

/* compiled from: ActualAndroid.android.kt */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final g1 f14182a = new g1();

    private g1() {
    }

    public final Object a(String str) {
        p.j(str, "name");
        Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}

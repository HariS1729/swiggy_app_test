package c7;

import android.os.SystemClock;
import java.io.File;
import kotlin.jvm.internal.p;

/* compiled from: HardwareBitmaps.kt */
final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12863a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final File f12864b = new File("/proc/self/fd");

    /* renamed from: c  reason: collision with root package name */
    private static int f12865c = 30;

    /* renamed from: d  reason: collision with root package name */
    private static long f12866d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f12867e = true;

    private l() {
    }

    private final boolean a() {
        int i11 = f12865c;
        f12865c = i11 + 1;
        return i11 >= 30 || SystemClock.uptimeMillis() > f12866d + ((long) 30000);
    }

    public final synchronized boolean b(q qVar) {
        if (a()) {
            boolean z11 = false;
            f12865c = 0;
            f12866d = SystemClock.uptimeMillis();
            String[] list = f12864b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            if (length < 800) {
                z11 = true;
            }
            f12867e = z11;
            if (!z11) {
                if (qVar != null) {
                    if (qVar.getLevel() <= 5) {
                        qVar.a("FileDescriptorCounter", 5, p.s("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", Integer.valueOf(length)), (Throwable) null);
                    }
                }
            }
        }
        return f12867e;
    }
}

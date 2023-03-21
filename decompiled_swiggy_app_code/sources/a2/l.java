package a2;

import kotlin.jvm.internal.i;

/* compiled from: TextOverflow.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f950a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f951b = c(1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f952c = c(2);

    /* renamed from: d  reason: collision with root package name */
    private static final int f953d = c(3);

    /* compiled from: TextOverflow.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return l.f951b;
        }

        public final int b() {
            return l.f952c;
        }
    }

    public static int c(int i11) {
        return i11;
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return i11;
    }

    public static String f(int i11) {
        if (d(i11, f951b)) {
            return "Clip";
        }
        if (d(i11, f952c)) {
            return "Ellipsis";
        }
        return d(i11, f953d) ? "Visible" : "Invalid";
    }
}

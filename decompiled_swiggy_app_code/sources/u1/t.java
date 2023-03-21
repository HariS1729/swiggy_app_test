package u1;

import kotlin.jvm.internal.i;
import org.apache.fontbox.afm.AFMParser;

/* compiled from: FontSynthesis.kt */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16943b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16944c = f(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16945d = f(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16946e = f(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f16947f = f(3);

    /* renamed from: a  reason: collision with root package name */
    private final int f16948a;

    /* compiled from: FontSynthesis.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return t.f16945d;
        }

        public final int b() {
            return t.f16944c;
        }

        public final int c() {
            return t.f16947f;
        }

        public final int d() {
            return t.f16946e;
        }
    }

    private /* synthetic */ t(int i11) {
        this.f16948a = i11;
    }

    public static final /* synthetic */ t e(int i11) {
        return new t(i11);
    }

    public static int f(int i11) {
        return i11;
    }

    public static boolean g(int i11, Object obj) {
        return (obj instanceof t) && i11 == ((t) obj).m();
    }

    public static final boolean h(int i11, int i12) {
        return i11 == i12;
    }

    public static int i(int i11) {
        return i11;
    }

    public static final boolean j(int i11) {
        return h(i11, f16945d) || h(i11, f16947f);
    }

    public static final boolean k(int i11) {
        return h(i11, f16945d) || h(i11, f16946e);
    }

    public static String l(int i11) {
        if (h(i11, f16944c)) {
            return "None";
        }
        if (h(i11, f16945d)) {
            return "All";
        }
        if (h(i11, f16946e)) {
            return AFMParser.WEIGHT;
        }
        return h(i11, f16947f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f16948a, obj);
    }

    public int hashCode() {
        return i(this.f16948a);
    }

    public final /* synthetic */ int m() {
        return this.f16948a;
    }

    public String toString() {
        return l(this.f16948a);
    }
}

package u0;

import kotlin.jvm.internal.i;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine;

/* compiled from: StrokeCap.kt */
public final class l1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16824b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16825c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16826d = e(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16827e = e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f16828a;

    /* compiled from: StrokeCap.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return l1.f16825c;
        }

        public final int b() {
            return l1.f16826d;
        }

        public final int c() {
            return l1.f16827e;
        }
    }

    private /* synthetic */ l1(int i11) {
        this.f16828a = i11;
    }

    public static final /* synthetic */ l1 d(int i11) {
        return new l1(i11);
    }

    public static int e(int i11) {
        return i11;
    }

    public static boolean f(int i11, Object obj) {
        return (obj instanceof l1) && i11 == ((l1) obj).j();
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return i11;
    }

    public static String i(int i11) {
        if (g(i11, f16825c)) {
            return PDAnnotationLine.LE_BUTT;
        }
        if (g(i11, f16826d)) {
            return "Round";
        }
        return g(i11, f16827e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return f(this.f16828a, obj);
    }

    public int hashCode() {
        return h(this.f16828a);
    }

    public final /* synthetic */ int j() {
        return this.f16828a;
    }

    public String toString() {
        return i(this.f16828a);
    }
}

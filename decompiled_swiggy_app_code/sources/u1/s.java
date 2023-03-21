package u1;

import kotlin.jvm.internal.i;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: FontStyle.kt */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16939b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16940c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16941d = d(1);

    /* renamed from: a  reason: collision with root package name */
    private final int f16942a;

    /* compiled from: FontStyle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return s.f16941d;
        }

        public final int b() {
            return s.f16940c;
        }
    }

    private /* synthetic */ s(int i11) {
        this.f16942a = i11;
    }

    public static final /* synthetic */ s c(int i11) {
        return new s(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof s) && i11 == ((s) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f16940c)) {
            return PDLayoutAttributeObject.LINE_HEIGHT_NORMAL;
        }
        return f(i11, f16941d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.f16942a, obj);
    }

    public int hashCode() {
        return g(this.f16942a);
    }

    public final /* synthetic */ int i() {
        return this.f16942a;
    }

    public String toString() {
        return h(this.f16942a);
    }
}

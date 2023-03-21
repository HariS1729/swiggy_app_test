package v1;

import kotlin.jvm.internal.i;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;

/* compiled from: KeyboardType.kt */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17183a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f17184b = j(1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f17185c = j(2);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f17186d = j(3);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f17187e = j(4);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f17188f = j(5);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f17189g = j(6);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f17190h = j(7);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f17191i = j(8);
    /* access modifiers changed from: private */
    public static final int j = j(9);

    /* compiled from: KeyboardType.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return r.f17185c;
        }

        public final int b() {
            return r.j;
        }

        public final int c() {
            return r.f17189g;
        }

        public final int d() {
            return r.f17186d;
        }

        public final int e() {
            return r.f17191i;
        }

        public final int f() {
            return r.f17190h;
        }

        public final int g() {
            return r.f17187e;
        }

        public final int h() {
            return r.f17184b;
        }

        public final int i() {
            return r.f17188f;
        }
    }

    public static int j(int i11) {
        return i11;
    }

    public static final boolean k(int i11, int i12) {
        return i11 == i12;
    }

    public static int l(int i11) {
        return i11;
    }

    public static String m(int i11) {
        if (k(i11, f17184b)) {
            return "Text";
        }
        if (k(i11, f17185c)) {
            return "Ascii";
        }
        if (k(i11, f17186d)) {
            return "Number";
        }
        if (k(i11, f17187e)) {
            return "Phone";
        }
        if (k(i11, f17188f)) {
            return "Uri";
        }
        if (k(i11, f17189g)) {
            return "Email";
        }
        if (k(i11, f17190h)) {
            return "Password";
        }
        if (k(i11, f17191i)) {
            return "NumberPassword";
        }
        return k(i11, j) ? PDListAttributeObject.LIST_NUMBERING_DECIMAL : "Invalid";
    }
}

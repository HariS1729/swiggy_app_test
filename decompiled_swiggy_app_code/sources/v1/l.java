package v1;

import kotlin.jvm.internal.i;

/* compiled from: ImeAction.kt */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17134b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f17135c = j(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f17136d = j(0);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f17137e = j(2);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f17138f = j(3);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f17139g = j(4);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f17140h = j(5);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f17141i = j(6);
    /* access modifiers changed from: private */
    public static final int j = j(7);

    /* renamed from: a  reason: collision with root package name */
    private final int f17142a;

    /* compiled from: ImeAction.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return l.f17135c;
        }

        public final int b() {
            return l.j;
        }

        public final int c() {
            return l.f17137e;
        }

        public final int d() {
            return l.f17141i;
        }

        public final int e() {
            return l.f17136d;
        }

        public final int f() {
            return l.f17140h;
        }

        public final int g() {
            return l.f17138f;
        }

        public final int h() {
            return l.f17139g;
        }
    }

    private /* synthetic */ l(int i11) {
        this.f17142a = i11;
    }

    public static final /* synthetic */ l i(int i11) {
        return new l(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof l) && i11 == ((l) obj).o();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return i11;
    }

    public static String n(int i11) {
        if (l(i11, f17136d)) {
            return "None";
        }
        if (l(i11, f17135c)) {
            return "Default";
        }
        if (l(i11, f17137e)) {
            return "Go";
        }
        if (l(i11, f17138f)) {
            return "Search";
        }
        if (l(i11, f17139g)) {
            return "Send";
        }
        if (l(i11, f17140h)) {
            return "Previous";
        }
        if (l(i11, f17141i)) {
            return "Next";
        }
        return l(i11, j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return k(this.f17142a, obj);
    }

    public int hashCode() {
        return m(this.f17142a);
    }

    public final /* synthetic */ int o() {
        return this.f17142a;
    }

    public String toString() {
        return n(this.f17142a);
    }
}

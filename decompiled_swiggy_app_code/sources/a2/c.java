package a2;

import kotlin.jvm.internal.i;

/* compiled from: LineHeightStyle.kt */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f893c = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final c f894d = new c(a.f897a.a(), C0002c.f902a.a(), (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f895a;

    /* renamed from: b  reason: collision with root package name */
    private final int f896b;

    /* compiled from: LineHeightStyle.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0001a f897a = new C0001a((i) null);

        /* renamed from: b  reason: collision with root package name */
        private static final int f898b = b(0);

        /* renamed from: c  reason: collision with root package name */
        private static final int f899c = b(50);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f900d = b(-1);

        /* renamed from: e  reason: collision with root package name */
        private static final int f901e = b(100);

        /* renamed from: a2.c$a$a  reason: collision with other inner class name */
        /* compiled from: LineHeightStyle.kt */
        public static final class C0001a {
            private C0001a() {
            }

            public /* synthetic */ C0001a(i iVar) {
                this();
            }

            public final int a() {
                return a.f900d;
            }
        }

        private static int b(int i11) {
            boolean z11 = true;
            if (!(i11 >= 0 && i11 < 101) && i11 != -1) {
                z11 = false;
            }
            if (z11) {
                return i11;
            }
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }

        public static final boolean c(int i11, int i12) {
            return i11 == i12;
        }

        public static int d(int i11) {
            return i11;
        }

        public static String e(int i11) {
            if (i11 == f898b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (i11 == f899c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (i11 == f900d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (i11 == f901e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + i11 + ')';
        }
    }

    /* compiled from: LineHeightStyle.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        public final c a() {
            return c.f894d;
        }
    }

    /* renamed from: a2.c$c  reason: collision with other inner class name */
    /* compiled from: LineHeightStyle.kt */
    public static final class C0002c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f902a = new a((i) null);

        /* renamed from: b  reason: collision with root package name */
        private static final int f903b = b(1);

        /* renamed from: c  reason: collision with root package name */
        private static final int f904c = b(16);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f905d = b(17);

        /* renamed from: e  reason: collision with root package name */
        private static final int f906e = b(0);

        /* renamed from: a2.c$c$a */
        /* compiled from: LineHeightStyle.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }

            public final int a() {
                return C0002c.f905d;
            }
        }

        private static int b(int i11) {
            return i11;
        }

        public static final boolean c(int i11, int i12) {
            return i11 == i12;
        }

        public static int d(int i11) {
            return i11;
        }

        public static final boolean e(int i11) {
            return (i11 & 1) > 0;
        }

        public static final boolean f(int i11) {
            return (i11 & 16) > 0;
        }

        public static String g(int i11) {
            if (i11 == f903b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i11 == f904c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i11 == f905d) {
                return "LineHeightStyle.Trim.Both";
            }
            return i11 == f906e ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    private c(int i11, int i12) {
        this.f895a = i11;
        this.f896b = i12;
    }

    public /* synthetic */ c(int i11, int i12, i iVar) {
        this(i11, i12);
    }

    public final int b() {
        return this.f895a;
    }

    public final int c() {
        return this.f896b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return a.c(this.f895a, cVar.f895a) && C0002c.c(this.f896b, cVar.f896b);
    }

    public int hashCode() {
        return (a.d(this.f895a) * 31) + C0002c.d(this.f896b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + a.e(this.f895a) + ", trim=" + C0002c.g(this.f896b) + ')';
    }
}

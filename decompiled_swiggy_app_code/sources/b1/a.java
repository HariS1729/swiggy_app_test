package b1;

import kotlin.jvm.internal.i;

/* compiled from: InputModeManager.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0099a f12567b = new C0099a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f12568c = d(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f12569d = d(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f12570a;

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* compiled from: InputModeManager.kt */
    public static final class C0099a {
        private C0099a() {
        }

        public /* synthetic */ C0099a(i iVar) {
            this();
        }

        public final int a() {
            return a.f12569d;
        }

        public final int b() {
            return a.f12568c;
        }
    }

    private /* synthetic */ a(int i11) {
        this.f12570a = i11;
    }

    public static final /* synthetic */ a c(int i11) {
        return new a(i11);
    }

    public static int d(int i11) {
        return i11;
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof a) && i11 == ((a) obj).i();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f12568c)) {
            return "Touch";
        }
        return f(i11, f12569d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f12570a, obj);
    }

    public int hashCode() {
        return g(this.f12570a);
    }

    public final /* synthetic */ int i() {
        return this.f12570a;
    }

    public String toString() {
        return h(this.f12570a);
    }
}

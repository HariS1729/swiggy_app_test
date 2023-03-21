package androidx.core.text;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f9401a = new C0045e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f9402b = new C0045e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f9403c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f9404d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f9405e = new C0045e(a.f9407b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final d f9406f = f.f9412b;

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f9407b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f9408a;

        private a(boolean z11) {
            this.f9408a = z11;
        }

        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int a11 = e.a(Character.getDirectionality(charSequence.charAt(i11)));
                if (a11 != 0) {
                    if (a11 != 1) {
                        continue;
                        i11++;
                    } else if (!this.f9408a) {
                        return 1;
                    }
                } else if (this.f9408a) {
                    return 0;
                }
                z11 = true;
                i11++;
            }
            if (z11) {
                return this.f9408a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f9409a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int i14 = 2;
            while (i11 < i13 && i14 == 2) {
                i14 = e.b(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return i14;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private interface c {
        int a(CharSequence charSequence, int i11, int i12);
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class d implements d {

        /* renamed from: a  reason: collision with root package name */
        private final c f9410a;

        d(c cVar) {
            this.f9410a = cVar;
        }

        private boolean c(CharSequence charSequence, int i11, int i12) {
            int a11 = this.f9410a.a(charSequence, i11, i12);
            if (a11 == 0) {
                return true;
            }
            if (a11 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i11, int i12) {
            if (charSequence == null || i11 < 0 || i12 < 0 || charSequence.length() - i12 < i11) {
                throw new IllegalArgumentException();
            } else if (this.f9410a == null) {
                return b();
            } else {
                return c(charSequence, i11, i12);
            }
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: androidx.core.text.e$e  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C0045e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f9411b;

        C0045e(c cVar, boolean z11) {
            super(cVar);
            this.f9411b = z11;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f9411b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f9412b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return f.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f9409a;
        f9403c = new C0045e(bVar, false);
        f9404d = new C0045e(bVar, true);
    }

    static int a(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

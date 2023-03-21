package p1;

import kotlin.jvm.internal.i;

/* compiled from: Placeholder.kt */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16157a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f16158b = h(1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f16159c = h(2);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f16160d = h(3);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f16161e = h(4);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f16162f = h(5);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f16163g = h(6);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f16164h = h(7);

    /* compiled from: Placeholder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return p.f16158b;
        }

        public final int b() {
            return p.f16160d;
        }

        public final int c() {
            return p.f16161e;
        }

        public final int d() {
            return p.f16163g;
        }

        public final int e() {
            return p.f16164h;
        }

        public final int f() {
            return p.f16162f;
        }

        public final int g() {
            return p.f16159c;
        }
    }

    public static int h(int i11) {
        return i11;
    }

    public static final boolean i(int i11, int i12) {
        return i11 == i12;
    }

    public static int j(int i11) {
        return i11;
    }

    public static String k(int i11) {
        if (i(i11, f16158b)) {
            return "AboveBaseline";
        }
        if (i(i11, f16159c)) {
            return "Top";
        }
        if (i(i11, f16160d)) {
            return "Bottom";
        }
        if (i(i11, f16161e)) {
            return "Center";
        }
        if (i(i11, f16162f)) {
            return "TextTop";
        }
        if (i(i11, f16163g)) {
            return "TextBottom";
        }
        return i(i11, f16164h) ? "TextCenter" : "Invalid";
    }
}

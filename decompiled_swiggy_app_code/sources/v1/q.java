package v1;

import kotlin.jvm.internal.i;
import org.apache.fontbox.afm.AFMParser;

/* compiled from: KeyboardCapitalization.kt */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17178a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int f17179b = e(0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f17180c = e(1);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int f17181d = e(2);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f17182e = e(3);

    /* compiled from: KeyboardCapitalization.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int a() {
            return q.f17180c;
        }

        public final int b() {
            return q.f17179b;
        }

        public final int c() {
            return q.f17182e;
        }

        public final int d() {
            return q.f17181d;
        }
    }

    public static int e(int i11) {
        return i11;
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static int g(int i11) {
        return i11;
    }

    public static String h(int i11) {
        if (f(i11, f17179b)) {
            return "None";
        }
        if (f(i11, f17180c)) {
            return AFMParser.CHARACTERS;
        }
        if (f(i11, f17181d)) {
            return "Words";
        }
        return f(i11, f17182e) ? "Sentences" : "Invalid";
    }
}

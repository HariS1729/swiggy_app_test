package p1;

import a0.h;
import kotlin.jvm.internal.i;

/* compiled from: AndroidTextStyle.android.kt */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16165b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final q f16166c = new q();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16167a;

    /* compiled from: AndroidTextStyle.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final q a() {
            return q.f16166c;
        }
    }

    public q(boolean z11) {
        this.f16167a = z11;
    }

    public final boolean b() {
        return this.f16167a;
    }

    public final q c(q qVar) {
        return qVar == null ? this : qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f16167a == ((q) obj).f16167a;
    }

    public int hashCode() {
        return h.a(this.f16167a);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f16167a + ')';
    }

    public q() {
        this(true);
    }
}

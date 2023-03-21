package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AccessibilityIterators.android.kt */
public final class g extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7302d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7303e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static g f7304f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f7305c;

    /* compiled from: AccessibilityIterators.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final g a(Locale locale) {
            p.j(locale, "locale");
            if (g.f7304f == null) {
                g.f7304f = new g(locale, (i) null);
            }
            g g11 = g.f7304f;
            Objects.requireNonNull(g11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return g11;
        }
    }

    private g(Locale locale) {
        l(locale);
    }

    public /* synthetic */ g(Locale locale, i iVar) {
        this(locale);
    }

    private final boolean i(int i11) {
        return i11 > 0 && j(i11 + -1) && (i11 == d().length() || !j(i11));
    }

    private final boolean j(int i11) {
        if (i11 < 0 || i11 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i11));
    }

    private final boolean k(int i11) {
        if (!j(i11) || (i11 != 0 && j(i11 - 1))) {
            return false;
        }
        return true;
    }

    private final void l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        p.i(wordInstance, "getWordInstance(locale)");
        this.f7305c = wordInstance;
    }

    public int[] a(int i11) {
        if (d().length() <= 0 || i11 >= d().length()) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (!j(i11) && !k(i11)) {
            BreakIterator breakIterator = this.f7305c;
            if (breakIterator == null) {
                p.B("impl");
                breakIterator = null;
            }
            i11 = breakIterator.following(i11);
            if (i11 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f7305c;
        if (breakIterator2 == null) {
            p.B("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i11);
        if (following == -1 || !i(following)) {
            return null;
        }
        return c(i11, following);
    }

    public int[] b(int i11) {
        int length = d().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        while (i11 > 0 && !j(i11 - 1) && !i(i11)) {
            BreakIterator breakIterator = this.f7305c;
            if (breakIterator == null) {
                p.B("impl");
                breakIterator = null;
            }
            i11 = breakIterator.preceding(i11);
            if (i11 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f7305c;
        if (breakIterator2 == null) {
            p.B("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i11);
        if (preceding == -1 || !k(preceding)) {
            return null;
        }
        return c(preceding, i11);
    }

    public void e(String str) {
        p.j(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f7305c;
        if (breakIterator == null) {
            p.B("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}

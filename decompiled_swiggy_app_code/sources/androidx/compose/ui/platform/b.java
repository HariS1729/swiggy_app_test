package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AccessibilityIterators.android.kt */
public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f7269d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f7270e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static b f7271f;

    /* renamed from: c  reason: collision with root package name */
    private BreakIterator f7272c;

    /* compiled from: AccessibilityIterators.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final b a(Locale locale) {
            p.j(locale, "locale");
            if (b.f7271f == null) {
                b.f7271f = new b(locale, (i) null);
            }
            b g11 = b.f7271f;
            Objects.requireNonNull(g11, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return g11;
        }
    }

    private b(Locale locale) {
        i(locale);
    }

    public /* synthetic */ b(Locale locale, i iVar) {
        this(locale);
    }

    private final void i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        p.i(characterInstance, "getCharacterInstance(locale)");
        this.f7272c = characterInstance;
    }

    public int[] a(int i11) {
        int length = d().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        do {
            BreakIterator breakIterator = this.f7272c;
            if (breakIterator == null) {
                p.B("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i11)) {
                BreakIterator breakIterator2 = this.f7272c;
                if (breakIterator2 == null) {
                    p.B("impl");
                    breakIterator2 = null;
                }
                i11 = breakIterator2.following(i11);
            } else {
                BreakIterator breakIterator3 = this.f7272c;
                if (breakIterator3 == null) {
                    p.B("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i11);
                if (following == -1) {
                    return null;
                }
                return c(i11, following);
            }
        } while (i11 != -1);
        return null;
    }

    public int[] b(int i11) {
        int length = d().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        do {
            BreakIterator breakIterator = this.f7272c;
            if (breakIterator == null) {
                p.B("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i11)) {
                BreakIterator breakIterator2 = this.f7272c;
                if (breakIterator2 == null) {
                    p.B("impl");
                    breakIterator2 = null;
                }
                i11 = breakIterator2.preceding(i11);
            } else {
                BreakIterator breakIterator3 = this.f7272c;
                if (breakIterator3 == null) {
                    p.B("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i11);
                if (preceding == -1) {
                    return null;
                }
                return c(preceding, i11);
            }
        } while (i11 != -1);
        return null;
    }

    public void e(String str) {
        p.j(str, "text");
        super.e(str);
        BreakIterator breakIterator = this.f7272c;
        if (breakIterator == null) {
            p.B("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }
}

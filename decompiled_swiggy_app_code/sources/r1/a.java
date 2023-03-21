package r1;

import java.util.Locale;
import kotlin.jvm.internal.p;

/* compiled from: WordBoundary.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f16425a;

    public a(Locale locale, CharSequence charSequence) {
        p.j(locale, "locale");
        p.j(charSequence, "text");
        this.f16425a = new b(charSequence, 0, charSequence.length(), locale);
    }

    public final int a(int i11) {
        int i12;
        if (this.f16425a.i(this.f16425a.n(i11))) {
            i12 = this.f16425a.g(i11);
        } else {
            i12 = this.f16425a.d(i11);
        }
        return i12 == -1 ? i11 : i12;
    }

    public final int b(int i11) {
        int i12;
        if (this.f16425a.k(this.f16425a.o(i11))) {
            i12 = this.f16425a.f(i11);
        } else {
            i12 = this.f16425a.e(i11);
        }
        return i12 == -1 ? i11 : i12;
    }
}

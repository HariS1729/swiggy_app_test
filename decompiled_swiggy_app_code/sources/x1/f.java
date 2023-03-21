package x1;

import kotlin.jvm.internal.p;
import p1.s;
import w1.a;
import w1.g;

/* compiled from: AndroidStringDelegate.android.kt */
public final class f implements s {
    public String a(String str, g gVar) {
        p.j(str, "string");
        p.j(gVar, "locale");
        String upperCase = str.toUpperCase(((a) gVar).b());
        p.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}

package y1;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.p;
import w1.e;
import w1.f;
import x1.h;

/* compiled from: LocaleExtensions.android.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18009a = new b();

    private b() {
    }

    public final Object a(f fVar) {
        p.j(fVar, "localeList");
        ArrayList arrayList = new ArrayList(l.u(fVar, 10));
        Iterator it2 = fVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.a((e) it2.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(h hVar, f fVar) {
        p.j(hVar, "textPaint");
        p.j(fVar, "localeList");
        ArrayList arrayList = new ArrayList(l.u(fVar, 10));
        Iterator it2 = fVar.iterator();
        while (it2.hasNext()) {
            arrayList.add(a.a((e) it2.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        hVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

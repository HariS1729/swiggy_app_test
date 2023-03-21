package androidx.datastore.preferences.core;

import b3.a;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Preferences.kt */
final class MutablePreferences$toString$1 extends Lambda implements l<Map.Entry<a.C0100a<?>, Object>, CharSequence> {

    /* renamed from: a  reason: collision with root package name */
    public static final MutablePreferences$toString$1 f9888a = new MutablePreferences$toString$1();

    MutablePreferences$toString$1() {
        super(1);
    }

    /* renamed from: a */
    public final CharSequence invoke(Map.Entry<a.C0100a<?>, Object> entry) {
        p.j(entry, "entry");
        return "  " + entry.getKey().a() + " = " + entry.getValue();
    }
}

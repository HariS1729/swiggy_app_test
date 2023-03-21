package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;
import tp0.e;

/* compiled from: InspectableValue.kt */
public final class k1 implements e<j1> {

    /* renamed from: a  reason: collision with root package name */
    private final List<j1> f7318a = new ArrayList();

    public final void b(String str, Object obj) {
        p.j(str, "name");
        this.f7318a.add(new j1(str, obj));
    }

    public Iterator<j1> iterator() {
        return this.f7318a.iterator();
    }
}

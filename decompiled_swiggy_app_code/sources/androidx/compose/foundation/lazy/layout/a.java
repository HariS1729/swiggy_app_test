package androidx.compose.foundation.lazy.layout;

import i1.k0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: LazyLayout.kt */
final class a implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final LazyLayoutItemContentFactory f4136a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, Integer> f4137b = new LinkedHashMap();

    public a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        p.j(lazyLayoutItemContentFactory, "factory");
        this.f4136a = lazyLayoutItemContentFactory;
    }

    public void a(k0.a aVar) {
        p.j(aVar, "slotIds");
        this.f4137b.clear();
        Iterator<Object> it2 = aVar.iterator();
        while (it2.hasNext()) {
            Object c11 = this.f4136a.c(it2.next());
            Integer num = this.f4137b.get(c11);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it2.remove();
            } else {
                this.f4137b.put(c11, Integer.valueOf(intValue + 1));
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return p.e(this.f4136a.c(obj), this.f4136a.c(obj2));
    }
}

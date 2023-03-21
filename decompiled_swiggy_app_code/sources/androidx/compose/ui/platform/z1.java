package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: Wrapper.android.kt */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final z1 f7401a = new z1();

    private z1() {
    }

    public final Map<Integer, Integer> a(View view) {
        p.j(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        p.i(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}

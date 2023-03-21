package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$Companion$Saver$2 extends Lambda implements l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaveableStateHolderImpl$Companion$Saver$2 f6196a = new SaveableStateHolderImpl$Companion$Saver$2();

    SaveableStateHolderImpl$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: a */
    public final SaveableStateHolderImpl invoke(Map<Object, Map<String, List<Object>>> map) {
        p.j(map, "it");
        return new SaveableStateHolderImpl(map);
    }
}

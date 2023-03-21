package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$Companion$Saver$1 extends Lambda implements p<d, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SaveableStateHolderImpl$Companion$Saver$1 f6195a = new SaveableStateHolderImpl$Companion$Saver$1();

    SaveableStateHolderImpl$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Map<Object, Map<String, List<Object>>> invoke(d dVar, SaveableStateHolderImpl saveableStateHolderImpl) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(saveableStateHolderImpl, "it");
        return saveableStateHolderImpl.g();
    }
}

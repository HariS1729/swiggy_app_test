package androidx.work;

import androidx.work.b;
import d4.f;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends f {
    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        for (b j : list) {
            hashMap.putAll(j.j());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}

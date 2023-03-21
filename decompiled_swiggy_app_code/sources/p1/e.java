package p1;

import java.util.ArrayList;
import java.util.List;
import p1.b;

/* compiled from: MultiParagraphIntrinsics.kt */
public final class e {
    /* access modifiers changed from: private */
    public static final List<b.C0163b<o>> b(List<b.C0163b<o>> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            b.C0163b<o> bVar = list.get(i13);
            b.C0163b bVar2 = bVar;
            if (c.i(i11, i12, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            b.C0163b bVar3 = (b.C0163b) arrayList.get(i14);
            if (i11 <= bVar3.f() && bVar3.d() <= i12) {
                arrayList2.add(new b.C0163b(bVar3.e(), bVar3.f() - i11, bVar3.d() - i11));
                i14++;
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}

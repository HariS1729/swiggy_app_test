package y0;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ImageVector.kt */
final class g<T> {
    public static <T> ArrayList<T> a(ArrayList<T> arrayList) {
        p.j(arrayList, "backing");
        return arrayList;
    }

    public static /* synthetic */ ArrayList b(ArrayList arrayList, int i11, i iVar) {
        if ((i11 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return a(arrayList);
    }

    public static final int c(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    public static final T d(ArrayList<T> arrayList) {
        return arrayList.get(c(arrayList) - 1);
    }

    public static final T e(ArrayList<T> arrayList) {
        return arrayList.remove(c(arrayList) - 1);
    }

    public static final boolean f(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}

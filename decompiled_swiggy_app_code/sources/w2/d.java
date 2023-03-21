package w2;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ListenerUtil */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> f17454a = new SparseArray<>();

    public static <T> T a(View view, T t, int i11) {
        T tag = view.getTag(i11);
        view.setTag(i11, t);
        return tag;
    }
}

package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private SparseIntArray f8893a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f8894b = new HashMap<>();

    /* compiled from: SharedValues */
    public interface a {
    }

    public void a(int i11, a aVar) {
        HashSet hashSet = this.f8894b.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f8894b.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}

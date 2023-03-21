package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f9731a = new SparseIntArray(0);

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final SparseArray<String> f9732a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f9732a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f9733a = new HashMap<>(0);
    }

    public List<e> collectDependencies() {
        return new ArrayList(0);
    }

    public String convertBrIdToString(int i11) {
        return a.f9732a.get(i11);
    }

    public ViewDataBinding getDataBinder(f fVar, View view, int i11) {
        if (f9731a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f9733a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f9731a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

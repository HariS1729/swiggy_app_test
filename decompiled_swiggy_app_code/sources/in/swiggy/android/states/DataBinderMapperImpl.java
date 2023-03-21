package in.swiggy.android.states;

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
    private static final SparseIntArray f18739a = new SparseIntArray(0);

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final SparseArray<String> f18740a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f18740a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f18741a = new HashMap<>(0);
    }

    public List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commons.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i11) {
        return a.f18740a.get(i11);
    }

    public ViewDataBinding getDataBinder(f fVar, View view, int i11) {
        if (f18739a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f18741a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f18739a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

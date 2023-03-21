package in.swiggy.android.swiggylocation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.f;
import com.facebook.react.modules.appstate.AppStateModule;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f18764a = new SparseIntArray(0);

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final SparseArray<String> f18765a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(23);
            f18765a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "actionButtonClickListenerLeft");
            sparseArray.put(2, "actionButtonClickListenerRight");
            sparseArray.put(3, "actionButtonLeftVisibility");
            sparseArray.put(4, "actionButtonRightVisibility");
            sparseArray.put(5, "actionButtonText");
            sparseArray.put(6, "actionButtonTextRight");
            sparseArray.put(7, "actionHandler");
            sparseArray.put(8, "actionText");
            sparseArray.put(9, AppStateModule.APP_STATE_BACKGROUND);
            sparseArray.put(10, "clickListener");
            sparseArray.put(11, "color");
            sparseArray.put(12, "description");
            sparseArray.put(13, "drawableResId");
            sparseArray.put(14, MenuConstants.MENU_OFFER_ICON);
            sparseArray.put(15, "iconColor");
            sparseArray.put(16, "size");
            sparseArray.put(17, "subtitle");
            sparseArray.put(18, "subtitleColor");
            sparseArray.put(19, "title");
            sparseArray.put(20, "topHeaderText");
            sparseArray.put(21, "visibility");
            sparseArray.put(22, "vm");
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f18766a = new HashMap<>(0);
    }

    public List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.swiggy.lynx.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commons.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commonsui.ui.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.conductor.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.dls.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.mvvm.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.tejas.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i11) {
        return a.f18765a.get(i11);
    }

    public ViewDataBinding getDataBinder(f fVar, View view, int i11) {
        if (f18764a.get(i11) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f18766a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f18764a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

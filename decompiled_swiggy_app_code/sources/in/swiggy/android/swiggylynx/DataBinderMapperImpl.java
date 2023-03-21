package in.swiggy.android.swiggylynx;

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
import mg0.d;
import mg0.h;
import mg0.j;

public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f18932a;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final SparseArray<String> f18933a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(53);
            f18933a = sparseArray;
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
            sparseArray.put(10, "cardTextWatcher");
            sparseArray.put(11, "clickAction");
            sparseArray.put(12, "clickListener");
            sparseArray.put(13, "color");
            sparseArray.put(14, "cvvTextWatcher");
            sparseArray.put(15, "dateTextWatcher");
            sparseArray.put(16, "deImageUrl");
            sparseArray.put(17, "deImageVisibility");
            sparseArray.put(18, "description");
            sparseArray.put(19, "drawableResId");
            sparseArray.put(20, MenuConstants.MENU_OFFER_ICON);
            sparseArray.put(21, "iconColor");
            sparseArray.put(22, "iconText");
            sparseArray.put(23, "image");
            sparseArray.put(24, "imageUrl");
            sparseArray.put(25, "lineVisibility");
            sparseArray.put(26, "loader");
            sparseArray.put(27, "nameTextWatcher");
            sparseArray.put(28, "orderProcessingMessage");
            sparseArray.put(29, "orderProcessingTitle");
            sparseArray.put(30, "orderSuccessMessage");
            sparseArray.put(31, "orderSuccessTitle");
            sparseArray.put(32, "progress");
            sparseArray.put(33, "pulseVisibility");
            sparseArray.put(34, "showOrderCompletionImage");
            sparseArray.put(35, "size");
            sparseArray.put(36, "subTitleFont");
            sparseArray.put(37, "subTitleStyle");
            sparseArray.put(38, "subTitleText");
            sparseArray.put(39, "subTitleVisibility");
            sparseArray.put(40, "subtitle");
            sparseArray.put(41, "subtitleColor");
            sparseArray.put(42, "superSavingsMessage");
            sparseArray.put(43, "text");
            sparseArray.put(44, "textBg");
            sparseArray.put(45, MenuConstants.MENU_OFFER_TEXT_COLOR);
            sparseArray.put(46, "title");
            sparseArray.put(47, "titleFont");
            sparseArray.put(48, "titleStyle");
            sparseArray.put(49, "titleText");
            sparseArray.put(50, "topHeaderText");
            sparseArray.put(51, "visibility");
            sparseArray.put(52, "vm");
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f18934a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(5);
            f18934a = hashMap;
            hashMap.put("layout/custom_intent_bottomsheet_0", Integer.valueOf(R.layout.custom_intent_bottomsheet));
            hashMap.put("layout/custom_intent_item_0", Integer.valueOf(R.layout.custom_intent_item));
            hashMap.put("layout/fragment_lynx_0", Integer.valueOf(R.layout.fragment_lynx));
            hashMap.put("layout/overlay_custom_dialog_layout_0", Integer.valueOf(R.layout.overlay_custom_dialog_layout));
            hashMap.put("layout/view_handpicked_loader_0", Integer.valueOf(R.layout.view_handpicked_loader));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f18932a = sparseIntArray;
        sparseIntArray.put(R.layout.custom_intent_bottomsheet, 1);
        sparseIntArray.put(R.layout.custom_intent_item, 2);
        sparseIntArray.put(R.layout.fragment_lynx, 3);
        sparseIntArray.put(R.layout.overlay_custom_dialog_layout, 4);
        sparseIntArray.put(R.layout.view_handpicked_loader, 5);
    }

    public List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.swiggy.lynx.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.analytics.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.bottombar_kit.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commons.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commonsFeature.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.commonsui.ui.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.conductor.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.constants.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.dash.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.dashutils.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.deeplink.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.dls.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.mvvm.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.payment.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.repositories.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.swiggylocation.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.swiggylynx_kit.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.tejas.DataBinderMapperImpl());
        arrayList.add(new in.swiggy.android.web.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i11) {
        return a.f18933a.get(i11);
    }

    public ViewDataBinding getDataBinder(f fVar, View view, int i11) {
        int i12 = f18932a.get(i11);
        if (i12 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        if ("layout/view_handpicked_loader_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for view_handpicked_loader is invalid. Received: " + tag);
                    } else if ("layout/overlay_custom_dialog_layout_0".equals(tag)) {
                        return new h(fVar, view);
                    } else {
                        throw new IllegalArgumentException("The tag for overlay_custom_dialog_layout is invalid. Received: " + tag);
                    }
                } else if ("layout/fragment_lynx_0".equals(tag)) {
                    return new mg0.f(fVar, view);
                } else {
                    throw new IllegalArgumentException("The tag for fragment_lynx is invalid. Received: " + tag);
                }
            } else if ("layout/custom_intent_item_0".equals(tag)) {
                return new d(fVar, view);
            } else {
                throw new IllegalArgumentException("The tag for custom_intent_item is invalid. Received: " + tag);
            }
        } else if ("layout/custom_intent_bottomsheet_0".equals(tag)) {
            return new mg0.b(fVar, view);
        } else {
            throw new IllegalArgumentException("The tag for custom_intent_bottomsheet is invalid. Received: " + tag);
        }
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f18934a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ViewDataBinding getDataBinder(f fVar, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f18932a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}

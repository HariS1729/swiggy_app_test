package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.DishAttribute;
import i20.t;
import in.swiggy.android.tejas.oldapi.models.menu.MenuAttributes;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MenuAttributeTransformer.kt */
public final class MenuAttributeTransformer implements ITransformer<DishAttribute, MenuAttributes> {
    public MenuAttributes transform(DishAttribute dishAttribute) {
        p.j(dishAttribute, t.V);
        MenuAttributes menuAttributes = new MenuAttributes();
        menuAttributes.vegClassifier = dishAttribute.getVegClassifier();
        menuAttributes.spiceLevel = dishAttribute.getSpiceLevel();
        menuAttributes.portionSize = dishAttribute.getPortionSize();
        menuAttributes.accompaniments = dishAttribute.getAccompaniments();
        menuAttributes.allergenInfo = dishAttribute.getAllergenInfo();
        return menuAttributes;
    }
}

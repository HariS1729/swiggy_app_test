package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import com.swiggy.gandalf.widgets.v2.BottomBar;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarEntity;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarInfo;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarType;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarTransformer.kt */
public final class BottomBarTransformer implements ITransformer<BottomBar, List<? extends BottomBarEntity>> {
    private final ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> accessibilityTransformer;

    /* compiled from: BottomBarTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomBar.Options.Type.values().length];
            iArr[BottomBar.Options.Type.TYPE_EXPANDABLE_HORIZONTAL.ordinal()] = 1;
            iArr[BottomBar.Options.Type.TYPE_EXPANDABLE_VERTICAL.ordinal()] = 2;
            iArr[BottomBar.Options.Type.TYPE_INLINE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BottomBarTransformer(ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer) {
        p.j(iTransformer, "accessibilityTransformer");
        this.accessibilityTransformer = iTransformer;
    }

    private final List<BottomBarInfo> toBottomBarInfo(List<BottomBar.Options> list) {
        BottomBarType bottomBarType;
        ArrayList arrayList = new ArrayList();
        for (BottomBar.Options options : list) {
            BottomBar.Options.Type type = options.getType();
            int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i11 == 1) {
                bottomBarType = BottomBarType.TYPE_EXPANDABLE_HORIZONTAL;
            } else if (i11 == 2) {
                bottomBarType = BottomBarType.TYPE_EXPANDABLE_VERTICAL;
            } else if (i11 != 3) {
                bottomBarType = BottomBarType.TYPE_INVALID;
            } else {
                bottomBarType = BottomBarType.TYPE_INLINE;
            }
            String link = options.getCta().getLink();
            String text = options.getCta().getText();
            String type2 = options.getCta().getType();
            p.i(type2, "it.cta.type");
            CTA cta = new CTA(link, text, type2, (CtaMetaInfo) null, 8, (i) null);
            String title = options.getTitle();
            String subtitle = options.getSubtitle();
            String selectedTextColor = options.getSelectedTextColor();
            String unselectedTextColor = options.getUnselectedTextColor();
            String selectedImageId = options.getSelectedImageId();
            String unselectedImageId = options.getUnselectedImageId();
            String unselectedBackgroundColor = options.getUnselectedBackgroundColor();
            String selectedBackgroundColor = options.getSelectedBackgroundColor();
            String selectedImageTint = options.getSelectedImageTint();
            ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer = this.accessibilityTransformer;
            ImageInfoLayoutCard.Accessibility accessibility = options.getAccessibility();
            p.i(accessibility, "it.accessibility");
            BottomBarInfo bottomBarInfo = r4;
            BottomBarInfo bottomBarInfo2 = new BottomBarInfo(bottomBarType, title, subtitle, selectedTextColor, unselectedTextColor, selectedImageId, unselectedImageId, cta, (List<BottomBarInfo>) null, unselectedBackgroundColor, selectedBackgroundColor, selectedImageTint, iTransformer.transform(accessibility));
            arrayList.add(bottomBarInfo);
        }
        return arrayList;
    }

    public List<BottomBarEntity> transform(BottomBar bottomBar) {
        BottomBarType bottomBarType;
        BottomBarTransformer bottomBarTransformer = this;
        p.j(bottomBar, t.V);
        ArrayList arrayList = new ArrayList();
        List<BottomBar.Options> optionsList = bottomBar.getOptionsList();
        if (optionsList != null) {
            for (BottomBar.Options options : optionsList) {
                BottomBar.Options.Type type = options.getType();
                int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                if (i11 == 1) {
                    bottomBarType = BottomBarType.TYPE_EXPANDABLE_HORIZONTAL;
                } else if (i11 == 2) {
                    bottomBarType = BottomBarType.TYPE_EXPANDABLE_VERTICAL;
                } else if (i11 != 3) {
                    bottomBarType = BottomBarType.TYPE_INVALID;
                } else {
                    bottomBarType = BottomBarType.TYPE_INLINE;
                }
                BottomBarType bottomBarType2 = bottomBarType;
                Cta cta = options.getCta();
                String str = null;
                String link = cta == null ? null : cta.getLink();
                Cta cta2 = options.getCta();
                String text = cta2 == null ? null : cta2.getText();
                Cta cta3 = options.getCta();
                if (cta3 != null) {
                    str = cta3.getType();
                }
                CTA cta4 = new CTA(link, text, str == null ? "" : str, (CtaMetaInfo) null, 8, (i) null);
                String title = options.getTitle();
                String subtitle = options.getSubtitle();
                String selectedTextColor = options.getSelectedTextColor();
                String unselectedTextColor = options.getUnselectedTextColor();
                String selectedImageId = options.getSelectedImageId();
                String unselectedImageId = options.getUnselectedImageId();
                List<BottomBar.Options> itemsList = options.getItemsList();
                p.i(itemsList, "it.itemsList");
                List<BottomBarInfo> bottomBarInfo = bottomBarTransformer.toBottomBarInfo(itemsList);
                String unselectedBackgroundColor = options.getUnselectedBackgroundColor();
                String selectedBackgroundColor = options.getSelectedBackgroundColor();
                String selectedImageTint = options.getSelectedImageTint();
                ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer = bottomBarTransformer.accessibilityTransformer;
                ImageInfoLayoutCard.Accessibility accessibility = options.getAccessibility();
                p.i(accessibility, "it.accessibility");
                BottomBarInfo bottomBarInfo2 = r5;
                BottomBarInfo bottomBarInfo3 = new BottomBarInfo(bottomBarType2, title, subtitle, selectedTextColor, unselectedTextColor, selectedImageId, unselectedImageId, cta4, bottomBarInfo, unselectedBackgroundColor, selectedBackgroundColor, selectedImageTint, iTransformer.transform(accessibility));
                arrayList.add(new BottomBarEntity(bottomBarInfo2));
                bottomBarTransformer = this;
            }
        }
        return arrayList;
    }
}

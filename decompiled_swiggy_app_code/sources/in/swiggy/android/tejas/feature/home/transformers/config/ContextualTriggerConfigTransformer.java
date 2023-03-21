package in.swiggy.android.tejas.feature.home.transformers.config;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.ContextTriggerWidget;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.ContextualTrigger;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ContextualTriggerConfigTransformer.kt */
public final class ContextualTriggerConfigTransformer implements ITransformer<SuccessResponse.PageConfigs, List<? extends ContextualTrigger>> {
    private final String getMediaUrl(ContextTriggerWidget contextTriggerWidget) {
        ContextTriggerWidget.ContextTriggerImage contextTriggerImage;
        String imageUrl;
        if (contextTriggerWidget.getMedia().is(ContextTriggerWidget.ContextTriggerLottie.class)) {
            ContextTriggerWidget.ContextTriggerLottie contextTriggerLottie = (ContextTriggerWidget.ContextTriggerLottie) contextTriggerWidget.getMedia().unpack(ContextTriggerWidget.ContextTriggerLottie.class);
            if (contextTriggerLottie == null || (imageUrl = contextTriggerLottie.getLottieUrl()) == null) {
                return "";
            }
        } else if (!contextTriggerWidget.getMedia().is(ContextTriggerWidget.ContextTriggerImage.class) || (contextTriggerImage = (ContextTriggerWidget.ContextTriggerImage) contextTriggerWidget.getMedia().unpack(ContextTriggerWidget.ContextTriggerImage.class)) == null || (imageUrl = contextTriggerImage.getImageUrl()) == null) {
            return "";
        }
        return imageUrl;
    }

    public List<ContextualTrigger> transform(SuccessResponse.PageConfigs pageConfigs) {
        Iterator<T> it2;
        ContextTriggerWidget contextTriggerWidget;
        p.j(pageConfigs, t.V);
        ArrayList arrayList = new ArrayList();
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        p.i(configInfoList, "configInfoList");
        Iterator<T> it3 = configInfoList.iterator();
        while (it3.hasNext()) {
            Card card = (Card) it3.next();
            if (!card.getCard().is(ContextTriggerWidget.class) || (contextTriggerWidget = (ContextTriggerWidget) card.getCard().unpack(ContextTriggerWidget.class)) == null) {
                it2 = it3;
            } else {
                String id2 = contextTriggerWidget.getId();
                String str = id2;
                String text = contextTriggerWidget.getTitle().getText();
                String text2 = contextTriggerWidget.getSubTitle().getText();
                String str2 = text2;
                String text3 = contextTriggerWidget.getCollapsedTitle().getText();
                int showAfterTime = contextTriggerWidget.getShowAfterTime();
                int hideAfterSomeTime = contextTriggerWidget.getHideAfterSomeTime();
                String link = contextTriggerWidget.getCta().getLink();
                String str3 = link;
                String mediaUrl = getMediaUrl(contextTriggerWidget);
                it2 = it3;
                String str4 = id2;
                String str5 = link;
                boolean is2 = contextTriggerWidget.getMedia().is(ContextTriggerWidget.ContextTriggerLottie.class);
                String strokeColor = contextTriggerWidget.getStrokeColor();
                ArrayList arrayList2 = arrayList;
                String str6 = str;
                String fillColor = contextTriggerWidget.getFillColor();
                String str7 = text;
                String str8 = text2;
                String str9 = fillColor;
                String str10 = str2;
                String crossTintColor = contextTriggerWidget.getCrossTintColor();
                String str11 = text3;
                String str12 = text;
                String str13 = crossTintColor;
                int i11 = hideAfterSomeTime;
                String textColor = contextTriggerWidget.getTitle().getHeaderStyling().getTextColor();
                String str14 = textColor;
                int i12 = showAfterTime;
                String textColor2 = contextTriggerWidget.getSubTitle().getHeaderStyling().getTextColor();
                String str15 = textColor2;
                String str16 = str3;
                String textColor3 = contextTriggerWidget.getCollapsedTitle().getHeaderStyling().getTextColor();
                String str17 = textColor3;
                String str18 = str5;
                AccessibilityData accessibilityData = r3;
                String str19 = mediaUrl;
                String altText = contextTriggerWidget.getAccessibility().getAltText();
                p.i(altText, "trigger.accessibility.altText");
                String altTextCta = contextTriggerWidget.getAccessibility().getAltTextCta();
                p.i(altTextCta, "trigger.accessibility.altTextCta");
                AccessibilityData accessibilityData2 = new AccessibilityData(altText, altTextCta);
                String str20 = str4;
                ContextualTrigger contextualTrigger = r3;
                p.i(str20, DistributedTracing.NR_ID_ATTRIBUTE);
                p.i(str12, "text");
                p.i(str8, "text");
                p.i(text3, "text");
                p.i(str18, "link");
                p.i(strokeColor, "strokeColor");
                p.i(fillColor, "fillColor");
                p.i(crossTintColor, "crossTintColor");
                p.i(textColor, MenuConstants.MENU_OFFER_TEXT_COLOR);
                p.i(textColor2, MenuConstants.MENU_OFFER_TEXT_COLOR);
                p.i(textColor3, MenuConstants.MENU_OFFER_TEXT_COLOR);
                String str21 = str19;
                ContextualTrigger contextualTrigger2 = new ContextualTrigger(str6, str7, str10, str11, i11, i12, str16, str21, is2, strokeColor, str9, str13, str14, str15, str17, accessibilityData);
                arrayList = arrayList2;
                arrayList.add(contextualTrigger);
            }
            it3 = it2;
        }
        return arrayList;
    }
}

package in.swiggy.android.tejas.feature.launch;

import i20.t;
import in.swiggy.android.tejas.feature.launch.model.consumable.FeedbackLaunchItem;
import in.swiggy.android.tejas.feature.launch.model.consumable.LaunchItem;
import in.swiggy.android.tejas.feature.launch.model.consumable.TrackingLaunchItem;
import in.swiggy.android.tejas.feature.launch.model.network.FeedbackItem;
import in.swiggy.android.tejas.feature.launch.model.network.FeedbackResponse;
import in.swiggy.android.tejas.feature.launch.model.network.LaunchResponse;
import in.swiggy.android.tejas.feature.launch.model.network.OrderItem;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import js.c;
import kotlin.jvm.internal.p;

/* compiled from: LaunchDataTransformer.kt */
public final class LaunchDataTransformer implements ITransformer<LaunchResponse, LaunchItem> {
    public LaunchItem transform(LaunchResponse launchResponse) {
        Long orderJobId;
        p.j(launchResponse, t.V);
        OrderItem lastActiveOrder = launchResponse.getLastActiveOrder();
        if (lastActiveOrder != null) {
            return new TrackingLaunchItem(lastActiveOrder.getOrderJobId(), lastActiveOrder.getTitle(), lastActiveOrder.getSubtitle(), lastActiveOrder.getOrderType(), lastActiveOrder.getOrderState(), lastActiveOrder.getEtamins());
        }
        FeedbackResponse lastCompletedOrder = launchResponse.getLastCompletedOrder();
        if (lastCompletedOrder == null || (orderJobId = lastCompletedOrder.getOrderJobId()) == null) {
            return null;
        }
        long longValue = orderJobId.longValue();
        ArrayList arrayList = new ArrayList();
        List<FeedbackItem> feedbackItems = lastCompletedOrder.getFeedbackItems();
        if (feedbackItems != null) {
            for (FeedbackItem feedbackItem : feedbackItems) {
                c.k(feedbackItem.getTypeId(), feedbackItem.getType(), feedbackItem.getTitle(), feedbackItem.getActionTitle(), feedbackItem.getDispositionTitles(), feedbackItem.getDispositions(), new LaunchDataTransformer$transform$1$2$1$1$1(arrayList));
            }
        }
        return new FeedbackLaunchItem(longValue, lastCompletedOrder.getFeedbackTitle(), lastCompletedOrder.getFeedbackSubtitle(), arrayList);
    }
}

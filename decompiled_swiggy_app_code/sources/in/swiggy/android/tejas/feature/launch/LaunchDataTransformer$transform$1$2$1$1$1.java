package in.swiggy.android.tejas.feature.launch;

import in.swiggy.android.tejas.feature.launch.model.consumable.FeedbackItem;
import in.swiggy.android.tejas.feature.launch.model.network.Disposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import js.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.t;

/* compiled from: LaunchDataTransformer.kt */
final class LaunchDataTransformer$transform$1$2$1$1$1 extends Lambda implements t<Integer, String, String, String, Map<String, ? extends String>, List<? extends Disposition>, Boolean> {
    final /* synthetic */ ArrayList<FeedbackItem> $feedbackItems;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LaunchDataTransformer$transform$1$2$1$1$1(ArrayList<FeedbackItem> arrayList) {
        super(6);
        this.$feedbackItems = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(((Number) obj).intValue(), (String) obj2, (String) obj3, (String) obj4, (Map<String, String>) (Map) obj5, (List<Disposition>) (List) obj6);
    }

    public final Boolean invoke(int i11, String str, String str2, String str3, Map<String, String> map, List<Disposition> list) {
        p.j(str, "type");
        p.j(str2, "title");
        p.j(str3, "actionTitle");
        p.j(map, "dispositionTitles");
        p.j(list, "dispositions");
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Integer l11 = n.l((String) next.getKey());
            if (l11 != null) {
                hashMap.put(Integer.valueOf(l11.intValue()), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Disposition disposition : list) {
            c.n(disposition.getId(), disposition.getValue(), disposition.getPossibleRatings(), new LaunchDataTransformer$transform$1$2$1$1$1$2$1(arrayList));
        }
        return Boolean.valueOf(this.$feedbackItems.add(new FeedbackItem(i11, str, str2, str3, hashMap, arrayList)));
    }
}

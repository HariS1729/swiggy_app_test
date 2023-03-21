package dl0;

import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import com.swiggy.pos.service.grpc.v1.ActionType;
import com.swiggy.pos.service.grpc.v1.Button;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.MessagesMetaDataType;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackMessageTypes;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: TrackV3Extensions2.kt */
public final class d {
    public static final Messages a(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.ASSIGNMENT_DELAY_CTA_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final LotteCardInfo b(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.DELIVERY_STATUS_MESSAGE)) {
                break;
            }
        }
        Messages messages = (Messages) t;
        if (messages == null) {
            return null;
        }
        return messages.getLottieInfo();
    }

    public static final Messages c(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.OFO_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final boolean d(String str) {
        p.j(str, "<this>");
        return p.e(str, TrackOrderState.CANCELLED) || p.e(str, "delivered");
    }

    public static final Messages e(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.SELF_DELIVERY_DELIVERY_STATUS_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final String f(TrackOrderV3 trackOrderV3) {
        Map<String, String> metaMap;
        p.j(trackOrderV3, "<this>");
        Messages k = k(trackOrderV3);
        if (k == null || (metaMap = k.getMetaMap()) == null) {
            return null;
        }
        return metaMap.get(MessagesMetaDataType.PAY_ON_DELIVERY_ISSUE_ID);
    }

    public static final String g(TrackOrderV3 trackOrderV3) {
        Map<String, String> metaMap;
        p.j(trackOrderV3, "<this>");
        Messages k = k(trackOrderV3);
        if (k == null || (metaMap = k.getMetaMap()) == null) {
            return null;
        }
        return metaMap.get(MessagesMetaDataType.PAY_ON_DELIVERY_STATUS_TYPE);
    }

    public static final String h(TrackOrderV3 trackOrderV3) {
        Map<String, String> metaMap;
        p.j(trackOrderV3, "<this>");
        Messages k = k(trackOrderV3);
        if (k == null || (metaMap = k.getMetaMap()) == null) {
            return null;
        }
        return metaMap.get(MessagesMetaDataType.PAY_ON_DELIVERY_ELIGIBILITY_REASON);
    }

    public static final String i(TrackOrderV3 trackOrderV3) {
        Map<String, String> metaMap;
        p.j(trackOrderV3, "<this>");
        Messages k = k(trackOrderV3);
        if (k == null || (metaMap = k.getMetaMap()) == null) {
            return null;
        }
        return metaMap.get(MessagesMetaDataType.PAY_ON_DELIVERY_TRANSACTION_ID);
    }

    public static final Button j(List<Button> list) {
        T t;
        boolean z11;
        p.j(list, "<this>");
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_PAY_ON_DELIVERY) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        return (Button) t;
    }

    public static final Messages k(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.PAY_ON_DELIVERY_STATUS)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final LotteCardInfo l(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.PAY_ON_DELIVERY_STATUS)) {
                break;
            }
        }
        Messages messages = (Messages) t;
        if (messages == null) {
            return null;
        }
        return messages.getLottieInfo();
    }

    public static final Messages m(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        Iterator<T> it2 = messagesList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getType(), TrackMessageTypes.DELIVERY_FEE_REFUND_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }
}

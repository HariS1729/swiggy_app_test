package dl0;

import com.google.protobuf.Duration;
import com.google.type.LatLng;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.swiggy.locationplatform.centraladdressservice.v1.Address;
import com.swiggy.locationplatform.shared.v1.Location;
import com.swiggy.pos.service.grpc.v1.ActionType;
import com.swiggy.pos.service.grpc.v1.Annotation;
import com.swiggy.pos.service.grpc.v1.BatchedDestination;
import com.swiggy.pos.service.grpc.v1.Button;
import com.swiggy.pos.service.grpc.v1.Configurations;
import com.swiggy.pos.service.grpc.v1.CounterType;
import com.swiggy.pos.service.grpc.v1.CustomerDetails;
import com.swiggy.pos.service.grpc.v1.DeliveryDetails;
import com.swiggy.pos.service.grpc.v1.DeliverySpeedMode;
import com.swiggy.pos.service.grpc.v1.ETA;
import com.swiggy.pos.service.grpc.v1.Label;
import com.swiggy.pos.service.grpc.v1.LabelStyle;
import com.swiggy.pos.service.grpc.v1.Messages;
import com.swiggy.pos.service.grpc.v1.NextBasedAction;
import com.swiggy.pos.service.grpc.v1.OrderDetails;
import com.swiggy.pos.service.grpc.v1.OrderStatus;
import com.swiggy.pos.service.grpc.v1.OutletDetails;
import com.swiggy.pos.service.grpc.v1.PollingIntervals;
import com.swiggy.pos.service.grpc.v1.RatingInfo;
import com.swiggy.pos.service.grpc.v1.RatingMode;
import com.swiggy.pos.service.grpc.v1.ThankYouCard;
import com.swiggy.pos.service.grpc.v1.TipMessages;
import com.swiggy.pos.service.grpc.v1.TipOptionView;
import com.swiggy.pos.service.grpc.v1.TipWarnMessage;
import com.swiggy.pos.service.grpc.v1.TippingInfo;
import com.swiggy.pos.service.grpc.v1.TrackDeliveryPartnerResponseV3;
import com.swiggy.pos.service.grpc.v1.TrackOrderV3;
import com.swiggy.pos.service.grpc.v1.TrackServiceResponseV3;
import in.swiggy.android.dls.textview.TextColor;
import in.swiggy.android.dls.textview.TextStyle;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.ConfigExperimentDataType;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.MessagesMetaDataType;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackMessageTypes;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import in.swiggy.android.tejas.oldapi.models.tracknew.TrackOrderResponseDataNew;
import in.swiggy.android.track.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import js.c;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import tk0.b;

@Instrumented
/* compiled from: TrackV3Extensions.kt */
public final class e {

    /* compiled from: TrackV3Extensions.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20110a;

        static {
            int[] iArr = new int[LabelStyle.values().length];
            iArr[LabelStyle.LABEL_STYLE_ARRIVING_EARLY.ordinal()] = 1;
            iArr[LabelStyle.LABEL_STYLE_EARLY.ordinal()] = 2;
            iArr[LabelStyle.LABEL_STYLE_ON_TIME.ordinal()] = 3;
            iArr[LabelStyle.LABEL_STYLE_DELAYED.ordinal()] = 4;
            f20110a = iArr;
        }
    }

    public static final boolean A(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        Configurations f11 = f(trackOrderV3);
        return c.e(f11 == null ? null : Boolean.valueOf(f11.getShowMap()));
    }

    public static final <T> boolean B(List<? extends T> list, List<? extends T> list2) {
        p.j(list, "<this>");
        p.j(list2, "list");
        if (list.size() != list2.size()) {
            return false;
        }
        List<Pair> J0 = s.J0(list, list2);
        if (!(J0 instanceof Collection) || !J0.isEmpty()) {
            for (Pair pair : J0) {
                if (!p.e(pair.a(), pair.b())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean C(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        Configurations f11 = f(trackOrderV3);
        return (f11 == null ? null : f11.getDeliverySpeedMode()) == DeliverySpeedMode.DELIVERY_SPEED_MODE_FAST_MODE;
    }

    public static final boolean D(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        OrderDetails L = L(trackOrderV3);
        return p.e(L == null ? null : L.getOrderType(), TrackOrderType.SELF_DELIVERY);
    }

    public static final boolean E(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.getTippingInfo() != null) {
            List<TipOptionView> tipOptionsList = trackOrderV3.getTippingInfo().getTipOptionsList();
            if ((tipOptionsList == null || tipOptionsList.isEmpty()) || !trackOrderV3.getTippingInfo().getTipOptionsShowable()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final Label F(ETA eta) {
        p.j(eta, "<this>");
        if (eta.hasLabel()) {
            return eta.getLabel();
        }
        return null;
    }

    public static final b G(Label label) {
        p.j(label, "<this>");
        LabelStyle labelStyle = label.getLabelStyle();
        int i11 = labelStyle == null ? -1 : a.f20110a[labelStyle.ordinal()];
        if (i11 == 1) {
            return new b(label.getText(), TextStyle.BUTTON5, R.color.green1, TextColor.COLOR_BACKGROUND_PRIMARY);
        }
        if (i11 == 2) {
            return new b(label.getText(), TextStyle.BUTTON5, R.color.green1, TextColor.COLOR_BACKGROUND_PRIMARY);
        }
        if (i11 == 3) {
            return new b(label.getText(), TextStyle.BUTTON5, R.color.green2, TextColor.COLOR_POSITIVE);
        }
        if (i11 != 4) {
            return new b(label.getText(), TextStyle.BUTTON5, R.color.green2, TextColor.COLOR_POSITIVE);
        }
        return new b(label.getText(), TextStyle.BUTTON5, R.color.errorRed2, TextColor.COLOR_NEGATIVE);
    }

    public static final LatLng H(BatchedDestination batchedDestination) {
        p.j(batchedDestination, "<this>");
        if (batchedDestination.hasLocation()) {
            return batchedDestination.getLocation();
        }
        return null;
    }

    public static final LatLng I(DeliveryDetails deliveryDetails) {
        if (!c.h(deliveryDetails == null ? null : Boolean.valueOf(deliveryDetails.hasLocation())) || deliveryDetails == null) {
            return null;
        }
        return deliveryDetails.getLocation();
    }

    public static final LatLng J(OutletDetails outletDetails) {
        p.j(outletDetails, "<this>");
        if (outletDetails.hasLocation()) {
            return outletDetails.getLocation();
        }
        return null;
    }

    public static final Location K(Address address) {
        p.j(address, "<this>");
        if (address.hasLocation()) {
            return address.getLocation();
        }
        return null;
    }

    public static final OrderDetails L(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasOrderDetails()) {
            return trackOrderV3.getOrderDetails();
        }
        return null;
    }

    public static final OrderStatus M(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasOrderStatus()) {
            return trackOrderV3.getOrderStatus();
        }
        return null;
    }

    public static final OutletDetails N(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasOutletDetails()) {
            return trackOrderV3.getOutletDetails();
        }
        return null;
    }

    public static final Messages O(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.OVERLAY_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final PollingIntervals P(Configurations configurations) {
        if (!c.h(configurations == null ? null : Boolean.valueOf(configurations.hasPolling())) || configurations == null) {
            return null;
        }
        return configurations.getPolling();
    }

    public static final boolean Q(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && o.x(nextBasedAction.getType(), "PRE_CANCELLATION_CONFIRMATION", true);
    }

    public static final boolean R(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && o.x(nextBasedAction.getType(), "PRE_CANCELLATION", true);
    }

    public static final boolean S(CounterType counterType) {
        p.j(counterType, "<this>");
        return counterType == CounterType.COUNTER_TYPE_PRE_CANCELLATION_CONFIRMATION;
    }

    public static final boolean T(CounterType counterType) {
        p.j(counterType, "<this>");
        return counterType == CounterType.COUNTER_TYPE_PRE_CANCELLATION;
    }

    public static final RatingInfo U(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasRatingInfo()) {
            return trackOrderV3.getRatingInfo();
        }
        return null;
    }

    public static final boolean V(Configurations configurations) {
        return configurations != null && configurations.getRatingMode() == RatingMode.RATING_MODE_REGULAR;
    }

    public static final boolean W(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && p.e(nextBasedAction.getType(), "RESTAURANT_CALL_OPTION");
    }

    public static final Messages X(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.SELF_DELIVERY_DESCRIPTION)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final NextBasedAction Y(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        List<NextBasedAction> nextBasedActionsList = trackOrderV3.getNextBasedActionsList();
        p.i(nextBasedActionsList, "nextBasedActionsList");
        Iterator<T> it2 = nextBasedActionsList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((NextBasedAction) t).getType(), TrackOrderResponseDataNew.OUTLET_MESSAGE_HELP)) {
                break;
            }
        }
        return (NextBasedAction) t;
    }

    public static final Button Z(List<Button> list) {
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
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_DOMINOS_NOT_RECIEVED) {
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

    public static final Annotation a(CustomerDetails customerDetails) {
        p.j(customerDetails, "<this>");
        if (customerDetails.hasAnnotation()) {
            return customerDetails.getAnnotation();
        }
        return null;
    }

    public static final Button a0(List<Button> list) {
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
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_DOMINOS_RECIEVED) {
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

    public static final Annotation b(DeliveryDetails deliveryDetails) {
        if (!c.h(deliveryDetails == null ? null : Boolean.valueOf(deliveryDetails.hasAnnotation())) || deliveryDetails == null) {
            return null;
        }
        return deliveryDetails.getAnnotation();
    }

    public static final Messages b0(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.SELF_DELIVERY_SUBTITLE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final Annotation c(OutletDetails outletDetails) {
        p.j(outletDetails, "<this>");
        if (outletDetails.hasAnnotation()) {
            return outletDetails.getAnnotation();
        }
        return null;
    }

    public static final Messages c0(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.SELF_DELIVERY_TITLE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final boolean d(Button button) {
        p.j(button, "<this>");
        return button.getAction() == ActionType.ACTION_TYPE_CANCEL_ORDER;
    }

    public static final boolean d0(ETA eta) {
        p.j(eta, "<this>");
        Duration n = n(eta);
        Long valueOf = n == null ? null : Long.valueOf(n.getSeconds());
        return eta.getShowEta() && valueOf != null && valueOf.longValue() >= 0;
    }

    public static final boolean e(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && p.e(nextBasedAction.getType(), "CANCELLATION_MESSAGE");
    }

    public static final boolean e0(Configurations configurations) {
        return configurations != null && configurations.getExperimentEnabledOrDefault(ConfigExperimentDataType.SHOW_DELIVERY_ADDRESS_LINE, false);
    }

    public static final Configurations f(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasConfiguration()) {
            return trackOrderV3.getConfiguration();
        }
        return null;
    }

    public static final Button f0(List<Button> list) {
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
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_SIMILAR_OPTIONS) {
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

    public static final Messages g(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.CROUTON_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final boolean g0(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && p.e(nextBasedAction.getType(), "TERMINATING_STATE");
    }

    public static final CustomerDetails h(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasCustomer()) {
            return trackOrderV3.getCustomer();
        }
        return null;
    }

    public static final ThankYouCard h0(TipMessages tipMessages) {
        p.j(tipMessages, "<this>");
        if (tipMessages.hasThankYouCard()) {
            return tipMessages.getThankYouCard();
        }
        return null;
    }

    public static final Messages i(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.DE_VACCINE_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final TipMessages i0(TippingInfo tippingInfo) {
        p.j(tippingInfo, "<this>");
        if (tippingInfo.hasTipMessages()) {
            return tippingInfo.getTipMessages();
        }
        return null;
    }

    public static final Address j(CustomerDetails customerDetails) {
        p.j(customerDetails, "<this>");
        if (customerDetails.hasDeliveryAddress()) {
            return customerDetails.getDeliveryAddress();
        }
        return null;
    }

    public static final TipWarnMessage j0(TipMessages tipMessages) {
        p.j(tipMessages, "<this>");
        if (tipMessages.hasTipWarnMessage()) {
            return tipMessages.getTipWarnMessage();
        }
        return null;
    }

    public static final DeliveryDetails k(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasDeliveryDetails()) {
            return trackOrderV3.getDeliveryDetails();
        }
        return null;
    }

    public static final TippingInfo k0(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasTippingInfo()) {
            return trackOrderV3.getTippingInfo();
        }
        return null;
    }

    public static final Messages l(TrackOrderV3 trackOrderV3) {
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
        return (Messages) t;
    }

    public static final com.google.android.gms.maps.model.LatLng l0(LatLng latLng) {
        double d11 = 0.0d;
        double latitude = latLng == null ? 0.0d : latLng.getLatitude();
        if (latLng != null) {
            d11 = latLng.getLongitude();
        }
        return new com.google.android.gms.maps.model.LatLng(latitude, d11);
    }

    public static final boolean m(Button button) {
        p.j(button, "<this>");
        return button.getAction() == ActionType.ACTION_TYPE_DISMISS_CANCEL_ORDER;
    }

    public static final com.google.android.gms.maps.model.LatLng m0(Location location) {
        double d11 = 0.0d;
        double lat = location == null ? 0.0d : location.getLat();
        if (location != null) {
            d11 = location.getLng();
        }
        return new com.google.android.gms.maps.model.LatLng(lat, d11);
    }

    public static final Duration n(ETA eta) {
        p.j(eta, "<this>");
        if (eta.hasEtaDuration()) {
            return eta.getEtaDuration();
        }
        return null;
    }

    public static final Long n0(PollingIntervals pollingIntervals) {
        Duration trackDeDuration;
        if (!c.h(pollingIntervals == null ? null : Boolean.valueOf(pollingIntervals.hasTrackDeDuration()))) {
            return -1L;
        }
        if (pollingIntervals == null || (trackDeDuration = pollingIntervals.getTrackDeDuration()) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(trackDeDuration.getSeconds()));
    }

    public static final Button o(List<Button> list) {
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
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_EDIT_ORDER) {
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

    public static final Long o0(PollingIntervals pollingIntervals) {
        Duration trackOrderDuration;
        if (!c.h(pollingIntervals == null ? null : Boolean.valueOf(pollingIntervals.hasTrackOrderDuration()))) {
            return -1L;
        }
        if (pollingIntervals == null || (trackOrderDuration = pollingIntervals.getTrackOrderDuration()) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(trackOrderDuration.getSeconds()));
    }

    public static final boolean p(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && p.e(nextBasedAction.getType(), "EDIT_ORDER_POPUP");
    }

    public static final Messages p0(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.VENDOR_STATUE_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final boolean q(NextBasedAction nextBasedAction) {
        return nextBasedAction != null && p.e(nextBasedAction.getType(), "edm_rating_confirmation");
    }

    public static final Messages q0(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), "warning_message")) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final ETA r(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        if (trackOrderV3.hasEta()) {
            return trackOrderV3.getEta();
        }
        return null;
    }

    public static final Messages r0(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.WARNING_MESSAGE_TITLE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final Messages s(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.FAST_DELIVERY_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final Messages t(TrackOrderV3 trackOrderV3) {
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
            if (p.e(((Messages) t).getType(), TrackMessageTypes.GIFTING_MESSAGE)) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final Button u(List<Button> list) {
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
            if (((Button) t).getAction() == ActionType.ACTION_TYPE_GO_TO_HOME) {
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

    public static final List<Messages> v(TrackOrderV3 trackOrderV3) {
        p.j(trackOrderV3, "<this>");
        List<Messages> messagesList = trackOrderV3.getMessagesList();
        p.i(messagesList, "messagesList");
        ArrayList arrayList = new ArrayList();
        for (T next : messagesList) {
            if (p.e(((Messages) next).getType(), TrackMessageTypes.HUD_MESSAGE)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final Messages w(TrackOrderV3 trackOrderV3) {
        T t;
        p.j(trackOrderV3, "<this>");
        Iterator<T> it2 = v(trackOrderV3).iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (p.e(((Messages) t).getMetaMap().get(MessagesMetaDataType.RAIN_ANIMATION_ENABLE), "true")) {
                break;
            }
        }
        return (Messages) t;
    }

    public static final DeliveryDetails x(TrackDeliveryPartnerResponseV3 trackDeliveryPartnerResponseV3) {
        p.j(trackDeliveryPartnerResponseV3, "<this>");
        if (trackDeliveryPartnerResponseV3.hasInfo()) {
            return trackDeliveryPartnerResponseV3.getInfo();
        }
        return null;
    }

    public static final TrackOrderV3 y(TrackServiceResponseV3 trackServiceResponseV3) {
        p.j(trackServiceResponseV3, "<this>");
        if (trackServiceResponseV3.hasInfo()) {
            return trackServiceResponseV3.getInfo();
        }
        return null;
    }

    public static final boolean z(TrackOrderV3 trackOrderV3) {
        if (trackOrderV3 == null) {
            return false;
        }
        return trackOrderV3.hasDeliveryDetails();
    }
}

package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import com.swiggy.gandalf.widgets.v2.BlackZone;
import com.swiggy.gandalf.widgets.v2.FailureResponse;
import com.swiggy.gandalf.widgets.v2.Response;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import com.swiggy.gandalf.widgets.v2.SwiggyNotPresent;
import fp0.c;
import in.swiggy.android.tejas.coroutineUtils.FlowErrorTransformer;
import in.swiggy.android.tejas.error.Error;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: MagicCartErrorTransformer.kt */
public final class MagicCartErrorTransformer extends FlowErrorTransformer<Response, Error> {
    public static final Companion Companion = new Companion((i) null);
    private static final String MESSAGE_COMMUNICATION_EMPTY = "success_communication_empty";
    private static final String MESSAGE_DEFAULT_FAILURE = "default_failure";
    private static final String MESSAGE_UNKNOWN_COMMUNICATION = "success_communication_unknown";
    private static final int STATUS_CODE_SUCCESS = 200;
    public static final String TAG = "ErrorTransformer";

    /* compiled from: MagicCartErrorTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final Error transform(Response response) {
        if (!p.e(response.getSuccess(), SuccessResponse.getDefaultInstance())) {
            if (response.getSuccess().hasCommunication() && !p.e(response.getSuccess().getCommunication().getBlackZone(), BlackZone.getDefaultInstance())) {
                return new Error.BlackZoneError(response.getSuccess().getCommunication().getBlackZone().getTitle(), response.getSuccess().getCommunication().getBlackZone().getMessage(), response.getTid(), response.getSid());
            }
            if (response.getSuccess().hasCommunication() && !p.e(response.getSuccess().getCommunication().getSwiggyNotPresent(), SwiggyNotPresent.getDefaultInstance())) {
                return new Error.LocationNotServiceableError(response.getTid(), response.getSid());
            }
            if (response.getSuccess().hasCommunication()) {
                return new Error.UnhandledError(MESSAGE_UNKNOWN_COMMUNICATION, 200, response.getTid(), response.getSid(), (Throwable) null, 16, (i) null);
            }
            return new Error.UnhandledError(MESSAGE_COMMUNICATION_EMPTY, 200, response.getTid(), response.getSid(), (Throwable) null, 16, (i) null);
        } else if (p.e(response.getFailure(), FailureResponse.getDefaultInstance())) {
            return new Error.UnhandledError(MESSAGE_DEFAULT_FAILURE, 200, response.getTid(), response.getSid(), (Throwable) null, 16, (i) null);
        } else {
            int errorCode = response.getFailure().getErrorCode();
            String errorMessage = response.getFailure().getErrorMessage();
            p.i(errorMessage, "t.failure.errorMessage");
            return new Error.DescriptiveError(errorCode, errorMessage, response.getTid(), response.getSid());
        }
    }

    /* access modifiers changed from: protected */
    public d<in.swiggy.android.tejas.Response<Error>> execute(Response response) {
        p.j(response, "parameters");
        return f.x(new MagicCartErrorTransformer$execute$1(this, response, (c<? super MagicCartErrorTransformer$execute$1>) null));
    }
}

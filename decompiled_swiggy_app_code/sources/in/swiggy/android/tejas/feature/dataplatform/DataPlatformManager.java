package in.swiggy.android.tejas.feature.dataplatform;

import ao0.s;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import in.swiggy.android.tejas.feature.dataplatform.api.IMessageApi;
import in.swiggy.android.tejas.feature.dataplatform.model.Message;
import in.swiggy.android.tejas.feature.dataplatform.model.MessageEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import retrofit2.Response;

/* compiled from: DataPlatformManager.kt */
public final class DataPlatformManager {
    public static final Companion Companion = new Companion((i) null);
    private static final String EMPTY_MESSAGE_LIST_IN_REQUEST = "empty_message_list";
    private final IMessageApi api;

    /* compiled from: DataPlatformManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DataPlatformManager(IMessageApi iMessageApi) {
        p.j(iMessageApi, "api");
        this.api = iMessageApi;
    }

    public final s<Response<Void>> sendGTMEvent(String str, Map<String, String> map) {
        p.j(str, AnalyticsAttribute.EVENT_TYPE_ATTRIBUTE);
        p.j(map, "params");
        return this.api.sendGTMEvent(str, map);
    }

    public final s<Response<Void>> sendMessages(List<Message<MessageEvent>> list) {
        p.j(list, "messages");
        if (list.size() == 1) {
            return this.api.sendMessage((Message) s.W(list));
        }
        if (list.size() > 1) {
            return this.api.sendBulkMessage(list);
        }
        s<Response<Void>> m11 = s.m(Response.error((int) OS2WindowsMetricsTable.WEIGHT_CLASS_NORMAL, ResponseBody.Companion.create$default(ResponseBody.Companion, EMPTY_MESSAGE_LIST_IN_REQUEST, (MediaType) null, 1, (Object) null)));
        p.i(m11, "just(Response.error(400,…EQUEST.toResponseBody()))");
        return m11;
    }
}

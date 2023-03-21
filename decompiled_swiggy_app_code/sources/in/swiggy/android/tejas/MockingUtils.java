package in.swiggy.android.tejas;

import android.content.Context;
import com.google.gson.Gson;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.proto.ProtoUtils;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.p;
import okio.u;

@Instrumented
/* compiled from: MockingUtils.kt */
public final class MockingUtils {
    public static final MockingUtils INSTANCE = new MockingUtils();

    private MockingUtils() {
    }

    public final <T> T getProtoResponseFromFile(Context context, Class<T> cls, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(cls, "classType");
        p.j(str, "filename");
        InputStream open = context.getAssets().open(str);
        p.i(open, "context.assets.open(filename)");
        return ProtoUtils.INSTANCE.getProtoResponseFromStream(cls, u.d(u.l(open)));
    }

    public final <T> T getProtoResponseFromJsonFile(Context context, Class<T> cls, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(cls, "classType");
        p.j(str, "filename");
        InputStream open = context.getAssets().open(str);
        p.i(open, "context.assets.open(filename)");
        return ProtoUtils.INSTANCE.getProtoResponseFromJson(cls, u.d(u.l(open)));
    }

    public final <T> T getResponseFromFile(Context context, Gson gson, Class<T> cls, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(gson, "gson");
        p.j(cls, "classType");
        p.j(str, "filename");
        InputStream open = context.getAssets().open(str);
        p.i(open, "context.assets.open(filename)");
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        open.close();
        Charset defaultCharset = Charset.defaultCharset();
        p.i(defaultCharset, "defaultCharset()");
        String str2 = new String(bArr, defaultCharset);
        return !(gson instanceof Gson) ? gson.fromJson(str2, cls) : GsonInstrumentation.fromJson(gson, str2, cls);
    }

    public final <T> T getProtoResponseFromFile(Context context, Message.Builder builder, Class<T> cls, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(builder, "builder");
        p.j(cls, "classType");
        p.j(str, "filename");
        InputStream open = context.getAssets().open(str);
        p.i(open, "context.assets.open(filename)");
        byte[] bArr = new byte[open.available()];
        open.read(bArr);
        open.close();
        Charset defaultCharset = Charset.defaultCharset();
        p.i(defaultCharset, "defaultCharset()");
        JsonFormat.parser().ignoringUnknownFields().merge(new String(bArr, defaultCharset), builder.clear());
        return builder.build();
    }
}

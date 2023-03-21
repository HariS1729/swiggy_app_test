package wg0;

import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import eq0.e;
import hq0.a;
import in.swiggy.android.tejas.oldapi.models.cart.CartItems;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElementSerializer;
import os.g0;

@Instrumented
/* compiled from: LegacyCartItemsSerializer.kt */
public final class a implements KSerializer<CartItems> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19950a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f19951b = SerialDescriptorsKt.a("CartItems", e.i.f23016a);

    private a() {
    }

    /* renamed from: a */
    public CartItems deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        Gson i11 = g0.i();
        String p11 = decoder.p();
        Class cls = CartItems.class;
        Object fromJson = !(i11 instanceof Gson) ? i11.fromJson(p11, cls) : GsonInstrumentation.fromJson(i11, p11, cls);
        p.i(fromJson, "getGson().fromJson(decod…), CartItems::class.java)");
        return (CartItems) fromJson;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, CartItems cartItems) {
        p.j(encoder, "encoder");
        p.j(cartItems, "value");
        a.C0293a aVar = hq0.a.f23147b;
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) cartItems) : GsonInstrumentation.toJson(i11, (Object) cartItems);
        p.i(json, "getGson().toJson(value)");
        encoder.z(JsonElementSerializer.f26449b, aVar.f(json));
    }

    public SerialDescriptor getDescriptor() {
        return f19951b;
    }
}

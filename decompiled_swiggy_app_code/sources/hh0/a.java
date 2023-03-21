package hh0;

import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import eq0.e;
import hq0.a;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.restaurant.RestaurantLabel;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElementSerializer;
import os.g0;

@Instrumented
/* compiled from: LegacyAddressSerializer.kt */
public final class a implements KSerializer<Address> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18345a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f18346b = SerialDescriptorsKt.a(RestaurantLabel.LABEL_TYPE_ADDRESS, e.i.f23016a);

    private a() {
    }

    /* renamed from: a */
    public Address deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        return Address.Companion.fromJson(decoder.p());
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, Address address) {
        p.j(encoder, "encoder");
        p.j(address, "value");
        a.C0293a aVar = hq0.a.f23147b;
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) address) : GsonInstrumentation.toJson(i11, (Object) address);
        p.i(json, "getGson().toJson(value)");
        encoder.z(JsonElementSerializer.f26449b, aVar.f(json));
    }

    public SerialDescriptor getDescriptor() {
        return f18346b;
    }
}

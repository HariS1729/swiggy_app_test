package hh0;

import eq0.e;
import hq0.a;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: LegacyRestaurantSerializer.kt */
public final class b implements KSerializer<Restaurant> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18347a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final SerialDescriptor f18348b = SerialDescriptorsKt.a("Restaurant", e.i.f23016a);

    private b() {
    }

    /* renamed from: a */
    public Restaurant deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        Restaurant fromJson = Restaurant.fromJson(decoder.p());
        p.i(fromJson, "fromJson(decoder.decodeString())");
        return fromJson;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, Restaurant restaurant) {
        p.j(encoder, "encoder");
        p.j(restaurant, "value");
        a.C0293a aVar = a.f23147b;
        String restaurant2 = restaurant.toString();
        p.i(restaurant2, "value.toString()");
        encoder.z(JsonElementSerializer.f26449b, aVar.f(restaurant2));
    }

    public SerialDescriptor getDescriptor() {
        return f18348b;
    }
}

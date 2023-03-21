package a5;

import eq0.e;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Serializers.kt */
public final class a implements KSerializer<Date> {
    public static final C0003a Companion = new C0003a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f989b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final SerialDescriptor f990a = SerialDescriptorsKt.a("Date", e.i.f23016a);

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* compiled from: Serializers.kt */
    public static final class C0003a {
        private C0003a() {
        }

        public /* synthetic */ C0003a(i iVar) {
            this();
        }
    }

    /* renamed from: a */
    public Date deserialize(Decoder decoder) {
        p.j(decoder, "decoder");
        Date parse = f989b.parse(decoder.p());
        p.g(parse);
        return parse;
    }

    /* renamed from: b */
    public void serialize(Encoder encoder, Date date) {
        p.j(encoder, "encoder");
        p.j(date, "value");
        String format = f989b.format(date);
        p.i(format, "dtFormat.format(value)");
        encoder.s(format);
    }

    public SerialDescriptor getDescriptor() {
        return this.f990a;
    }
}

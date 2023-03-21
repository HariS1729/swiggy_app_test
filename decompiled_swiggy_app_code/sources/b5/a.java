package b5;

import co.hyperverge.crashguard.data.models.CrashEvent;
import co.hyperverge.crashguard.data.network.SentryResponse;
import hq0.a;
import kotlin.jvm.internal.p;
import okhttp3.MediaType;
import po.c;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* compiled from: SentryApi.kt */
public interface a {
    public static final C0101a Companion = C0101a.f12581a;

    /* renamed from: b5.a$a  reason: collision with other inner class name */
    /* compiled from: SentryApi.kt */
    public static final class C0101a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0101a f12581a = new C0101a();

        /* renamed from: b  reason: collision with root package name */
        private static a f12582b;

        private C0101a() {
        }

        public final a a() {
            a aVar = f12582b;
            if (aVar != null) {
                return aVar;
            }
            Retrofit.Builder builder = new Retrofit.Builder();
            a.C0293a aVar2 = hq0.a.f23147b;
            MediaType parse = MediaType.parse("application/json");
            p.g(parse);
            p.i(parse, "parse(\"application/json\")!!");
            Object create = builder.addConverterFactory(c.a(aVar2, parse)).baseUrl("https://hyperverge.co/").build().create(a.class);
            a aVar3 = (a) create;
            f12582b = aVar3;
            p.i(create, "Builder()\n            .a…a).also { INSTANCE = it }");
            return aVar3;
        }
    }

    @POST
    Object a(@Body CrashEvent crashEvent, @Url String str, @Query("sentry_key") String str2, fp0.c<? super Response<SentryResponse>> cVar);
}

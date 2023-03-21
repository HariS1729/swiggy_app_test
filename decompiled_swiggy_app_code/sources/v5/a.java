package v5;

import co.hyperverge.hypersnapsdk.objects.d;
import java.util.concurrent.TimeUnit;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import w5.n;

/* compiled from: ApiClient */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f17293a;

    /* renamed from: b  reason: collision with root package name */
    private static e f17294b;

    /* renamed from: c  reason: collision with root package name */
    private static s5.a f17295c;

    public static s5.a a() {
        if (f17295c == null) {
            d s11 = p5.a.t().s();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            builder.connectTimeout((long) s11.getConnectTimeOut(), timeUnit);
            builder.writeTimeout((long) s11.getWriteTimeOut(), timeUnit);
            builder.readTimeout((long) s11.getReadTimeOut(), timeUnit);
            f17295c = (s5.a) new Retrofit.Builder().baseUrl(n.w().y()).addConverterFactory(GsonConverterFactory.create()).client(builder.build()).build().create(s5.a.class);
        }
        return f17295c;
    }

    private static void b(OkHttpClient.Builder builder) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.readTimeout((long) p5.a.t().s().getReadTimeOut(), timeUnit);
        builder.writeTimeout((long) p5.a.t().s().getWriteTimeOut(), timeUnit);
        builder.connectTimeout((long) p5.a.t().s().getConnectTimeOut(), timeUnit);
    }

    public static e c() {
        if (f17294b == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            b(builder);
            f17294b = (e) new Retrofit.Builder().baseUrl(n.w().B()).client(builder.build()).addConverterFactory(GsonConverterFactory.create()).build().create(e.class);
        }
        return f17294b;
    }

    public static b d() {
        if (f17293a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            b(builder);
            if (p5.a.t().s().isShouldEnableSSLPinning()) {
                builder.certificatePinner(new CertificatePinner.Builder().add("ind.faceid.hyperverge.co", "sha256/hHWXbXBGT2chaVwYyxEyGqtPJX9H/dh5HbOAz5CmclM=").add("ind.faceid.hyperverge.co", "sha256/8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=").add("ind.faceid.hyperverge.co", "sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=").add("ind.docs.hyperverge.co", "sha256/hHWXbXBGT2chaVwYyxEyGqtPJX9H/dh5HbOAz5CmclM=").add("ind.docs.hyperverge.co", "sha256/8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=").add("ind.docs.hyperverge.co", "sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=").add("staging.api.hyperverge.co", "sha256/hHWXbXBGT2chaVwYyxEyGqtPJX9H/dh5HbOAz5CmclM=").add("staging.api.hyperverge.co", "sha256/8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=").add("staging.api.hyperverge.co", "sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=").add("*.hyperverge.co", "sha256/C3U1B8/WXNaje+K8wU4TRgV0htiLVH9gikN4+kwR+P4=").add("*.hyperverge.co", "sha256/8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=").add("*.hyperverge.co", "sha256/Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA=").build());
            }
            f17293a = (b) new Retrofit.Builder().baseUrl(n.w().t()).client(builder.build()).addConverterFactory(GsonConverterFactory.create()).build().create(b.class);
        }
        return f17293a;
    }
}

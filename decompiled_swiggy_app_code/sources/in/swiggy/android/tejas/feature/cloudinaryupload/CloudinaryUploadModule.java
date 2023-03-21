package in.swiggy.android.tejas.feature.cloudinaryupload;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinaryRequestDataWrapper;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;
import okhttp3.MultipartBody;
import os.a;
import retrofit2.Retrofit;

/* compiled from: CloudinaryUploadModule.kt */
public final class CloudinaryUploadModule {
    public static final CloudinaryUploadModule INSTANCE = new CloudinaryUploadModule();

    private CloudinaryUploadModule() {
    }

    public static final ITransformer<CloudinaryRequestDataWrapper, MultipartBody> provideCloudinaryTransformer(a aVar) {
        p.j(aVar, "appBuildDetails");
        return new CloudinaryUploadTransformer(aVar);
    }

    public static final ICloudinaryApi providesAPI(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ICloudinaryApi.class);
        p.i(create, "retrofit.create(ICloudinaryApi::class.java)");
        return (ICloudinaryApi) create;
    }
}

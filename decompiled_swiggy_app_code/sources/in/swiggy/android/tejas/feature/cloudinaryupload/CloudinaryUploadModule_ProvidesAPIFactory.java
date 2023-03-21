package in.swiggy.android.tejas.feature.cloudinaryupload;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class CloudinaryUploadModule_ProvidesAPIFactory implements e<ICloudinaryApi> {
    private final Provider<Retrofit> retrofitProvider;

    public CloudinaryUploadModule_ProvidesAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static CloudinaryUploadModule_ProvidesAPIFactory create(Provider<Retrofit> provider) {
        return new CloudinaryUploadModule_ProvidesAPIFactory(provider);
    }

    public static ICloudinaryApi providesAPI(Retrofit retrofit) {
        return (ICloudinaryApi) i.e(CloudinaryUploadModule.providesAPI(retrofit));
    }

    public ICloudinaryApi get() {
        return providesAPI(this.retrofitProvider.get());
    }
}

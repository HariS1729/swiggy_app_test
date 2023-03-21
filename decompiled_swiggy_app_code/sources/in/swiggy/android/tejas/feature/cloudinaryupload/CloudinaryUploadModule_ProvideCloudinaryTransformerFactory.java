package in.swiggy.android.tejas.feature.cloudinaryupload;

import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinaryRequestDataWrapper;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import okhttp3.MultipartBody;
import os.a;
import qq.e;
import qq.i;

public final class CloudinaryUploadModule_ProvideCloudinaryTransformerFactory implements e<ITransformer<CloudinaryRequestDataWrapper, MultipartBody>> {
    private final Provider<a> appBuildDetailsProvider;

    public CloudinaryUploadModule_ProvideCloudinaryTransformerFactory(Provider<a> provider) {
        this.appBuildDetailsProvider = provider;
    }

    public static CloudinaryUploadModule_ProvideCloudinaryTransformerFactory create(Provider<a> provider) {
        return new CloudinaryUploadModule_ProvideCloudinaryTransformerFactory(provider);
    }

    public static ITransformer<CloudinaryRequestDataWrapper, MultipartBody> provideCloudinaryTransformer(a aVar) {
        return (ITransformer) i.e(CloudinaryUploadModule.provideCloudinaryTransformer(aVar));
    }

    public ITransformer<CloudinaryRequestDataWrapper, MultipartBody> get() {
        return provideCloudinaryTransformer(this.appBuildDetailsProvider.get());
    }
}

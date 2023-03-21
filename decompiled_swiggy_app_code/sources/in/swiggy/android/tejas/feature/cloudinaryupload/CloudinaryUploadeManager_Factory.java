package in.swiggy.android.tejas.feature.cloudinaryupload;

import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinaryRequestDataWrapper;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import okhttp3.MultipartBody;
import qq.e;

public final class CloudinaryUploadeManager_Factory implements e<CloudinaryUploadeManager> {
    private final Provider<ICloudinaryApi> apiProvider;
    private final Provider<ITransformer<CloudinaryRequestDataWrapper, MultipartBody>> transformerProvider;

    public CloudinaryUploadeManager_Factory(Provider<ICloudinaryApi> provider, Provider<ITransformer<CloudinaryRequestDataWrapper, MultipartBody>> provider2) {
        this.apiProvider = provider;
        this.transformerProvider = provider2;
    }

    public static CloudinaryUploadeManager_Factory create(Provider<ICloudinaryApi> provider, Provider<ITransformer<CloudinaryRequestDataWrapper, MultipartBody>> provider2) {
        return new CloudinaryUploadeManager_Factory(provider, provider2);
    }

    public static CloudinaryUploadeManager newInstance(ICloudinaryApi iCloudinaryApi, ITransformer<CloudinaryRequestDataWrapper, MultipartBody> iTransformer) {
        return new CloudinaryUploadeManager(iCloudinaryApi, iTransformer);
    }

    public CloudinaryUploadeManager get() {
        return newInstance(this.apiProvider.get(), this.transformerProvider.get());
    }
}

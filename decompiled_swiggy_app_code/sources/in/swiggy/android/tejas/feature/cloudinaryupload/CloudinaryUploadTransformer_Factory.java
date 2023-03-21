package in.swiggy.android.tejas.feature.cloudinaryupload;

import javax.inject.Provider;
import os.a;
import qq.e;

public final class CloudinaryUploadTransformer_Factory implements e<CloudinaryUploadTransformer> {
    private final Provider<a> appBuildDetailsProvider;

    public CloudinaryUploadTransformer_Factory(Provider<a> provider) {
        this.appBuildDetailsProvider = provider;
    }

    public static CloudinaryUploadTransformer_Factory create(Provider<a> provider) {
        return new CloudinaryUploadTransformer_Factory(provider);
    }

    public static CloudinaryUploadTransformer newInstance(a aVar) {
        return new CloudinaryUploadTransformer(aVar);
    }

    public CloudinaryUploadTransformer get() {
        return newInstance(this.appBuildDetailsProvider.get());
    }
}

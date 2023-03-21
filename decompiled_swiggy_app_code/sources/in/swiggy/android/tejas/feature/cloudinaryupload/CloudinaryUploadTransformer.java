package in.swiggy.android.tejas.feature.cloudinaryupload;

import i20.t;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.Constants;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinaryRequestDataWrapper;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinarySignature;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.io.File;
import java.net.URI;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import os.a;

/* compiled from: CloudinaryUploadTransformer.kt */
public final class CloudinaryUploadTransformer implements ITransformer<CloudinaryRequestDataWrapper, MultipartBody> {
    private final a appBuildDetails;

    public CloudinaryUploadTransformer(a aVar) {
        p.j(aVar, "appBuildDetails");
        this.appBuildDetails = aVar;
    }

    public final a getAppBuildDetails() {
        return this.appBuildDetails;
    }

    public MultipartBody transform(CloudinaryRequestDataWrapper cloudinaryRequestDataWrapper) {
        String token;
        p.j(cloudinaryRequestDataWrapper, t.V);
        File file = new File(new URI(cloudinaryRequestDataWrapper.getFilePath()));
        RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("image/jpeg"), file);
        Long l11 = null;
        MultipartBody.Builder builder = new MultipartBody.Builder((String) null, 1, (i) null);
        builder.addFormDataPart("api_key", this.appBuildDetails.k());
        CloudinarySignature signature = cloudinaryRequestDataWrapper.getSignature();
        String str = "";
        if (!(signature == null || (token = signature.getToken()) == null)) {
            str = token;
        }
        builder.addFormDataPart(PaymentConstants.SIGNATURE, str);
        CloudinarySignature signature2 = cloudinaryRequestDataWrapper.getSignature();
        if (signature2 != null) {
            l11 = Long.valueOf(signature2.getTimestamp());
        }
        builder.addFormDataPart("timestamp", String.valueOf(l11));
        builder.addFormDataPart("upload_preset", Constants.CLOUDINARY_UPLOAD_BUCKET);
        builder.addFormDataPart("file", file.getName(), create);
        return builder.build();
    }
}

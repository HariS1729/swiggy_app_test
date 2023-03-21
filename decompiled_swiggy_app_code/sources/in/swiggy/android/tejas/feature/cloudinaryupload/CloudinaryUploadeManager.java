package in.swiggy.android.tejas.feature.cloudinaryupload;

import ao0.s;
import ii0.a;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.CloudinaryRequestDataWrapper;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.GenerateTokenApiResponse;
import in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;
import okhttp3.MultipartBody;

/* compiled from: CloudinaryUploadeManager.kt */
public final class CloudinaryUploadeManager {
    private final ICloudinaryApi api;
    private final ITransformer<CloudinaryRequestDataWrapper, MultipartBody> transformer;

    public CloudinaryUploadeManager(ICloudinaryApi iCloudinaryApi, ITransformer<CloudinaryRequestDataWrapper, MultipartBody> iTransformer) {
        p.j(iCloudinaryApi, "api");
        p.j(iTransformer, "transformer");
        this.api = iCloudinaryApi;
        this.transformer = iTransformer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: uploadImage$lambda-0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData m13uploadImage$lambda0(java.util.Map r4) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.p.j(r4, r0)
            java.lang.String r0 = "secure_url"
            java.lang.Object r0 = r4.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0019
            r0 = r1
        L_0x0019:
            java.lang.String r3 = "public_id"
            java.lang.Object r4 = r4.get(r3)
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L_0x0026
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData r4 = new in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData
            r4.<init>(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.cloudinaryupload.CloudinaryUploadeManager.m13uploadImage$lambda0(java.util.Map):in.swiggy.android.tejas.feature.cloudinaryupload.imageupload.data.ImageUploadData");
    }

    public final s<GenerateTokenApiResponse> generateSigningToken(long j, String str) {
        return this.api.generateSigningToken(j, str);
    }

    public final s<ImageUploadData> uploadImage(CloudinaryRequestDataWrapper cloudinaryRequestDataWrapper) {
        p.j(cloudinaryRequestDataWrapper, "dataWrapper");
        s<R> n = this.api.uploadImage(this.transformer.transform(cloudinaryRequestDataWrapper)).n(a.f56291a);
        p.i(n, "api.uploadImage(multipar…dUrl, publicId)\n        }");
        return n;
    }
}

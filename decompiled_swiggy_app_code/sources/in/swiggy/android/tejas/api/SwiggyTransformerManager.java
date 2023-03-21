package in.swiggy.android.tejas.api;

import androidx.core.util.d;
import go0.h;
import in.swiggy.android.tejas.api.models.SwiggyApiRawResponse;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.api.models.SwiggyApiResponseModel;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import os.i;
import retrofit2.Response;

public class SwiggyTransformerManager {
    public static <R, M, E extends BaseException> i<SwiggyApiResponseModel<M>, E> build(Response<SwiggyApiRawResponse<SwiggyApiResponse<R>>> response, h<d<String, String>, E> hVar, IErrorChecker<SwiggyBaseResponse> iErrorChecker, ITransformer<R, M> iTransformer, ITransformer<SwiggyBaseResponse, E> iTransformer2) throws Exception {
        if (shouldParseError(response)) {
            return i.a((BaseException) hVar.apply(Errors.findFirstErrorCodeAndParam(response)));
        }
        SwiggyApiResponse<R> rawResponse = getRawResponse(response);
        M m11 = null;
        BaseException baseException = (iTransformer2 == null || rawResponse == null || !iErrorChecker.shouldCheckForErrors(rawResponse)) ? null : (BaseException) iTransformer2.transform(rawResponse);
        if (rawResponse == null) {
            return i.a((BaseException) hVar.apply(Errors.handleNoContent()));
        }
        R data = rawResponse.getData();
        if (data != null) {
            m11 = iTransformer.transform(data);
        }
        return i.b(new SwiggyApiResponseModel(baseException, m11));
    }

    public static <R, M, E extends BaseException> i<SwiggyApiResponseModel<M>, E> buildOneOf(Response<SwiggyApiResponse<R>> response, h<d<String, String>, E> hVar, IErrorChecker<SwiggyBaseResponse> iErrorChecker, ITransformer<R, M> iTransformer, ITransformer<SwiggyBaseResponse, E> iTransformer2) throws Exception {
        if (shouldParseError(response)) {
            return i.a((BaseException) hVar.apply(Errors.findFirstErrorCodeAndParam(response)));
        }
        SwiggyApiResponse body = response.body();
        M m11 = null;
        BaseException baseException = (iTransformer2 == null || body == null || !iErrorChecker.shouldCheckForErrors(body)) ? null : (BaseException) iTransformer2.transform(body);
        if (body == null) {
            return i.a((BaseException) hVar.apply(Errors.handleNoContent()));
        }
        Object data = body.getData();
        if (data != null) {
            m11 = iTransformer.transform(data);
        }
        return i.b(new SwiggyApiResponseModel(baseException, m11));
    }

    private static <R> SwiggyApiResponse<R> getRawResponse(Response<SwiggyApiRawResponse<SwiggyApiResponse<R>>> response) {
        SwiggyApiRawResponse body = response.body();
        if (body != null) {
            return (SwiggyApiResponse) body.getData();
        }
        return null;
    }

    private static boolean shouldParseError(Response response) {
        return !response.isSuccessful() || response.code() == 204;
    }
}

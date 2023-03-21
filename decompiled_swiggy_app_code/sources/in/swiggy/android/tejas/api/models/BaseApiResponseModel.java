package in.swiggy.android.tejas.api.models;

/* compiled from: BaseApiResponseModel.kt */
public class BaseApiResponseModel<T, M> {
    private final T extraParams;
    private final M responseModel;

    public BaseApiResponseModel(T t, M m11) {
        this.extraParams = t;
        this.responseModel = m11;
    }

    public final T getExtraParams() {
        return this.extraParams;
    }

    public final M getResponseModel() {
        return this.responseModel;
    }
}

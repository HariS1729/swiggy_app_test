package in.swiggy.android.tejas.dao;

import in.swiggy.android.commons.utils.GeneralUtilsKt;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: BaseRequest.kt */
public abstract class BaseRequest<T> {
    public final T generateKey(a<? extends T> aVar) {
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        return aVar.invoke();
    }

    public final String generateMD5() {
        return GeneralUtilsKt.m(super.toString());
    }

    public abstract T getDefaultKey();

    public abstract void setDefaultKey(T t);
}

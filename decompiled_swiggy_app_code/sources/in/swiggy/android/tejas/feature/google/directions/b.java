package in.swiggy.android.tejas.feature.google.directions;

import go0.h;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ITransformer f20220a;

    public /* synthetic */ b(ITransformer iTransformer) {
        this.f20220a = iTransformer;
    }

    public final Object apply(Object obj) {
        return (ArrayList) this.f20220a.transform((SwiggyDirectionsResponse) obj);
    }
}

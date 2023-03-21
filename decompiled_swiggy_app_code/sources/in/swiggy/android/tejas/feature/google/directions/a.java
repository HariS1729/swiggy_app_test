package in.swiggy.android.tejas.feature.google.directions;

import go0.h;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ITransformer f20219a;

    public /* synthetic */ a(ITransformer iTransformer) {
        this.f20219a = iTransformer;
    }

    public final Object apply(Object obj) {
        return (ArrayList) this.f20219a.transform((GoogleDirectionsResponse) obj);
    }
}

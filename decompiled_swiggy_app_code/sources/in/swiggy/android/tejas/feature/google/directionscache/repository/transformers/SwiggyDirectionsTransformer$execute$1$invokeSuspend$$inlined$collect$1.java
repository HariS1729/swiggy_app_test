package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import java.util.ArrayList;
import kotlinx.coroutines.flow.e;

/* compiled from: Collect.kt */
public final class SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1 implements e<ArrayList<LatLng>> {
    final /* synthetic */ ArrayList $pathList$inlined;

    public SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1(ArrayList arrayList) {
        this.$pathList$inlined = arrayList;
    }

    public Object emit(ArrayList<LatLng> arrayList, c<? super k> cVar) {
        this.$pathList$inlined.add(arrayList);
        return k.f22762a;
    }
}

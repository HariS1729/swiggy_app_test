package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1", f = "GoogleDirectionsTransformer.kt", l = {46, 35}, m = "invokeSuspend")
/* compiled from: GoogleDirectionsTransformer.kt */
final class GoogleDirectionsTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends DirectionsResponse>>, c<? super k>, Object> {
    final /* synthetic */ GoogleDirectionsResponse $parameters;
    final /* synthetic */ ArrayList<ArrayList<LatLng>> $pathList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GoogleDirectionsTransformer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoogleDirectionsTransformer$execute$1(GoogleDirectionsResponse googleDirectionsResponse, GoogleDirectionsTransformer googleDirectionsTransformer, ArrayList<ArrayList<LatLng>> arrayList, c<? super GoogleDirectionsTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = googleDirectionsResponse;
        this.this$0 = googleDirectionsTransformer;
        this.$pathList = arrayList;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        GoogleDirectionsTransformer$execute$1 googleDirectionsTransformer$execute$1 = new GoogleDirectionsTransformer$execute$1(this.$parameters, this.this$0, this.$pathList, cVar);
        googleDirectionsTransformer$execute$1.L$0 = obj;
        return googleDirectionsTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<DirectionsResponse>> eVar, c<? super k> cVar) {
        return ((GoogleDirectionsTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            bp0.g.b(r12)
            goto L_0x0079
        L_0x0012:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001a:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r12)
            goto L_0x0053
        L_0x0022:
            bp0.g.b(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionsResponse r12 = r11.$parameters
            java.util.List r12 = r12.getDirections()
            if (r12 != 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            kotlinx.coroutines.flow.d r12 = kotlinx.coroutines.flow.f.a(r12)
            if (r12 != 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer r4 = r11.this$0
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1 r5 = new in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1
            r5.<init>(r12, r4)
            java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> r12 = r11.$pathList
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1 r4 = new in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1
            r4.<init>(r12)
            r11.L$0 = r1
            r11.label = r3
            java.lang.Object r12 = r5.collect(r4, r11)
            if (r12 != r0) goto L_0x0053
            return r0
        L_0x0053:
            java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> r4 = r11.$pathList
            in.swiggy.android.tejas.Response$Companion r12 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse r10 = new in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse
            r5 = 0
            in.swiggy.android.tejas.feature.google.directionscache.api.RemoteDirectionsDataSource r6 = in.swiggy.android.tejas.feature.google.directionscache.api.RemoteDirectionsDataSource.GOOGLE_DIRECTIONS
            r7 = 0
            r8 = 10
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r8 = 0
            r9 = 6
            r3 = 0
            r5 = r12
            r6 = r10
            r10 = r3
            in.swiggy.android.tejas.Response r12 = in.swiggy.android.tejas.Response.Companion.success$default(r5, r6, r7, r8, r9, r10)
            r11.L$0 = r3
            r11.label = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L_0x0079
            return r0
        L_0x0079:
            bp0.k r12 = bp0.k.f22762a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

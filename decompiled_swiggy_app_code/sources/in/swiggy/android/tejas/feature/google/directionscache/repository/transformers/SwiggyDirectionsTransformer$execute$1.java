package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;

@d(c = "in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1", f = "SwiggyDirectionsTransformer.kt", l = {50, 37}, m = "invokeSuspend")
/* compiled from: SwiggyDirectionsTransformer.kt */
final class SwiggyDirectionsTransformer$execute$1 extends SuspendLambda implements p<e<? super Response<? extends DirectionsResponse>>, c<? super k>, Object> {
    final /* synthetic */ SwiggyDirectionsResponse $parameters;
    final /* synthetic */ ArrayList<ArrayList<LatLng>> $pathList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwiggyDirectionsTransformer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwiggyDirectionsTransformer$execute$1(SwiggyDirectionsResponse swiggyDirectionsResponse, SwiggyDirectionsTransformer swiggyDirectionsTransformer, ArrayList<ArrayList<LatLng>> arrayList, c<? super SwiggyDirectionsTransformer$execute$1> cVar) {
        super(2, cVar);
        this.$parameters = swiggyDirectionsResponse;
        this.this$0 = swiggyDirectionsTransformer;
        this.$pathList = arrayList;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SwiggyDirectionsTransformer$execute$1 swiggyDirectionsTransformer$execute$1 = new SwiggyDirectionsTransformer$execute$1(this.$parameters, this.this$0, this.$pathList, cVar);
        swiggyDirectionsTransformer$execute$1.L$0 = obj;
        return swiggyDirectionsTransformer$execute$1;
    }

    public final Object invoke(e<? super Response<DirectionsResponse>> eVar, c<? super k> cVar) {
        return ((SwiggyDirectionsTransformer$execute$1) create(eVar, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r14 = r14.get(0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r13.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            bp0.g.b(r14)
            goto L_0x0093
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001b:
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            bp0.g.b(r14)
            goto L_0x0054
        L_0x0023:
            bp0.g.b(r14)
            java.lang.Object r14 = r13.L$0
            r1 = r14
            kotlinx.coroutines.flow.e r1 = (kotlinx.coroutines.flow.e) r1
            in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse r14 = r13.$parameters
            java.util.List r14 = r14.getDirections()
            if (r14 != 0) goto L_0x0034
            goto L_0x0054
        L_0x0034:
            kotlinx.coroutines.flow.d r14 = kotlinx.coroutines.flow.f.a(r14)
            if (r14 != 0) goto L_0x003b
            goto L_0x0054
        L_0x003b:
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer r4 = r13.this$0
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1 r5 = new in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1
            r5.<init>(r14, r4)
            java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> r14 = r13.$pathList
            in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1 r4 = new in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1$invokeSuspend$$inlined$collect$1
            r4.<init>(r14)
            r13.L$0 = r1
            r13.label = r3
            java.lang.Object r14 = r5.collect(r4, r13)
            if (r14 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.util.ArrayList<java.util.ArrayList<com.google.android.gms.maps.model.LatLng>> r4 = r13.$pathList
            in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirectionsResponse r14 = r13.$parameters
            in.swiggy.android.tejas.Response$Companion r10 = in.swiggy.android.tejas.Response.Companion
            in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse r11 = new in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse
            r5 = 0
            in.swiggy.android.tejas.feature.google.directionscache.api.RemoteDirectionsDataSource r6 = in.swiggy.android.tejas.feature.google.directionscache.api.RemoteDirectionsDataSource.SWIGGY_DIRECTIONS
            java.util.List r14 = r14.getDirections()
            r12 = 0
            if (r14 != 0) goto L_0x0068
        L_0x0066:
            r7 = r12
            goto L_0x0077
        L_0x0068:
            r3 = 0
            java.lang.Object r14 = r14.get(r3)
            in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirection r14 = (in.swiggy.android.tejas.feature.google.directions.model.SwiggyDirection) r14
            if (r14 != 0) goto L_0x0072
            goto L_0x0066
        L_0x0072:
            java.lang.String r14 = r14.getRouteId()
            r7 = r14
        L_0x0077:
            r8 = 2
            r9 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r7 = 0
            r8 = 0
            r9 = 6
            r14 = 0
            r5 = r10
            r6 = r11
            r10 = r14
            in.swiggy.android.tejas.Response r14 = in.swiggy.android.tejas.Response.Companion.success$default(r5, r6, r7, r8, r9, r10)
            r13.L$0 = r12
            r13.label = r2
            java.lang.Object r14 = r1.emit(r14, r13)
            if (r14 != r0) goto L_0x0093
            return r0
        L_0x0093:
            bp0.k r14 = bp0.k.f22762a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.SwiggyDirectionsTransformer$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

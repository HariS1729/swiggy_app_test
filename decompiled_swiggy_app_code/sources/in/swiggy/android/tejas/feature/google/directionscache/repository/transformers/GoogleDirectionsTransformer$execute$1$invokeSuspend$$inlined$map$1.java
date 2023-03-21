package in.swiggy.android.tejas.feature.google.directionscache.repository.transformers;

import bp0.k;
import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection;
import java.util.ArrayList;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;

/* compiled from: SafeCollector.common.kt */
public final class GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1 implements d<ArrayList<LatLng>> {
    final /* synthetic */ d $this_unsafeTransform$inlined;
    final /* synthetic */ GoogleDirectionsTransformer this$0;

    public GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1(d dVar, GoogleDirectionsTransformer googleDirectionsTransformer) {
        this.$this_unsafeTransform$inlined = dVar;
        this.this$0 = googleDirectionsTransformer;
    }

    public Object collect(final e eVar, c cVar) {
        d dVar = this.$this_unsafeTransform$inlined;
        final GoogleDirectionsTransformer googleDirectionsTransformer = this.this$0;
        Object collect = dVar.collect(new e<GoogleDirection>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, fp0.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = (in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1$2$1 r0 = new in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    bp0.g.b(r6)
                    kotlinx.coroutines.flow.e r6 = r4
                    in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection r5 = (in.swiggy.android.tejas.feature.google.directions.model.GoogleDirection) r5
                    in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer r2 = r2
                    in.swiggy.android.tejas.feature.google.directions.model.GoogleDirectionPolyline r5 = r5.getDirectionPolyline()
                    if (r5 != 0) goto L_0x0042
                    r5 = 0
                    goto L_0x0046
                L_0x0042:
                    java.lang.String r5 = r5.getEncodedPolyline()
                L_0x0046:
                    java.util.List r5 = r2.decodeEncodedPolyLine(r5)
                    java.util.ArrayList r5 = r2.getInterpolatedPath(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    bp0.k r5 = bp0.k.f22762a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.google.directionscache.repository.transformers.GoogleDirectionsTransformer$execute$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}

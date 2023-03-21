package lf0;

import android.view.View;
import bp0.k;
import in.swiggy.android.tejas.feature.listing.facets.model.Facet;
import in.swiggy.android.tejas.feature.listing.facets.model.FacetGroup;
import in.swiggy.android.tejas.feature.listing.facets.model.SortItem;
import java.util.HashMap;
import java.util.List;
import lp0.l;

/* compiled from: FacetClickHandler.kt */
public interface a {

    /* renamed from: lf0.a$a  reason: collision with other inner class name */
    /* compiled from: FacetClickHandler.kt */
    public static final class C0232a {
        public static /* synthetic */ void a(a aVar, HashMap hashMap, String str, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    z11 = false;
                }
                aVar.R0(hashMap, str, z11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFacetSelected");
        }
    }

    void C0(List<SortItem> list, View view, HashMap<String, List<Facet>> hashMap);

    void P0(HashMap<String, List<Facet>> hashMap);

    void R0(HashMap<String, List<Facet>> hashMap, String str, boolean z11);

    void T0(FacetGroup facetGroup, View view, HashMap<String, List<Facet>> hashMap, String str, l<? super Boolean, k> lVar);

    void b0(FacetGroup facetGroup, HashMap<String, List<Facet>> hashMap, String str);

    void n0(FacetGroup facetGroup, View view, HashMap<String, List<Facet>> hashMap, String str);
}

package in.swiggy.android.tejas.feature.discovery.pageskeleton.adapterfactories;

import com.google.gson.TypeAdapterFactory;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarEntity;
import in.swiggy.android.tejas.feature.dropboxStore.typeadapters.RuntimeTypeAdapterFactory;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.searchbar.model.SearchBarEntity;
import kotlin.jvm.internal.p;

/* compiled from: PageSkeletonAdapterFactories.kt */
public final class PageSkeletonAdapterFactories {
    public static final PageSkeletonAdapterFactories INSTANCE = new PageSkeletonAdapterFactories();

    private PageSkeletonAdapterFactories() {
    }

    public final TypeAdapterFactory getPageSkeletonAdapterFactory() {
        RuntimeTypeAdapterFactory<ListingCardEntity> registerSubtype = RuntimeTypeAdapterFactory.of(ListingCardEntity.class).registerSubtype(BottomBarEntity.class).registerSubtype(SearchBarEntity.class);
        p.i(registerSubtype, "of(ListingCardEntity::cl…rchBarEntity::class.java)");
        return registerSubtype;
    }
}

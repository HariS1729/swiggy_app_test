package in.swiggy.android.tejas.feature.home.transformers;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.swiggy.gandalf.home.protobuf.RestaurantHomeDto;
import in.swiggy.android.tejas.feature.listing.restaurant.model.CollectionMetadata;
import in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CollectionHomeMetadataDecorator.kt */
public final class CollectionHomeMetadataDecorator {

    /* renamed from: id  reason: collision with root package name */
    private final String f20251id;
    private int position = 1;
    private final ITransformer<RestaurantHomeDto, RestaurantEntity> restaurantTransformer;
    private final String theme;

    public CollectionHomeMetadataDecorator(String str, String str2, ITransformer<RestaurantHomeDto, RestaurantEntity> iTransformer) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "theme");
        p.j(iTransformer, "restaurantTransformer");
        this.f20251id = str;
        this.theme = str2;
        this.restaurantTransformer = iTransformer;
    }

    public final RestaurantEntity decorate(RestaurantHomeDto restaurantHomeDto) {
        p.j(restaurantHomeDto, "restaurant");
        RestaurantEntity transform = this.restaurantTransformer.transform(restaurantHomeDto);
        if (transform == null) {
            return null;
        }
        String id2 = getId();
        int position2 = getPosition();
        setPosition(position2 + 1);
        transform.setCollectionMetadata(new CollectionMetadata(id2, position2, getTheme()));
        return transform;
    }

    public final String getId() {
        return this.f20251id;
    }

    public final int getPosition() {
        return this.position;
    }

    public final ITransformer<RestaurantHomeDto, RestaurantEntity> getRestaurantTransformer() {
        return this.restaurantTransformer;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final void setPosition(int i11) {
        this.position = i11;
    }
}

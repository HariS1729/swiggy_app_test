package in.swiggy.android.tejas.feature.listing;

import bp0.h;
import com.google.protobuf.Any;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.GroupedCard;
import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.NetworkExceptionTransformer;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: ListingTransformerModule.kt */
public final class ListingTransformerModule {
    public static final ListingTransformerModule INSTANCE = new ListingTransformerModule();

    private ListingTransformerModule() {
    }

    public static final ITransformer<Card, List<ListingCardEntity<?>>> providesListingCardResultFactory(ListingCardEntityFactory listingCardEntityFactory) {
        p.j(listingCardEntityFactory, "listingEntityFactory");
        return listingCardEntityFactory;
    }

    public static final ITransformer<GroupedCard, List<ListingCardEntity<?>>> providesListingGroupTransformer(ListingGroupTransformer listingGroupTransformer) {
        p.j(listingGroupTransformer, "listingGroupTransformer");
        return listingGroupTransformer;
    }

    public static final ITransformer<Any, List<ListingCardEntity<?>>> providesListingResultFactory(ListingEntityFactory listingEntityFactory) {
        p.j(listingEntityFactory, "listingEntityFactory");
        return listingEntityFactory;
    }

    public static final ITransformer<Response, ListingResponse> providesResultTransformer(ListingTransformer listingTransformer) {
        p.j(listingTransformer, "listingTransformer");
        return listingTransformer;
    }

    @ListingTransformers
    public final Map<String, ITransformer<?, ?>> providesListingTransformers(ITransformer<Response, ListingResponse> iTransformer, ITransformer<Response, Error> iTransformer2, ITransformer<Throwable, Error> iTransformer3) {
        p.j(iTransformer, "listingResponseTransformer");
        p.j(iTransformer2, "errorTransformer");
        p.j(iTransformer3, "exceptionTransformer");
        return x.i(h.a(ListingTransformer.TAG, iTransformer), h.a("ErrorTransformer", iTransformer2), h.a(NetworkExceptionTransformer.TAG, iTransformer3));
    }
}

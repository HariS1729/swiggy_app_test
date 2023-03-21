package in.swiggy.android.tejas.feature.dropboxStore;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import in.swiggy.android.tejas.feature.dropboxStore.adapterfactories.HomeAdapterFactories;
import in.swiggy.android.tejas.feature.dropboxStore.adapterfactories.ListingAdapterFactories;
import kotlin.jvm.internal.p;

/* compiled from: DropboxGsonUtils.kt */
public final class DropboxGsonUtils {
    public static final DropboxGsonUtils INSTANCE = new DropboxGsonUtils();
    private static Gson homeGson;
    private static Gson listingGson;

    private DropboxGsonUtils() {
    }

    public final Gson getHomeGson() {
        Gson gson = homeGson;
        if (gson != null) {
            return gson;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        HomeAdapterFactories homeAdapterFactories = HomeAdapterFactories.INSTANCE;
        Gson create = gsonBuilder.registerTypeAdapterFactory(homeAdapterFactories.getHomeAdapterFactory()).registerTypeAdapterFactory(homeAdapterFactories.getGridWidgetFactory()).registerTypeAdapterFactory(homeAdapterFactories.getHomeConfigFactory()).registerTypeAdapterFactory(homeAdapterFactories.getErrorFactory()).registerTypeAdapterFactory(homeAdapterFactories.getGridTypeFactory()).create();
        homeGson = create;
        p.i(create, "GsonBuilder()\n          …meGson = it\n            }");
        return create;
    }

    public final Gson getListingGson() {
        Gson gson = listingGson;
        if (gson != null) {
            return gson;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        ListingAdapterFactories listingAdapterFactories = ListingAdapterFactories.INSTANCE;
        GsonBuilder registerTypeAdapterFactory = gsonBuilder.registerTypeAdapterFactory(listingAdapterFactories.getListingAdapterFactory()).registerTypeAdapterFactory(listingAdapterFactories.getMenuHealthItemFactory());
        HomeAdapterFactories homeAdapterFactories = HomeAdapterFactories.INSTANCE;
        Gson create = registerTypeAdapterFactory.registerTypeAdapterFactory(homeAdapterFactories.getGridWidgetFactory()).registerTypeAdapterFactory(homeAdapterFactories.getHomeConfigFactory()).registerTypeAdapterFactory(homeAdapterFactories.getErrorFactory()).registerTypeAdapterFactory(homeAdapterFactories.getGridTypeFactory()).create();
        listingGson = create;
        p.i(create, "GsonBuilder()\n          …ngGson = it\n            }");
        return create;
    }
}

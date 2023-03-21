package eg0;

import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;

/* compiled from: PlacesClientProvider.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18287a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static PlacesClient f18288b;

    private a() {
    }

    private final PlacesClient a(Context context, String str) {
        if (!Places.isInitialized()) {
            Places.initialize(context, str);
        }
        PlacesClient createClient = Places.createClient(context);
        p.i(createClient, "createClient(context)");
        f18288b = createClient;
        return createClient;
    }

    public final PlacesClient b(Context context, String str) {
        p.j(context, LogCategory.CONTEXT);
        p.j(str, HttpRequest.HEADER_KEY);
        PlacesClient placesClient = f18288b;
        return placesClient == null ? a(context, str) : placesClient;
    }
}

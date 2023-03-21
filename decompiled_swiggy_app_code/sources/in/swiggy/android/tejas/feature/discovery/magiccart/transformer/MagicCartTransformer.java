package in.swiggy.android.tejas.feature.discovery.magiccart.transformer;

import com.swiggy.gandalf.widgets.v2.Response;
import fp0.c;
import in.swiggy.android.tejas.coroutineUtils.FlowModelTransformer;
import in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse;
import in.swiggy.android.tejas.feature.listing.dish.transformer.MenuEntityV2Transformer;
import in.swiggy.android.tejas.feature.listing.restaurant.transformer.RestaurantEntityTransformer;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: MagicCartTransformer.kt */
public final class MagicCartTransformer extends FlowModelTransformer<Response, MagicCartResponse> {
    private final MenuEntityV2Transformer menuEntityTransformer;
    private final RestaurantEntityTransformer restaurantEntityTransformer;

    public MagicCartTransformer(MenuEntityV2Transformer menuEntityV2Transformer, RestaurantEntityTransformer restaurantEntityTransformer2) {
        p.j(menuEntityV2Transformer, "menuEntityTransformer");
        p.j(restaurantEntityTransformer2, "restaurantEntityTransformer");
        this.menuEntityTransformer = menuEntityV2Transformer;
        this.restaurantEntityTransformer = restaurantEntityTransformer2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a3, code lost:
        r7 = r7.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse transform(com.swiggy.gandalf.widgets.v2.Response r11) {
        /*
            r10 = this;
            com.swiggy.gandalf.widgets.v2.SuccessResponse r11 = r11.getSuccess()
            java.util.List r11 = r11.getCardsList()
            java.lang.String r0 = "t.success.cardsList"
            kotlin.jvm.internal.p.i(r11, r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x0011:
            boolean r0 = r11.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r11.next()
            r2 = r0
            com.swiggy.gandalf.widgets.v2.CardInfo r2 = (com.swiggy.gandalf.widgets.v2.CardInfo) r2
            r3 = 0
            com.swiggy.gandalf.widgets.v2.Card r2 = r2.getCard()     // Catch:{ Exception -> 0x0033 }
            com.google.protobuf.Any r2 = r2.getCard()     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<com.swiggy.presentation.food.v2.MagicCartCollection> r4 = com.swiggy.presentation.food.v2.MagicCartCollection.class
            com.google.protobuf.Message r2 = r2.unpack(r4)     // Catch:{ Exception -> 0x0033 }
            if (r2 == 0) goto L_0x0034
            r2 = 1
            r3 = 1
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            if (r3 == 0) goto L_0x0011
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            com.swiggy.gandalf.widgets.v2.CardInfo r0 = (com.swiggy.gandalf.widgets.v2.CardInfo) r0
            if (r0 != 0) goto L_0x003e
            goto L_0x00ee
        L_0x003e:
            com.swiggy.gandalf.widgets.v2.Card r11 = r0.getCard()
            com.google.protobuf.Any r11 = r11.getCard()
            java.lang.Class<com.swiggy.presentation.food.v2.MagicCartCollection> r0 = com.swiggy.presentation.food.v2.MagicCartCollection.class
            com.google.protobuf.Message r11 = r11.unpack(r0)
            com.swiggy.presentation.food.v2.MagicCartCollection r11 = (com.swiggy.presentation.food.v2.MagicCartCollection) r11
            java.util.List r0 = r11.getMagicCartList()
            java.lang.String r2 = "collection.magicCartList"
            kotlin.jvm.internal.p.i(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.l.u(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0066:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00e0
            java.lang.Object r4 = r0.next()
            com.swiggy.presentation.food.v2.MagicCart r4 = (com.swiggy.presentation.food.v2.MagicCart) r4
            java.util.List r5 = r4.getDishesList()
            java.lang.String r6 = "it.dishesList"
            kotlin.jvm.internal.p.i(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.l.u(r5, r3)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x0088:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b9
            java.lang.Object r7 = r5.next()
            com.swiggy.presentation.food.v2.Dish r7 = (com.swiggy.presentation.food.v2.Dish) r7
            in.swiggy.android.tejas.feature.listing.dish.transformer.MenuEntityV2Transformer r8 = r10.menuEntityTransformer
            java.lang.String r9 = "it"
            kotlin.jvm.internal.p.i(r7, r9)
            in.swiggy.android.tejas.feature.listing.dish.model.MenuItemV2Entity r7 = r8.transform((com.swiggy.presentation.food.v2.Dish) r7)
            if (r7 != 0) goto L_0x00a3
        L_0x00a1:
            r7 = r1
            goto L_0x00ae
        L_0x00a3:
            in.swiggy.android.tejas.feature.listing.dish.model.ListingMenuItem r7 = r7.getData()
            if (r7 != 0) goto L_0x00aa
            goto L_0x00a1
        L_0x00aa:
            in.swiggy.android.tejas.oldapi.models.menu.MenuItem r7 = r7.getMenuItem()
        L_0x00ae:
            if (r7 != 0) goto L_0x00b5
            in.swiggy.android.tejas.oldapi.models.menu.MenuItem r7 = new in.swiggy.android.tejas.oldapi.models.menu.MenuItem
            r7.<init>()
        L_0x00b5:
            r6.add(r7)
            goto L_0x0088
        L_0x00b9:
            in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartModel r5 = new in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartModel
            in.swiggy.android.tejas.feature.listing.restaurant.transformer.RestaurantEntityTransformer r7 = r10.restaurantEntityTransformer
            com.swiggy.presentation.food.v2.Restaurant r4 = r4.getRestaurant()
            java.lang.String r8 = "it.restaurant"
            kotlin.jvm.internal.p.i(r4, r8)
            in.swiggy.android.tejas.feature.listing.restaurant.model.RestaurantEntity r4 = r7.transform((com.swiggy.presentation.food.v2.Restaurant) r4)
            if (r4 != 0) goto L_0x00ce
            r4 = r1
            goto L_0x00d2
        L_0x00ce:
            in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant r4 = r4.getData()
        L_0x00d2:
            if (r4 != 0) goto L_0x00d9
            in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant r4 = new in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant
            r4.<init>()
        L_0x00d9:
            r5.<init>(r4, r6)
            r2.add(r5)
            goto L_0x0066
        L_0x00e0:
            in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse r1 = new in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse
            java.lang.String r11 = r11.getCollectionId()
            java.lang.String r0 = "collection.collectionId"
            kotlin.jvm.internal.p.i(r11, r0)
            r1.<init>(r2, r11)
        L_0x00ee:
            if (r1 != 0) goto L_0x00fb
            in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse r1 = new in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse
            java.util.List r11 = kotlin.collections.k.j()
            java.lang.String r0 = ""
            r1.<init>(r11, r0)
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.discovery.magiccart.transformer.MagicCartTransformer.transform(com.swiggy.gandalf.widgets.v2.Response):in.swiggy.android.tejas.feature.discovery.magiccart.model.MagicCartResponse");
    }

    /* access modifiers changed from: protected */
    public d<in.swiggy.android.tejas.Response<MagicCartResponse>> execute(Response response) {
        p.j(response, "parameters");
        return f.x(new MagicCartTransformer$execute$1(response, this, (c<? super MagicCartTransformer$execute$1>) null));
    }
}

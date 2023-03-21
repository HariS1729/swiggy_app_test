package ff0;

import ef0.d;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.oldapi.models.listing.FilterGroup;
import in.swiggy.android.tejas.oldapi.models.listing.SortOption;
import in.swiggy.android.tejas.oldapi.network.responses.RestaurantListResponseDataV2;
import io.reactivex.processors.PublishProcessor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SortFilterContext.kt */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final transient PublishProcessor<C0221a> f18309a;

    /* renamed from: b  reason: collision with root package name */
    private final transient PublishProcessor<Boolean> f18310b;

    /* renamed from: c  reason: collision with root package name */
    private RestaurantListResponseDataV2 f18311c;

    /* renamed from: d  reason: collision with root package name */
    public ListingResponse f18312d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f18313e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<FilterGroup> f18314f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<SortOption> f18315g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f18316h;

    /* renamed from: ff0.a$a  reason: collision with other inner class name */
    /* compiled from: SortFilterContext.kt */
    public static abstract class C0221a {

        /* renamed from: ff0.a$a$a  reason: collision with other inner class name */
        /* compiled from: SortFilterContext.kt */
        public static final class C0222a extends C0221a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f18317a;

            public C0222a() {
                this((Throwable) null, 1, (i) null);
            }

            public C0222a(Throwable th2) {
                super((i) null);
                this.f18317a = th2;
            }

            public final Throwable a() {
                return this.f18317a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C0222a(Throwable th2, int i11, i iVar) {
                this((i11 & 1) != 0 ? null : th2);
            }
        }

        /* renamed from: ff0.a$a$b */
        /* compiled from: SortFilterContext.kt */
        public static final class b extends C0221a {

            /* renamed from: a  reason: collision with root package name */
            private final Error f18318a;

            public b() {
                this((Error) null, 1, (i) null);
            }

            public b(Error error) {
                super((i) null);
                this.f18318a = error;
            }

            public final Error a() {
                return this.f18318a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(Error error, int i11, i iVar) {
                this((i11 & 1) != 0 ? null : error);
            }
        }

        /* renamed from: ff0.a$a$c */
        /* compiled from: SortFilterContext.kt */
        public static final class c extends C0221a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f18319a = new c();

            private c() {
                super((i) null);
            }
        }

        /* renamed from: ff0.a$a$d */
        /* compiled from: SortFilterContext.kt */
        public static final class d extends C0221a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f18320a = new d();

            private d() {
                super((i) null);
            }
        }

        private C0221a() {
        }

        public /* synthetic */ C0221a(i iVar) {
            this();
        }
    }

    public a() {
        PublishProcessor<C0221a> z02 = PublishProcessor.z0();
        p.i(z02, "create<ListingUpdatedState>()");
        this.f18309a = z02;
        PublishProcessor<Boolean> z03 = PublishProcessor.z0();
        p.i(z03, "create<Boolean>()");
        this.f18310b = z03;
    }

    public void b(List<FilterGroup> list) {
        p.j(list, "filterGroupList");
        this.f18314f.clear();
        this.f18314f.addAll(list);
    }

    public void c(List<SortOption> list) {
        p.j(list, "sortList");
        this.f18315g.clear();
        this.f18315g.addAll(list);
    }

    public boolean d() {
        return this.f18313e;
    }

    public ListingResponse f() {
        return p();
    }

    public boolean g() {
        return this.f18316h;
    }

    public PublishProcessor<C0221a> h() {
        return this.f18309a;
    }

    public void i(ListingResponse listingResponse) {
        p.j(listingResponse, "listingResponse");
        r(listingResponse);
    }

    public void j(RestaurantListResponseDataV2 restaurantListResponseDataV2) {
        p.j(restaurantListResponseDataV2, "restaurantListResponseDataV2");
        this.f18311c = restaurantListResponseDataV2;
    }

    public PublishProcessor<Boolean> k() {
        return this.f18310b;
    }

    public void l() {
        this.f18313e = true;
        this.f18310b.onNext(Boolean.TRUE);
    }

    public RestaurantListResponseDataV2 m() {
        return this.f18311c;
    }

    public void n() {
        this.f18313e = false;
    }

    /* renamed from: o */
    public ArrayList<FilterGroup> a() {
        return this.f18314f;
    }

    public final ListingResponse p() {
        ListingResponse listingResponse = this.f18312d;
        if (listingResponse != null) {
            return listingResponse;
        }
        p.B("listResponse");
        return null;
    }

    /* renamed from: q */
    public ArrayList<SortOption> e() {
        return this.f18315g;
    }

    public final void r(ListingResponse listingResponse) {
        p.j(listingResponse, "<set-?>");
        this.f18312d = listingResponse;
    }
}

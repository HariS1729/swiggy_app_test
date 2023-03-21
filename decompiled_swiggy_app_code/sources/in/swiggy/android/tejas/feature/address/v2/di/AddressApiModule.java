package in.swiggy.android.tejas.feature.address.v2.di;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsJsonApi;
import in.swiggy.android.tejas.feature.address.v2.api.IAddressMapsProtoApi;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressMapsRepository;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepository;
import in.swiggy.android.tejas.feature.address.v2.repository.AddressRepositoryImpl;
import in.swiggy.android.tejas.feature.user.IProfileApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.shareaddress.api.IAddressDeepLinkApi;
import in.swiggy.android.tejas.shareaddress.repository.AddressDeepLinkRepository;
import in.swiggy.android.tejas.shareaddress.repository.AddressDeepLinkRepositoryImpl;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: AddressApiModule.kt */
public interface AddressApiModule {
    public static final Dependencies Dependencies = Dependencies.$$INSTANCE;

    /* compiled from: AddressApiModule.kt */
    public static final class Dependencies {
        static final /* synthetic */ Dependencies $$INSTANCE = new Dependencies();

        private Dependencies() {
        }

        public final IAddressDeepLinkApi providesAddressDeepLinkApi(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IAddressDeepLinkApi) retrofit.create(IAddressDeepLinkApi.class);
        }

        public final IAddressMapsJsonApi providesAddressMapsJsonApi(@AddressMapsApi Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IAddressMapsJsonApi) retrofit.create(IAddressMapsJsonApi.class);
        }

        public final IAddressMapsProtoApi providesAddressMapsProtoApi(@AddressMapsApi Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IAddressMapsProtoApi) retrofit.create(IAddressMapsProtoApi.class);
        }

        public final IProfileApi providesProfileApi(@RetrofitDevApi(apiType = ApiEndPointType.PROFILE_API) Retrofit retrofit) {
            p.j(retrofit, "retrofit");
            return (IProfileApi) retrofit.create(IProfileApi.class);
        }
    }

    AddressDeepLinkRepository bindAddressDeepLinkRepository(AddressDeepLinkRepositoryImpl addressDeepLinkRepositoryImpl);

    @AddressMaps
    AddressRepository bindAddressMapsRepo(AddressMapsRepository addressMapsRepository);

    @AddressRepo
    AddressRepository bindAddressRepo(AddressRepositoryImpl addressRepositoryImpl);
}

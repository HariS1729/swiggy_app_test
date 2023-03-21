package ef0;

import ao0.d;
import cg0.n;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import in.swiggy.android.tejas.feature.user.CommunicationSubscriptionData;
import in.swiggy.android.tejas.feature.user.UnBoxingDataResponse;
import in.swiggy.android.tejas.feature.user.UserSuperDataResponse;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

/* compiled from: IUser */
public interface e extends a {
    boolean A();

    void A0(boolean z11);

    Boolean C2();

    boolean D();

    String D0();

    d<String> E();

    boolean F2();

    List<GooglePlace> H2(String str);

    List<GooglePlace> I();

    boolean J(Address address);

    Boolean J2();

    UnBoxingDataResponse L();

    boolean L0();

    int N();

    UserSuperDataResponse N1();

    void O();

    void O1();

    boolean P0();

    CommunicationSubscriptionData Q();

    List<Address> Q0(String str);

    boolean R0();

    void T1(String str);

    PublishSubject<Boolean> U1();

    boolean Z();

    void a2(CommunicationSubscriptionData communicationSubscriptionData);

    void b1(String str);

    Address c();

    boolean c0();

    Boolean c1();

    void c2(List<Address> list);

    void d(Address address);

    void d0(int i11, Double d11, List<Address> list);

    void d2();

    AddressSortingWeight e();

    boolean e0();

    Boolean e2();

    void f();

    boolean g();

    d<Boolean> g1();

    void g2(String str);

    Address getAddressById(String str);

    String getAuthToken();

    String getCustomerId();

    int getDefaultingType();

    String getDeviceId();

    String getName();

    String getPhoneNumber();

    Double getProximityWeight();

    String getSessionId();

    String getSwuid();

    String getTid();

    String getToken();

    String i0();

    void j0(boolean z11);

    void j2(GooglePlace googlePlace);

    void k0(int i11);

    void k1(Address address);

    List<Address> k2(List<Address> list);

    PublishProcessor<Boolean> l1();

    void l2();

    d<Boolean> m();

    boolean n2();

    d<String> o();

    boolean o0();

    String o1(String str);

    String r();

    void r1(Address address);

    boolean s();

    boolean s0(n nVar);

    void setAuthToken(String str);

    void setSessionId(String str);

    void setTid(String str);

    void t2(SwiggyApiResponse<UserResponseData> swiggyApiResponse);

    void v1(String str);

    boolean x();

    String x2();

    void y2(Address address);

    List<Address> z0();
}

package in.swiggy.android.tejas.feature.address.v2.api.transformer;

import com.swiggy.locationplatform.centraladdressservice.v1.Address;
import com.swiggy.locationplatform.centraladdressservice.v1.AddressCategory;
import com.swiggy.locationplatform.centraladdressservice.v1.ClientCtx;
import com.swiggy.locationplatform.centraladdressservice.v1.CreateAddressRequest;
import com.swiggy.locationplatform.centraladdressservice.v1.DeleteAddressRequest;
import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress;
import com.swiggy.locationplatform.centraladdressservice.v1.EntityCtx;
import com.swiggy.locationplatform.centraladdressservice.v1.EntityType;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressByAddressIDResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.GetAddressesResponse;
import com.swiggy.locationplatform.centraladdressservice.v1.RequestCtx;
import com.swiggy.locationplatform.centraladdressservice.v1.UpdateAddressRequest;
import com.swiggy.locationplatform.shared.v1.Location;
import com.swiggy.platform.shared.marketplace.v1.MarketplaceProto;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressInfo;
import in.swiggy.android.tejas.feature.address.model.AddressTag;
import in.swiggy.android.tejas.feature.address.model.PostableAddress;
import in.swiggy.android.tejas.feature.address.model.PostableUpdateAddress;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeleteAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: AddressTranformerUtils.kt */
public final class AddressTranformerUtilsKt {

    /* compiled from: AddressTranformerUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressCategory.values().length];
            iArr[AddressCategory.ADDRESS_CATEGORY_HOME.ordinal()] = 1;
            iArr[AddressCategory.ADDRESS_CATEGORY_WORK.ordinal()] = 2;
            iArr[AddressCategory.ADDRESS_CATEGORY_OTHER.ordinal()] = 3;
            iArr[AddressCategory.ADDRESS_CATEGORY_FRIENDS_AND_FAMILY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Address convertGetAddressByIdResponse(GetAddressByAddressIDResponse getAddressByAddressIDResponse) {
        p.j(getAddressByAddressIDResponse, "addressResponse");
        EnrichedAddress address = getAddressByAddressIDResponse.getAddress();
        p.i(address, "addressResponse.address");
        return getLocalAddressFromCAS(address);
    }

    public static final List<Address> convertGetAddressResponse(GetAddressesResponse getAddressesResponse) {
        p.j(getAddressesResponse, "addressResponse");
        ArrayList arrayList = new ArrayList();
        List<EnrichedAddress> addressesList = getAddressesResponse.getAddressesList();
        p.i(addressesList, "addressResponse.addressesList");
        for (EnrichedAddress enrichedAddress : addressesList) {
            p.i(enrichedAddress, "it");
            arrayList.add(getLocalAddressFromCAS(enrichedAddress));
        }
        return arrayList;
    }

    public static final CreateAddressRequest createAddress(PostableAddress postableAddress, boolean z11) {
        p.j(postableAddress, "<this>");
        CreateAddressRequest.Builder newBuilder = CreateAddressRequest.newBuilder();
        newBuilder.setEntityCtx(getEntityCtx(postableAddress.getUserId()));
        newBuilder.setRequestCtx(getRequestCtx(postableAddress.getLaunchSource()));
        CreateAddressRequest build = newBuilder.setAddress(createMapsAddressRequest(postableAddress, z11)).build();
        p.i(build, "newBuilder().apply {\n   …omDash))\n        .build()");
        return build;
    }

    private static final com.swiggy.locationplatform.centraladdressservice.v1.Address createMapsAddressRequest(AddressInfo addressInfo, boolean z11) {
        String directionsToReach;
        Address.Builder newBuilder = com.swiggy.locationplatform.centraladdressservice.v1.Address.newBuilder();
        String addressString = addressInfo.getAddressString();
        if (addressString != null) {
            newBuilder.setFormattedAddress(addressString);
        }
        String flatNo = addressInfo.getFlatNo();
        if (flatNo != null) {
            newBuilder.setAddressLine(flatNo);
        }
        if (!z11) {
            String addressLine2 = addressInfo.getAddressLine2();
            if (addressLine2 != null) {
                newBuilder.setAddressLine2(addressLine2);
            }
        } else {
            String landmark = addressInfo.getLandmark();
            if (landmark != null) {
                newBuilder.setLandmark(landmark);
            }
        }
        String city = addressInfo.getCity();
        if (city != null) {
            newBuilder.setCity(city);
        }
        String area = addressInfo.getArea();
        if (area != null) {
            newBuilder.setLocality(area);
        }
        newBuilder.setLocation(Location.newBuilder().setLat(addressInfo.getLatitude()).setLng(addressInfo.getLongitude()).build());
        if (!z11 && (directionsToReach = addressInfo.getDirectionsToReach()) != null) {
            newBuilder.setInstructions(directionsToReach);
        }
        String name = addressInfo.getName();
        if (name != null) {
            newBuilder.setContactName(name);
        }
        String number = addressInfo.getNumber();
        if (number != null) {
            newBuilder.setPhone(number);
        }
        String voiceDirectionsUri = addressInfo.getVoiceDirectionsUri();
        if (voiceDirectionsUri != null) {
            newBuilder.setVoiceDirectionsS3Uri(voiceDirectionsUri);
        }
        newBuilder.setMarketPlaceId(MarketplaceProto.MarketPlaceId.MARKET_PLACE_ID_SWIGGY_IN);
        return newBuilder.addAddressCategory(getAddressCategory(addressInfo)).addTags(addressInfo.getAnnotationString()).build();
    }

    static /* synthetic */ com.swiggy.locationplatform.centraladdressservice.v1.Address createMapsAddressRequest$default(AddressInfo addressInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return createMapsAddressRequest(addressInfo, z11);
    }

    public static final DeleteAddressRequest deleteAddress(PostableDeleteAddress postableDeleteAddress) {
        p.j(postableDeleteAddress, "<this>");
        DeleteAddressRequest build = DeleteAddressRequest.newBuilder().setId(postableDeleteAddress.mAddressId).build();
        p.i(build, "newBuilder().setId(this.mAddressId).build()");
        return build;
    }

    private static final String getAddressCategory(AddressCategory addressCategory) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[addressCategory.ordinal()];
        if (i11 == 1) {
            return AddressTag.TypeString.HOME_TAG_STRING;
        }
        if (i11 != 2) {
            return (i11 == 3 || i11 != 4) ? "Other" : AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING;
        }
        return AddressTag.TypeString.WORK_TAG_STRING;
    }

    public static final EntityCtx getEntityCtx(String str) {
        EntityCtx.Builder newBuilder = EntityCtx.newBuilder();
        if (str == null) {
            str = "";
        }
        newBuilder.setId(str);
        newBuilder.setType(EntityType.ENTITY_TYPE_CUSTOMER);
        EntityCtx build = newBuilder.build();
        p.i(build, "newBuilder().apply {\n   …PE_CUSTOMER\n    }.build()");
        return build;
    }

    public static final in.swiggy.android.tejas.feature.address.model.Address getLocalAddressFromCAS(EnrichedAddress enrichedAddress) {
        p.j(enrichedAddress, "enrichedAddress");
        in.swiggy.android.tejas.feature.address.model.Address address = new in.swiggy.android.tejas.feature.address.model.Address();
        address.setId(enrichedAddress.getId());
        com.swiggy.locationplatform.centraladdressservice.v1.Address actualAddress = enrichedAddress.getActualAddress();
        address.setAddressString(actualAddress.getFormattedAddress());
        address.setLandmark(actualAddress.getLandmark());
        address.setFlatNo(actualAddress.getAddressLine());
        address.setAddressLine2(actualAddress.getAddressLine2());
        address.setArea(actualAddress.getLocality());
        address.setLatitude(actualAddress.getLocation().getLat());
        address.setLongitude(actualAddress.getLocation().getLng());
        List<AddressCategory> addressCategoryList = actualAddress.getAddressCategoryList();
        p.i(addressCategoryList, "addressData.addressCategoryList");
        if (!addressCategoryList.isEmpty()) {
            AddressCategory addressCategory = actualAddress.getAddressCategoryList().get(0);
            p.i(addressCategory, "addressData.addressCategoryList[0]");
            address.setAnnotationString(getAddressCategory(addressCategory));
        }
        address.setCity(actualAddress.getCity());
        address.setDirectionsToReach(actualAddress.getInstructions());
        address.setName(actualAddress.getContactName());
        address.setContactNumber(actualAddress.getPhone());
        address.setAnnotationString((String) actualAddress.getTagsList().get(0));
        address.setSortScore(Integer.valueOf(enrichedAddress.getIntelligenceBlock().getAddressRecency()));
        address.setVoiceDirectionsUri(enrichedAddress.getActualAddress().getVoiceDirectionsS3Uri());
        address.setWeightedOrderShareScore(enrichedAddress.getDefaultingInfo().getWeightedOrderShareScore());
        address.setAddressAccuracy(Integer.valueOf(enrichedAddress.getIntelligenceBlock().getAddressAccuracy().getNumber()));
        return address;
    }

    public static final RequestCtx getRequestCtx(String str) {
        RequestCtx.Builder newBuilder = RequestCtx.newBuilder();
        newBuilder.setMarketPlaceId(MarketplaceProto.MarketPlaceId.MARKET_PLACE_ID_SWIGGY_IN);
        ClientCtx.Builder newBuilder2 = ClientCtx.newBuilder();
        newBuilder2.setClientId("android-consumer-app");
        if (str == null) {
            str = "";
        }
        newBuilder2.setSource(str);
        newBuilder.setClientCtx(newBuilder2.build());
        RequestCtx build = newBuilder.build();
        p.i(build, "newBuilder().apply {\n   …  }.build()\n    }.build()");
        return build;
    }

    public static final UpdateAddressRequest updateAddress(PostableUpdateAddress postableUpdateAddress) {
        p.j(postableUpdateAddress, "<this>");
        UpdateAddressRequest.Builder newBuilder = UpdateAddressRequest.newBuilder();
        newBuilder.setEntityCtx(getEntityCtx(postableUpdateAddress.getUserId()));
        newBuilder.setRequestCtx(getRequestCtx(postableUpdateAddress.getLaunchSource()));
        UpdateAddressRequest build = newBuilder.setAddress(createMapsAddressRequest$default(postableUpdateAddress, false, 2, (Object) null)).setId(postableUpdateAddress.getAddressId()).build();
        p.i(build, "newBuilder().apply {\n   …dressId)\n        .build()");
        return build;
    }

    private static final AddressCategory getAddressCategory(AddressInfo addressInfo) {
        String addressAnnotation = addressInfo.getAddressAnnotation();
        if (addressAnnotation != null) {
            int hashCode = addressAnnotation.hashCode();
            if (hashCode != -524144264) {
                if (hashCode != 2255103) {
                    if (hashCode == 2702129 && addressAnnotation.equals(AddressTag.TypeString.WORK_TAG_STRING)) {
                        return AddressCategory.ADDRESS_CATEGORY_WORK;
                    }
                } else if (addressAnnotation.equals(AddressTag.TypeString.HOME_TAG_STRING)) {
                    return AddressCategory.ADDRESS_CATEGORY_HOME;
                }
            } else if (addressAnnotation.equals(AddressTag.TypeString.FRIENDS_AND_FAMILY_TAG_STRING)) {
                return AddressCategory.ADDRESS_CATEGORY_FRIENDS_AND_FAMILY;
            }
        }
        return AddressCategory.ADDRESS_CATEGORY_OTHER;
    }
}

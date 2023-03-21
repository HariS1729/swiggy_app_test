package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.MessageOrBuilder;
import com.swiggy.platform.shared.marketplace.v1.MarketplaceProto;

public interface RequestCtxOrBuilder extends MessageOrBuilder {
    MarketplaceProto.BusinessLine getBusinesslineId();

    int getBusinesslineIdValue();

    MarketplaceProto.Category getCategoryId();

    int getCategoryIdValue();

    ClientCtx getClientCtx();

    ClientCtxOrBuilder getClientCtxOrBuilder();

    MarketplaceProto.MarketPlaceId getMarketplaceId();

    int getMarketplaceIdValue();

    boolean hasClientCtx();
}

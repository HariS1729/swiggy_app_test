package in.swiggy.android.tejas.deliveryInstructions.usecase;

import in.swiggy.android.tejas.deliveryInstructions.repository.DeliveryInstructionsUpdateRepo;
import javax.inject.Provider;
import qq.e;

public final class GetAddressFromOrderUseCase_Factory implements e<GetAddressFromOrderUseCase> {
    private final Provider<DeliveryInstructionsUpdateRepo> diUpdateRepoProvider;

    public GetAddressFromOrderUseCase_Factory(Provider<DeliveryInstructionsUpdateRepo> provider) {
        this.diUpdateRepoProvider = provider;
    }

    public static GetAddressFromOrderUseCase_Factory create(Provider<DeliveryInstructionsUpdateRepo> provider) {
        return new GetAddressFromOrderUseCase_Factory(provider);
    }

    public static GetAddressFromOrderUseCase newInstance(DeliveryInstructionsUpdateRepo deliveryInstructionsUpdateRepo) {
        return new GetAddressFromOrderUseCase(deliveryInstructionsUpdateRepo);
    }

    public GetAddressFromOrderUseCase get() {
        return newInstance(this.diUpdateRepoProvider.get());
    }
}

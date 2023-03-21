package in.swiggy.android.tejas.deliveryInstructions.usecase;

import in.swiggy.android.tejas.deliveryInstructions.repository.DeliveryInstructionsUpdateRepo;
import javax.inject.Provider;
import qq.e;

public final class UpdateDelInstructionUseCase_Factory implements e<UpdateDelInstructionUseCase> {
    private final Provider<DeliveryInstructionsUpdateRepo> diUpdateRepoProvider;

    public UpdateDelInstructionUseCase_Factory(Provider<DeliveryInstructionsUpdateRepo> provider) {
        this.diUpdateRepoProvider = provider;
    }

    public static UpdateDelInstructionUseCase_Factory create(Provider<DeliveryInstructionsUpdateRepo> provider) {
        return new UpdateDelInstructionUseCase_Factory(provider);
    }

    public static UpdateDelInstructionUseCase newInstance(DeliveryInstructionsUpdateRepo deliveryInstructionsUpdateRepo) {
        return new UpdateDelInstructionUseCase(deliveryInstructionsUpdateRepo);
    }

    public UpdateDelInstructionUseCase get() {
        return newInstance(this.diUpdateRepoProvider.get());
    }
}

package in.swiggy.android.tejas.feature.google.directionscache.di;

import in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepository;
import in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsRepositoryImpl;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import in.swiggy.android.tejas.flush.SharedPrefFlushManagerImpl;

/* compiled from: SharedPrefDirectionsModule.kt */
public interface SharedPrefDirectionsModule {
    DirectionsRepository bindDirectionsRepository(DirectionsRepositoryImpl directionsRepositoryImpl);

    SharedPrefFlushManager bindSharedPrefFlushManager(SharedPrefFlushManagerImpl sharedPrefFlushManagerImpl);
}

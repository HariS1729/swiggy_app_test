package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: InvalidationLiveDataContainer */
class v {

    /* renamed from: a  reason: collision with root package name */
    final Set<LiveData> f11633a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f11634b;

    v(RoomDatabase roomDatabase) {
        this.f11634b = roomDatabase;
    }
}

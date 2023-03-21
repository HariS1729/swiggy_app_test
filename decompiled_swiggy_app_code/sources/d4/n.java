package d4;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.a;
import androidx.work.c;
import androidx.work.d;
import androidx.work.e;
import com.google.common.util.concurrent.b;
import e4.i;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SuppressLint({"AddedAbstractMethod"})
/* compiled from: WorkManager */
public abstract class n {
    protected n() {
    }

    public static n k(Context context) {
        return i.s(context);
    }

    public static void m(Context context, a aVar) {
        i.m(context, aVar);
    }

    public final m a(String str, ExistingWorkPolicy existingWorkPolicy, c cVar) {
        return b(str, existingWorkPolicy, Collections.singletonList(cVar));
    }

    public abstract m b(String str, ExistingWorkPolicy existingWorkPolicy, List<c> list);

    public abstract j c(String str);

    public abstract j d(String str);

    public abstract j e(UUID uuid);

    public final j f(e eVar) {
        return g(Collections.singletonList(eVar));
    }

    public abstract j g(List<? extends e> list);

    public abstract j h(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, d dVar);

    public j i(String str, ExistingWorkPolicy existingWorkPolicy, c cVar) {
        return j(str, existingWorkPolicy, Collections.singletonList(cVar));
    }

    public abstract j j(String str, ExistingWorkPolicy existingWorkPolicy, List<c> list);

    public abstract b<List<WorkInfo>> l(String str);
}

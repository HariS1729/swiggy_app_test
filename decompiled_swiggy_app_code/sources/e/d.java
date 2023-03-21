package e;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ActivityResultContracts.kt */
public final class d extends a<Intent, ActivityResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14158a = new a((i) null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        p.j(context, LogCategory.CONTEXT);
        p.j(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public ActivityResult c(int i11, Intent intent) {
        return new ActivityResult(i11, intent);
    }
}

package p3;

import android.content.Context;
import android.net.Uri;
import com.brentvatne.react.ReactVideoViewManager;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.p;

/* compiled from: ListBuilder.kt */
public final class b extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, Uri uri, long j) {
        super(context, uri, j);
        p.k(context, LogCategory.CONTEXT);
        p.k(uri, ReactVideoViewManager.PROP_SRC_URI);
    }
}

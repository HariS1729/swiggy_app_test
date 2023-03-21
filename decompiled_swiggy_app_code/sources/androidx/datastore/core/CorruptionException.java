package androidx.datastore.core;

import com.newrelic.agent.android.agentdata.HexAttribute;
import java.io.IOException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Serializer.kt */
public final class CorruptionException extends IOException {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CorruptionException(String str, Throwable th2, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th2) {
        super(str, th2);
        p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
    }
}

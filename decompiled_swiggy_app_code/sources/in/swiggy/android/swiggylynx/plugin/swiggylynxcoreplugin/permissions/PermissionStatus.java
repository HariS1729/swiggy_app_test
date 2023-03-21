package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.permissions;

import kotlin.jvm.internal.i;
import kotlinx.serialization.KSerializer;

/* compiled from: PermissionStatus.kt */
public enum PermissionStatus {
    GRANTED,
    DENIED;
    
    public static final Companion Companion = null;

    /* compiled from: PermissionStatus.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<PermissionStatus> serializer() {
            return PermissionStatus$$serializer.INSTANCE;
        }
    }

    static {
        Companion = new Companion((i) null);
    }
}

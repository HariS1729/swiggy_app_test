package in.swiggy.android.tejas.error;

import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Error.kt */
public abstract class Error {
    private final String sid;
    private final String tid;

    /* compiled from: Error.kt */
    public static final class BlackZoneError extends Error {
        private final String message;
        private final String title;

        public BlackZoneError(String str, String str2, String str3, String str4) {
            super(str3, str4, (i) null);
            this.title = str;
            this.message = str2;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Error.kt */
    public static final class DescriptiveError extends Error {
        private final int code;
        private final String message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DescriptiveError(int i11, String str, String str2, String str3) {
            super(str2, str3, (i) null);
            p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
            this.code = i11;
            this.message = str;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: Error.kt */
    public static final class ExpiredTokenError extends Error {
        private final String message;

        public ExpiredTokenError() {
            this((String) null, 1, (i) null);
        }

        public ExpiredTokenError(String str) {
            super((String) null, (String) null, 3, (i) null);
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExpiredTokenError(String str, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: Error.kt */
    public static final class InternalError extends Error {
        private final Integer code;
        private final String statusMessage;
        private final String statusTitle;

        public InternalError() {
            this((String) null, (String) null, (Integer) null, 7, (i) null);
        }

        public InternalError(String str, String str2, Integer num) {
            super((String) null, (String) null, 3, (i) null);
            this.statusTitle = str;
            this.statusMessage = str2;
            this.code = num;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getStatusMessage() {
            return this.statusMessage;
        }

        public final String getStatusTitle() {
            return this.statusTitle;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InternalError(String str, String str2, Integer num, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num);
        }
    }

    /* compiled from: Error.kt */
    public static final class LocationNotServiceableError extends Error {
        public LocationNotServiceableError(String str, String str2) {
            super(str, str2, (i) null);
        }
    }

    /* compiled from: Error.kt */
    public static final class NoNetworkError extends Error {
        public NoNetworkError() {
            super((String) null, (String) null, 3, (i) null);
        }
    }

    /* compiled from: Error.kt */
    public static final class ThrottleError extends Error {
        public ThrottleError() {
            super((String) null, (String) null, 3, (i) null);
        }
    }

    /* compiled from: Error.kt */
    public static final class UnhandledError extends Error {
        private final Integer code;
        private final String message;
        private final Throwable throwable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnhandledError(String str, Integer num, String str2, String str3, Throwable th2) {
            super(str2, str3, (i) null);
            p.j(str, HexAttribute.HEX_ATTR_MESSAGE);
            this.message = str;
            this.code = num;
            this.throwable = th2;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UnhandledError(String str, Integer num, String str2, String str3, Throwable th2, int i11, i iVar) {
            this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : th2);
        }
    }

    /* compiled from: Error.kt */
    public static final class UnhandledExceptionError extends Error {
        private final Throwable error;
        private final String message;

        public UnhandledExceptionError() {
            this((Throwable) null, (String) null, 3, (i) null);
        }

        public UnhandledExceptionError(Throwable th2, String str) {
            super((String) null, (String) null, 3, (i) null);
            this.error = th2;
            this.message = str;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public String toString() {
            Throwable th2 = this.error;
            String message2 = th2 == null ? null : th2.getMessage();
            return message2 == null ? super.toString() : message2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UnhandledExceptionError(Throwable th2, String str, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : th2, (i11 & 2) != 0 ? null : str);
        }
    }

    private Error(String str, String str2) {
        this.tid = str;
        this.sid = str2;
    }

    public /* synthetic */ Error(String str, String str2, i iVar) {
        this(str, str2);
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getTid() {
        return this.tid;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Error(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i) null);
    }
}

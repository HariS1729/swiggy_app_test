package in.swiggy.android.tejas;

import in.swiggy.android.tejas.error.Error;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Response.kt */
public abstract class Response<T> {
    public static final Companion Companion = new Companion((i) null);

    /* compiled from: Response.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ Response failure$default(Companion companion, Error error, Boolean bool, Object obj, Integer num, String str, int i11, Object obj2) {
            return companion.failure(error, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str);
        }

        public static /* synthetic */ Response success$default(Companion companion, Object obj, Boolean bool, Integer num, int i11, Object obj2) {
            if ((i11 & 2) != 0) {
                bool = null;
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            return companion.success(obj, bool, num);
        }

        public final Response failure(Error error, Boolean bool, Object obj, Integer num, String str) {
            p.j(error, "error");
            return new Failure(error, bool, obj, num, str);
        }

        public final <T> Response<T> success(T t, Boolean bool, Integer num) {
            return new Success(t, bool, num);
        }
    }

    /* compiled from: Response.kt */
    public static final class Failure extends Response {
        private final Error error;
        private final String errorMessage;
        private final Integer httpStatusCode;
        private final Boolean isCached;
        private final Object response;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(Error error2, Boolean bool, Object obj, Integer num, String str, int i11, i iVar) {
            this(error2, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : obj, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Error error2, Boolean bool, Object obj, Integer num, String str, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                error2 = failure.error;
            }
            if ((i11 & 2) != 0) {
                bool = failure.isCached;
            }
            Boolean bool2 = bool;
            if ((i11 & 4) != 0) {
                obj = failure.response;
            }
            Object obj3 = obj;
            if ((i11 & 8) != 0) {
                num = failure.httpStatusCode;
            }
            Integer num2 = num;
            if ((i11 & 16) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(error2, bool2, obj3, num2, str);
        }

        public final Error component1() {
            return this.error;
        }

        public final Boolean component2() {
            return this.isCached;
        }

        public final Object component3() {
            return this.response;
        }

        public final Integer component4() {
            return this.httpStatusCode;
        }

        public final String component5() {
            return this.errorMessage;
        }

        public final Failure copy(Error error2, Boolean bool, Object obj, Integer num, String str) {
            p.j(error2, "error");
            return new Failure(error2, bool, obj, num, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return p.e(this.error, failure.error) && p.e(this.isCached, failure.isCached) && p.e(this.response, failure.response) && p.e(this.httpStatusCode, failure.httpStatusCode) && p.e(this.errorMessage, failure.errorMessage);
        }

        public final Error getError() {
            return this.error;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public final Object getResponse() {
            return this.response;
        }

        public int hashCode() {
            int hashCode = this.error.hashCode() * 31;
            Boolean bool = this.isCached;
            int i11 = 0;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Object obj = this.response;
            int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Integer num = this.httpStatusCode;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.errorMessage;
            if (str != null) {
                i11 = str.hashCode();
            }
            return hashCode4 + i11;
        }

        public final Boolean isCached() {
            return this.isCached;
        }

        public String toString() {
            return "Failure(error=" + this.error + ", isCached=" + this.isCached + ", response=" + this.response + ", httpStatusCode=" + this.httpStatusCode + ", errorMessage=" + this.errorMessage + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Error error2, Boolean bool, Object obj, Integer num, String str) {
            super((i) null);
            p.j(error2, "error");
            this.error = error2;
            this.isCached = bool;
            this.response = obj;
            this.httpStatusCode = num;
            this.errorMessage = str;
        }
    }

    /* compiled from: Response.kt */
    public static final class Success<T> extends Response<T> {
        private final Integer httpStatusCode;
        private Boolean isCached;
        private final T response;

        public Success(T t, Boolean bool, Integer num) {
            super((i) null);
            this.response = t;
            this.isCached = bool;
            this.httpStatusCode = num;
        }

        public static /* synthetic */ Success copy$default(Success success, T t, Boolean bool, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                t = success.response;
            }
            if ((i11 & 2) != 0) {
                bool = success.isCached;
            }
            if ((i11 & 4) != 0) {
                num = success.httpStatusCode;
            }
            return success.copy(t, bool, num);
        }

        public final T component1() {
            return this.response;
        }

        public final Boolean component2() {
            return this.isCached;
        }

        public final Integer component3() {
            return this.httpStatusCode;
        }

        public final Success<T> copy(T t, Boolean bool, Integer num) {
            return new Success<>(t, bool, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return p.e(this.response, success.response) && p.e(this.isCached, success.isCached) && p.e(this.httpStatusCode, success.httpStatusCode);
        }

        public final Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public final T getResponse() {
            return this.response;
        }

        public int hashCode() {
            T t = this.response;
            int i11 = 0;
            int hashCode = (t == null ? 0 : t.hashCode()) * 31;
            Boolean bool = this.isCached;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.httpStatusCode;
            if (num != null) {
                i11 = num.hashCode();
            }
            return hashCode2 + i11;
        }

        public final Boolean isCached() {
            return this.isCached;
        }

        public final void setCached(Boolean bool) {
            this.isCached = bool;
        }

        public String toString() {
            return "Success(response=" + this.response + ", isCached=" + this.isCached + ", httpStatusCode=" + this.httpStatusCode + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Success(Object obj, Boolean bool, Integer num, int i11, i iVar) {
            this(obj, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : num);
        }
    }

    private Response() {
    }

    public /* synthetic */ Response(i iVar) {
        this();
    }

    public String toString() {
        if (this instanceof Success) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Success[response=");
            Success success = (Success) this;
            sb2.append(success.getResponse());
            sb2.append(",httpStatusCode=");
            sb2.append(success.getHttpStatusCode());
            sb2.append(",isCached=");
            sb2.append(success.isCached());
            sb2.append(']');
            return sb2.toString();
        } else if (this instanceof Failure) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failure[error");
            Failure failure = (Failure) this;
            sb3.append(failure.getError());
            sb3.append(",response=");
            sb3.append(failure.getResponse());
            sb3.append(",,httpStatusCode=");
            sb3.append(failure.getHttpStatusCode());
            sb3.append(",isCached=");
            sb3.append(failure.isCached());
            sb3.append(']');
            return sb3.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}

package in.swiggy.android.tejas.feature.chathead;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ChatResponse.kt */
public abstract class ChatResponse<T> {
    public static final Companion Companion = new Companion((i) null);

    /* compiled from: ChatResponse.kt */
    public static final class CatchFailure extends ChatResponse {
        private final Error.UnhandledExceptionError data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CatchFailure(Error.UnhandledExceptionError unhandledExceptionError) {
            super((i) null);
            p.j(unhandledExceptionError, CardTypeAdapterFactory.DATA);
            this.data = unhandledExceptionError;
        }

        public static /* synthetic */ CatchFailure copy$default(CatchFailure catchFailure, Error.UnhandledExceptionError unhandledExceptionError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                unhandledExceptionError = catchFailure.data;
            }
            return catchFailure.copy(unhandledExceptionError);
        }

        public final Error.UnhandledExceptionError component1() {
            return this.data;
        }

        public final CatchFailure copy(Error.UnhandledExceptionError unhandledExceptionError) {
            p.j(unhandledExceptionError, CardTypeAdapterFactory.DATA);
            return new CatchFailure(unhandledExceptionError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CatchFailure) && p.e(this.data, ((CatchFailure) obj).data);
        }

        public final Error.UnhandledExceptionError getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "CatchFailure(data=" + this.data + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final <T> ChatResponse<T> failure(Error error) {
            p.j(error, "error");
            return new Failure(error);
        }

        public final <T> ChatResponse<T> onComplete(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new OnComplete(t);
        }

        public final <T> ChatResponse<T> otherErrors(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new OtherErrors(t);
        }

        public final <T> ChatResponse<T> sessionInvalid(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new SessionInvalid(t);
        }

        public final <T> ChatResponse<T> success(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new Success(t);
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class Failure<T> extends ChatResponse<T> {
        private final Error error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Error error2) {
            super((i) null);
            p.j(error2, "error");
            this.error = error2;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Error error2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                error2 = failure.error;
            }
            return failure.copy(error2);
        }

        public final Error component1() {
            return this.error;
        }

        public final Failure<T> copy(Error error2) {
            p.j(error2, "error");
            return new Failure<>(error2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && p.e(this.error, ((Failure) obj).error);
        }

        public final Error getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class OnComplete<T> extends ChatResponse<T> {
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnComplete(T t) {
            super((i) null);
            p.j(t, CardTypeAdapterFactory.DATA);
            this.data = t;
        }

        public static /* synthetic */ OnComplete copy$default(OnComplete onComplete, T t, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                t = onComplete.data;
            }
            return onComplete.copy(t);
        }

        public final T component1() {
            return this.data;
        }

        public final OnComplete<T> copy(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new OnComplete<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnComplete) && p.e(this.data, ((OnComplete) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "OnComplete(data=" + this.data + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class OnJobComplete extends ChatResponse {
        private final Throwable data;

        public OnJobComplete(Throwable th2) {
            super((i) null);
            this.data = th2;
        }

        public static /* synthetic */ OnJobComplete copy$default(OnJobComplete onJobComplete, Throwable th2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                th2 = onJobComplete.data;
            }
            return onJobComplete.copy(th2);
        }

        public final Throwable component1() {
            return this.data;
        }

        public final OnJobComplete copy(Throwable th2) {
            return new OnJobComplete(th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnJobComplete) && p.e(this.data, ((OnJobComplete) obj).data);
        }

        public final Throwable getData() {
            return this.data;
        }

        public int hashCode() {
            Throwable th2 = this.data;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            return "OnJobComplete(data=" + this.data + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class OtherErrors<T> extends ChatResponse<T> {
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OtherErrors(T t) {
            super((i) null);
            p.j(t, CardTypeAdapterFactory.DATA);
            this.data = t;
        }

        public static /* synthetic */ OtherErrors copy$default(OtherErrors otherErrors, T t, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                t = otherErrors.data;
            }
            return otherErrors.copy(t);
        }

        public final T component1() {
            return this.data;
        }

        public final OtherErrors<T> copy(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new OtherErrors<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OtherErrors) && p.e(this.data, ((OtherErrors) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "OtherErrors(data=" + this.data + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class SessionInvalid<T> extends ChatResponse<T> {
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionInvalid(T t) {
            super((i) null);
            p.j(t, CardTypeAdapterFactory.DATA);
            this.data = t;
        }

        public static /* synthetic */ SessionInvalid copy$default(SessionInvalid sessionInvalid, T t, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                t = sessionInvalid.data;
            }
            return sessionInvalid.copy(t);
        }

        public final T component1() {
            return this.data;
        }

        public final SessionInvalid<T> copy(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new SessionInvalid<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionInvalid) && p.e(this.data, ((SessionInvalid) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SessionInvalid(data=" + this.data + ')';
        }
    }

    /* compiled from: ChatResponse.kt */
    public static final class Success<T> extends ChatResponse<T> {
        private final T data;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(T t) {
            super((i) null);
            p.j(t, CardTypeAdapterFactory.DATA);
            this.data = t;
        }

        public static /* synthetic */ Success copy$default(Success success, T t, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                t = success.data;
            }
            return success.copy(t);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && p.e(this.data, ((Success) obj).data);
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    private ChatResponse() {
    }

    public /* synthetic */ ChatResponse(i iVar) {
        this();
    }
}

package in.swiggy.android.tejas.feature.instamart;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: InstamartResponse.kt */
public abstract class InstamartResponse<T> {
    public static final Companion Companion = new Companion((i) null);

    /* compiled from: InstamartResponse.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final <T> InstamartResponse<T> failure(Error error) {
            p.j(error, "error");
            return new Failure(error);
        }

        public final <T> InstamartResponse<T> success(T t) {
            p.j(t, CardTypeAdapterFactory.DATA);
            return new Success(t);
        }
    }

    /* compiled from: InstamartResponse.kt */
    public static final class Failure<T> extends InstamartResponse<T> {
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

    /* compiled from: InstamartResponse.kt */
    public static final class Success<T> extends InstamartResponse<T> {
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

    private InstamartResponse() {
    }

    public /* synthetic */ InstamartResponse(i iVar) {
        this();
    }
}

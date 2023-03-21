package arrow.core;

import kotlin.jvm.internal.p;

/* compiled from: Try.kt */
public abstract class TryException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f12483a;

    /* compiled from: Try.kt */
    public static final class PredicateException extends TryException {

        /* renamed from: b  reason: collision with root package name */
        private final String f12484b;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof PredicateException) && p.e(getMessage(), ((PredicateException) obj).getMessage());
            }
            return true;
        }

        public String getMessage() {
            return this.f12484b;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "PredicateException(message=" + getMessage() + ")";
        }
    }

    /* compiled from: Try.kt */
    public static final class UnsupportedOperationException extends TryException {

        /* renamed from: b  reason: collision with root package name */
        private final String f12485b;

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof UnsupportedOperationException) && p.e(getMessage(), ((UnsupportedOperationException) obj).getMessage());
            }
            return true;
        }

        public String getMessage() {
            return this.f12485b;
        }

        public int hashCode() {
            String message = getMessage();
            if (message != null) {
                return message.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "UnsupportedOperationException(message=" + getMessage() + ")";
        }
    }

    public String getMessage() {
        return this.f12483a;
    }
}

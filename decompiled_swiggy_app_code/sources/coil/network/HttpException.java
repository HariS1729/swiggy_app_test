package coil.network;

import okhttp3.Response;

/* compiled from: HttpException.kt */
public final class HttpException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final Response f13662a;

    public HttpException(Response response) {
        super("HTTP " + response.code() + ": " + response.message());
        this.f13662a = response;
    }
}

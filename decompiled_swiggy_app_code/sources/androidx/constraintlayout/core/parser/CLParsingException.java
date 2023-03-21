package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f8088a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8089b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8090c;

    public CLParsingException(String str, c cVar) {
        this.f8088a = str;
        if (cVar != null) {
            this.f8090c = cVar.k();
            this.f8089b = cVar.i();
            return;
        }
        this.f8090c = "unknown";
        this.f8089b = 0;
    }

    public String a() {
        return this.f8088a + " (" + this.f8090c + " at line " + this.f8089b + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}

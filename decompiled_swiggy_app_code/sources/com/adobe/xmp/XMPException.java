package com.adobe.xmp;

public class XMPException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private int f13706a;

    public XMPException(String str, int i11) {
        super(str);
        this.f13706a = i11;
    }

    public XMPException(String str, int i11, Throwable th2) {
        super(str, th2);
        this.f13706a = i11;
    }

    public int a() {
        return this.f13706a;
    }
}

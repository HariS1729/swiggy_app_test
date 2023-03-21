package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
public enum zzhe {
    DOUBLE(zzhf.DOUBLE, 1),
    FLOAT(zzhf.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzhf.BOOLEAN, 0),
    STRING(zzhf.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzhf.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzhf.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzhf zzt;

    private zzhe(zzhf zzhf, int i11) {
        this.zzt = zzhf;
    }

    public final zzhf zza() {
        return this.zzt;
    }
}

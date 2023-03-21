package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AccountType;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzai implements Result {
    private static final Account zza = new Account("DUMMY_NAME", AccountType.GOOGLE);
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    public final Status getStatus() {
        return this.zzb;
    }
}

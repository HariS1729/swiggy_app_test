package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import ej.f;
import zj.i;

/* renamed from: com.google.android.gms.internal.auth-api.zbay  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth@@20.1.0 */
public final class zbay extends GoogleApi {
    private static final Api.ClientKey zba;
    private static final Api.AbstractClientBuilder zbb;
    private static final Api zbc;
    private final String zbd = zbbb.zba();

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zba = clientKey;
        zbat zbat = new zbat();
        zbb = zbat;
        zbc = new Api("Auth.Api.Identity.SignIn.API", zbat, clientKey);
    }

    public zbay(Activity activity, f fVar) {
        super(activity, zbc, fVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest.a x02 = BeginSignInRequest.x0(beginSignInRequest);
        x02.e(this.zbd);
        BeginSignInRequest a11 = x02.a();
        return doRead(TaskApiCall.builder().setFeatures(zbba.zba).run(new zbaq(this, a11)).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new ApiException(Status.RESULT_CANCELED);
            } else if (status.isSuccess()) {
                String stringExtra = intent.getStringExtra("phone_number_hint_result");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new ApiException(Status.RESULT_INTERNAL_ERROR);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        return doRead(TaskApiCall.builder().setFeatures(zbba.zbh).run(new zbar(this, getPhoneNumberHintIntentRequest)).setMethodKey(1653).build());
    }

    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new ApiException(Status.RESULT_CANCELED);
            } else if (status.isSuccess()) {
                SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
                if (signInCredential != null) {
                    return signInCredential;
                }
                throw new ApiException(Status.RESULT_INTERNAL_ERROR);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
    }

    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        GetSignInIntentRequest.a x02 = GetSignInIntentRequest.x0(getSignInIntentRequest);
        x02.f(this.zbd);
        GetSignInIntentRequest a11 = x02.a();
        return doRead(TaskApiCall.builder().setFeatures(zbba.zbf).run(new zbas(this, a11)).setMethodKey(1555).build());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(zbba.zbb).run(new zbap(this)).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zba(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbaz zbaz, i iVar) throws RemoteException {
        ((zbai) zbaz.getService()).zbd(new zbax(this, iVar), getPhoneNumberHintIntentRequest, this.zbd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zbb(zbaz zbaz, i iVar) throws RemoteException {
        ((zbai) zbaz.getService()).zbf(new zbav(this, iVar), this.zbd);
    }

    public zbay(Context context, f fVar) {
        super(context, zbc, fVar, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}

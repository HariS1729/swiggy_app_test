package q0;

import androidx.compose.ui.autofill.AutofillType;
import bp0.h;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAutofillType.android.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<AutofillType, String> f16272a = x.h(h.a(AutofillType.EmailAddress, "emailAddress"), h.a(AutofillType.Username, "username"), h.a(AutofillType.Password, "password"), h.a(AutofillType.NewUsername, "newUsername"), h.a(AutofillType.NewPassword, "newPassword"), h.a(AutofillType.PostalAddress, "postalAddress"), h.a(AutofillType.PostalCode, "postalCode"), h.a(AutofillType.CreditCardNumber, "creditCardNumber"), h.a(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), h.a(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), h.a(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), h.a(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), h.a(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), h.a(AutofillType.AddressCountry, "addressCountry"), h.a(AutofillType.AddressRegion, "addressRegion"), h.a(AutofillType.AddressLocality, "addressLocality"), h.a(AutofillType.AddressStreet, "streetAddress"), h.a(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), h.a(AutofillType.PostalCodeExtended, "extendedPostalCode"), h.a(AutofillType.PersonFullName, "personName"), h.a(AutofillType.PersonFirstName, "personGivenName"), h.a(AutofillType.PersonLastName, "personFamilyName"), h.a(AutofillType.PersonMiddleName, "personMiddleName"), h.a(AutofillType.PersonMiddleInitial, "personMiddleInitial"), h.a(AutofillType.PersonNamePrefix, "personNamePrefix"), h.a(AutofillType.PersonNameSuffix, "personNameSuffix"), h.a(AutofillType.PhoneNumber, "phoneNumber"), h.a(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), h.a(AutofillType.PhoneCountryCode, "phoneCountryCode"), h.a(AutofillType.PhoneNumberNational, "phoneNational"), h.a(AutofillType.Gender, "gender"), h.a(AutofillType.BirthDateFull, "birthDateFull"), h.a(AutofillType.BirthDateDay, "birthDateDay"), h.a(AutofillType.BirthDateMonth, "birthDateMonth"), h.a(AutofillType.BirthDateYear, "birthDateYear"), h.a(AutofillType.SmsOtpCode, "smsOTPCode"));

    public static final String a(AutofillType autofillType) {
        p.j(autofillType, "<this>");
        String str = f16272a.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}

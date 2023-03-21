package com.google.android.gms.internal.auth;

import com.newrelic.agent.android.util.SafeJsonPrimitive;
import in.swiggy.android.tejas.network.HttpRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
final class zzfs {
    static String zza(zzfq zzfq, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzfq, sb2, 0);
        return sb2.toString();
    }

    static final void zzb(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i11, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i11, str, zzb2);
            }
        } else {
            sb2.append(10);
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                sb2.append(SafeJsonPrimitive.NULL_CHAR);
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgn.zza(zzeb.zzl((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzeb) {
                sb2.append(": \"");
                sb2.append(zzgn.zza((zzeb) obj));
                sb2.append('\"');
            } else if (obj instanceof zzeq) {
                sb2.append(" {");
                zzd((zzeq) obj, sb2, i11 + 2);
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(SafeJsonPrimitive.NULL_CHAR);
                    i12++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i14 = i11 + 2;
                zzb(sb2, i14, HttpRequest.HEADER_KEY, entry.getKey());
                zzb(sb2, i14, "value", entry.getValue());
                sb2.append("\n");
                while (i12 < i11) {
                    sb2.append(SafeJsonPrimitive.NULL_CHAR);
                    i12++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzfq zzfq, StringBuilder sb2, int i11) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z11;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : zzfq.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str8 : treeSet) {
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith(PDListAttributeObject.OWNER_LIST) && !substring.endsWith("OrBuilderList") && !substring.equals(PDListAttributeObject.OWNER_LIST)) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i11, zzc(str7), zzeq.zzf(method2, zzfq, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i11, zzc(str6), zzeq.zzf(method3, zzfq, new Object[0]));
                }
            }
            if (substring.length() != 0) {
                str = "set".concat(substring);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (substring.length() != 0) {
                    str3 = "get".concat(substring);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (substring.length() != 0) {
                    str4 = "has".concat(substring);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object zzf = zzeq.zzf(method4, zzfq, new Object[0]);
                    if (method5 == null) {
                        if (zzf instanceof Boolean) {
                            if (!((Boolean) zzf).booleanValue()) {
                            }
                        } else if (zzf instanceof Integer) {
                            if (((Integer) zzf).intValue() == 0) {
                            }
                        } else if (zzf instanceof Float) {
                            if (((Float) zzf).floatValue() == 0.0f) {
                            }
                        } else if (!(zzf instanceof Double)) {
                            if (zzf instanceof String) {
                                z11 = zzf.equals("");
                            } else if (zzf instanceof zzeb) {
                                z11 = zzf.equals(zzeb.zzb);
                            } else if (zzf instanceof zzfq) {
                                if (zzf == ((zzfq) zzf).zzh()) {
                                }
                            } else if ((zzf instanceof Enum) && ((Enum) zzf).ordinal() == 0) {
                            }
                            if (z11) {
                            }
                        } else if (((Double) zzf).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) zzeq.zzf(method5, zzfq, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i11, zzc(str2), zzf);
                }
            }
        }
        if (!(zzfq instanceof zzep)) {
            zzgq zzgq = ((zzeq) zzfq).zzc;
            if (zzgq != null) {
                zzgq.zze(sb2, i11);
                return;
            }
            return;
        }
        zzep zzep = (zzep) zzfq;
        throw null;
    }
}

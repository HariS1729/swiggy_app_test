package e7;

import com.adobe.xmp.XMPException;
import d7.d;
import d7.e;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class f {
    private static m a(k kVar, m mVar, Node node, String str, boolean z11) throws XMPException {
        e a11 = d.a();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String a12 = a11.a(namespaceURI);
            if (a12 == null) {
                a12 = a11.b(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
            }
            String str2 = a12 + node.getLocalName();
            g7.e eVar = new g7.e();
            boolean z12 = false;
            if (z11) {
                mVar = n.i(kVar.b(), namespaceURI, "_dflt", true);
                mVar.U(false);
                if (a11.d(str2) != null) {
                    kVar.b().S(true);
                    mVar.S(true);
                    z12 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            m mVar2 = new m(str2, str, eVar);
            mVar2.R(z12);
            if (!equals2) {
                mVar.c(mVar2);
            } else {
                mVar.a(1, mVar2);
            }
            if (equals2) {
                if (z11 || !mVar.s().q()) {
                    throw new XMPException("Misplaced rdf:value element", 202);
                }
                mVar.T(true);
            }
            if (equals) {
                if (mVar.s().i()) {
                    mVar2.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                } else {
                    throw new XMPException("Misplaced rdf:li element", 202);
                }
            }
            return mVar2;
        }
        throw new XMPException("XML namespace required for all elements and attributes", 202);
    }

    private static m b(m mVar, String str, String str2) throws XMPException {
        if ("xml:lang".equals(str)) {
            str2 = h.h(str2);
        }
        m mVar2 = new m(str, str2, (g7.e) null);
        mVar.d(mVar2);
        return mVar2;
    }

    private static void c(m mVar) throws XMPException {
        m m11 = mVar.m(1);
        if (m11.s().h()) {
            if (!mVar.s().h()) {
                m u11 = m11.u(1);
                m11.N(u11);
                mVar.d(u11);
            } else {
                throw new XMPException("Redundant xml:lang for rdf:value element", 203);
            }
        }
        for (int i11 = 1; i11 <= m11.w(); i11++) {
            mVar.d(m11.u(i11));
        }
        for (int i12 = 2; i12 <= mVar.o(); i12++) {
            mVar.d(mVar.m(i12));
        }
        mVar.T(false);
        mVar.s().B(false);
        mVar.s().r(m11.s());
        mVar.Y(m11.y());
        mVar.L();
        Iterator G = m11.G();
        while (G.hasNext()) {
            mVar.c((m) G.next());
        }
    }

    private static int d(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    private static boolean e(int i11) {
        return 1 <= i11 && i11 <= 7;
    }

    private static boolean f(int i11) {
        return 10 <= i11 && i11 <= 12;
    }

    private static boolean g(int i11) {
        if (i11 == 8 || f(i11)) {
            return false;
        }
        return !e(i11);
    }

    private static boolean h(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i11 = 0; i11 < nodeValue.length(); i11++) {
            if (!Character.isWhitespace(nodeValue.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    static k i(Node node) throws XMPException {
        k kVar = new k();
        u(kVar, node);
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(e7.k r16, e7.m r17, org.w3c.dom.Node r18, boolean r19) throws com.adobe.xmp.XMPException {
        /*
            r0 = r16
            boolean r1 = r18.hasChildNodes()
            r2 = 202(0xca, float:2.83E-43)
            if (r1 != 0) goto L_0x0157
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0010:
            org.w3c.dom.NamedNodeMap r9 = r18.getAttributes()
            int r9 = r9.getLength()
            java.lang.String r10 = "Unrecognized attribute of empty property element"
            r11 = 6
            r12 = 5
            r13 = 2
            java.lang.String r14 = "xml:lang"
            java.lang.String r15 = "xmlns"
            if (r4 >= r9) goto L_0x00b2
            org.w3c.dom.NamedNodeMap r9 = r18.getAttributes()
            org.w3c.dom.Node r9 = r9.item(r4)
            java.lang.String r1 = r9.getPrefix()
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = r9.getPrefix()
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = r9.getNodeName()
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0047
            goto L_0x00ae
        L_0x0047:
            int r1 = d(r9)
            java.lang.String r15 = "Empty property element can't have both rdf:value and rdf:resource"
            if (r1 == 0) goto L_0x007e
            if (r1 == r13) goto L_0x00ae
            java.lang.String r13 = "Empty property element can't have both rdf:resource and rdf:nodeID"
            if (r1 == r12) goto L_0x0067
            if (r1 != r11) goto L_0x0061
            if (r6 != 0) goto L_0x005b
            r8 = 1
            goto L_0x00ae
        L_0x005b:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r0.<init>(r13, r2)
            throw r0
        L_0x0061:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r0.<init>(r10, r2)
            throw r0
        L_0x0067:
            if (r8 != 0) goto L_0x0078
            if (r5 != 0) goto L_0x0070
            if (r5 != 0) goto L_0x006e
            r3 = r9
        L_0x006e:
            r6 = 1
            goto L_0x00ae
        L_0x0070:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r1 = 203(0xcb, float:2.84E-43)
            r0.<init>(r15, r1)
            throw r0
        L_0x0078:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r0.<init>(r13, r2)
            throw r0
        L_0x007e:
            java.lang.String r1 = r9.getLocalName()
            java.lang.String r10 = "value"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = r9.getNamespaceURI()
            java.lang.String r10 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x00a3
            if (r6 != 0) goto L_0x009b
            r3 = r9
            r5 = 1
            goto L_0x00ae
        L_0x009b:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r1 = 203(0xcb, float:2.84E-43)
            r0.<init>(r15, r1)
            throw r0
        L_0x00a3:
            java.lang.String r1 = r9.getNodeName()
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x00ae
            r7 = 1
        L_0x00ae:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x00b2:
            java.lang.String r1 = ""
            r4 = r17
            r8 = r18
            r9 = r19
            e7.m r4 = a(r0, r4, r8, r1, r9)
            if (r5 != 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00c3
            goto L_0x00cf
        L_0x00c3:
            if (r7 == 0) goto L_0x00e2
            g7.e r1 = r4.s()
            r6 = 1
            r1.B(r6)
            r1 = 1
            goto L_0x00e3
        L_0x00cf:
            r6 = 1
            if (r3 == 0) goto L_0x00d6
            java.lang.String r1 = r3.getNodeValue()
        L_0x00d6:
            r4.Y(r1)
            if (r5 != 0) goto L_0x00e2
            g7.e r1 = r4.s()
            r1.C(r6)
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            r5 = 0
        L_0x00e4:
            org.w3c.dom.NamedNodeMap r6 = r18.getAttributes()
            int r6 = r6.getLength()
            if (r5 >= r6) goto L_0x0156
            org.w3c.dom.NamedNodeMap r6 = r18.getAttributes()
            org.w3c.dom.Node r6 = r6.item(r5)
            if (r6 == r3) goto L_0x0152
            java.lang.String r7 = r6.getPrefix()
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L_0x0152
            java.lang.String r7 = r6.getPrefix()
            if (r7 != 0) goto L_0x0113
            java.lang.String r7 = r6.getNodeName()
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0113
            goto L_0x0152
        L_0x0113:
            int r7 = d(r6)
            if (r7 == 0) goto L_0x0130
            if (r7 == r13) goto L_0x0152
            if (r7 == r12) goto L_0x0126
            if (r7 != r11) goto L_0x0120
            goto L_0x0152
        L_0x0120:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            r0.<init>(r10, r2)
            throw r0
        L_0x0126:
            java.lang.String r6 = r6.getNodeValue()
            java.lang.String r7 = "rdf:resource"
        L_0x012c:
            b(r4, r7, r6)
            goto L_0x0152
        L_0x0130:
            java.lang.String r7 = r6.getNodeName()
            if (r1 != 0) goto L_0x013b
            java.lang.String r6 = r6.getNodeValue()
            goto L_0x012c
        L_0x013b:
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L_0x0149
            java.lang.String r6 = r6.getNodeValue()
            b(r4, r14, r6)
            goto L_0x0152
        L_0x0149:
            java.lang.String r7 = r6.getNodeValue()
            r9 = 0
            a(r0, r4, r6, r7, r9)
            goto L_0x0153
        L_0x0152:
            r9 = 0
        L_0x0153:
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x0156:
            return
        L_0x0157:
            com.adobe.xmp.XMPException r0 = new com.adobe.xmp.XMPException
            java.lang.String r1 = "Nested content not allowed with rdf:resource or property attributes"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.f.j(e7.k, e7.m, org.w3c.dom.Node, boolean):void");
    }

    private static void k(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        m a11 = a(kVar, mVar, node, (String) null, z11);
        int i11 = 0;
        for (int i12 = 0; i12 < node.getAttributes().getLength(); i12++) {
            Node item = node.getAttributes().item(i12);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ("xml:lang".equals(item.getNodeName())) {
                    b(a11, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new XMPException("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        while (i11 < node.getChildNodes().getLength()) {
            Node item2 = node.getChildNodes().item(i11);
            if (item2.getNodeType() == 3) {
                str = str + item2.getNodeValue();
                i11++;
            } else {
                throw new XMPException("Invalid child of literal property element", 202);
            }
        }
        a11.Y(str);
    }

    private static void l(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        int d11 = d(node);
        if (d11 != 8 && d11 != 0) {
            throw new XMPException("Node element must be rdf:Description or typed node", 202);
        } else if (!z11 || d11 != 0) {
            m(kVar, mVar, node, z11);
            t(kVar, mVar, node, z11);
        } else {
            throw new XMPException("Top level typed node not allowed", 203);
        }
    }

    private static void m(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        int i11 = 0;
        for (int i12 = 0; i12 < node.getAttributes().getLength(); i12++) {
            Node item = node.getAttributes().item(i12);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                int d11 = d(item);
                if (d11 == 0) {
                    a(kVar, mVar, item, item.getNodeValue(), z11);
                } else if (d11 != 6 && d11 != 2 && d11 != 3) {
                    throw new XMPException("Invalid nodeElement attribute", 202);
                } else if (i11 <= 0) {
                    i11++;
                    if (z11 && d11 == 3) {
                        if (mVar.r() == null || mVar.r().length() <= 0) {
                            mVar.V(item.getNodeValue());
                        } else if (!mVar.r().equals(item.getNodeValue())) {
                            throw new XMPException("Mismatched top level rdf:about values", 203);
                        }
                    }
                } else {
                    throw new XMPException("Mutally exclusive about, ID, nodeID attributes", 202);
                }
            }
        }
    }

    private static void n(k kVar, m mVar, Node node) throws XMPException {
        for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
            Node item = node.getChildNodes().item(i11);
            if (!h(item)) {
                l(kVar, mVar, item, true);
            }
        }
    }

    private static void o() throws XMPException {
        throw new XMPException("ParseTypeCollection property element not allowed", 203);
    }

    private static void p() throws XMPException {
        throw new XMPException("ParseTypeLiteral property element not allowed", 203);
    }

    private static void q() throws XMPException {
        throw new XMPException("ParseTypeOther property element not allowed", 203);
    }

    private static void r(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        m a11 = a(kVar, mVar, node, "", z11);
        a11.s().B(true);
        for (int i11 = 0; i11 < node.getAttributes().getLength(); i11++) {
            Node item = node.getAttributes().item(i11);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                if ("xml:lang".equals(item.getNodeName())) {
                    b(a11, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"parseType".equals(localName))) {
                    throw new XMPException("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        t(kVar, a11, node, false);
        if (a11.q()) {
            c(a11);
        }
    }

    private static void s(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        if (g(d(node))) {
            NamedNodeMap attributes = node.getAttributes();
            ArrayList<String> arrayList = null;
            for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                Node item = attributes.item(i11);
                if ("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName()))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(item.getNodeName());
                }
            }
            if (arrayList != null) {
                for (String removeNamedItem : arrayList) {
                    attributes.removeNamedItem(removeNamedItem);
                }
            }
            if (attributes.getLength() <= 3) {
                int i12 = 0;
                while (i12 < attributes.getLength()) {
                    Node item2 = attributes.item(i12);
                    String localName = item2.getLocalName();
                    String namespaceURI = item2.getNamespaceURI();
                    String nodeValue = item2.getNodeValue();
                    if ("xml:lang".equals(item2.getNodeName()) && (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                        i12++;
                    } else if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        k(kVar, mVar, node, z11);
                        return;
                    } else if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        j(kVar, mVar, node, z11);
                        return;
                    } else if ("Literal".equals(nodeValue)) {
                        p();
                        return;
                    } else if ("Resource".equals(nodeValue)) {
                        r(kVar, mVar, node, z11);
                        return;
                    } else if ("Collection".equals(nodeValue)) {
                        o();
                        return;
                    } else {
                        q();
                        return;
                    }
                }
                if (node.hasChildNodes()) {
                    for (int i13 = 0; i13 < node.getChildNodes().getLength(); i13++) {
                        if (node.getChildNodes().item(i13).getNodeType() != 3) {
                            v(kVar, mVar, node, z11);
                            return;
                        }
                    }
                    k(kVar, mVar, node, z11);
                    return;
                }
            }
            j(kVar, mVar, node, z11);
            return;
        }
        throw new XMPException("Invalid property element name", 202);
    }

    private static void t(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
            Node item = node.getChildNodes().item(i11);
            if (!h(item)) {
                if (item.getNodeType() == 1) {
                    s(kVar, mVar, item, z11);
                } else {
                    throw new XMPException("Expected property element node not found", 202);
                }
            }
        }
    }

    static void u(k kVar, Node node) throws XMPException {
        if (node.hasAttributes()) {
            n(kVar, kVar.b(), node);
            return;
        }
        throw new XMPException("Invalid attributes of rdf:RDF element", 202);
    }

    private static void v(k kVar, m mVar, Node node, boolean z11) throws XMPException {
        XMPException xMPException;
        if (!z11 || !"iX:changes".equals(node.getNodeName())) {
            m a11 = a(kVar, mVar, node, "", z11);
            for (int i11 = 0; i11 < node.getAttributes().getLength(); i11++) {
                Node item = node.getAttributes().item(i11);
                if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                    String localName = item.getLocalName();
                    String namespaceURI = item.getNamespaceURI();
                    if ("xml:lang".equals(item.getNodeName())) {
                        b(a11, "xml:lang", item.getNodeValue());
                    } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        throw new XMPException("Invalid attribute for resource property element", 202);
                    }
                }
            }
            boolean z12 = false;
            for (int i12 = 0; i12 < node.getChildNodes().getLength(); i12++) {
                Node item2 = node.getChildNodes().item(i12);
                if (!h(item2)) {
                    if (item2.getNodeType() == 1 && !z12) {
                        boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item2.getNamespaceURI());
                        String localName2 = item2.getLocalName();
                        if (equals && "Bag".equals(localName2)) {
                            a11.s().s(true);
                        } else if (equals && "Seq".equals(localName2)) {
                            a11.s().s(true).v(true);
                        } else if (!equals || !"Alt".equals(localName2)) {
                            a11.s().B(true);
                            if (!equals && !"Description".equals(localName2)) {
                                String namespaceURI2 = item2.getNamespaceURI();
                                if (namespaceURI2 != null) {
                                    b(a11, "rdf:type", namespaceURI2 + ':' + localName2);
                                } else {
                                    throw new XMPException("All XML elements must be in a namespace", 203);
                                }
                            }
                        } else {
                            a11.s().s(true).v(true).u(true);
                        }
                        l(kVar, a11, item2, false);
                        if (a11.q()) {
                            c(a11);
                        } else if (a11.s().k()) {
                            n.d(a11);
                        }
                        z12 = true;
                    } else if (z12) {
                        throw xMPException;
                    } else {
                        xMPException = new XMPException("Children of resource property element must be XML elements", 202);
                        throw xMPException;
                    }
                }
            }
            if (!z12) {
                throw new XMPException("Missing child of resource property element", 202);
            }
        }
    }
}

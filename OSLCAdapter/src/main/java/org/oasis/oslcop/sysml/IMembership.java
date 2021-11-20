// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
 */
// End of user code

package org.oasis.oslcop.sysml;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.IAnnotation;
import org.oasis.oslcop.sysml.IComment;
import org.oasis.oslcop.sysml.IDocumentation;
import org.oasis.oslcop.sysml.IElement;
import org.oasis.oslcop.sysml.IMembership;
import org.oasis.oslcop.sysml.INamespace;
import org.eclipse.lyo.oslc.domains.IPerson;
import org.oasis.oslcop.sysml.IRelationship;
import org.oasis.oslcop.sysml.ITextualRepresentation;
// Start of user code imports
// End of user code

@OslcNamespace(SysmlDomainConstants.MEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.MEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "Membership Resource Shape", describes = SysmlDomainConstants.MEMBERSHIP_TYPE)
public interface IMembership
{


    @OslcName("memberName")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberName")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getMemberName();

    @OslcName("visibility")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "visibility")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"public", "private", "protected", "package"})
    public String getVisibility();

    @OslcName("memberElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberElement")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getMemberElement();

    @OslcName("membershipOwningNamespace")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "membershipOwningNamespace")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.NAMESPACE_TYPE})
    @OslcReadOnly(false)
    public Link getMembershipOwningNamespace();

    @OslcName("ownedMemberElement_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberElement_comp")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberElement_comp();

    @OslcName("ownedMemberElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberElement")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberElement();


    public void setMemberName(final String memberName );
    public void setVisibility(final String visibility );
    public void setMemberElement(final Link memberElement );
    public void setMembershipOwningNamespace(final Link membershipOwningNamespace );
    public void setOwnedMemberElement_comp(final Link ownedMemberElement_comp );
    public void setOwnedMemberElement(final Link ownedMemberElement );
}


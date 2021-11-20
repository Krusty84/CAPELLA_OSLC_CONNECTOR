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

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
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
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.oasis.oslcop.sysml.SysmlDomainConstants;
import org.oasis.oslcop.sysml.Relationship;

import org.oasis.oslcop.sysml.SysmlDomainConstants;

import org.oasis.oslcop.sysml.Annotation;
import org.oasis.oslcop.sysml.Comment;
import org.oasis.oslcop.sysml.Documentation;
import org.oasis.oslcop.sysml.Element;
import org.oasis.oslcop.sysml.Membership;
import org.oasis.oslcop.sysml.Namespace;
import org.eclipse.lyo.oslc.domains.Person;
import org.oasis.oslcop.sysml.Relationship;
import org.oasis.oslcop.sysml.TextualRepresentation;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(SysmlDomainConstants.MEMBERSHIP_NAMESPACE)
@OslcName(SysmlDomainConstants.MEMBERSHIP_LOCALNAME)
@OslcResourceShape(title = "Membership Resource Shape", describes = SysmlDomainConstants.MEMBERSHIP_TYPE)
public class Membership
    extends Relationship
    implements IMembership
{
    // Start of user code attributeAnnotation:memberName
    // End of user code
    private String memberName;
    // Start of user code attributeAnnotation:visibility
    // End of user code
    private String visibility;
    // Start of user code attributeAnnotation:memberElement
    // End of user code
    private Link memberElement;
    // Start of user code attributeAnnotation:membershipOwningNamespace
    // End of user code
    private Link membershipOwningNamespace;
    // Start of user code attributeAnnotation:ownedMemberElement_comp
    // End of user code
    private Link ownedMemberElement_comp;
    // Start of user code attributeAnnotation:ownedMemberElement
    // End of user code
    private Link ownedMemberElement;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Membership()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Membership(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        SysmlDomainConstants.MEMBERSHIP_PATH,
        Membership.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Membership Resource} - update Membership.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }
    
        // Start of user code toString_finalize
        result = getShortTitle();
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:memberName
    // End of user code
    @OslcName("memberName")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberName")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getMemberName()
    {
        // Start of user code getterInit:memberName
        // End of user code
        return memberName;
    }
    
    // Start of user code getterAnnotation:visibility
    // End of user code
    @OslcName("visibility")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "visibility")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcAllowedValue({"public", "private", "protected", "package"})
    public String getVisibility()
    {
        // Start of user code getterInit:visibility
        // End of user code
        return visibility;
    }
    
    // Start of user code getterAnnotation:memberElement
    // End of user code
    @OslcName("memberElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "memberElement")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getMemberElement()
    {
        // Start of user code getterInit:memberElement
        // End of user code
        return memberElement;
    }
    
    // Start of user code getterAnnotation:membershipOwningNamespace
    // End of user code
    @OslcName("membershipOwningNamespace")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "membershipOwningNamespace")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.NAMESPACE_TYPE})
    @OslcReadOnly(false)
    public Link getMembershipOwningNamespace()
    {
        // Start of user code getterInit:membershipOwningNamespace
        // End of user code
        return membershipOwningNamespace;
    }
    
    // Start of user code getterAnnotation:ownedMemberElement_comp
    // End of user code
    @OslcName("ownedMemberElement_comp")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberElement_comp")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberElement_comp()
    {
        // Start of user code getterInit:ownedMemberElement_comp
        // End of user code
        return ownedMemberElement_comp;
    }
    
    // Start of user code getterAnnotation:ownedMemberElement
    // End of user code
    @OslcName("ownedMemberElement")
    @OslcPropertyDefinition(SysmlDomainConstants.SYSML_NAMSPACE + "ownedMemberElement")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({SysmlDomainConstants.ELEMENT_TYPE})
    @OslcReadOnly(false)
    public Link getOwnedMemberElement()
    {
        // Start of user code getterInit:ownedMemberElement
        // End of user code
        return ownedMemberElement;
    }
    
    
    // Start of user code setterAnnotation:memberName
    // End of user code
    public void setMemberName(final String memberName )
    {
        // Start of user code setterInit:memberName
        // End of user code
        this.memberName = memberName;
    
        // Start of user code setterFinalize:memberName
        // End of user code
    }
    
    // Start of user code setterAnnotation:visibility
    // End of user code
    public void setVisibility(final String visibility )
    {
        // Start of user code setterInit:visibility
        // End of user code
        this.visibility = visibility;
    
        // Start of user code setterFinalize:visibility
        // End of user code
    }
    
    // Start of user code setterAnnotation:memberElement
    // End of user code
    public void setMemberElement(final Link memberElement )
    {
        // Start of user code setterInit:memberElement
        // End of user code
        this.memberElement = memberElement;
    
        // Start of user code setterFinalize:memberElement
        // End of user code
    }
    
    // Start of user code setterAnnotation:membershipOwningNamespace
    // End of user code
    public void setMembershipOwningNamespace(final Link membershipOwningNamespace )
    {
        // Start of user code setterInit:membershipOwningNamespace
        // End of user code
        this.membershipOwningNamespace = membershipOwningNamespace;
    
        // Start of user code setterFinalize:membershipOwningNamespace
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberElement_comp
    // End of user code
    public void setOwnedMemberElement_comp(final Link ownedMemberElement_comp )
    {
        // Start of user code setterInit:ownedMemberElement_comp
        // End of user code
        this.ownedMemberElement_comp = ownedMemberElement_comp;
    
        // Start of user code setterFinalize:ownedMemberElement_comp
        // End of user code
    }
    
    // Start of user code setterAnnotation:ownedMemberElement
    // End of user code
    public void setOwnedMemberElement(final Link ownedMemberElement )
    {
        // Start of user code setterInit:ownedMemberElement
        // End of user code
        this.ownedMemberElement = ownedMemberElement;
    
        // Start of user code setterFinalize:ownedMemberElement
        // End of user code
    }
    
    
}

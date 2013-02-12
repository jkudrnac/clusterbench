package org.jboss.test.clusterbench.ejb.stateless;

import org.jboss.ejb3.annotation.Clustered;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@Clustered
@TransactionAttribute(TransactionAttributeType.REQUIRED) // this is the default anyway
public class ForwardingStatelessSBImpl extends AbstractForwardingStatelessSBImpl
        implements RemoteStatelessSB {
}

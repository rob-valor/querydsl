/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.jdoql;

import com.mysema.query.Projectable;
import com.mysema.query.QueryModifiers;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.expr.EBoolean;
import com.mysema.query.types.path.PEntity;

/**
 * Query interface for JDOQL queries
 * 
 * @author tiwe
 * 
 */
public interface JDOQLQuery extends Projectable {

    JDOQLQuery from(PEntity<?>... o);

    JDOQLQuery orderBy(OrderSpecifier<?>... o);

    JDOQLQuery where(EBoolean... o);

    JDOQLQuery limit(long limit);

    JDOQLQuery offset(long offset);

    JDOQLQuery restrict(QueryModifiers mod);

}

/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.test.onlineTest;

import org.geoserver.data.test.SystemTestData;
import org.geoserver.test.NamespaceTestData;
import org.geotools.data.complex.AppSchemaDataAccessRegistry;

/**
 * 
 * @author Niels Charlier
 * 
 */
public class DataReferenceWmsOracleWithJoiningTest extends DataReferenceWmsOracleTest {

    public DataReferenceWmsOracleWithJoiningTest() throws Exception {
        super();
    }

    @Override
    protected void onSetUp(SystemTestData testData) throws Exception {
        AppSchemaDataAccessRegistry.getAppSchemaProperties().setProperty ("app-schema.joining", "true");
        super.onSetUp(testData);
    }
    
}

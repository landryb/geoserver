/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wfs.response.dxf;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Interface for a DXF Writer implementation.
 * DXF exists in many different versions, so we can expect many
 * different implementations, each one supporting one or more of 
 * these versions.
 * Implementations are registered as SPI and can be found using 
 * DXFWriterFinder.
 * 
 * @author Mauro Bartolomeoli, mbarto@infosia.it
 * 
 */
public interface DXFWriter {
    /**
     * Creates a new instance of the writer, 
     * using the given writer as output.
     * 
     * @param writer
     * @return
     */
    public DXFWriter newInstance(Writer writer);

    /**
     * Checks if the writer supports the requested dxf version.
     * 
     * @param version
     * @return
     */
    public boolean supportsVersion(String version);

    /**
     * Performs the actual writing.
     * 
     * @param featureList
     * @param version
     * @throws IOException
     */
    public void write(List featureList,String version) throws IOException;

    /**
     * Configure a writer option.
     * 
     * @param optionName
     * @param optionValue
     */
    public void setOption(String optionName, Object optionValue);

    /**
     * Gets the writer description.
     * 
     * @return
     */
    public String getDescription();
}

/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.geofence.gui.server.service;

import java.util.List;

import com.extjs.gxt.ui.client.data.PagingLoadResult;

import org.geoserver.geofence.gui.client.ApplicationException;
import org.geoserver.geofence.gui.client.model.GSInstanceModel;
import org.geoserver.geofence.gui.client.model.RuleModel;
import org.geoserver.geofence.gui.client.model.data.Layer;
import org.geoserver.geofence.gui.client.model.data.LayerStyle;
import org.geoserver.geofence.gui.client.model.data.WorkspaceModel;


// TODO: Auto-generated Javadoc
/**
 * The Interface IWorkspacesManagerService.
 */
public interface IWorkspacesManagerService
{

    /**
     * Gets the workspaces.
     *
     * @param config
     *            the config
     * @param URL
     *            the uRL
     * @return the workspaces
     * @throws ApplicationException
     *             the application exception
     */
    public PagingLoadResult<WorkspaceModel> getWorkspaces(int offset, int limit, String URL,
        GSInstanceModel gsInstance) throws ApplicationException;

    /**
     * Gets the layers.
     *
     * @param config
     *            the config
     * @param baseURL
     *            the base url
     * @param workspace
     *            the workspace
     * @return the layers
     * @throws ApplicationException
     *             the application exception
     */
    public PagingLoadResult<Layer> getLayers(int offset, int limit, String baseURL,
        GSInstanceModel gsInstance, String workspace, String service) throws ApplicationException;

    /**
     * @param gsInstance
     * @return List<LayerStyle>
     * @throws ApplicationException
     */
    public List<LayerStyle> getStyles(RuleModel rule) throws ApplicationException;
}

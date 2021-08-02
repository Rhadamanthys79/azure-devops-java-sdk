package org.azd.utils;

import org.azd.accounts.AccountsApi;
import org.azd.build.BuildApi;
import org.azd.connection.Connection;
import org.azd.core.CoreApi;
import org.azd.feedmanagement.FeedManagementApi;
import org.azd.git.GitApi;
import org.azd.graph.GraphApi;
import org.azd.interfaces.AzDClient;
import org.azd.memberentitlementmanagement.MemberEntitlementManagementApi;
import org.azd.release.ReleaseApi;
import org.azd.servicehooks.ServiceHooksApi;
import org.azd.wiki.WikiApi;
import org.azd.work.WorkApi;
import org.azd.workitemtracking.WorkItemTrackingApi;

/***
 * AzDClientApi class to easily call VSTS REST Api with the connection parameters
 */
public class AzDClientApi implements AzDClient {

    /***
     * Instance of connection object
     */
    private final Connection CONNECTION;

    /***
     * Pass the VSTS organization name and personal access token to create a connection object
     * @param organizationName VSTS/Azure DevOps services organization name
     * @param personalAccessToken Personal access token
     */
    public AzDClientApi(String organizationName, String personalAccessToken) {
        var connection = new Connection(organizationName, personalAccessToken);
        this.CONNECTION = connection;
    }

    /***
     * Pass the VSTS organization name, project name and personal access token to create a connection object
     * @param organizationName VSTS/Azure DevOps services organization name
     * @param projectName project name
     * @param personalAccessToken Personal access token
     */
    public AzDClientApi(String organizationName, String projectName, String personalAccessToken) {
        var connection = new Connection(organizationName, projectName, personalAccessToken);
        this.CONNECTION = connection;
    }

    /***
     * Returns an instance of AccountsApi
     * @return an instance of AccountsApi {@link AccountsApi}
     */
    @Override
    public AccountsApi getAccountsApi() { return new AccountsApi(CONNECTION); }

    /***
     * Returns an instance of Build Api
     * @return instance of BuildApi {@link BuildApi}
     */
    @Override
    public BuildApi getBuildApi() {
        return new BuildApi(CONNECTION);
    }

    /***
     * Returns an instance of Core Api
     * @return instance of CoreApi {@link CoreApi}
     */
    @Override
    public CoreApi getCoreApi() {
        return new CoreApi(CONNECTION);
    }

    /***
     * Returns an instance of FeedManagement Api
     * @return instance of Feed management Api {@link FeedManagementApi}
     */
    @Override
    public FeedManagementApi getFeedManagementApi() {
        return new FeedManagementApi(CONNECTION);
    }

    /***
     * Returns an instance of Git Api
     * @return instance of Git Api {@link GitApi}
     */
    @Override
    public GitApi getGitApi() { return new GitApi(CONNECTION); }

    /***
     * Returns an instance of GraphApi
     * @return instance of Graph Api {@link GraphApi}
     */
    @Override
    public GraphApi getGraphApi() { return new GraphApi(CONNECTION); }

    /***
     * Returns an instance of Member Entitlement management Api
     * @return instance of Member Entitle management Api {@link MemberEntitlementManagementApi}
     */
    @Override
    public MemberEntitlementManagementApi getMemberEntitlementManagementApi() { return new MemberEntitlementManagementApi(CONNECTION); }

    /***
     * Returns an instance of Release Api
     * @return instance of Release Api {@link ReleaseApi}
     */
    @Override
    public ReleaseApi getReleaseApi() { return new ReleaseApi(CONNECTION); }

    /***
     * Returns an instance of Service Hooks Api
     * @return instance of Service Hooks Api {@link ServiceHooksApi}
     */
    @Override
    public ServiceHooksApi getServiceHooksApi() { return new ServiceHooksApi(CONNECTION); }

    /***
     * Returns an instance of WikiApi
     * @return instance of Wiki Api {@link WikiApi}
     */
    @Override
    public WikiApi getWikiApi() { return new WikiApi(CONNECTION); }

    /***
     * Returns an instance of Work Api
     * @return instance of Work Api {@link WorkApi}
     */
    @Override
    public WorkApi getWorkApi() { return new WorkApi(CONNECTION); }

    /***
     * Returns an instance of Work item tracking Api
     * @return instance of work item tracking Api {@link WorkItemTrackingApi}
     */
    @Override
    public WorkItemTrackingApi getWorkItemTrackingApi() { return new WorkItemTrackingApi(CONNECTION); }
}
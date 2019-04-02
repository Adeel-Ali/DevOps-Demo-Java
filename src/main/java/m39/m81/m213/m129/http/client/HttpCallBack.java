/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated for testing by APIMATIC v2.0 ( https://apimatic.io ).
 */
package m39.m81.m213.m129.http.client;

import m39.m81.m213.m129.http.request.HttpRequest;

/**
 * Callback to be called before and after the HTTP call for an endpoint is made 
 */
public interface HttpCallBack {
    /**
     * Callback called just before the HTTP request is sent 
     * @param request The HTTP request to be executed
     */
    public void OnBeforeRequest(HttpRequest request);
    
    /**
     * Callback called just after the HTTP response is received
     * @param context Context for the HTTP call
     */
    public void OnAfterResponse(HttpContext context);
}
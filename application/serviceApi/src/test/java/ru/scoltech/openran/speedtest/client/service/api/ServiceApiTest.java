/*
 * Service API
 * Speedtest iperf service
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dev@5gst.ru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.scoltech.openran.speedtest.client.service.api;

import ru.scoltech.openran.speedtest.client.service.model.IperfArgs;
import ru.scoltech.openran.speedtest.client.service.model.IperfMeasurement;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceApi
 */
@Ignore
public class ServiceApiTest {

    private final ServiceApi api = new ServiceApi();

    
    /**
     * 
     *
     * Returns iperf speed probes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getIperfSpeedProbesTest() throws Exception {
        Integer fromProbe = null;
        IperfMeasurement response = api.getIperfSpeedProbes(fromProbe);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startIperfTest() throws Exception {
        IperfArgs data = null;
        api.startIperf(data);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startSessionTest() throws Exception {
        api.startSession();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopIperfTest() throws Exception {
        api.stopIperf();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopSessionTest() throws Exception {
        api.stopSession();

        // TODO: test validations
    }
    
}

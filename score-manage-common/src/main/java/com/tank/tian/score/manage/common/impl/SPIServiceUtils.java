package com.tank.tian.score.manage.common.impl;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * SPI Service utils
 * @author  
 *
 */
public final class SPIServiceUtils {
    private SPIServiceUtils() {

    }

    /**
     * get target service.if target services are array,only random access to a service.
     * @param serviceType service type
     * @return target service,if no service, it will return null.
     */
    public static <T> T getTargetService(Class<T> serviceType) {
        ServiceLoader<T> loader = ServiceLoader.load(serviceType);
        Iterator<T> targetServices = loader.iterator();
        while (targetServices.hasNext()) {
            T service = targetServices.next();
            return service;
        }
        return null;
    }
}

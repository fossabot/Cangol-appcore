package mobi.cangol.mobile.service.route;

import mobi.cangol.mobile.service.AppService;

/**
 * Created by xuewu.wei on 2018/10/15.
 */
public interface RouteService extends AppService {
    /**
     * 注册 （注解）
     *
     * @param clazz
     */
    void register(Class clazz);

    /**
     * 注册 （非注解）
     *
     * @param path
     * @param clazz
     */
    void register(String path, Class clazz);

    /**
     * @param path
     */
    void unregister(String path);

    /**
     * @param onNavigation
     */
    void registerNavigation(OnNavigation onNavigation);

    /**
     * 构造器
     *
     * @param path
     * @return
     */
    RouteBuilder build(String path);
}

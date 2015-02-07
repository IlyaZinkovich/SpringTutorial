package tutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {

    private List<Point> points;

    private ApplicationContext context = null;

    public void draw() {
        points.forEach(System.out::println);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: " + s);
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void init() {
        System.out.println("Initialization");
    }

    public void destroyBean() {
        System.out.println("Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean destroy method");
    }
}

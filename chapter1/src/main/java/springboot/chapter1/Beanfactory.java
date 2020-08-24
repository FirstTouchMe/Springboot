package springboot.chapter1;


import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.core.ResolvableType;

public interface Beanfactory {

    String FACTORY_BEAN_PREFIX="&";

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name ,Class<T> requiredType) throws BeansException;

    <T> T getBean(Class<T> requiredType) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;

    <T> T getBean(Class<T> requiredType,Object... args) throws BeansException;

    //是否包含bean
    boolean containBean(String name);

    //bean是否单例
    boolean isSingleton(String name) throws NoSuchBeanDefinitionException;

    //bean是否原型
    boolean isPrototype(String name) throws NoSuchBeanDefinitionException;

    //是否类型匹配
    boolean isTypeMatch(String name, ResolvableType typeToMatch) throws NoSuchBeanDefinitionException;

    boolean isTypeMatch(String name, Class<?> typeTomatch) throws NoSuchBeanDefinitionException;

    Class<?> getType(String name) throws NoSuchBeanDefinitionException;

    String[] getAliases(String name);

}

public interface IoCContext extends AutoCloseable{
    void registerBean(Class<?> beanClazz);
    <T> T getBean(Class<? super T> resolveClazz);
    <T> void registerBean(Class<? super T> resolveClazz, Class<T> beanClazz);
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());


        Cat beanCat1 = applicationContext.getBean("catBean", Cat.class);
        beanCat1.catSay();
        Cat beanCat2 = applicationContext.getBean("catBean", Cat.class);
        beanCat2.catSay();


        System.out.printf("Ссылаются ли %s (ссылка - %s) и %s (ссылка - %s) на один и тот же объект -> "
                + (bean1 == bean2), bean1.getClass(),bean1, bean2.getClass(),bean2);

        System.out.println("\n========================================================================");

        System.out.printf("Ссылаются ли %s (ссылка - %s) и %s (ссылка - %s) на один и тот же объект -> "
                + (beanCat1 == beanCat2), beanCat1.getClass(), beanCat1, beanCat2.getClass(), beanCat2);
    }
}
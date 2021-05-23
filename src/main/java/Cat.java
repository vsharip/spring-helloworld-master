import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
public class Cat {
    public void catSay() {
        System.out.println("Мяу - мяу");
    }
}

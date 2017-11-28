import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greetName() {
        assertThat(greeter.greet("name")).isEqualTo("Hello < name >");
    }
}

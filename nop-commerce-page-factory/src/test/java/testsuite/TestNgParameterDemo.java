package testsuite;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameterDemo {
    @Test
    @Parameters("MyName")
    public void test(@Optional("Jay") String name){
        System.out.println("Name is : "+name);
    }
}

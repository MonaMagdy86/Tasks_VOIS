package Tests;

import org.testng.annotations.Test;

public class SignInTest extends TestBase{
    @Test
    public void SignIn(){
        signInPage.signInSteps("Monam2715@gmail.com","Mona@1234");
    }
}

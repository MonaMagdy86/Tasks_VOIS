package Tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase{
    static void TakeSnapshot(String name) throws IOException {
        File SrcFile= ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("D:\\projects\\Task1_VOIS\\SnapShots\\"+name+".png"));

    }
}

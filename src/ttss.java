import org.junit.Test;

import java.io.IOException;

public class ttss {
    @Test
    public void ss() throws IOException, InterruptedException {
        String str = "D:/Progra~1/Tencent/QQ/Bin/QQScLauncher.exe";

        Runtime.getRuntime().exec("cmd /c start " + str).waitFor();
    }
}

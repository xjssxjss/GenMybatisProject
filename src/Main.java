import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static URL xmlpath = null;

    @Before
    public void initUrl(){
        xmlpath = this.getClass().getClassLoader().getResource("");
    }

    /**
     * 逆向工程运行
     */
    @Test
    public void genereateExec() {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //指向逆向工程的配置文件（项目根路径不要有中文，如果有的话建议使用绝对路径）
        File configFile = new File(xmlpath.getPath()+"generatorConfig.xml");
        System.out.println("加载xml文件路径>>>>>>>>>>>>>>>"+configFile);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        MyBatisGenerator myBatisGenerator = null;
        try {
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

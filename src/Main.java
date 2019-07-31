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
     * ���򹤳�����
     */
    @Test
    public void genereateExec() {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //ָ�����򹤳̵������ļ�����Ŀ��·����Ҫ�����ģ�����еĻ�����ʹ�þ���·����
        File configFile = new File(xmlpath.getPath()+"generatorConfig.xml");
        System.out.println("����xml�ļ�·��>>>>>>>>>>>>>>>"+configFile);
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

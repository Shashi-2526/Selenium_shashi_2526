package genricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author hp
 */
public class FileUtility {
	/**
	 * It is used to read data from property file
	 * user must pass key and it return value
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getDataFromproperty(String key) throws IOException  {
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata/commondata.properties");
	Properties prop=new Properties();
	prop.load(fis);
return	prop.getProperty(key);
	
}
}

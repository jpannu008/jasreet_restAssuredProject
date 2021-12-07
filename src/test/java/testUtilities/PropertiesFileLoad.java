package testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	public static Properties propertiesFileLoad(String path) throws IOException {
		File f = new File("E:\\jasreet_restAssuredProject\\" + "Environment.Properties");

		FileInputStream fr = new FileInputStream(f);

		Properties pr = new Properties();

		pr.load(fr);

		return pr;

	}

}

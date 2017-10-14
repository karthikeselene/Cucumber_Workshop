package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import stepDefinitions.BaseSteps;

public class ReadYml extends BaseSteps{
	
	@Test
	public void readYmlFile() throws FileNotFoundException, YamlException{
		YamlReader reader = new YamlReader(new FileReader("./testdata/testdata.yml"));
		Object obj= reader.read();
		getTestExtract = new HashMap<String, String>();		
		getTestExtract = (Map<String, String>) obj;		
		System.out.println(getTestExtract.get("username"));
		System.out.println(getTestExtract.get("password"));		
	}

}

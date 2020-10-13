package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonfileLoad {
	//It is a generic method = file dedo - uska data uthalega
	public static String loadfile(String path) throws FileNotFoundException// json file ko load krega ye method
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject j = new JSONObject(js);
		
		return j.toString();//ye learn krna bohot zaruri hai - return data string mai convert nhi ho rha tha , toh to.string lga diya return value ke saath
	}

}

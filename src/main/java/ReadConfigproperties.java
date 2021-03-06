import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
	
	public class ReadConfigproperties {
		String propFileName="config.properties";
	 		
		ReadConfigproperties(String propFileName){
			this.propFileName=propFileName;		
		}

		public String getPropValue(String property) throws IOException {
			String result = "";
			InputStream inputStream =null;
			
			try {
				Properties prop = new Properties();
	 
				inputStream = getClass().getClassLoader().getResourceAsStream(this.propFileName);
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
				}
	 
	 
				// get the property value and return it 
	 
				result = prop.getProperty(property);
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			return result;
			
		}
	}


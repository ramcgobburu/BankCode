package pb.register.newcustomer.main;

public class TestIT  {
	
	public String stepsPath;
	
	public TestIT() {
		super();
		String storyNames = storyNamesFromEnvironmentVariable();
		if(!storyNames.isEmpty()) {
			System.out.println("starwars");
			
		}
	}
	
	/** to run a specific story */
	
	private String storyNamesFromEnvironmentVariable() {
		
		String propVal = System.getProperty("story");
		System.out.println("************"+propVal);
		String storyPaths = "";
		
		if(propVal!= null && !propVal.isEmpty()) {
			String[] splittedVals = propVal.split(",");
			for (int i=0;i<splittedVals.length; i++) {
				
				String story = splittedVals[i].trim();
				if(!story.contains(".story")) {
					story = "**/"+story+".story";
					
				}else {
					story = "**/"+story;
				}
				
				if(!storyPaths.isEmpty()) {
					storyPaths = storyPaths+ ",";
				}
				
				storyPaths = storyPaths + story;
			}
			
		}
		System.out.println("starwars 1"+storyPaths);
		return storyPaths;
	}

	public String getStepsPackage() {
		
		String path = "";
		
		if(storyNamesFromEnvironmentVariable().contains("TestNewCustomer.story")) {
			path = "pb.register.newcustomer.scripts";
		}
		return path;
		
	}

}

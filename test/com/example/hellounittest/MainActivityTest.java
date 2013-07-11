package com.example.hellounittest;

import android.test.ActivityInstrumentationTestCase2;
import com.example.hellounittest.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>  {

	public MainActivityTest(Class<MainActivity> activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}
	
	private MainActivity mActivity;
	
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
    }

    //@Test
    public void testAddHelloLogic() {
        assertEquals("Hello, Hoge!", mActivity.addHello("Hoge"));
    }
    
    public void testAddHello2() {
    	assertEquals("Hello, HAD!", mActivity.addHello("HAD"));
    }
    
    public void testAddHello3() {
    	assertEquals("Hello, World!", mActivity.addHello("WOrld"));
    }
    
    
    @Override
    protected void tearDown() throws Exception {
        // TODO Release memory etc.
        super.tearDown();
    }
    /*
    @Test
    public void testButton() throws Exception {
    	Intent intent = new Intent();
    	// Create Target Class Instance 
    	MainActivity activity = startActivity(intent, null, null);
    	final Button button = (Button)activity.findViewById(com.sony.example.hellojunit.R.id.btn1);
    	
    	activity.runOnUiThread(new Runnable() {
    		@Override
    		public void run() {
    			// Invoke Click Event w/o pressing the button
    			button.performClick();
    		}
    	});
    	getInstrumentation().waitForIdleSync();
    	
    	// Check that Activity as required is running
    	Intent target = getStartedActivityIntent();
    	String ret = target.getComponent().getClassName();
    	assertEquals(SecondActivity.class.getName(), ret);
    	
    	// Check the request code 
    	int request_code = getStartedActivityRequest();
    	assertEquals(100, request_code);
    	
    }
    */	

}

###Volley For Android 

- Very simple and easy code to integrate the volley in your android project to make get post put request .Just copy my VolleyRequest.java class to make the request.


#### Step 1:  
-Add this line into your gradle .

    implementation 'com.android.volley:volley:1.1.0' 
	
	
#### Step 2:  
-Add this permission into your manifest.


      <uses-permission android:name="android.permission.INTERNET" />
	  
	  
### Step 3:  
-Copy my  VolleyRequest.java file into your project:

### Step 4:  
-Copy this code call request.


```
//initialize my class
    VolleyRequest vr = new VolleyRequest(MainActivity.this);
    
	//create JSONObject to send in the body of the post request.
            try{
                JSONObject js = new JSONObject();
                js.accumulate("email", "tasfiqul.ghani@northsouth.edu");
                js.accumulate("password","www.Tashfik.me");
				
				//call request in the parameter add the json you created above  					//and in the Second parameter add the api URL.
                vr.VolleyPost(js.toString(),"www.tashfik.me/api/test/getrequest");
    
            }catch (Exception e){
    
            }
    
    		//Listener for response
            vr.setListener(new VolleyRequest.MyServerListener(){
    
    
                @Override
                public void onResponse(JSONObject response) {
    			//here you will get response
                    Toast.makeText(MainActivity.this, ""+response.toString(), Toast.LENGTH_SHORT).show();
    
                }
                @Override
                public void onError(String error) {
                    Toast.makeText(MainActivity.this, ""+error.toString(), Toast.LENGTH_SHORT).show();
                }
    
            });```



For more visit www.tashfik.me . thanks.

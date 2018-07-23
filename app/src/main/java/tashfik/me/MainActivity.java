package tashfik.me;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VolleyRequest vr = new VolleyRequest(MainActivity.this);

        try{
            JSONObject js = new JSONObject();
            js.accumulate("email", "tasfiqul.ghani@northsouth.edu");
            js.accumulate("password","www.Tashfik.me");
            vr.VolleyPost(js.toString(),"www.tashfik.me/api/test/getrequest");

        }catch (Exception e){

        }


        vr.setListener(new VolleyRequest.MyServerListener(){


            @Override
            public void onResponse(JSONObject response) {

                Toast.makeText(MainActivity.this, ""+response.toString(), Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onError(String error) {
                Toast.makeText(MainActivity.this, ""+error.toString(), Toast.LENGTH_SHORT).show();
            }

        });

    }
}

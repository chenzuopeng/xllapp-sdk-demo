package org.xllapp.sdk.demo;

import java.util.ArrayList;
import java.util.List;

import org.xllapp.sdk.core.ApiClient;
import org.xllapp.sdk.core.ApiConfig;
import org.xllapp.sdk.core.ApiResponse;
import org.xllapp.sdk.core.ResponseListener;
import org.xllapp.sdk.demo.R;

import com.xllapp.sdk.ConfigRequest;
import com.xllapp.sdk.UserActionRequest;
import com.xllapp.sdk.UserActionRequest.UserAction;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((Button) findViewById(R.id.button1)).setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {

		ApiClient apiClient = ApiClient.getApiClient(new ApiConfig() {

			@Override
			public String getServer() {
				return "http://10.0.2.2:8080";
			}

			@Override
			public String getDes3Key() {
				return "b5eefe0437d945b98e82f46fbff8d3552c2ff6f7f8acd8de";
			}

			@Override
			public String getAppKey() {
				return "75BD2E98AC17564B2DB7C74B064F5084C6557FDDF3E4C286";
			}

			@Override
			public String getProductId() {
				return "icity";
			}

			@Override
			public String getClientType() {
				return "phone";
			}

			@Override
			public String getClientVersion() {
				return "700";
			}

			@Override
			public String getClientChannelType() {
				return "91";
			}

			@Override
			public String getImsi() {
				return "abc";
			}

			@Override
			public String getImei() {
				return "123";
			}



		});



/*		DemoApiRequest request = new DemoApiRequest(apiClient);
		request.setOrgCode("100");
		request.setMobile("189");*/

/*		DemoGetApiRequest request = new DemoGetApiRequest(apiClient);
		request.setOrgCode("100");
		request.setMobile("189");
		request.setCityCode("afsdf大水法@#￥%");*/

/*		ConfigRequest request = new ConfigRequest(apiClient);
		request.setOrgCode("100");
		request.setCityCode("3501");
		request.setGroups(new String[]{"a","b"});
//		request.setKeys(new String[]{"key1","key2","3"});
		request.setMobile("189");
		request.setLatitude("1");
		request.setLongitude("2");*/

		UserActionRequest request = new UserActionRequest(apiClient);
		List<UserAction> actions=new ArrayList<UserActionRequest.UserAction>();
		UserAction userAction= new UserAction();
		userAction.setActionType("click");
		userAction.setAreaId("abc");
		actions.add(userAction);

		UserAction userAction2= new UserAction();
		userAction2.setActionType("click");
		userAction2.setAreaId("123");
		actions.add(userAction2);

		request.setActions(actions.toArray(new UserAction[0]));
		request.setOrgCode("100");
		request.setCityCode("3501");
		request.setMobile("189");
		request.setLatitude("123");
		request.setLongitude("345");

		try {
			// apiClient.sendSyncRequest(request);

			ResponseListener responseListener=new ResponseListener() {

				@Override
				public void onSuccess(ApiResponse response) {
                     System.out.println(response);
				}

				@Override
				public void onFailure(Throwable throwable) {
					throwable.printStackTrace();
				}
			};

			apiClient.sendAsyncRequest(request, responseListener);

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * final String
		 * url="http://10.0.2.2:8080/icity-api-archetype-mysql/demo/json";
		 *
		 * final String json="{}";
		 */

		/*
		 * AsyncHttpHelper.doPost(url, null, json, new RequestListener() {
		 *
		 * @Override public void onException(Throwable throwable) {
		 * throwable.printStackTrace(); }
		 *
		 * @Override public void onComplete(int statusCode, String response) {
		 * System.out.println("----"+statusCode+":"+response); } });
		 */

		/*
		 * new Thread(new Runnable() {
		 *
		 * @Override public void run() {
		 *
		 * SyncHttpClient client = new SyncHttpClient();
		 *
		 * HttpEntity entity=null; try { entity = new StringEntity("{}",
		 * "UTF-8"); } catch (UnsupportedEncodingException e) {
		 * e.printStackTrace(); }
		 *
		 * client.post(null,url,entity,"application/json", new
		 * TextHttpResponseHandler() {
		 *
		 * @Override public void onSuccess(int statusCode, Header[] headers,
		 * String responseString) { System.out.println(statusCode);
		 * System.out.println(Arrays.toString(headers));
		 * System.out.println(responseString); }
		 *
		 * @Override public void onFailure(int statusCode, Header[] headers,
		 * String responseString, Throwable throwable) {
		 * System.err.println(statusCode);
		 * System.err.println(Arrays.toString(headers));
		 * System.err.println(responseString+""); throwable.printStackTrace(); }
		 * });
		 *
		 * System.out.println("---next----"); } }).start();
		 */

		/*
		 * AsyncHttpClient client = new AsyncHttpClient();
		 *
		 * // SyncHttpClient client = new SyncHttpClient();
		 *
		 * HttpEntity entity=null; try { entity = new StringEntity("{}",
		 * "UTF-8"); } catch (UnsupportedEncodingException e) {
		 * e.printStackTrace(); }
		 *
		 * client.post(null,url,entity,"application/json", new
		 * TextHttpResponseHandler() {
		 *
		 * @Override public void onSuccess(int statusCode, Header[] headers,
		 * String responseString) { System.out.println(statusCode);
		 * System.out.println(Arrays.toString(headers));
		 * System.out.println(responseString); }
		 *
		 * @Override public void onFailure(int statusCode, Header[] headers,
		 * String responseString, Throwable throwable) {
		 * System.err.println(statusCode);
		 * System.err.println(Arrays.toString(headers));
		 * System.err.println(responseString+""); } });
		 *
		 * System.out.println("---next----");
		 */

		System.out.println("---next----");
	}
}

package org.xllapp.sdk.demo;

import org.json.JSONObject;
import org.xllapp.sdk.core.ApiClient;
import org.xllapp.sdk.core.ApiResponse;
import org.xllapp.sdk.core.JsonPostApiRequest;

/**
 *
 *
 * @author dylan.chen Sep 24, 2014
 *
 */
public class DemoApiRequest extends JsonPostApiRequest {

	private String mobile;

	private String[] arrry = { "1", "2" };

	private Object[] objects = { "===", new Demo(),new Demo(),123 };

	public static class Demo{

		private int d1 = 123;

		private String[] arrry = { "a", "c" };

	}

	public DemoApiRequest(ApiClient apiClient) {
		super(apiClient);
	}

	@Override
	public String[] getSignItems() {
		return new String[] { this.getImsi(), this.getImei() };
	}

	@Override
	public String getUri() {
		return "/xll-app-api-demo/demo/json";
	}

	@Override
	public DemoApiResponse getResponse(JSONObject jsonObject) {
		return new DemoApiResponse(jsonObject);
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

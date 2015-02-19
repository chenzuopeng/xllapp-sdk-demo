package org.xllapp.sdk.demo;

import org.json.JSONObject;
import org.xllapp.sdk.core.ApiClient;
import org.xllapp.sdk.core.ApiResponse;
import org.xllapp.sdk.core.GetApiRequest;
import org.xllapp.sdk.core.util.ReflectionUtils.FieldName;

/**
 *
 *
 * @author dylan.chen Sep 25, 2014
 *
 */
public class DemoGetApiRequest extends GetApiRequest{

	@FieldName("abcNNN")
	private String mobile;

	public DemoGetApiRequest(ApiClient apiClient) {
		super(apiClient);
	}

	@Override
	public String[] getSignItems() {
		return new String[]{this.getImsi(),this.getImei()};
	}

	@Override
	public String getUri() {
		return "/xll-app-api-demo/demo/json";
	}

	@Override
	public ApiResponse getResponse(JSONObject jsonObject) {
		return new DemoApiResponse(jsonObject);
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

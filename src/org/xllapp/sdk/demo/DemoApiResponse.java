package org.xllapp.sdk.demo;

import org.json.JSONObject;
import org.xllapp.sdk.core.ApiResponse;

public class DemoApiResponse extends ApiResponse<DemoApiResponseData>{

	public DemoApiResponse(JSONObject jsonObject) {
		super(jsonObject);
	}

}
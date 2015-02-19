package org.xllapp.sdk.demo;

import org.xllapp.sdk.core.util.ReflectionUtils.FieldName;

public class DemoApiResponseData {

//	@FieldName("abc")
	private String userName;

	private int i;

	private boolean b;

	private Double d;

	private Long l;

	private Integer[] ia;

	private Bean[] beans;

	public Bean[] getBeans() {
		return beans;
	}

	public void setBeans(Bean[] beans) {
		this.beans = beans;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public Long getL() {
		return l;
	}

	public void setL(Long l) {
		this.l = l;
	}

	public Integer[] getIa() {
		return ia;
	}

	public void setIa(Integer[] ia) {
		this.ia = ia;
	}

	public static class Bean {

		private String[] bstr;

		private Long bl;

		public String[] getBstr() {
			return bstr;
		}

		public void setBstr(String[] bstr) {
			this.bstr = bstr;
		}

		public Long getBl() {
			return bl;
		}

		public void setBl(Long bl) {
			this.bl = bl;
		}

	}

}
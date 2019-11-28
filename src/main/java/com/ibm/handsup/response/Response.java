package com.ibm.handsup.response;

/**
 * Common response body
 * @author liuyifan
 *
 * @param <T>
 */
public class Response<T> {
	public static final int CODE_SUCCESS = 200;
	public static final int CODE_COMMON_ERROR = 800;
	public static final int CODE_TOKEN_NOTEXIST = 801;
	public static final int CODE_TOKEN_EXPIRED = 802;
	
	public static final String MESSAGE_SECCESS = "success";
	
	public int code;
	public String message;
	public T content;
	
	private Response(int code, String message, T content) {
		this.code = code;
		this.message = message;
		this.content = content;
	}
	
	/**
	 * Empty success response body
	 * @return
	 */
	public static <T> Response<T> ok() {
		return new Response<T>(CODE_SUCCESS, MESSAGE_SECCESS, null);
	}
	
	/**
	 * Common success response body
	 * @param content
	 * @return
	 */
	public static <T> Response<T> ok(T content) {
		return new Response<T>(CODE_SUCCESS, MESSAGE_SECCESS, content);
	}
	
	/**
	 * Common response body
	 * @param code
	 * @param message
	 * @param content
	 * @return
	 */
	public static <T> Response<T> ok(int code, String message, T content) {
		return new Response<T>(code, message, content);
	}
}

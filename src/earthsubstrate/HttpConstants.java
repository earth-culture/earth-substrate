/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package earthsubstrate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Christopher Brett
 */
public class HttpConstants {
    
    //status codes 
    protected static final int STATUS_OK = 200; 
    protected static final int STATUS_CREATED = 201;
    protected static final int STATUS_NO_CONTENT = 204;
    protected static final int STATUS_BAD_REQUEST = 400;
    protected static final int STATUS_UNAUTHORIZED = 401; //unauthenticated
    protected static final int STATUS_FORBIDDEN = 403; //authenticated but requesting someone elses data 
    protected static final int STATUS_NOT_FOUND = 404;
    protected static final int STATUS_METHOD_NOT_ALLOWED = 405;
    protected static final int STATUS_TOO_MANY_REQUESTS = 429;
    protected static final int STATUS_INTERNAL_SERVER_ERROR = 500;
    protected static final int STATUS_SERVICE_UNAVAILABLE = 503;
    
    //methods
    protected static final String METHOD_GET = "GET";
    protected static final String METHOD_PUT = "PUT";
    protected static final String METHOD_POST = "POST";
    protected static final String METHOD_DELETE = "DELETE";
    protected static final String METHOD_OPTIONS = "OPTIONS";
    protected static final String ALLOWED_METHODS = METHOD_GET + ", " + METHOD_PUT + ", " + METHOD_POST + ", " + METHOD_DELETE + ", " + METHOD_OPTIONS;
    
    //headers 
    protected static final String HEADER_ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";
    protected static final String HEADER_ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";
    protected static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected static final String HEADER_ALLOW_ACCESS_CONTROL_ORIGIN = "Access-Control-Allow-Origin";
    protected static final String HEADER_CONTENT_LENGTH = "Content-Length";
    protected static final String HEADER_CONTENT_DISPOSITION = "Content-Disposition";
    
    //character sets 
    protected static final Charset CHARSET_UTF8 = StandardCharsets.UTF_8;

    //data formats
    protected static final String FORMAT_JSON = "application/json; charset=%s";
    
    //general 
    protected static final int NO_RESPONSE_LENGTH = -1;
}
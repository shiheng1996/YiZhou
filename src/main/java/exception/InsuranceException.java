package exception;

/**
 * 代驾保险费透支异常
 */
public class InsuranceException extends RuntimeException {
    private static final long serialVersionUID = 3103763355775981179L;
    
    private String errorCode;
    
    private boolean propertiesKey = true;
    
    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     */
    public InsuranceException(String message) {
        super(message);
    }
    
    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public InsuranceException(String errorCode, String message) {
        this(errorCode, message, true);
    }
    
    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public InsuranceException(String errorCode, String message, Throwable cause) {
        this(errorCode, message, cause, true);
    }
    
    /**
     * 构造一个基本异常.
     *
     * @param errorCode     错误编码
     * @param message       信息描述
     * @param propertiesKey 消息是否为属性文件中的Key
     */
    public InsuranceException(String errorCode, String message, boolean propertiesKey) {
        super(message);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }
    
    /**
     * 构造一个基本异常.
     *
     * @param errorCode 错误编码
     * @param message   信息描述
     */
    public InsuranceException(String errorCode, String message, Throwable cause, boolean propertiesKey) {
        super(message, cause);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }
    
    /**
     * 构造一个基本异常.
     *
     * @param message 信息描述
     * @param cause   根异常类（可以存入任何异常）
     */
    public InsuranceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public String getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public boolean isPropertiesKey() {
        return propertiesKey;
    }
    
    public void setPropertiesKey(boolean propertiesKey) {
        this.propertiesKey = propertiesKey;
    }
    
}

package simm.framework.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 服务调用结果组装
 * @author simm
 */
@Data
public class ObjectWrapper<T> extends StringWrapper implements Serializable {
    private T data;
}
